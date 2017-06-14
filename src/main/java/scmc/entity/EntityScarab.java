package scmc.entity;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.entity.ai.EntityAIScarabExplode;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;

public class EntityScarab extends EntityProtossMob implements IMob, Predicate<EntityLivingBase>{

	private static final DataParameter<Boolean> IGNITED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Boolean> POWERED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Integer> STATE = EntityDataManager.<Integer>createKey(EntityCreeper.class, DataSerializers.VARINT);

	private byte explosionRadius = 6;
	private short fuseTime = 10;
	// TODO: Fix ALL of this code!
	/**
	 * Time when this scarab was last in an active state (Messed up code here,
	 * probably causes scarab animation to go weird)
	 */
	private int lastActiveTime;

	/**
	 * The amount of time since the scarab was close enough to the player to
	 * ignite
	 */
	private int timeSinceIgnited;

	public EntityScarab(World worldIn) {
		super(worldIn);
		setSize(.1F, .1F);
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIScarabExplode(this));
		tasks.addTask(3, new EntityAIAttackMelee(this, 1, false));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}
	
	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity instanceof EntityZergMob)
			return true;
		if(entity instanceof EntityZergPassive)
			return true;
		if(entity instanceof EntityTerranMob)
			return true;
		if(entity instanceof EntityTerranPassive)
			return true;
		if(entity instanceof EntityPlayer)
			return true;
		if(entity instanceof EntityGolem)
			return true;
		if(entity instanceof EntityProtossMob)
			return false;
		if(entity instanceof EntityProtossPassive)
			return false;

		return false;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		return true;
	}

	@Override
	public boolean canBeCollidedWith() {
		return false;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		dataManager.register(STATE, Integer.valueOf(-1));
		dataManager.register(POWERED, Boolean.valueOf(false));
		dataManager.register(IGNITED, Boolean.valueOf(false));
	}

	/**
	 * Creates an explosion as determined by this scarab's power and explosion
	 * radius.
	 */
	private void explode() {
		if(!worldObj.isRemote) {
			boolean flag = worldObj.getGameRules().getBoolean("mobGriefing");
			float f = getPowered() ? 2 : 1;
			dead = true;
			worldObj.createExplosion(this, posX, posY, posZ, explosionRadius * f, flag);
			setDead();
		}
	}

	@Override
	public void fall(float distance, float damageMultiplier) {
		super.fall(distance, damageMultiplier);
		timeSinceIgnited = (int) (timeSinceIgnited + distance * 1.5F);

		if(timeSinceIgnited > fuseTime - 5) {
			timeSinceIgnited = fuseTime - 5;
		}
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn) {
		return 10000;
	}

	@Override
	@Nullable
	protected ResourceLocation getLootTable() {
		return LootTableList.ENTITIES_CREEPER;
	}

	/**
	 * The maximum height from where the entity is allowed to jump (used in
	 * pathfinder)
	 */
	@Override
	public int getMaxFallHeight() {
		return getAttackTarget() == null ? 3 : 3 + (int) (getHealth() - 1);
	}

	/**
	 * Returns true if the scarab is powered by a lightning bolt.
	 */
	public boolean getPowered() {
		return dataManager.get(POWERED).booleanValue();
	}

	/**
	 * Params: (Float)Render tick. Returns the intensity of the scarab's flash
	 * when it is ignited.
	 */
	@SideOnly(Side.CLIENT)
	public float getscarabFlashIntensity(float par1) {
		return (lastActiveTime + (timeSinceIgnited - lastActiveTime) * par1) / (fuseTime - 2);
	}

	/**
	 * Returns the current state of scarab, -1 is idle, 1 is 'in fuse'
	 */
	public int getScarabState() {
		return dataManager.get(STATE).intValue();
	}

	public boolean hasIgnited() {
		return dataManager.get(IGNITED).booleanValue();
	}

	public void ignite() {
		dataManager.set(IGNITED, Boolean.valueOf(true));
	}

	/**
	 * Called when the mob's health reaches 0.
	 */
	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);

		if(worldObj.getGameRules().getBoolean("doMobLoot")) {
			if(cause.getEntity() instanceof EntitySkeleton) {
				int i = Item.getIdFromItem(Items.RECORD_13);
				int j = Item.getIdFromItem(Items.RECORD_WAIT);
				int k = i + rand.nextInt(j - i + 1);
				dropItem(Item.getItemById(k), 1);
			} else if(cause.getEntity() instanceof EntityCreeper && cause.getEntity() != this && ((EntityCreeper) cause.getEntity()).getPowered()
					&& ((EntityCreeper) cause.getEntity()).isAIEnabled()) {
				((EntityCreeper) cause.getEntity()).incrementDroppedSkulls();
				entityDropItem(new ItemStack(Items.SKULL, 1, 4), 0);
			}
		}
	}

	@Override
	public void onLivingUpdate() {
		if(!worldObj.isRemote) {
			for(int i = 0; i < 2; i++) {
				worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, posX + rand.nextDouble() * width, posY + (rand.nextDouble() * height),
						posZ + rand.nextDouble() * width, 0, 0, 0);
			}
		}

		super.onLivingUpdate();
	}

	/**
	 * Called when a lightning bolt hits the entity.
	 */
	@Override
	public void onStruckByLightning(EntityLightningBolt lightningBolt) {
		super.onStruckByLightning(lightningBolt);
		dataManager.set(POWERED, Boolean.valueOf(true));
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate() {
		if(isEntityAlive()) {
			lastActiveTime = timeSinceIgnited;

			if(hasIgnited()) {
				setScarabState(1);
			}

			int i = getScarabState();

			if(i > 0 && timeSinceIgnited == 0) {
				playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1, 0.5F);
			}

			timeSinceIgnited += i;

			if(timeSinceIgnited < 0) {
				timeSinceIgnited = 0;
			}

			if(timeSinceIgnited >= fuseTime) {
				timeSinceIgnited = fuseTime;
				explode();
			}
		}

		if(ticksExisted > 500) {
			explode();
		}

		super.onUpdate();
	}

	@Override
	protected boolean processInteract(EntityPlayer player, EnumHand hand, @Nullable ItemStack stack) {
		if(stack != null && stack.getItem() == Items.FLINT_AND_STEEL) {
			worldObj.playSound(player, posX, posY, posZ, SoundEvents.ITEM_FLINTANDSTEEL_USE, getSoundCategory(), 1, rand.nextFloat() * 0.4F + 0.8F);
			player.swingArm(hand);

			if(!worldObj.isRemote) {
				ignite();
				stack.damageItem(1, player);
				return true;
			}
		}

		return super.processInteract(player, hand, stack);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		dataManager.set(POWERED, Boolean.valueOf(compound.getBoolean("powered")));

		if(compound.hasKey("Fuse", 99)) {
			fuseTime = compound.getShort("Fuse");
		}

		if(compound.hasKey("ExplosionRadius", 99)) {
			explosionRadius = compound.getByte("ExplosionRadius");
		}

		if(compound.getBoolean("ignited")) {
			ignite();
		}
	}

	/**
	 * Sets the state of scarab, -1 to idle and 1 to be 'in fuse'
	 */
	public void setScarabState(int state) {
		dataManager.set(STATE, Integer.valueOf(state));
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);

		if(dataManager.get(POWERED).booleanValue()) {
			compound.setBoolean("powered", true);
		}

		compound.setShort("Fuse", fuseTime);
		compound.setByte("ExplosionRadius", explosionRadius);
		compound.setBoolean("ignited", hasIgnited());
	}
}
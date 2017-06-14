package scmc.entity;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;
import scmc.items.ModItems;
import scmc.lib.StarcraftConfig;

/**
 * @author He of a Former Time
 */
public class EntityBrutalisk extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityBrutalisk(World world) {
		super(world);
		setSize(7.0F, 9.0F);
		experienceValue = 1000;
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity instanceof EntityProtossMob)
			return true;
		if(entity instanceof EntityProtossPassive)
			return true;
		if(entity instanceof EntityTerranMob)
			return true;
		if(entity instanceof EntityTerranPassive)
			return true;
		if(entity instanceof EntityPlayer)
			return true;
		if(entity instanceof EntityGolem)
			return true;
		if(entity instanceof EntityZergMob)
			return false;
		if(entity instanceof EntityZergPassive)
			return false;

		return false;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.brutaliskHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2700000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.brutaliskDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.0D);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent damage was dealt by a
	 * player
	 * @param lootingLevel level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		int j = rand.nextInt(50);

		if(j == 49) {
			//TODO: Make this
			//dropItem(ModWeapons.ZERGLING_CLAW, 1);
		} else if(j < 5) {
			entityDropItem(new ItemStack(ModItems.zergCarapace, 1, 2), 1 + rand.nextInt(2));
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_LIVE1;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		playSound(StarcraftSoundEvents.ENTITY_BRUTALISK_STEP, 1.0F, 1.0F);
	}
}

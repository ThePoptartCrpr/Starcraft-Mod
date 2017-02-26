package net.bvanseghi.starcraft.entity;

import javax.annotation.Nullable;

import net.bvanseghi.starcraft.entity.ai.EntityAIScarabExplode;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.lib.Library;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityVillager;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityScarab extends EntityMob
{
    private static final DataParameter<Integer> STATE = EntityDataManager.<Integer>createKey(EntityCreeper.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> POWERED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Boolean> IGNITED = EntityDataManager.<Boolean>createKey(EntityCreeper.class, DataSerializers.BOOLEAN);
    /**
     * Time when this creeper was last in an active state (Messed up code here, probably causes creeper animation to go
     * weird)
     */
    private int lastActiveTime;
    /** The amount of time since the creeper was close enough to the player to ignite */
    private int timeSinceIgnited;
    private int fuseTime = 10;
    /** Explosion radius for this creeper. */
    private int explosionRadius = 6;
    private int droppedSkulls;

    public EntityScarab(World worldIn)
    {
        super(worldIn);
        this.setSize(0.1F, 0.1F);
    }

    @Override
    public boolean canBeCollidedWith() {
    	return false; 
    }
    
    @Override
    public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn)
    {
        return 10000.0F;
    }
    
    protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIScarabExplode(this));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
    	this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
    	this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityZergMob>(this, EntityZergMob.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
        
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityZergPassive>(this, EntityZergPassive.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
        
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityVillager>(this, EntityVillager.class, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityIronGolem>(this, EntityIronGolem.class, true));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
    }

    /**
     * The maximum height from where the entity is allowed to jump (used in pathfinder)
     */
    public int getMaxFallHeight()
    {
        return this.getAttackTarget() == null ? 3 : 3 + (int)(this.getHealth() - 1.0F);
    }

    public void fall(float distance, float damageMultiplier)
    {
        super.fall(distance, damageMultiplier);
        this.timeSinceIgnited = (int)((float)this.timeSinceIgnited + distance * 1.5F);

        if (this.timeSinceIgnited > this.fuseTime - 5)
        {
            this.timeSinceIgnited = this.fuseTime - 5;
        }
    }
    
    public static void func_189762_b(DataFixer p_189762_0_)
    {
        EntityLiving.func_189752_a(p_189762_0_, "Creeper");
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        if (((Boolean)this.dataManager.get(POWERED)).booleanValue())
        {
            compound.setBoolean("powered", true);
        }

        compound.setShort("Fuse", (short)this.fuseTime);
        compound.setByte("ExplosionRadius", (byte)this.explosionRadius);
        compound.setBoolean("ignited", this.hasIgnited());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.dataManager.set(POWERED, Boolean.valueOf(compound.getBoolean("powered")));

        if (compound.hasKey("Fuse", 99))
        {
            this.fuseTime = compound.getShort("Fuse");
        }

        if (compound.hasKey("ExplosionRadius", 99))
        {
            this.explosionRadius = compound.getByte("ExplosionRadius");
        }

        if (compound.getBoolean("ignited"))
        {
            this.ignite();
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.isEntityAlive())
        {
            this.lastActiveTime = this.timeSinceIgnited;

            if (this.hasIgnited())
            {
                this.setCreeperState(1);
            }

            int i = this.getCreeperState();

            if (i > 0 && this.timeSinceIgnited == 0)
            {
                this.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1.0F, 0.5F);
            }

            this.timeSinceIgnited += i;

            if (this.timeSinceIgnited < 0)
            {
                this.timeSinceIgnited = 0;
            }

            if (this.timeSinceIgnited >= this.fuseTime)
            {
                this.timeSinceIgnited = this.fuseTime;
                this.explode();
            }
        }

        if(!worldObj.isRemote) {
			if((ticksExisted > 1000)) {
				this.explode();
			}
		}
        
        super.onUpdate();
    }
    
    public void onLivingUpdate()
    {

        if (!this.worldObj.isRemote)
        {
        	for (int i = 0; i < 2; ++i)
            {
                this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }

        super.onLivingUpdate();
    }

    protected SoundEvent getHurtSound()
    {
        return SoundEvents.ENTITY_CREEPER_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_CREEPER_DEATH;
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);

        if (this.worldObj.getGameRules().getBoolean("doMobLoot"))
        {
            if (cause.getEntity() instanceof EntitySkeleton)
            {
                int i = Item.getIdFromItem(Items.RECORD_13);
                int j = Item.getIdFromItem(Items.RECORD_WAIT);
                int k = i + this.rand.nextInt(j - i + 1);
                this.dropItem(Item.getItemById(k), 1);
            }
            else if (cause.getEntity() instanceof EntityCreeper && cause.getEntity() != this && ((EntityCreeper)cause.getEntity()).getPowered() && ((EntityCreeper)cause.getEntity()).isAIEnabled())
            {
                ((EntityCreeper)cause.getEntity()).incrementDroppedSkulls();
                this.entityDropItem(new ItemStack(Items.SKULL, 1, 4), 0.0F);
            }
        }
    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        return true;
    }

    /**
     * Returns true if the creeper is powered by a lightning bolt.
     */
    public boolean getPowered()
    {
        return ((Boolean)this.dataManager.get(POWERED)).booleanValue();
    }

    /**
     * Params: (Float)Render tick. Returns the intensity of the creeper's flash when it is ignited.
     */
    @SideOnly(Side.CLIENT)
    public float getCreeperFlashIntensity(float p_70831_1_)
    {
        return ((float)this.lastActiveTime + (float)(this.timeSinceIgnited - this.lastActiveTime) * p_70831_1_) / (float)(this.fuseTime - 2);
    }

    /**
     * Returns the current state of creeper, -1 is idle, 1 is 'in fuse'
     */
    public int getCreeperState()
    {
        return ((Integer)this.dataManager.get(STATE)).intValue();
    }

    /**
     * Sets the state of creeper, -1 to idle and 1 to be 'in fuse'
     */
    public void setCreeperState(int state)
    {
        this.dataManager.set(STATE, Integer.valueOf(state));
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt lightningBolt)
    {
        super.onStruckByLightning(lightningBolt);
        this.dataManager.set(POWERED, Boolean.valueOf(true));
    }

    protected boolean processInteract(EntityPlayer player, EnumHand hand, @Nullable ItemStack stack)
    {
        if (stack != null && stack.getItem() == Items.FLINT_AND_STEEL)
        {
            this.worldObj.playSound(player, this.posX, this.posY, this.posZ, SoundEvents.ITEM_FLINTANDSTEEL_USE, this.getSoundCategory(), 1.0F, this.rand.nextFloat() * 0.4F + 0.8F);
            player.swingArm(hand);

            if (!this.worldObj.isRemote)
            {
                this.ignite();
                stack.damageItem(1, player);
                return true;
            }
        }

        return super.processInteract(player, hand, stack);
    }

    /**
     * Creates an explosion as determined by this creeper's power and explosion radius.
     */
    private void explode()
    {
        if (!this.worldObj.isRemote)
        {
            float f = this.getPowered() ? 2.0F : 1.0F;
            this.dead = true;
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius * f, false);
            this.setDead();
        }
    }

    public boolean hasIgnited()
    {
        return ((Boolean)this.dataManager.get(IGNITED)).booleanValue();
    }

    public void ignite()
    {
        this.dataManager.set(IGNITED, Boolean.valueOf(true));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return this.droppedSkulls < 1 && this.worldObj.getGameRules().getBoolean("doMobLoot");
    }

    public void incrementDroppedSkulls()
    {
        ++this.droppedSkulls;
    }
}
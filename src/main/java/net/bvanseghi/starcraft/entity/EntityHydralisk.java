package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * Work in progress
 * @author bvanseghi
 */
public class EntityHydralisk extends EntityZergMob implements IRangedAttackMob{
	public EntityHydralisk(World world) {
		super(world);
        this.setSize(2.0F, 2.0F);
	}
	   
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	protected void initEntityAI()
    {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 20, 20.0F));
	    this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
	    this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
    	tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityProtossMob.class, true));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, true));
        
        targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        
        targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityProtossPassive.class, true));
        targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, true));
    }
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		if(rand.nextInt(3) == 0) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE3;
		}
		return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE4;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_DEATH;
	}
	
	
	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent
	 * damage was dealt by a player
	 * @param lootingLevel level of Looting on kill
	 * weapon
	 */
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {
	
	}
	
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}

	
	@Override
    public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
        double d0 = entity.posX - this.posX;
        double d1 = entity.posY + (double)(entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
        double d2 = entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_float(distance) * 0.5F;
        for (int i = 0; i < 1; ++i)
        {
        	 EntityHydraliskSpike entityhydraliskspike = new EntityHydraliskSpike(this.worldObj, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
        	 entityhydraliskspike.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
        	 this.worldObj.spawnEntityInWorld(entityhydraliskspike);
        }
	}
}

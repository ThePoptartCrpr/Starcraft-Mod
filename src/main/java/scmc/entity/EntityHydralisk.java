package scmc.entity;

import java.util.Random;

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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

/**
 * Work in progress
 * @author bvanseghi
 */
public class EntityHydralisk extends EntityZergMob implements IRangedAttackMob{
	public EntityHydralisk(World world) {
		super(world);
        setSize(2, 2);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}
	
	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, .25F, 20, 20));
	    tasks.addTask(7, new EntityAIWander(this, 1));
	    tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 12));
	    targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        applyEntityAI();
    }

    protected void applyEntityAI() {
    	tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityProtossMob>(this, EntityProtossMob.class, true));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
        targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        targetTasks.addTask(5, new EntityAINearestAttackableTarget<EntityProtossPassive>(this, EntityProtossPassive.class, true));
        targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
    }
	
    @Override
	public int getTalkInterval() {
    	return 160;
    }
	
    @Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		
		if(rand.nextInt(3) == 0) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE3;
		} else {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE4;
		}
	}
	
    @Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_HURT;
	}
	
    @Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_DEATH;
	}
	
	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent damage was dealt by a player
	 * @param lootingLevel level of Looting on kill weapon
	 */
    @Override
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {}
	
	@Override
    public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
        double d0 = entity.posX - posX;
        double d1 = entity.posY + (double) (entity.height/2) - (posY + (double) (height/2));
        double d2 = entity.posZ - posZ;
        float f1 = MathHelper.sqrt_float(distance) * .5F;
        
        for(int i = 0; i < 1; i++) {
        	 EntityHydraliskSpike entityhydraliskspike = new EntityHydraliskSpike(worldObj, d0 + rand.nextGaussian() * (double) f1, d1, d2 + rand.nextGaussian() * (double) f1);
        	 entityhydraliskspike.posY = posY + (double) (height/2) + .5;
        	 worldObj.spawnEntityInWorld(entityhydraliskspike);
        }
	}
}

package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityProtossReaver extends EntityProtossMob implements IRangedAttackMob {

	Random random = new Random();

	public EntityProtossReaver(World world) {
		super(world);
		this.setSize(6.0F, 3.0F);
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }
	 
	 @Override
	    public boolean canBePushed() {
	    	return false; 
	    }

	 protected void initEntityAI()
	    {
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 120, 30.0F));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
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
	    
	    protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.preaverHP);
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24000000417232513D);
			this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
			this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
		}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		if(rand.nextInt(3) == 0) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE1;
		}else if(rand.nextInt(3) == 1) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE2;
		}else if(rand.nextInt(3) == 2) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE3;
		}else if(rand.nextInt(3) == 3) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE4;
		}
		return StarcraftSoundEvents.ENTITY_PREAVER_LIVE5;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_DEATH;
	}

	@Override
    public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
		if(!worldObj.isRemote){
			for (int i = 0; i < 1; ++i)
	        {
			EntityScarab scarab = new EntityScarab(worldObj);
			scarab.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0);
			worldObj.spawnEntityInWorld(scarab);
	        }
		}
	}
}
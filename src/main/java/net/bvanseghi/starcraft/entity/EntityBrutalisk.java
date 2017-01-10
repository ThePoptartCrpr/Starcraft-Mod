package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

/**
 * @author bvanseghi
 */
public class EntityBrutalisk extends EntityZergMob {
	public EntityBrutalisk(World world) {
		super(world);
        this.setSize(1.0F, 1.75F);
	}
	
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		//To be modified by bvanseghi
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	/*
	public SCSoundEvent getLivingSound() {
		Random rand = new Random();
		if(rand.nextInt(2) == 0) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE3;
		}
		return SCSoundEvents.ENTITY_ZERGLING_LIVE4;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_ZERGLING_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_ZERGLING_DEATH;
	}
	*/
	
	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent
	 * damage was dealt by a player
	 * @param lootingLevel level of Looting on kill
	 * weapon
	 */
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {
		//TODO: make this
	}
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	public void onUpdate() {
		super.onUpdate();
	}
	
	public boolean attackEntityAsMob(Entity target) {
		//TODO: make this
		return target.attackEntityFrom(DamageSource.causeMobDamage(this), 1 /* will be modified */);
	}
	
	public boolean attackEntityFrom(DamageSource damageSource, float damage /* I have no clue what to call it */) {
		return super.attackEntityFrom(damageSource, damage);
	}
}

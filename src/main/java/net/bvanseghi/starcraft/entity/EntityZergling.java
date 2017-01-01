package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

/**
 * May or may not have been totally stolen from {@link EntityZealot}
 * @author wundrweapon
 */
public class EntityZergling extends EntityZergMob {
	public EntityZergling(World world) {
		super(world);
        this.setSize(1.0F, 1.75F);
        /*
         * TODO: recreate entity ai.
         */
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		//To be modified by bvanseghi
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
	}
	
	protected void clearAITasks() {
		tasks.taskEntries.clear();
		targetTasks.taskEntries.clear();
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
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

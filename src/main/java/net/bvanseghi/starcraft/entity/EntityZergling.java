package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
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
	
	public String getLivingSound() {
		Random rand = new Random();
		if(rand.nextInt(2) == 0) {
			return "Starcraft:zergling-live1";
		}else if(rand.nextInt(2) == 1) {
			return "Starcraft:zergling-live2";
		}else if(rand.nextInt(2) == 2) {
			return "Starcraft:zergling-live3";
		}
		return "Starcraft:zergling-live4";
	}
	
	public String getHurtSound() {
		return "Starcraft:zergling-hurt";
	}
	
	public String getDeathSound() {
		return "Starcraft:zergling-death";
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

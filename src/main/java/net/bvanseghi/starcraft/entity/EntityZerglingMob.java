package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

/**
 * May or may not have been totally stolen from {@link EntityZealot}
 * @author wundrweapon
 */
public class EntityZerglingMob extends EntityZergMob {
	public EntityZerglingMob(World world) {
		super(world);
		
		//Same tasks as Zealot; for modification by bvanseghi
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1, false));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranPassive.class, 1, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergPassive.class, 1, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranMob.class, 1, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergMob.class, 1, true));
        this.tasks.addTask(2, new EntityAIWander(this, 1));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergPassive.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergMob.class, 0, false));
        this.setSize(0.5f, 1f);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		//To be modified by bvanseghi
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.39000000417232513);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(10);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2);
	}
	
	protected void clearAITasks() {
		tasks.taskEntries.clear();
		targetTasks.taskEntries.clear();
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	public int getTalkInterval() {
		return 150;
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

package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityZealot extends EntityProtossMob {

	public EntityZealot(World world) {
		super(world);
		clearAITasks();
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityTerranPassive.class, 1.0D, true));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityZergPassive.class, 1.0D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityTerranMob.class, 1.0D, true));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityZergMob.class, 1.0D, true));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, 0, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZergPassive.class, 0, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, 0, false));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZergMob.class, 0, false));
	        this.setSize(1.0F, 3.0F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
	}
	
	protected void clearAITasks()
	{
	   tasks.taskEntries.clear();
	   targetTasks.taskEntries.clear();
	}

	public boolean isAIEnabled()
    {
        return true;
    }
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	protected void dropFewItems(boolean par1, int par2) {

	}
}




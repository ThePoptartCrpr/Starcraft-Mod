package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityCivilian extends EntityTerranPassive{

	Random random = new Random();

	public EntityCivilian(World world) {
		super(world);
		this.setSize(1.0F, 2.0F);
		this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 0.4D));
        this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntitySkeleton.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityCreeper.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(5, new EntityAIAvoidEntity(this, EntityEnderman.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(6, new EntityAIAvoidEntity(this, EntitySpider.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(7, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(8, new EntityAIAvoidEntity(this, EntityCaveSpider.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(9, new EntityAIAvoidEntity(this, EntityBlaze.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(10, new EntityAIAvoidEntity(this, EntitySilverfish.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(11, new EntityAIAvoidEntity(this, EntitySlime.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(12, new EntityAIAvoidEntity(this, EntityWitch.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(13, new EntityAIAvoidEntity(this, EntityPigZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(14, new EntityAIAvoidEntity(this, EntityZergPassive.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(15, new EntityAIAvoidEntity(this, EntityZergMob.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(16, new EntityAIAvoidEntity(this, EntityProtossPassive.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(17, new EntityAIAvoidEntity(this, EntityProtossMob.class, 8.0F, 0.4D, 0.4D));
        
        
        this.tasks.addTask(18, new EntityAIMoveIndoors(this));
        this.tasks.addTask(19, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(20, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(21, new EntityAIMoveTowardsRestriction(this, 0.4D));
        this.tasks.addTask(22, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(23, new EntityAIWatchClosest2(this, EntityVillager.class, 5.0F, 0.02F));
        this.tasks.addTask(24, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.43000000417232513D);
	}

	protected String getLivingSound() {
		return null;
	}

	protected String getHurtSound() {
		return null;
	}

	protected String getDeathSound() {
		return null;
	}

	protected boolean canDespawn()
    {
        return false;
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
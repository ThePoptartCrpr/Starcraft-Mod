package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCivilian extends EntityTerranPassive{

	Random random = new Random();

	public EntityCivilian(World world) {
		super(world);
		this.setSize(1.0F, 2.0F);
		/*
		 * TODO: Remake entity ai.
		 */
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.civHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
	}

	protected String getLivingSound() {
		return null;
	}

	protected SoundEvent getHurtSound() {
		return null;
	}

	protected SoundEvent getDeathSound() {
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
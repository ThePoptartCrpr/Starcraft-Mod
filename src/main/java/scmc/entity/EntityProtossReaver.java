package scmc.entity;

import java.util.Random;

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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;
import scmc.lib.StarcraftConfig;

public class EntityProtossReaver extends EntityProtossMob implements IRangedAttackMob {
	public EntityProtossReaver(World world) {
		super(world);
		setSize(6, 3);
	}
	
	//FIXME: this
	//	public boolean isAIEnabled() {
	//		return true;
	//	}
	
	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 100, 30));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(7, new EntityAIWander(this, 1));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(8, new EntityAILookIdle(this));
		applyEntityAI();
	}
	
	protected void applyEntityAI() {
		tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1, false));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityZergMob>(this, EntityZergMob.class, true));
		targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
		targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
		targetTasks.addTask(5, new EntityAINearestAttackableTarget<EntityZergPassive>(this, EntityZergPassive.class, true));
		targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.reaverHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.24000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}
	
	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		
		if(rand.nextInt(5) == 0) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE1;
		} else if(rand.nextInt(5) == 1) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE2;
		} else if(rand.nextInt(5) == 2) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE3;
		} else if(rand.nextInt(5) == 3) {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE4;
		} else {
			return StarcraftSoundEvents.ENTITY_PREAVER_LIVE5;
		}
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_DEATH;
	}
	
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
		if(!worldObj.isRemote) {
			EntityScarab scarab = new EntityScarab(worldObj);
			scarab.setLocationAndAngles(posX, posY, posZ, 0, 0);
			worldObj.spawnEntityInWorld(scarab);
		}
	}
}
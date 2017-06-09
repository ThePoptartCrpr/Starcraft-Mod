package scmc.entity;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;
import scmc.lib.StarcraftConfig;

public class EntityProtossReaver extends EntityProtossMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	public EntityProtossReaver(World world) {
		super(world);
		setSize(8.0F, 4.3F);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackRanged(this, 0.25F, 85, 30));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.reaverHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.24000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entity, float distance) {
		if(!worldObj.isRemote) {
			EntityScarab scarab = new EntityScarab(worldObj);
			scarab.setLocationAndAngles(posX, posY, posZ, 0, 0);
			worldObj.spawnEntityInWorld(scarab);
		}
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch(rand.nextInt(3)) {
			case 0:
				return StarcraftSoundEvents.ENTITY_PREAVER_LIVE1;
			case 1:
				return StarcraftSoundEvents.ENTITY_PREAVER_LIVE2;
			case 2:
				return StarcraftSoundEvents.ENTITY_PREAVER_LIVE3;
			case 3:
				return StarcraftSoundEvents.ENTITY_PREAVER_LIVE4;
			default:
				return StarcraftSoundEvents.ENTITY_PREAVER_LIVE5;
				}
			
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PREAVER_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
	
	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity instanceof EntityZergMob)
			return true;
		if(entity instanceof EntityZergPassive)
			return true;
		if(entity instanceof EntityTerranMob)
			return true;
		if(entity instanceof EntityTerranPassive)
			return true;
		if(entity instanceof EntityPlayer)
			return true;
		if(entity instanceof EntityGolem)
			return true;
		if(entity instanceof EntityProtossMob)
			return false;
		if(entity instanceof EntityProtossPassive)
			return false;

		return false;
	}
}
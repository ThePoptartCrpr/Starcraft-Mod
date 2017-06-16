package scmc.entity;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
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
import scmc.lib.StarcraftConfig;

public class EntityBroodling extends EntityZergMob implements IMob, Predicate<EntityLivingBase>{

	public EntityBroodling(World world) {
		super(world);
		setSize(1.0F, 0.5F);
		experienceValue = 20;
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIWander(this, 1.0D));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}
	
	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity instanceof EntityProtossMob || entity instanceof EntityProtossPassive || entity instanceof EntityTerranMob || entity instanceof EntityTerranPassive
				|| entity instanceof EntityPlayer) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.BROODLING_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.BROODLING_DAMAGE);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2) {
	}

	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_BROODLING_LIVE1;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_BROODLING_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_BROODLING_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}

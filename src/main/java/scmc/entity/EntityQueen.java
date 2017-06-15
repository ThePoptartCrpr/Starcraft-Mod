package scmc.entity;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
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
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;
import scmc.lib.StarcraftConfig;

/**
 * @author Hypeirochus
 */
// TODO: Fix this entire class
public class EntityQueen extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityQueen(World world) {
		super(world);
		setSize(2.0F, 2.0F);
		experienceValue = 60;
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
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

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D); // Wat
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {
		// TODO: make this
	}

	@Override
	public SoundEvent getAmbientSound() {
		return null;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public SoundEvent getDeathSound() {
		return null;
	}

	@Override
	public SoundEvent getHurtSound() {
		return null;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}
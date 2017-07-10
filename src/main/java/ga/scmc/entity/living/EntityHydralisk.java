package ga.scmc.entity.living;

import java.util.Random;

import com.google.common.base.Predicate;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.entity.EntityProtossMob;
import ga.scmc.entity.EntityProtossPassive;
import ga.scmc.entity.EntityTerranMob;
import ga.scmc.entity.EntityTerranPassive;
import ga.scmc.entity.EntityZergMob;
import ga.scmc.entity.projectiles.EntityHydraliskSpike;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

/**
 * Work in progress
 * @author He of a Former Time
 */
public class EntityHydralisk extends EntityZergMob implements IMob, IRangedAttackMob, Predicate<EntityLivingBase> {

	private EntityAIBase rangedAttackAI;

	public EntityHydralisk(World world) {
		super(world);
		setSize(3.5F, 3.3F);
		experienceValue = 60;
		tasks.addTask(1, new EntityAIAttackRanged(this, 1.0D, 17, 16.0F));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	@Override
	public boolean apply(EntityLivingBase entity) {
		if(entity.isInvisible() == false) {
			if(entity instanceof EntityProtossMob || entity instanceof EntityProtossPassive || entity instanceof EntityTerranMob || entity instanceof EntityTerranPassive
					|| entity instanceof EntityPlayer) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.HYDRALISK_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.HYDRALISK_DAMAGE);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	// TODO: Work this out! Also, fix the sound and particles!
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		EntityHydraliskSpike spike = new EntityHydraliskSpike(this.worldObj, this);
		double d0 = target.posY + (double) target.getEyeHeight() - 1.600000023841858D;
		double d1 = target.posX - this.posX;
		double d2 = d0 - spike.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
		spike.setThrowableHeading(d1, d2 + (double) f, d3, 1.6F, .0F);
		this.playSound(SoundEvents.ENTITY_SNOWMAN_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.worldObj.spawnEntityInWorld(spike);
	}

	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent damage was dealt by a
	 * player
	 * @param lootingLevel level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {
		// TODO: make this
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch(rand.nextInt(3)) {
			case 0:
				return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE1;
			default: {
				switch(rand.nextInt(3)) {
					case 0:
						return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE2;
					case 1:
						return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE3;
					default:
						return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE4;
				}
			}
		}
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
	}

}

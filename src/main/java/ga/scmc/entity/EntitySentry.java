package ga.scmc.entity;

import java.util.Random;

import com.google.common.base.Predicate;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.entity.monster.EntityTerranMob;
import ga.scmc.entity.monster.EntityZergMob;
import ga.scmc.entity.passive.EntityTerranPassive;
import ga.scmc.entity.passive.EntityZergPassive;
import ga.scmc.items.ModItems;
import ga.scmc.items.weapons.ModWeapons;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntitySentry extends EntityGuardian implements IMob, Predicate<EntityLivingBase> {

	public EntitySentry(World world) {
		super(world);
		setSize(1.2F, 2.5F);
		experienceValue = 100;
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
		if(entity instanceof EntityZergMob || entity instanceof EntityZergPassive || entity instanceof EntityTerranMob || entity instanceof EntityTerranPassive
				|| entity instanceof EntityPlayer) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.ZEALOT_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.ZEALOT_DAMAGE);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	/**
	 * Drop 0-2 items of this living's type.
	 * @param recentlyHit - Whether this entity has recently been hit by a
	 * player.
	 * @param looting - Level of Looting used to kill this mob.
	 */
	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		int j = rand.nextInt(50);

		if(j == 49) {
			dropItem(ModWeapons.PSI_BLADE, 1);
		} else if(j < 5) {
			entityDropItem(new ItemStack(ModItems.ENERGY, 1, 0), 1 + rand.nextInt(2));
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch(rand.nextInt(3)) {
			case 0:
				return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE1;
			default: {
				switch(rand.nextInt(3)) {
					case 0:
						return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE2;
					case 1:
						return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE3;
					default:
						return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE4;
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
		return StarcraftSoundEvents.ENTITY_ZEALOT_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZEALOT_HURT;
	}
	
	@Override
	public int getTalkInterval() {
		return 160;
	}
}
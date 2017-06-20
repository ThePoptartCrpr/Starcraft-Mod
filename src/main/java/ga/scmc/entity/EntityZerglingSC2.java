package ga.scmc.entity;

import java.util.Random;

import com.google.common.base.Predicate;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.entity.monster.EntityProtossMob;
import ga.scmc.entity.monster.EntityTerranMob;
import ga.scmc.entity.monster.EntityZergMob;
import ga.scmc.entity.passive.EntityProtossPassive;
import ga.scmc.entity.passive.EntityTerranPassive;
import ga.scmc.items.ModItems;
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
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

/**
 * @author Hypeirochus
 */
public class EntityZerglingSC2 extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityZerglingSC2(World world) {
		super(world);
		setSize(1.75F, 1.55F);
		experienceValue = 23;
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
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(StarcraftConfig.ZERGLING_SC2_ARMOR);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.ZERGLING_SC2_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(StarcraftConfig.ZERGLING_SC2_SPEED);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(StarcraftConfig.ZERGLING_SC2_RANGE);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.ZERGLING_SC2_DAMAGE);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		int j = rand.nextInt(50);

		if(j == 49) {
			//TODO: Make this
			//dropItem(ModWeapons.ZERGLING_CLAW, 1);
		} else if(j < 5) {
			entityDropItem(new ItemStack(ModItems.ZERG_CARAPACE, 1, 0), 1 + rand.nextInt(2));
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();

		switch(rand.nextInt(3)) {
			case 0:
				return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE1;
			default: {
				switch(rand.nextInt(3)) {
					case 0:
						return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE2;
					case 1:
						return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE3;
					default:
						return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE4;
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
		return StarcraftSoundEvents.ENTITY_ZERGLING_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZERGLING_HURT;
	}
	
	@Override
	public int getTalkInterval() {
		return 160;
	}
}
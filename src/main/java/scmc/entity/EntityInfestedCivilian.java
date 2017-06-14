package scmc.entity;

import java.util.Random;

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
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.items.ModItems;
import scmc.lib.StarcraftConfig;

public class EntityInfestedCivilian extends EntityZergMob implements IMob, Predicate<EntityLivingBase> {

	public EntityInfestedCivilian(World world) {
		super(world);
		setSize(1, 1.75F);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(3, new EntityAIWander(this, 1.0D));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityLivingBase>(this, EntityLivingBase.class, 0, false, false, this));
	}

	//Don't ask me what the hell this is :/
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

		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.infestedCivilianHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.infestedCivilianDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
		int j = rand.nextInt(50);

		if(j == 49) {
			//TODO: Make this
			//dropItem(ModWeapons.ZERGLING_CLAW, 1);
		} else if(j < 5) {
			entityDropItem(new ItemStack(ModItems.zergCarapace, 1, 0), 1 + rand.nextInt(2));
		}
	}

	//TODO: redo these sounds
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

	@Override
	public void onLivingUpdate() {
		if(this.worldObj.isDaytime() && !this.worldObj.isRemote) {
			float f = this.getBrightness(1.0F);
			BlockPos blockpos = this.getRidingEntity() instanceof EntityBoat ? (new BlockPos(this.posX, (double) Math.round(this.posY), this.posZ)).up()
					: new BlockPos(this.posX, (double) Math.round(this.posY), this.posZ);

			if(f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canSeeSky(blockpos)) {
				boolean flag = true;

				if(flag) {
					this.setFire(8);
				}
			}
		}

		super.onLivingUpdate();
	}
}

package ga.scmc.entity.living;

import java.util.Random;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.entity.EntityProtossPassive;
import ga.scmc.entity.EntityTerranMob;
import ga.scmc.entity.EntityZergMob;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityProbe extends EntityProtossPassive {

	Random random = new Random();

	public EntityProbe(World world) {
		super(world);
		setSize(0.5F, 1.3F);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAvoidEntity<EntityZergMob>(this, EntityZergMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(2, new EntityAIAvoidEntity<EntityTerranMob>(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(5, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.PROBE_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000298023224D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_LIVE1;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}

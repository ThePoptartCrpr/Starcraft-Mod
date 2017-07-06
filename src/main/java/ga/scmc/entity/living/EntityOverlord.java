package ga.scmc.entity.living;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityOverlord extends EntityFlying {

	public EntityOverlord(World world) {
		super(world);
		setSize(4, 4);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.OVERLORD_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.015);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_LIVE1;
	}

	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}
}
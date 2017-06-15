package scmc.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

public class EntityCivilian extends EntityTerranPassive {

	Random random = new Random();

	public EntityCivilian(World world) {
		super(world);
		setSize(1.0F, 2.0F);
		/*
		 * TODO: Remake entity ai.
		 */
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.CIVILIAN_HEALTH);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
	
	@Override
	public boolean getCanSpawnHere() {
		return true;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return null;
	}

	@Override
	protected SoundEvent getHurtSound() {
		return null;
	}

	public boolean isAIEnabled() {
		return true;
	}

}
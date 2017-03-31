package scmc.entity;

import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.lib.StarcraftConfig;

public class EntityOverlord extends EntityFlying {
	public EntityOverlord(World world) {
		super(world);
		setSize(4, 4);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.overlordHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.015);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}
	
	@Override
	public int getTalkInterval() {
        return 160;
    }
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_LIVE1;
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_DEATH;
	}
}
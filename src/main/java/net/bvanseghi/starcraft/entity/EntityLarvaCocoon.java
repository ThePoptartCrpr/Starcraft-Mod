package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLarvaCocoon extends EntityZergPassive {
	private Random random = new Random();
	
	public EntityLarvaCocoon(World world) {
		super(world);
		this.setSize(0.7F, 0.8F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.larvaCocoonHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}
	
	@Override
	protected boolean canDespawn() {
        return false;
    }
	
	@Override
	public int getTalkInterval() {
        return 160;
    }
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_LIVE1;
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_DEATH;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if(!worldObj.isRemote) {
			if((ticksExisted > 340)) {
				Library.cocoonMorph(worldObj, this, random);
			}
		}
	}

	/**
	 * Why doesn't this do anything?
	 */
	@Override
	public void moveEntity(double x, double y, double z) {
       
    }
	
	@Override
	public boolean isPushedByWater() {
		return false;
	}

	/**
	 * <em>Reset</em> rotation?
	 */
	@Override
	protected void setRotation(float par1, float par2) {
		rotationYaw = 0;
		rotationPitch = 0;
	}

	/**
	 * ...?
	 */
	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}

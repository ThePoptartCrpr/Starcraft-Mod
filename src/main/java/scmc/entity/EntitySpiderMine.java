package scmc.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

public class EntitySpiderMine extends EntityTerranPassive{

	Random random = new Random();

	public EntitySpiderMine(World world) {
		super(world);
		this.setSize(1.0F, 2.0F);
		/*
		 * TODO: Remake entity ai.
		 */
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.civHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}

	protected String getLivingSound() {
		return null;
	}

	protected SoundEvent getHurtSound() {
		return null;
	}

	protected SoundEvent getDeathSound() {
		return null;
	}

	protected boolean canDespawn()
    {
        return false;
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
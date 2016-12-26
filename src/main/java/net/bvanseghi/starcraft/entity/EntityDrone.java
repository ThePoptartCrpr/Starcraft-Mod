package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityDrone extends EntityAnimal {

	public EntityDrone(World world) {
		super(world);

	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.droneHP);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}

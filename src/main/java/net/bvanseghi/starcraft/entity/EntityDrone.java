package net.bvanseghi.starcraft.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityDrone extends EntityAnimal {

	public EntityDrone(World world) {
		super(world);

	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}

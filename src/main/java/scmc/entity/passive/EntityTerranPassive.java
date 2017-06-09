package scmc.entity.passive;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityTerranPassive extends EntityTameable {

	public EntityTerranPassive(World p_i1604_1_) {
		super(p_i1604_1_);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
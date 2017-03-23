package scmc.entity.passive;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

public class EntityZergPassive extends EntityTameable {
	public EntityZergPassive(World world) {
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}
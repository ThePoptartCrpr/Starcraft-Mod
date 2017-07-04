package ga.scmc.lib;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class ModTeleporter extends Teleporter {
	private final WorldServer worldServer;
	private double x;
	private double y;
	private double z;

	//TODO: Fix this, players do not spawn on the surface, but underground in boxes of bedrock
	public ModTeleporter(WorldServer world, double x, double y, double z) {
		super(world);
		worldServer = world;
		BlockPos playerSpawn = new BlockPos(x, 100, z);
		while(world.isAirBlock(playerSpawn)) {
			playerSpawn = playerSpawn.down();
		}
		this.x = x;
		this.y = playerSpawn.getY();
		this.z = z;
	}

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		entity.setPosition(x, y + 1, z);
		entity.motionX = 0;
		entity.motionY = 0;
		entity.motionZ = 0;
	}
}

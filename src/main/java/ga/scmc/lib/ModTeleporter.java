package ga.scmc.lib;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class ModTeleporter extends Teleporter {

	public static void teleportToDimension(EntityPlayer player, int dimension, double x, double y, double z) {
		int oldDimension = player.worldObj.provider.getDimension();
		EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;
		MinecraftServer server = ((EntityPlayerMP) player).worldObj.getMinecraftServer();
		WorldServer worldServer = server.worldServerForDimension(dimension);
		player.addExperienceLevel(0);

		if(worldServer == null || worldServer.getMinecraftServer() == null) { // Dimension doesn't exist
			throw new IllegalArgumentException("Dimension: " + dimension + " doesn't exist!");
		}

		worldServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(entityPlayerMP, dimension, new ModTeleporter(worldServer, x, y, z));
		player.setPositionAndUpdate(x, y, z);
		if(oldDimension == 1) {
			// For some reason teleporting out of the end does weird things.
			player.setPositionAndUpdate(x, y, z);
			worldServer.spawnEntityInWorld(player);
			worldServer.updateEntityWithOptionalForce(player, false);
		}
	}

	private final WorldServer worldServer;
	private double x;
	private double y;
	private double z;

	// TODO: Fix this, players do not spawn on the surface, but underground in
	// boxes of bedrock
	public ModTeleporter(WorldServer world, double x, double y, double z) {
		super(world);
		this.worldServer = world;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		worldServer.getBlockState(new BlockPos((int) x, (int) y, (int) z));

		entity.setPosition(x, y, z);
		entity.motionX = 0.0f;
		entity.motionY = 0.0f;
		entity.motionZ = 0.0f;
	}

}
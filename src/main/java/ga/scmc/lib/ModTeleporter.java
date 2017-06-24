package ga.scmc.lib;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
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
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void teleportToDimension(EntityPlayer player, int dimension, double x, double y, double z) {
		int oldDimension = player.worldObj.provider.getDimension();
		EntityPlayerMP playerMP = (EntityPlayerMP) player;
		WorldServer worldServer = playerMP.worldObj.getMinecraftServer().worldServerForDimension(dimension);
		
		//True if dimension doesn't exist
		if(worldServer == null || worldServer.getMinecraftServer() == null) {
			throw new IllegalArgumentException("Dimension " + dimension + " doesn't exist!");
		}
		
		worldServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(playerMP, dimension, new ModTeleporter(worldServer, x, y, z));
		BlockPos playerSpawn = new BlockPos(x, 255, z);
		
		while(player.worldObj.isAirBlock(playerSpawn)) {
			playerSpawn = playerSpawn.down();
		}
		
		player.setPositionAndUpdate(x, playerSpawn.getY(), z); //Didn't call playerSpawn for Y/Z to save a stack slot
		
		//Apparently this is only necessary coming out of the End?
		if(oldDimension == 1) {
			worldServer.spawnEntityInWorld(player);
			worldServer.updateEntityWithOptionalForce(player, false);
		}
	}

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		entity.setPosition(x, y, z);
		entity.motionX = 0;
		entity.motionY = 0;
		entity.motionZ = 0;
	}
}

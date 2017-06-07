package scmc.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {

	public static void preInit() {
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeChar.class, "WarpGateWormholeChar");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeShakuras.class, "WarpGateWormholeShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeOverworld.class, "WarpGateWormholeOverworld");
	}
}
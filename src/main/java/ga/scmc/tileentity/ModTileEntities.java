package ga.scmc.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	//If all goes well, then one of my s e c r e t code changes should eliminate this completely ;)
	public static void preInit() {
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeChar.class, "WarpGateWormholeChar");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeShakuras.class, "WarpGateWormholeShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeOverworld.class, "WarpGateWormholeOverworld");
	}
}
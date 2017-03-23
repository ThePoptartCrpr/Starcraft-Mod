package scmc.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {

	public static void preInit() {
		GameRegistry.registerTileEntity(TileEntityBlockMineralField.class, "MineralField");
		GameRegistry.registerTileEntity(TileEntityBlockRichMineralField.class, "RichMineralField");
		
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyser.class, "VespeneGeyser");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyser.class, "RichVespeneGeyser");
		
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyserChar.class, "VespeneGeyserChar");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyserChar.class, "RichVespeneGeyserChar");
		
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyserShakuras.class, "VespeneGeyserShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyserShakuras.class, "RichVespeneGeyserShakuras");
		
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeChar.class, "WarpGateWormholeChar");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeShakuras.class, "WarpGateWormholeShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeOverworld.class, "WarpGateWormholeOverworld");
	}
}
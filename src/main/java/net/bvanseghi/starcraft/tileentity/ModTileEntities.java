package net.bvanseghi.starcraft.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {

	public static void preInit() {
		GameRegistry.registerTileEntity(TileEntityBlockMineralField.class, "MineralField");
		GameRegistry.registerTileEntity(TileEntityBlockRichMineralField.class, "RichMineralField");
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyser.class, "VespeneGeyser");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyser.class, "RichVespeneGeyser");
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyserChar.class, "VespeneGeyserChar");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyserChar.class, "RichVespeneGeyserChar");
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyserChar.class, "VespeneGeyserShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockRichVespeneGeyserChar.class, "RichVespeneGeyserShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeChar.class, "WarpGateWormholeChar");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeShakuras.class, "WarpGateWormholeShakuras");
		GameRegistry.registerTileEntity(TileEntityBlockWarpGateWormholeOverworld.class, "WarpGateWormholeOverworld");
	}
}

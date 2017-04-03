package scmc.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.lib.Reference;
import scmc.tileentity.TileEntityBlockVespeneGeyser;

@SuppressWarnings("unused")
public class ServerProxy {
	public void preInit(FMLPreInitializationEvent event) {}
	
	public void init(FMLInitializationEvent event) {}
	
	public void postInit(FMLPostInitializationEvent event) {}
	
	public void registerModelBakeryVariants() {}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyser.class, Reference.RL_BASE + "geyserVespene");
	}

	public void registerModelBakeryStuff() {}
}
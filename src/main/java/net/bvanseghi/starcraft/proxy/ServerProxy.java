package net.bvanseghi.starcraft.proxy;

import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyser;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy {

	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerModelBakeryVariants() {
		
	}
	

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBlockVespeneGeyser.class, Reference.RL_BASE + "geyserVespene");
		
	}

	public void registerModelBakeryStuff() {
		// TODO Auto-generated method stub
		
	}
}

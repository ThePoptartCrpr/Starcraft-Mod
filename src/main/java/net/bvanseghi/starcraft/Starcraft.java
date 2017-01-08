package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.ModEntities;
import net.bvanseghi.starcraft.handlers.FuelHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.proxy.ServerProxy;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.bvanseghi.starcraft.worldgen.SCWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10], [1.10.2]")
public class Starcraft {
	
	@Instance(Reference.MODID)
	public static Starcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();
		ModBlocks.init();
		ModItems.init();
		ModMaterials.preInit();
		ModWeapons.preInit();
		ModArmour.preInit();
		ModTools.preInit();
		FuelHandler.preInit();
		ModItems.registerModels();
		ModBlocks.registerModels();
		SCWorldGen.setupWorldgen();
		SCWorldGen.preInit();
		proxy.preInit(event);
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModEntities.init();
		Achievements.init();
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}

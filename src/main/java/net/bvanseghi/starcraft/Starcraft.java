package net.bvanseghi.starcraft;

import org.apache.logging.log4j.Level;

import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.BlockRenderRegister;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.ModEntities;
import net.bvanseghi.starcraft.handlers.FuelHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.LogHelper;
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
		try {
			StarcraftConfig.preInit();
			LogHelper.logger.log(Level.INFO, "Starcraft Configuration initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Configuration failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModBlocks.init();
		LogHelper.logger.log(Level.INFO, "Starcraft Blocks initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Blocks failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModItems.init();
		LogHelper.logger.log(Level.INFO, "Starcraft Items initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Items failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModMaterials.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Materials initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Materials failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModWeapons.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Weapons initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Weapons failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModArmour.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Armors initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Armors failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModTools.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Tools initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Tools failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		FuelHandler.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Fuel Handler initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Fuel Handler failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModItems.registerModels();
		LogHelper.logger.log(Level.INFO, "Starcraft Item Models registered.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Item Models failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		ModBlocks.registerModels();
		LogHelper.logger.log(Level.INFO, "Starcraft Block Models registered.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Block Models failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		SCWorldGen.setupWorldgen();
		LogHelper.logger.log(Level.INFO, "Starcraft Dimensions registered.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Dimensions failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		SCWorldGen.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft World Generation initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Configuration failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		proxy.preInit(event);
		LogHelper.logger.log(Level.INFO, "Starcraft Proxy initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Configuration failed to initialize! Report this to the developer(s) of the mod!");
		}

		//try {
		BlockRenderRegister.preInit();
		LogHelper.logger.log(Level.INFO, "Starcraft Meta Blocks initialized.");
		//}catch(Exception e) {
			//LogHelper.logger.log(Level.ERROR, "Starcraft Meta Blocks failed to initialize! Report this to the developer(s) of the mod!");
		//}
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	
		try {
		ModEntities.init();
		LogHelper.logger.log(Level.INFO, "Starcraft Entities initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Entities failed to initialize! Report this to the developer(s) of the mod!");
		}
		try {
		Achievements.init();
		LogHelper.logger.log(Level.INFO, "Starcraft Achievements initialized.");
		}catch(Exception e) {
			LogHelper.logger.log(Level.ERROR, "Starcraft Achievements failed to initialize! Report this to the developer(s) of the mod!");
		}
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}

package net.bvanseghi.starcraft;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.bvanseghi.starcraft.GUI.GUI;
import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.ModEntities;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.handlers.FuelHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.SCWorldSettings;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.proxy.CommonProxy;
import net.bvanseghi.starcraft.tileentity.ModTileEntities;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.bvanseghi.starcraft.worldgen.SCWorldGen;
import net.bvanseghi.starcraft.worldgen.biome.BiomesSC;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = REFERENCE.MODID, name = REFERENCE.NAME, version = REFERENCE.VERSION)
public class Starcraft {
	
	@Instance(REFERENCE.MODID)
	public static Starcraft instance;
	public static World world;

	@SidedProxy(clientSide = "net.bvanseghi.starcraft.proxy.ClientProxy", serverSide = "net.bvanseghi.starcraft.proxy.CommonProxy")
	public static CommonProxy starcraftProxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();

		// Pre-Initializations
		ModTileEntities.preInit();
		ModFluids.preInit();
		ModBlocks.preInit();
		ModMaterials.preInit();
		ModItems.preInit();
		ModWeapons.preInit();
		ModArmour.preInit();
		ModTools.preInit();
		FuelHandler.preInit();
		BiomesSC.init();
		BucketHandler.initABucket();
		BucketHandler.initBBucket();
		
		SCWorldGen.preInit();
		SCWorldGen.setupWorldgen();
		
		
		starcraftProxy.registerRenderObjects();
		
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		ModRecipes.init();
		ModEntities.init();
		Achievements.init();

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static void addNames(){
		LanguageRegistry.addName(new ItemStack(ModItems.ingot, 0, 0), "Copper Ingot");
		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 0), "Protoss Essence");
		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 1), "Terran Essence");
		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 2), "Zerg Essence");
		
		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 0), "C14 Barrel");
		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 1), "C14 Body");
		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 2), "C14 Grip");
		
		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 0), "Energy");
		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 1), "Corrupted Energy");
		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 2), "Void Energy");
	}
	
	public static void oreRegistrations(){
		OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.ingot, 0, 0));
		OreDictionary.registerOre("ingotTitanium", new ItemStack(ModItems.ingot, 0, 0));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.ingot, 0, 0));
		
	}
	
	public static void addOreRecipes(){
		
	}

}

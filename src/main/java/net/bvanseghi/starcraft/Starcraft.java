package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.ModEntities;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.handlers.FuelHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.proxy.IProxy;
import net.bvanseghi.starcraft.tileentity.ModTileEntities;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.bvanseghi.starcraft.worldgen.SCWorldGen;
import net.bvanseghi.starcraft.worldgen.biome.BiomesSC;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = REFERENCE.MODID, name = REFERENCE.NAME, version = REFERENCE.VERSION)
public class Starcraft {
	
	@Instance(REFERENCE.MODID)
	public static Starcraft instance;

	@SidedProxy(clientSide = "net.bvanseghi.starcraft.proxy.ClientProxy")
	public static IProxy proxy;

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
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		ModEntities.init();
		Achievements.init();
	}
	
//	public static void addNames() {
		//TODO: add lang file data to these
//		LanguageRegistry.addName(new ItemStack(ModItems.ingot, 0, 0), "Copper Ingot");
//		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 0), "Protoss Essence");
//		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 1), "Terran Essence");
//		LanguageRegistry.addName(new ItemStack(ModItems.essence, 1, 2), "Zerg Essence");
//		
//		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 0), "C14 Barrel");
//		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 1), "C14 Body");
//		LanguageRegistry.addName(new ItemStack(ModItems.c14Parts, 1, 2), "C14 Grip");
//		
//		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 0), "Energy");
//		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 1), "Corrupted Energy");
//		LanguageRegistry.addName(new ItemStack(ModItems.energy, 1, 2), "Void Energy");
//	}
	
	public static void oreRegistrations(){
		OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.ingot, 1, 0));
		OreDictionary.registerOre("ingotTitanium", new ItemStack(ModItems.ingot, 1, 3));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.ingot, 1, 4));
		OreDictionary.registerOre("dustSteel", new ItemStack(ModItems.dust, 1, 0));
		OreDictionary.registerOre("dustIron", new ItemStack(ModItems.dust, 1, 1));
		OreDictionary.registerOre("dustCarbon", new ItemStack(ModItems.dust, 1, 2));
	}
}

package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.achievement.Achievements;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.ModEntities;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.handlers.FuelHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.material.ModMaterials;
import net.bvanseghi.starcraft.proxy.ClientProxy;
import net.bvanseghi.starcraft.proxy.CommonProxy;
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
import scala.tools.nsc.backend.icode.TypeKinds.REFERENCE;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Starcraft {
	
	@Instance(Reference.MODID)
	public static Starcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();
		// Pre-Initializations
		proxy.registerRenders();
		ModTileEntities.preInit();
		//ModFluids.preInit();
		ModMaterials.preInit();
		ModWeapons.preInit();
		ModArmour.preInit();
		ModTools.preInit();
		FuelHandler.preInit();
		//BiomesSC.init();
		//BucketHandler.initABucket();
		//BucketHandler.initBBucket();
		
		//SCWorldGen.preInit();
		SCWorldGen.setupWorldgen();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		//ModItems.registerRenders();
		//ModRecipes.init();
		ModEntities.init();
		Achievements.init();
	}
}

package scmc.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class StarcraftConfig {
	
	public static boolean useSubCfg;
	
	public static boolean dTempVis = false;
	
	public static double broodlingHP = 15;
	public static double brutaliskHP = 750;
	public static double hydraliskHP = 50;
	public static double civHP = 20;
	public static double dProbeHP = 20;
	public static double dTempHP = 60;
	public static double droneHP = 20;
	public static double larvaHP = 12.5;
	public static double larvaCocoonHP = 100;
	public static double overlordHP = 100;
	public static double probeHP = 20;
	public static double zealotHP = 100;
	public static double preaverHP = 200;
	public static double zerglingHP = 25;
	
	public static double broodlingDmg = 2;
	public static double brutaliskDmg = 25;
	public static double dTempDmg = 24.5;
	public static double zealotDmg = 8;
	public static double zerglingDmg = 5;

	public static boolean creepCanSpread;
	public static boolean creepSpreadScalesWithDif;
	public static int creepSpreadBaseVal;

	public static boolean vanillaSpawn;
	public static int dimChar;
	public static int dimShakuras;
	
	public static float MAX_VALUE  = 1000;

	public static void preInit() {
		Configuration config = new Configuration(new File("config/Starcraft.cfg"));

		// General
		config.setCategoryComment("General", "General settings.");
		
		useSubCfg = config.getBoolean("Use Sub-Config", "General", false, "If true, the sub-config \'./scmc_editor/units.cfg\' will be used to set various mob stats. NOTE: New file will be generated in the Config folder if this is set to true.");
		
		creepCanSpread = config.get("General", "Zerg - Creep Can Spread", true).getBoolean(true);
		
		creepSpreadScalesWithDif = config.get("General", "Zerg - Creep Spread Scales With Difficulty", false)
				.getBoolean(false);
		
		creepSpreadBaseVal = config.getInt("Creep Spread Base Value", "General", 4, 0, 16,
				"Base value for Creep Spread. WARNING, DO NOT SET THIS HIGH");

		// Dimensions
		config.setCategoryComment("Dimension ID's", "Change the ID's of the dimensions");
		dimChar = config.getInt("Char ID", "Dimension ID's", 2, -128, 127, "ID for the planet Char");
		dimShakuras = config.getInt("Shakuras ID", "Dimension ID's", 3, -128, 127, "ID for the planet Shakuras");
		// Biome Generation (Overworld)

		// Overall Structure Generation
		config.setCategoryComment("World Generation", "Enable or disable structure generation.");
		// Terran Structure Generation
		// generateTerranBunker = config.get("World Generation", "Terran -
		// Bunker", true).getBoolean(true);
		// Protoss Structure Generation
		// generateProtossPylon = config.get("World Generation", "Protoss -
		// Pylon", true).getBoolean(true);
		// generateProtossDarkPylon = config.get("World Generation", "Protoss -
		// Dark Pylon", true).getBoolean(true);
		// generateProtossVoidPylon = config.get("World Generation", "Protoss -
		// Void Pylon", true).getBoolean(true);
		// generateProtossWarpGateChar = config.get("World Generation", "Protoss
		// - Warp Gate (To Char)", true).getBoolean(true);
		// generateProtossWarpGateOverworld = config.get("World Generation",
		// "Protoss - Warp Gate (To Overworld)", true).getBoolean(true);
		// generateProtossWarpGateShakuras= config.get("World Generation",
		// "Protoss - Warp Gate (To Shakuras)", true).getBoolean(true);
		// Zerg Structure Generation
		// generateZergSpawningPool = config.get("World Generation", "Zerg -
		// Spawning Pool", true).getBoolean(true);
		// generateZergSpire = config.get("World Generation", "Zerg - Spire",
		// true).getBoolean(true);
		// Xel'Naga Structure Generation
		// Neutral Structure Generation
		// generateVespeneGeyser = config.get("World Generation", "Neutral -
		// Vespene Geyser", true).getBoolean(true);
		// generateRichVespeneGeyser = config.get("World Generation", "Neutral -
		// Rich Vespene Geyser", true).getBoolean(true);
		// generateMineralBed = config.get("World Generation", "Neutral -
		// Mineral Bed", true).getBoolean(true);
		// generateRichMineralBed = config.get("World Generation", "Neutral -
		// Rich Mineral Bed", true).getBoolean(true);

		// Ore Generation
		config.setCategoryComment("Ore Generation", "Enable or disable ore generation.");
		// generateTitaniumOre = config.get("Ore Generation", "Titanium Ore",
		// true).getBoolean(true);
		// generateCopperOre = config.get("Ore Generation", "Copper Ore",
		// true).getBoolean(true);
		// generateAlienOre = config.get("Ore Generation", "Alien Ore",
		// true).getBoolean(true);
		// generateMineralOre = config.get("Ore Generation", "Mineral Ore",
		// true).getBoolean(true);
		// generateRichMineralOre = config.get("Ore Generation", "Rich Mineral
		// Ore", true).getBoolean(true);

		// Mob Spawning
		config.setCategoryComment("Mob Spawning", "Decide which mobs will spawn and which mobs will not.");
		vanillaSpawn = config.get("Mob Spawning", "Vanilla - Disable Vanilla Mob Spawn", false).getBoolean(false);
		// larvaCanSpawn = config.get("Mob Spawning", "Zerg - Larva",
		// true).getBoolean(true);
		// larvaCocoonCanSpawn = config.get("Mob Spawning", "Zerg - Larva
		// Cocoon", true).getBoolean(true);

		// Dimension Id Configuration

		// Debugging/TESTING

		config.save();
		
		//////////////
		//SUB-CONFIG//
		//////////////
		
		if(useSubCfg) {
			Configuration subCfg = new Configuration(new File("config/scmc_editor/units.cfg"));
			
			subCfg.setCategoryComment("Protoss", "Protoss mob modifications");
			subCfg.setCategoryComment("Terran", "Terran mob modifications");
			subCfg.setCategoryComment("Zerg", "Zerg mob modifications");
			
			broodlingHP = subCfg.getFloat("Broodling HP", "Zerg", 15, 1, MAX_VALUE, "Health of the Broodling. Be sane else you might break something");
			broodlingDmg = subCfg.getFloat("Broodling Damage", "Zerg", 2, 1, MAX_VALUE, "Damage the Broodling deals. Be sane else you might break something");
			
			brutaliskHP = subCfg.getFloat("Brutalisk HP", "Zerg", 750, 1, MAX_VALUE, "Health of the Brutalisk. Be sane else you might break something");
			brutaliskDmg = subCfg.getFloat("Brutalisk Damage", "Zerg", 25, 1, MAX_VALUE, "Damage the Brutalisk deals. Be sane else you might break something");
			
			civHP = subCfg.getFloat("Civilian HP", "Terran", 20, 1, MAX_VALUE, "Health of the Civilian. Be sane else you might break something");
			
			dProbeHP = subCfg.getFloat("Dark Probe HP", "Protoss", 20, 1, MAX_VALUE, "Health of the Dark Probe. Be sane else you might break something");
			
			droneHP  =subCfg.getFloat("Drone HP", "Zerg", 20, 1, MAX_VALUE, "Health of the Drone. Be sane else you might break something");
			
			dTempVis = subCfg.getBoolean("Dark Templar Visibility", "Protoss", false, "If true, the Dark Templar will be visible");
			dTempHP = subCfg.getFloat("Dark Templar HP", "Protoss", 60, 1, MAX_VALUE, "Health of the Dark Templar. Be sane else you might break something");
			dTempDmg = subCfg.getFloat("Dark Templar Damage", "Protoss", 24.5f, 1, MAX_VALUE, "Damage the Dark Templar deals. Be sane else you\'ll break something");
			
			larvaHP = subCfg.getFloat("Larva HP", "Zerg", 12.5f, 1, MAX_VALUE, "Health of the Larva. Be sane else you might break something");
			
			larvaCocoonHP = subCfg.getFloat("Larva Cocoon HP", "Zerg", 100, 1, MAX_VALUE, "Health of the Larva Cocoon. Be sane else you might break something");
			
			overlordHP = subCfg.getFloat("Overlord HP", "Zerg", 100, 1, MAX_VALUE, "Health of the Overlord. Be sane else you might break something");
			
			probeHP = subCfg.getFloat("Probe HP", "Protoss", 20, 1, MAX_VALUE, "Health of the Probe. Be sane else you might break something");
			
			zealotHP = subCfg.getFloat("Zealot HP", "Protoss", 100, 1, MAX_VALUE, "Health of the Zealot. Be sane else you might break something");
			zealotDmg = subCfg.getFloat("Zealot Damage", "Protoss", 8, 1, MAX_VALUE, "Damage the Zealot deals. Be sane else you might break something");
			
			zerglingHP = subCfg.getFloat("Zergling HP", "Zerg", 25, 1, MAX_VALUE, "Health of the Zergling. Be sane else you might break something");
			zerglingDmg = subCfg.getFloat("Zergling Damage", "Zerg", 5, 1, MAX_VALUE, "Damage the Zergling deals. Be sane else you might break something");
			
			subCfg.save();
		}
		
		
	}
}

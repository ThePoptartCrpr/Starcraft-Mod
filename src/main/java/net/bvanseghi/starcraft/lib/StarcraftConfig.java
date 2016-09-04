package net.bvanseghi.starcraft.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class StarcraftConfig {

	public static boolean creepCanSpread;
	
	
	public static void preInit() {
		Configuration config = new Configuration(new File("config/Starcraft.cfg"));

		config.load();

		// General
		config.setCategoryComment("General", "General settings.");
		creepCanSpread = config.get("General", "Zerg - Creep Can Spread", true).getBoolean(true);

		// Biome Generation (Overworld)
	
		// Overall Structure Generation
		config.setCategoryComment("World Generation", "Enable or disable structure generation.");
		// Terran Structure Generation
			//generateTerranBunker = config.get("World Generation", "Terran - Bunker", true).getBoolean(true);
		// Protoss Structure Generation
			//generateProtossPylon = config.get("World Generation", "Protoss - Pylon", true).getBoolean(true);
			//generateProtossDarkPylon = config.get("World Generation", "Protoss - Dark Pylon", true).getBoolean(true);
			//generateProtossVoidPylon = config.get("World Generation", "Protoss - Void Pylon", true).getBoolean(true);
			//generateProtossWarpGateChar = config.get("World Generation", "Protoss - Warp Gate (To Char)", true).getBoolean(true);
			//generateProtossWarpGateOverworld = config.get("World Generation", "Protoss - Warp Gate (To Overworld)", true).getBoolean(true);
			//generateProtossWarpGateShakuras= config.get("World Generation", "Protoss - Warp Gate (To Shakuras)", true).getBoolean(true);
		// Zerg Structure Generation
			//generateZergSpawningPool = config.get("World Generation", "Zerg - Spawning Pool", true).getBoolean(true);
			//generateZergSpire = config.get("World Generation", "Zerg - Spire", true).getBoolean(true);
		// Xel'Naga Structure Generation
		// Neutral Structure Generation
			//generateVespeneGeyser = config.get("World Generation", "Neutral - Vespene Geyser", true).getBoolean(true);
			//generateRichVespeneGeyser = config.get("World Generation", "Neutral - Rich Vespene Geyser", true).getBoolean(true);
			//generateMineralBed = config.get("World Generation", "Neutral - Mineral Bed", true).getBoolean(true);
			//generateRichMineralBed = config.get("World Generation", "Neutral - Rich Mineral Bed", true).getBoolean(true);

		// Ore Generation
		config.setCategoryComment("Ore Generation", "Enable or disable ore generation.");
			//generateTitaniumOre = config.get("Ore Generation", "Titanium Ore", true).getBoolean(true);
			//generateCopperOre = config.get("Ore Generation", "Copper Ore", true).getBoolean(true);
			//generateAlienOre = config.get("Ore Generation", "Alien Ore", true).getBoolean(true);
			//generateMineralOre = config.get("Ore Generation", "Mineral Ore", true).getBoolean(true);
			//generateRichMineralOre = config.get("Ore Generation", "Rich Mineral Ore", true).getBoolean(true);

		// Mob Spawning
		config.setCategoryComment("Mob Spawning", "Decide which mobs will spawn and which mobs will not.");
			//larvaCanSpawn = config.get("Mob Spawning", "Zerg - Larva", true).getBoolean(true);
			//larvaCocoonCanSpawn = config.get("Mob Spawning", "Zerg - Larva Cocoon", true).getBoolean(true);
		
		// Dimension Id Configuration
		
		//Debugging/TESTING
		

		config.save();
	}
	 
	
}

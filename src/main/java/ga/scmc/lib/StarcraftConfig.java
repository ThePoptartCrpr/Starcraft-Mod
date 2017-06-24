package ga.scmc.lib;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class StarcraftConfig {

	//I honestly hate this whole BOOL_ thing, but organization is nice...
	public static boolean BOOL_CREEP_CAN_SPREAD = FactorySettings.BOOL_CREEP_CAN_SPREAD;
	public static boolean BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY = FactorySettings.BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY;
	public static boolean BOOL_ENABLE_SUBCONFIG = FactorySettings.BOOL_ENABLE_SUBCONFIG;
	public static boolean BOOL_IS_DARK_TEMPLAR_VISIBLE = FactorySettings.BOOL_IS_DARK_TEMPLAR_VISIBLE;
	public static boolean BOOL_VANILLA_MOBS_CAN_SPAWN = FactorySettings.BOOL_VANILLA_MOBS_CAN_SPAWN;
	
	public static double BROODLING_DAMAGE = FactorySettings.BROODLING_DAMAGE_CONV;
	public static double BROODLING_HEALTH = FactorySettings.BROODLING_HEALTH_CONV;
	
	public static double BRUTALISK_DAMAGE = FactorySettings.BRUTALISK_DAMAGE_CONV;
	public static double BRUTALISK_HEALTH = FactorySettings.BRUTALISK_HEALTH_CONV;
	
	public static double CIVILIAN_HEALTH = FactorySettings.CIVILIAN_HEALTH_CONV;
	
	public static double DARK_PROBE_HEALTH = FactorySettings.DARK_PROBE_HEALTH_CONV;
	public static double DARK_TEMPLAR_DAMAGE = FactorySettings.DARK_TEMPLAR_DAMAGE_CONV;
	public static double DARK_TEMPLAR_HEALTH = FactorySettings.DARK_TEMPLAR_HEALTH_CONV;
	
	public static double DRONE_HEALTH = FactorySettings.DRONE_HEALTH_CONV;
	
	public static double HYDRALISK_DAMAGE = FactorySettings.HYDRALISK_DAMAGE_CONV;
	public static double HYDRALISK_HEALTH = FactorySettings.HYDRALISK_HEALTH_CONV;
	
	public static double INFESTED_CIVILIAN_DAMAGE = FactorySettings.INFESTED_CIVILIAN_DAMAGE_CONV;
	public static double INFESTED_CIVILIAN_HEALTH = FactorySettings.INFESTED_CIVILIAN_HEALTH_CONV;
	
	public static int INT_CREEP_SPREAD_BASE_VALUE = FactorySettings.INT_CREEP_SPREAD_BASE_VALUE;
	public static int INT_DIMENSION_CHAR;
	public static int INT_DIMENSION_SHAKURAS;
	
	public static double LARVA_COCOON_HEALTH = FactorySettings.LARVA_COCOON_HEALTH_CONV;
	public static double LARVA_HEALTH = FactorySettings.LARVA_HEALTH_CONV;
	
	public static double OVERLORD_HEALTH = FactorySettings.OVERLORD_HEALTH_CONV;
	
	public static double PROBE_HEALTH = FactorySettings.PROBE_HEALTH_CONV;
	
	public static double REAVER_HEALTH = FactorySettings.PREAVER_HEALTH_CONV;
	
	public static double ZEALOT_DAMAGE = FactorySettings.ZEALOT_DAMAGE_CONV;
	public static double ZEALOT_HEALTH = FactorySettings.ZEALOT_HEALTH_CONV;
	
	public static double ZERGLING_BOOST_ARMOR = FactorySettings.ZERGLING_BOOST_ARMOR_CONV;
	public static double ZERGLING_BOOST_DAMAGE = FactorySettings.ZERGLING_BOOST_DAMAGE_CONV;
	public static double ZERGLING_BOOST_HEALTH = FactorySettings.ZERGLING_BOOST_HEALTH_CONV;
	public static double ZERGLING_BOOST_RANGE = FactorySettings.ZERGLING_BOOST_RANGE_CONV;
	public static double ZERGLING_BOOST_SPEED = FactorySettings.ZERGLING_BOOST_SPEED_CONV;

	public static double ZERGLING_RAPTOR_ARMOR = FactorySettings.ZERGLING_RAPTOR_ARMOR_CONV;
	public static double ZERGLING_RAPTOR_DAMAGE = FactorySettings.ZERGLING_RAPTOR_DAMAGE_CONV;
	public static double ZERGLING_RAPTOR_HEALTH = FactorySettings.ZERGLING_RAPTOR_HEALTH_CONV;
	public static double ZERGLING_RAPTOR_RANGE = FactorySettings.ZERGLING_RAPTOR_RANGE_CONV;
	public static double ZERGLING_RAPTOR_SPEED = FactorySettings.ZERGLING_RAPTOR_SPEED_CONV;
	
	public static double ZERGLING_SC2_ARMOR = FactorySettings.ZERGLING_RAPTOR_ARMOR_CONV;
	public static double ZERGLING_SC2_DAMAGE = FactorySettings.ZERGLING_RAPTOR_DAMAGE_CONV;
	public static double ZERGLING_SC2_HEALTH = FactorySettings.ZERGLING_RAPTOR_HEALTH_CONV;
	public static double ZERGLING_SC2_RANGE = FactorySettings.ZERGLING_RAPTOR_RANGE_CONV;
	public static double ZERGLING_SC2_SPEED = FactorySettings.ZERGLING_RAPTOR_SPEED_CONV;
	
	public static double ZERGLING_SWARMLING_ARMOR = FactorySettings.ZERGLING_RAPTOR_ARMOR_CONV;
	public static double ZERGLING_SWARMLING_DAMAGE = FactorySettings.ZERGLING_RAPTOR_DAMAGE_CONV;
	public static double ZERGLING_SWARMLING_HEALTH = FactorySettings.ZERGLING_RAPTOR_HEALTH_CONV;
	public static double ZERGLING_SWARMLING_RANGE = FactorySettings.ZERGLING_RAPTOR_RANGE_CONV;
	public static double ZERGLING_SWARMLING_SPEED = FactorySettings.ZERGLING_RAPTOR_SPEED_CONV;

	public static void preInit() {
		Configuration config = new Configuration(new File("config/Starcraft.cfg"));

		// General
		config.setCategoryComment("General", "General settings.");
		BOOL_ENABLE_SUBCONFIG = config.getBoolean("Use Sub-Config", "General", FactorySettings.BOOL_ENABLE_SUBCONFIG,
				"If true, the sub-config \'./scmc_editor/units.cfg\' will be used to set various mob stats. NOTE: New file will be generated in the Config folder if this is set to true.");
		BOOL_CREEP_CAN_SPREAD = config.get("General", "Zerg - Creep Can Spread", FactorySettings.BOOL_CREEP_CAN_SPREAD).getBoolean(FactorySettings.BOOL_CREEP_CAN_SPREAD);
		BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY = config
				.get("General", "Zerg - Creep Spread Scales With Difficulty", FactorySettings.BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY)
				.getBoolean(FactorySettings.BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY);
		INT_CREEP_SPREAD_BASE_VALUE = config.getInt("Creep Spread Base Value", "General", FactorySettings.INT_CREEP_SPREAD_BASE_VALUE, 0, 16, "Base value for Creep Spread. WARNING, DO NOT SET THIS HIGH");
		
		// Dimensions
		config.setCategoryComment("Dimension ID's", "Change the ID's of the dimensions");
		INT_DIMENSION_CHAR = config.getInt("Char ID", "Dimension ID's", 2, -128, 127, "ID for the planet Char");
		INT_DIMENSION_SHAKURAS = config.getInt("Shakuras ID", "Dimension ID's", 3, -128, 127, "ID for the planet Shakuras");
		
		// Overall Structure Generation
		config.setCategoryComment("World Generation", "Enable or disable structure generation.");
		
		// Ore Generation
		config.setCategoryComment("Ore Generation", "Enable or disable ore generation.");
		
		// Mob Spawning
		config.setCategoryComment("Mob Spawning", "Decide which mobs will spawn and which mobs will not.");
		BOOL_VANILLA_MOBS_CAN_SPAWN = config.get("Mob Spawning", "Vanilla - Disable Vanilla Mob Spawn", FactorySettings.BOOL_VANILLA_MOBS_CAN_SPAWN).getBoolean(FactorySettings.BOOL_VANILLA_MOBS_CAN_SPAWN);

		config.save();

		//////////////
		// SUB-CONFIG//
		//////////////

		if(BOOL_ENABLE_SUBCONFIG) {
			Configuration subCfg = new Configuration(new File("config/scmc_editor/units.cfg"));

			subCfg.setCategoryComment("Protoss", "Protoss mob modifications");
			DARK_PROBE_HEALTH = subCfg.getFloat("Dark Probe HP", "Protoss", (float) FactorySettings.DARK_PROBE_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Dark Probe.");

			BOOL_IS_DARK_TEMPLAR_VISIBLE = subCfg.getBoolean("Dark Templar Visibility", "Protoss", FactorySettings.BOOL_IS_DARK_TEMPLAR_VISIBLE, "If true, the Dark Templar will be visible");
			DARK_TEMPLAR_HEALTH = subCfg.getFloat("Dark Templar HP", "Protoss", (float) FactorySettings.DARK_TEMPLAR_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Dark Templar.");
			DARK_TEMPLAR_DAMAGE = subCfg.getFloat("Dark Templar Damage", "Protoss", (float) FactorySettings.DARK_TEMPLAR_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Dark Templar deals.");

			PROBE_HEALTH = subCfg.getFloat("Probe HP", "Protoss", (float) FactorySettings.PROBE_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Probe.");

			REAVER_HEALTH = subCfg.getFloat("Reaver HP", "Protoss", (float) FactorySettings.PREAVER_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Reaver.");

			ZEALOT_HEALTH = subCfg.getFloat("Zealot HP", "Protoss", (float) FactorySettings.ZEALOT_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Zealot.");
			ZEALOT_DAMAGE = subCfg.getFloat("Zealot Damage", "Protoss", (float) FactorySettings.ZEALOT_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Zealot deals.");
			
			subCfg.setCategoryComment("Terran", "Terran mob modifications");
			CIVILIAN_HEALTH = subCfg.getFloat("Civilian HP", "Terran", (float) FactorySettings.CIVILIAN_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Civilian.");
			
			subCfg.setCategoryComment("Zerg", "Zerg mob modifications");
			BROODLING_HEALTH = subCfg.getFloat("Broodling HP", "Zerg", (float) FactorySettings.BROODLING_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Broodling.");
			BROODLING_DAMAGE = subCfg.getFloat("Broodling Damage", "Zerg", (float) FactorySettings.BROODLING_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Broodling deals.");

			BRUTALISK_HEALTH = subCfg.getFloat("Brutalisk HP", "Zerg", (float) FactorySettings.BRUTALISK_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Brutalisk.");
			BRUTALISK_DAMAGE = subCfg.getFloat("Brutalisk Damage", "Zerg", (float) FactorySettings.BRUTALISK_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Brutalisk deals.");
			
			LARVA_HEALTH = subCfg.getFloat("Larva HP", "Zerg", (float) FactorySettings.LARVA_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Larva.");

			LARVA_COCOON_HEALTH = subCfg.getFloat("Larva Cocoon HP", "Zerg", (float) FactorySettings.LARVA_COCOON_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Larva Cocoon.");

			OVERLORD_HEALTH = subCfg.getFloat("Overlord HP", "Zerg", (float) FactorySettings.OVERLORD_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Overlord.");
			
			DRONE_HEALTH = subCfg.getFloat("Drone HP", "Zerg", (float) FactorySettings.DRONE_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Drone.");

			ZERGLING_BOOST_ARMOR = subCfg.getFloat("Zergling (Boost) Armor", "Zerg", (float) FactorySettings.ZERGLING_BOOST_ARMOR_CONV, 1, Float.MAX_VALUE, "Armor of the Boosted Zergling.");
			ZERGLING_BOOST_HEALTH = subCfg.getFloat("Zergling (Boost) HP", "Zerg", (float) FactorySettings.ZERGLING_BOOST_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Boosted Zergling.");
			ZERGLING_BOOST_DAMAGE = subCfg.getFloat("Zergling (Boost) Damage", "Zerg", (float) FactorySettings.ZERGLING_BOOST_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Boosted Zergling deals.");
			ZERGLING_BOOST_RANGE = subCfg.getFloat("Zergling (Boost) Follow Range", "Zerg", (float) FactorySettings.ZERGLING_BOOST_RANGE_CONV, 1, Float.MAX_VALUE, "Range the Boosted Zergling can spot other mobs.");
			ZERGLING_BOOST_SPEED = subCfg.getFloat("Zergling (Boost) Speed", "Zerg", (float) FactorySettings.ZERGLING_BOOST_SPEED_CONV, 1, Float.MAX_VALUE, "Speed the Boosted Zergling moves at.");
			
			ZERGLING_RAPTOR_ARMOR = subCfg.getFloat("Zergling (Raptor) Armor", "Zerg", (float) FactorySettings.ZERGLING_RAPTOR_ARMOR_CONV, 1, Float.MAX_VALUE, "Armor of the Raptor Zergling.");
			ZERGLING_RAPTOR_HEALTH = subCfg.getFloat("Zergling (Raptor) HP", "Zerg", (float) FactorySettings.ZERGLING_RAPTOR_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Raptor Zergling.");
			ZERGLING_RAPTOR_DAMAGE = subCfg.getFloat("Zergling (Raptor) Damage", "Zerg", (float) FactorySettings.ZERGLING_RAPTOR_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Raptor Zergling deals.");
			ZERGLING_RAPTOR_RANGE = subCfg.getFloat("Zergling (Raptor) Follow Range", "Zerg", (float) FactorySettings.ZERGLING_RAPTOR_RANGE_CONV, 1, Float.MAX_VALUE, "Range the Raptor Zergling can spot other mobs.");
			ZERGLING_RAPTOR_SPEED = subCfg.getFloat("Zergling (Raptor) Speed", "Zerg", (float) FactorySettings.ZERGLING_RAPTOR_SPEED_CONV, 1, Float.MAX_VALUE, "Speed the Raptor Zergling moves at.");
			
			ZERGLING_SWARMLING_ARMOR = subCfg.getFloat("Zergling (Swarmling) Armor", "Zerg", (float) FactorySettings.ZERGLING_SWARMLING_ARMOR_CONV, 1, Float.MAX_VALUE, "Armor of the Swarmling.");
			ZERGLING_SWARMLING_HEALTH = subCfg.getFloat("Zergling (Swarmling) HP", "Zerg", (float) FactorySettings.ZERGLING_SWARMLING_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the Swarmling.");
			ZERGLING_SWARMLING_DAMAGE = subCfg.getFloat("Zergling (Swarmling) Damage", "Zerg", (float) FactorySettings.ZERGLING_SWARMLING_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the Swarmling deals.");
			ZERGLING_SWARMLING_RANGE = subCfg.getFloat("Zergling (Swarmling) Follow Range", "Zerg", (float) FactorySettings.ZERGLING_SWARMLING_RANGE_CONV, 1, Float.MAX_VALUE, "Range the Swarmling can spot other mobs.");
			ZERGLING_SWARMLING_SPEED = subCfg.getFloat("Zergling (Swarmling) Speed", "Zerg", (float) FactorySettings.ZERGLING_SWARMLING_SPEED_CONV, 1, Float.MAX_VALUE, "Speed the Swarmling moves at.");
			
			ZERGLING_SC2_ARMOR = subCfg.getFloat("Zergling (SC2) Armor", "Zerg", (float) FactorySettings.ZERGLING_SC2_ARMOR_CONV, 1, Float.MAX_VALUE, "Armor of the SC2 Zergling.");
			ZERGLING_SC2_HEALTH = subCfg.getFloat("Zergling (SC2) HP", "Zerg", (float) FactorySettings.ZERGLING_SC2_HEALTH_CONV, 1, Float.MAX_VALUE, "Health of the SC2 Zergling.");
			ZERGLING_SC2_DAMAGE = subCfg.getFloat("Zergling (SC2) Damage", "Zerg", (float) FactorySettings.ZERGLING_SC2_DAMAGE_CONV, 1, Float.MAX_VALUE, "Damage the SC2 Zergling deals.");
			ZERGLING_SC2_RANGE = subCfg.getFloat("Zergling (SC2) Follow Range", "Zerg", (float) FactorySettings.ZERGLING_SC2_RANGE_CONV, 1, Float.MAX_VALUE, "Range the SC2 Zergling can spot other mobs.");
			ZERGLING_SC2_SPEED = subCfg.getFloat("Zergling (SC2) Speed", "Zerg", (float) FactorySettings.ZERGLING_SC2_SPEED_CONV, 1, Float.MAX_VALUE, "Speed the SC2 Zergling moves at.");
			
			subCfg.save();
		}

	}
}
package scmc.lib;

/**
 * 
 * @author Hypeirochus
 * This class is for converting SC2 data values to MC data values. In it, you'll find methods and such that do so. Variables marked with _RAW are SC2 values, and
 * variables marked with _CONV are, of course, the converted values.
 */
public class FactorySettings {
	
	/**
	 * General variables
	 */
	public static boolean BOOL_ENABLE_SUBCONFIG = false;
	public static boolean BOOL_VANILLA_MOBS_CAN_SPAWN = true;
	
	public static int INT_DIMENSION_CHAR;
	public static int INT_DIMENSION_SHAKURAS;
	
	private static final float MAX_VALUE = Float.MAX_VALUE;
	
	/**
	 * Protoss variables
	 */
	public static boolean BOOL_IS_DARK_TEMPLAR_VISIBLE = false;
	
	//Probe (Tal'Darim)
	public static double DARK_PROBE_HEALTH_RAW = 40.0D;
	
	public static double DARK_PROBE_HEALTH_CONV = standardHealthConversion(DARK_PROBE_HEALTH_RAW);
	
	//Dark Templar (Nerazim)
	public static double DARK_TEMPLAR_DAMAGE_RAW = 45.0D;
	public static double DARK_TEMPLAR_HEALTH_RAW = 120.0D;
	
	public static double DARK_TEMPLAR_DAMAGE_CONV = standardDamageConversion(DARK_TEMPLAR_DAMAGE_RAW);
	public static double DARK_TEMPLAR_HEALTH_CONV = standardHealthConversion(DARK_TEMPLAR_HEALTH_RAW);
	
	//Probe (Khalai)
	public static double PROBE_HEALTH_RAW = 40.0D;
	
	public static double PROBE_HEALTH_CONV = standardHealthConversion(PROBE_HEALTH_RAW);
	
	//Reaver
	public static double PREAVER_HEALTH_RAW = 200.0D;
	
	public static double PREAVER_HEALTH_CONV = specialHealthConversion(PREAVER_HEALTH_RAW);
	
	//Zealot
	public static double ZEALOT_DAMAGE_RAW = 16.0D;
	public static double ZEALOT_HEALTH_RAW = 150.0D;
	
	public static double ZEALOT_DAMAGE_CONV = standardDamageConversion(ZEALOT_DAMAGE_RAW);
	public static double ZEALOT_HEALTH_CONV = standardHealthConversion(ZEALOT_HEALTH_RAW);
	
	/**
	 * Terran variables
	 */
	//Civilian
	public static double CIVILIAN_HEALTH_RAW = 40.0D;
	
	public static double CIVILIAN_HEALTH_CONV = standardHealthConversion(CIVILIAN_HEALTH_RAW);
	
	/**
	 * Zerg variables
	 */
	//Booleans
	public static boolean BOOL_CREEP_CAN_SPREAD = true;
	public static boolean BOOL_CREEP_SPREAD_SCALES_WITH_DIFFICULTY = false;
	
	//Integers
	public static int INT_CREEP_SPREAD_BASE_VALUE;
	
	//Broodling
	public static double BROODLING_DAMAGE_RAW = 4.0D;
	public static double BROODLING_HEALTH_RAW = 30.0D;
	
	public static double BROODLING_DAMAGE_CONV = specialDamageConversion(BROODLING_DAMAGE_RAW);
	public static double BROODLING_HEALTH_CONV = specialHealthConversion(BROODLING_HEALTH_RAW);
	
	//Brutalisk
	public static double BRUTALISK_DAMAGE_RAW = 100.0D;
	public static double BRUTALISK_HEALTH_RAW = 1500.0D;
	
	public static double BRUTALISK_DAMAGE_CONV = standardDamageConversion(BRUTALISK_DAMAGE_RAW);
	public static double BRUTALISK_HEALTH_CONV = standardHealthConversion(BRUTALISK_HEALTH_RAW);
	
	//Drone
	public static double DRONE_HEALTH_RAW = 40.0D;
	
	public static double DRONE_HEALTH_CONV = standardHealthConversion(DRONE_HEALTH_RAW);
	
	//Hydralisk
	public static double HYDRALISK_DAMAGE_RAW = 12.0D;
	public static double HYDRALISK_HEALTH_RAW = 90.0D;
	
	public static double HYDRALISK_DAMAGE_CONV = standardDamageConversion(HYDRALISK_DAMAGE_RAW);
	public static double HYDRALISK_HEALTH_CONV = standardHealthConversion(HYDRALISK_HEALTH_RAW);
	
	//Infested Civilian
	public static double INFESTED_CIVILIAN_DAMAGE_RAW = 8.0D;
	public static double INFESTED_CIVILIAN_HEALTH_RAW = 35.0D;
	
	public static double INFESTED_CIVILIAN_DAMAGE_CONV = standardDamageConversion(INFESTED_CIVILIAN_DAMAGE_RAW);
	public static double INFESTED_CIVILIAN_HEALTH_CONV = standardHealthConversion(INFESTED_CIVILIAN_HEALTH_RAW);
	
	//Larva Cocoon
	public static double LARVA_COCOON_HEALTH_RAW = 200.0D;
	
	public static double LARVA_COCOON_HEALTH_CONV = standardHealthConversion(LARVA_COCOON_HEALTH_RAW);
	
	//Larva
	public static double LARVA_HEALTH_RAW = 25.0D;
	
	public static double LARVA_HEALTH_CONV = standardHealthConversion(LARVA_HEALTH_RAW);
	
	//Overlord
	public static double OVERLORD_HEALTH_RAW = 200.0D;
	
	public static double OVERLORD_HEALTH_CONV = standardHealthConversion(OVERLORD_HEALTH_RAW);

	//Zergling (Boost)
	public static double ZERGLING_BOOST_ARMOR_RAW = 0.0D;
	public static double ZERGLING_BOOST_DAMAGE_RAW = 5.0D;
	public static double ZERGLING_BOOST_HEALTH_RAW = 35.0D;
	public static double ZERGLING_BOOST_SPEED_RAW = 5.57D;
	
	public static double ZERGLING_BOOST_ARMOR_CONV = 0.0D;
	public static double ZERGLING_BOOST_DAMAGE_CONV = standardDamageConversion(ZERGLING_BOOST_DAMAGE_RAW);
	public static double ZERGLING_BOOST_HEALTH_CONV = standardHealthConversion(ZERGLING_BOOST_HEALTH_RAW);
	public static double ZERGLING_BOOST_RANGE_CONV = 16.0D;
	public static double ZERGLING_BOOST_SPEED_CONV = standardSpeedConversion(ZERGLING_BOOST_SPEED_RAW);
	
	//Zergling (SC2)
	public static double ZERGLING_SC2_ARMOR_RAW = 0.0D;
	public static double ZERGLING_SC2_DAMAGE_RAW = 5.0D;
	public static double ZERGLING_SC2_HEALTH_RAW = 35.0D;
	public static double ZERGLING_SC2_SPEED_RAW = 4.13D;
	
	public static double ZERGLING_SC2_ARMOR_CONV = standardArmorConversion(ZERGLING_SC2_ARMOR_RAW);
	public static double ZERGLING_SC2_DAMAGE_CONV = standardDamageConversion(ZERGLING_SC2_DAMAGE_RAW);
	public static double ZERGLING_SC2_HEALTH_CONV = standardHealthConversion(ZERGLING_SC2_HEALTH_RAW);
	public static double ZERGLING_SC2_RANGE_CONV = 16.0D;
	public static double ZERGLING_SC2_SPEED_CONV = standardSpeedConversion(ZERGLING_SC2_SPEED_RAW);
	
	//Zergling (Raptor)
	public static double ZERGLING_RAPTOR_ARMOR_RAW = 0.0D;
	public static double ZERGLING_RAPTOR_DAMAGE_RAW = 5.0D;
	public static double ZERGLING_RAPTOR_HEALTH_RAW = 25.0D;
	public static double ZERGLING_RAPTOR_SPEED_RAW = 4.13D;
	
	public static double ZERGLING_RAPTOR_ARMOR_CONV = standardArmorConversion(ZERGLING_RAPTOR_ARMOR_RAW);
	public static double ZERGLING_RAPTOR_DAMAGE_CONV = standardDamageConversion(ZERGLING_RAPTOR_DAMAGE_RAW);
	public static double ZERGLING_RAPTOR_HEALTH_CONV = standardHealthConversion(ZERGLING_RAPTOR_HEALTH_RAW);
	public static double ZERGLING_RAPTOR_RANGE_CONV = 16.0D;
	public static double ZERGLING_RAPTOR_SPEED_CONV = standardSpeedConversion(ZERGLING_RAPTOR_SPEED_RAW);
		
	//Zergling (Swarmling)
	public static double ZERGLING_SWARMLING_ARMOR_RAW = 0.0D;
	public static double ZERGLING_SWARMLING_DAMAGE_RAW = 5.0D;
	public static double ZERGLING_SWARMLING_HEALTH_RAW = 35.0D;
	public static double ZERGLING_SWARMLING_SPEED_RAW = 4.13D;
	
	public static double ZERGLING_SWARMLING_ARMOR_CONV = standardArmorConversion(ZERGLING_SWARMLING_ARMOR_RAW);
	public static double ZERGLING_SWARMLING_DAMAGE_CONV = standardDamageConversion(ZERGLING_SWARMLING_DAMAGE_RAW);
	public static double ZERGLING_SWARMLING_HEALTH_CONV = standardHealthConversion(ZERGLING_SWARMLING_HEALTH_RAW);
	public static double ZERGLING_SWARMLING_RANGE_CONV = 16.0D;
	public static double ZERGLING_SWARMLING_SPEED_CONV = standardSpeedConversion(ZERGLING_SWARMLING_SPEED_RAW);
	
	
	
	/**
	 * A standard method to convert SC2 health to MC health
	 * @param h health
	 * @return
	 */
	public static double standardHealthConversion(double h) {
		h *= 0.666666666;
		return h;
	}
	
	/**
	 * A standard method to convert SC2 speed to MC speed
	 * @param s speed
	 * @return
	 */
	public static double standardSpeedConversion(double s) {
		s *= 0.08;
		return s;
	}
	
	/**
	 * A standard method to convert SC2 damage to MC damage
	 * @param d damage
	 * @return
	 */
	public static double standardDamageConversion(double d) {
		d *= 0.5;
		return d;
	}
	
	/**
	 * A standard method to convert SC2 armor to MC armor
	 * @param a armor
	 * @return
	 */
	public static double standardArmorConversion(double a) {
		a *= 1.0;
		return a;
	}
	
	/**
	 * A mini-boss method to convert SC2 health to MC health. This method is
	 * only for special mini-bosses, such as {@link: EntityBrutalisk} or {@link: EntityProtossReaver}
	 * @param h health
	 * @return
	 */
	public static double specialHealthConversion(double h) {
		h *= 0.5;
		return h;
	}
	
	/**
	 * A mini-boss method to convert SC2 speed to MC speed. This method is
	 * only for special mini-bosses, such as {@link: EntityBrutalisk} or {@link: EntityProtossReaver}
	 * @param s speed
	 * @return
	 */
	public static double specialSpeedConversion(double s) {
		s *= 0.08;
		return s;
	}
	
	/**
	 * A mini-boss method to convert SC2 damage to MC damage. This method is
	 * only for special mini-bosses, such as {@link: EntityBrutalisk} or {@link: EntityProtossReaver}
	 * @param d damage
	 * @return
	 */
	public static double specialDamageConversion(double d) {
		d *= 0.4;
		return d;
	}
	
	/**
	 * A mini-boss method to convert SC2 armor to MC armor. This method is
	 * only for special mini-bosses, such as {@link: EntityBrutalisk} or {@link: EntityProtossReaver}
	 * @param a armor
	 * @return
	 */
	public static double specialArmorConversion(double a) {
		a *= 1.0;
		return a;
	}
}

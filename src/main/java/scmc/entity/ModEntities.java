package scmc.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import scmc.Starcraft;
import scmc.worldgen.biome.BiomesSC;

public class ModEntities {

	private static int entityID = 0;

	public static void generateSpawnEgg() {
		EntityRegistry.registerEgg(EntityZealot.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityProbe.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityProtossReaver.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityScarab.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntitySentry.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityDarkTemplar.class, 1447446, 45824);
		EntityRegistry.registerEgg(EntityDarkProbe.class, 1447446, 12648448);

		EntityRegistry.registerEgg(EntityBrutalisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityHydralisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZergling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingSC2.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingRaptor.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingSwarmling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZerglingBoost.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityQueen.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityOverlord.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarva.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarvaCocoon.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityBroodling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityInfestedCivilian.class, 11403519, 7684608);

		EntityRegistry.registerEgg(EntityCivilian.class, 7566195, 16639);
		EntityRegistry.registerEgg(EntitySpiderMine.class, 7566195, 16639);
	}

	public static void registerEntities() {
		registerEntity(EntityZealot.class, "zealot", 64, 1, true);
		registerEntity(EntityProtossReaver.class, "protossReaver", 64, 1, true);
		registerEntity(EntitySentry.class, "sentry", 64, 1, true);
		registerEntity(EntityScarab.class, "scarab", 64, 1, true);
		registerEntity(EntityProbe.class, "probe", 64, 1, true);
		registerEntity(EntityDarkTemplar.class, "darkTemplar", 64, 1, true);
		registerEntity(EntityDarkProbe.class, "darkProbe", 64, 1, true);

		registerEntity(EntityBrutalisk.class, "brutalisk", 64, 1, true);
		registerEntity(EntityHydralisk.class, "hydralisk", 64, 1, true);
		registerEntity(EntityZergling.class, "zergling", 64, 1, true);
		registerEntity(EntityZerglingSC2.class, "zerglingSC2", 64, 1, true);
		registerEntity(EntityZerglingRaptor.class, "zerglingRaptor", 64, 1, true);
		registerEntity(EntityZerglingSwarmling.class, "zerglingSwarmling", 64, 1, true);
		registerEntity(EntityZerglingBoost.class, "zerglingBoost", 64, 1, true);
		registerEntity(EntityQueen.class, "queen", 64, 1, true);
		registerEntity(EntityOverlord.class, "overlord", 64, 1, true);
		registerEntity(EntityLarva.class, "larva", 64, 1, true);
		registerEntity(EntityLarvaCocoon.class, "larvaCocoon", 64, 1, true);
		registerEntity(EntityBroodling.class, "broodling", 64, 1, true);
		registerEntity(EntityInfestedCivilian.class, "infestedCivilian", 64, 1, true);

		registerEntity(EntityCivilian.class, "civilian", 64, 1, true);
		registerEntity(EntitySpiderMine.class, "spiderMine", 64, 1, true);
	}

	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Starcraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}

	public static void setEntityToSpawn() {
		EntityRegistry.addSpawn(EntityZealot.class, 50, 1, 3, EnumCreatureType.MONSTER, BiomesSC.biomeShakurasCity);
		EntityRegistry.addSpawn(EntityProbe.class, 7, 1, 3, EnumCreatureType.CREATURE, BiomesSC.biomeShakurasCity);
		EntityRegistry.addSpawn(EntityProtossReaver.class, 1, 1, 1, EnumCreatureType.CREATURE, BiomesSC.biomeShakurasCity);
		EntityRegistry.addSpawn(EntityDarkTemplar.class, 35, 1, 2, EnumCreatureType.MONSTER, BiomesSC.biomeShakurasCity);
		EntityRegistry.addSpawn(EntityDarkProbe.class, 7, 1, 3, EnumCreatureType.CREATURE, BiomesSC.biomeShakurasCity);

		EntityRegistry.addSpawn(EntityBrutalisk.class, 1, 1, 1, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityHydralisk.class, 9, 1, 3, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		//EntityRegistry.addSpawn(EntityZergling.class, 1, 1, 5, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityZerglingSC2.class, 25, 1, 5, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityZerglingRaptor.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityZerglingSwarmling.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityZerglingBoost.class, 10, 1, 5, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityQueen.class, 5, 1, 1, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityOverlord.class, 5, 1, 2, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityLarva.class, 5, 1, 3, EnumCreatureType.CREATURE, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityLarvaCocoon.class, 5, 1, 5, EnumCreatureType.CREATURE, BiomesSC.biomeCharCreepInfestation);
		EntityRegistry.addSpawn(EntityInfestedCivilian.class, 15, 1, 3, EnumCreatureType.MONSTER, BiomesSC.biomeCharCreepInfestation);

		EntityRegistry.addSpawn(EntityCivilian.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntitySpiderMine.class, 1, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);

	}
}
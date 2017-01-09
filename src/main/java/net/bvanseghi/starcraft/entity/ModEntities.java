package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.Starcraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

	private static int entityID = 0;
	
	public static void registerEntities() {
		registerEntity(EntityZealot.class, "zealot", 64, 20, true);
		registerEntity(EntityDarkTemplar.class, "templar_dark", 64, 20, true);
		registerEntity(EntityProbe.class, "probe", 64, 20, true);
		registerEntity(EntityDarkProbe.class, "probe_dark", 64, 20, true);
		
		registerEntity(EntityBrutalisk.class, "brutalisk", 64, 20, true);
		registerEntity(EntityZergling.class, "zergling", 64, 20, true);
		registerEntity(EntityLarva.class, "larva", 64, 20, true);
		registerEntity(EntityLarvaCocoon.class, "cocoon_larva", 64, 20, true);
		registerEntity(EntityBroodling.class, "broodling", 64, 20, true);
		
		registerEntity(EntityCivilian.class, "civilian", 64, 20, true);
	}
	
	public static void setEntityToSpawn() {
		EntityRegistry.addSpawn(EntityZealot.class, 20, 1, 5, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityDarkTemplar.class, 20, 1, 5, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityProbe.class, 20, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityDarkProbe.class, 20, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		
		EntityRegistry.addSpawn(EntityBrutalisk.class, 20, 1, 5, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityZergling.class, 20, 1, 5, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityLarva.class, 20, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityLarvaCocoon.class, 20, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		EntityRegistry.addSpawn(EntityBroodling.class, 20, 1, 5, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		
		EntityRegistry.addSpawn(EntityCivilian.class, 20, 1, 5, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.FOREST, Biomes.FOREST_HILLS);
		
	}
	
	public static void generateSpawnEgg() {
		EntityRegistry.registerEgg(EntityZealot.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityDarkTemplar.class, 1447446, 45824);
		EntityRegistry.registerEgg(EntityProbe.class, 13022529, 2412228);
		EntityRegistry.registerEgg(EntityDarkProbe.class, 1447446, 12648448);
		
		EntityRegistry.registerEgg(EntityBrutalisk.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityZergling.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarva.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityLarvaCocoon.class, 11403519, 7684608);
		EntityRegistry.registerEgg(EntityBroodling.class, 11403519, 7684608);
		
		EntityRegistry.registerEgg(EntityCivilian.class, 7566195, 16639);
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Starcraft.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
}

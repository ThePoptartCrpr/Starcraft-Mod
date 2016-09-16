package net.bvanseghi.starcraft.handlers;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.bvanseghi.starcraft.Starcraft;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.entity.EntityDrone;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.entity.EntityOverlord;
import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.entity.EntityScourge;
import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.worldgen.biome.BiomesSC;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler {

	// Hostile Entities

	public static void RegisterBroodling(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva Cocoon
		EntityRegistry.registerGlobalEntityID(EntityBroodling.class, name, entityId);
		EntityRegistry.addSpawn(EntityBroodling.class, 50, 2, 3, EnumCreatureType.monster);
		EntityRegistry.registerModEntity(EntityBroodling.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	
	public static void RegisterScourge(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva Cocoon
		EntityRegistry.registerGlobalEntityID(EntityScourge.class, name, entityId);
		EntityRegistry.addSpawn(EntityScourge.class, 50, 2, 3, EnumCreatureType.monster);
		EntityRegistry.registerModEntity(EntityScourge.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	

	// Peaceful Entities

	public static void RegisterCivilian(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva
		EntityRegistry.registerGlobalEntityID(EntityCivilian.class, name, entityId);
		EntityRegistry.addSpawn(EntityCivilian.class, 30, 2, 3, EnumCreatureType.creature, BiomeGenBase.birchForest, BiomeGenBase.forest);
		EntityRegistry.registerModEntity(EntityCivilian.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	public static void RegisterProbe(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva
		EntityRegistry.registerGlobalEntityID(EntityProbe.class, name, entityId);
		EntityRegistry.addSpawn(EntityProbe.class, 50, 2, 3, EnumCreatureType.creature, BiomesSC.biomeShakurasDesert);
		EntityRegistry.registerModEntity(EntityProbe.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	public static void RegisterArmoredZealot(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the Zealot
		EntityRegistry.registerGlobalEntityID(EntityZealot.class, name, entityId);
		EntityRegistry.addSpawn(EntityZealot.class, 50, 2, 3, EnumCreatureType.monster, BiomesSC.biomeShakurasDesert);
		EntityRegistry.registerModEntity(EntityZealot.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

	public static void RegisterDarkProbe(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva
		EntityRegistry.registerGlobalEntityID(EntityDarkProbe.class, name, entityId);
		EntityRegistry.addSpawn(EntityDarkProbe.class, 50, 2, 3, EnumCreatureType.creature, BiomesSC.biomeShakurasDesert);
		EntityRegistry.registerModEntity(EntityDarkProbe.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

	public static void RegisterLarva(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva
		EntityRegistry.registerGlobalEntityID(EntityLarva.class, name, entityId);
		EntityRegistry.addSpawn(EntityLarva.class, 50, 2, 3, EnumCreatureType.creature, BiomesSC.biomeCreepInfestationChar);
		EntityRegistry.registerModEntity(EntityLarva.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

	public static void RegisterLarvaCocoon(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the larva Cocoon
		EntityRegistry.registerGlobalEntityID(EntityLarvaCocoon.class, name, entityId);
		EntityRegistry.addSpawn(EntityLarvaCocoon.class, 30, 2, 3, EnumCreatureType.creature, BiomesSC.biomeCreepInfestationChar);
		EntityRegistry.registerModEntity(EntityLarvaCocoon.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

	public static void RegisterOverlord(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the Overlord
		EntityRegistry.registerGlobalEntityID(EntityOverlord.class, name, entityId);
		EntityRegistry.addSpawn(EntityOverlord.class, 10, 1, 2, EnumCreatureType.creature, BiomesSC.biomeCreepInfestationChar);
		EntityRegistry.registerModEntity(EntityOverlord.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

	public static void RegisterDrone(Class entityClass, String name, int mainColor, int subColor) {
		// creates colors for Spawn Egg based on name.
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);

		// Unique spawn details for the Drone
		EntityRegistry.registerGlobalEntityID(EntityDrone.class, name, entityId);
		EntityRegistry.addSpawn(EntityDrone.class, 40, 2, 3, EnumCreatureType.creature, BiomesSC.biomeCreepInfestationChar);
		EntityRegistry.registerModEntity(EntityDrone.class, name, entityId, Starcraft.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId),
				new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
}

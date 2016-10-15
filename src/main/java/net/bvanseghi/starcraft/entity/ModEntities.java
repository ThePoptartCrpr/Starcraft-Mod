package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.handlers.EntityHandler;

public class ModEntities {
	public static void init() {
		EntityHandler.registerBroodling(EntityBroodling.class, "Broodling", 11403519, 7684608);
		EntityHandler.registerCivilian(EntityCivilian.class, "Civilian", 13022529, 2412228);
		EntityHandler.registerDarkProbe(EntityDarkProbe.class, "DarkProbe", 1447446, 12648448);
		EntityHandler.registerDarkTemplar(EntityDarkTemplar.class, "DarkTemplar", 13022529, 2412228); //TODO: colors
//		EntityHandler.registerDrone(EntityDrone.class, "Drone", 38400/2, 7684608/2);
		EntityHandler.registerLarva(EntityLarva.class, "Larva", 11403519, 7684608);
		EntityHandler.registerLarvaCocoon(EntityLarvaCocoon.class, "LarvaCocoon", 11403519, 7684608);
		EntityHandler.registerOverlord(EntityOverlord.class, "Overlord", 11403519, 7684608);
		EntityHandler.registerProbe(EntityProbe.class, "Probe", 13022529, 2412228);
//		EntityHandler.registerScourge(EntityScourge.class, "Scourge", 11403519, 7684608);
		EntityHandler.registerZergling(EntityZergling.class, "Zergling", 11403519, 7684608);
		EntityHandler.registerZealot(EntityZealot.class, "Zealot", 13022529, 2412228);
	}
}

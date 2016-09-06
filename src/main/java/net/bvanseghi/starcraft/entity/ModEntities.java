package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.Starcraft;
import net.bvanseghi.starcraft.handlers.EntityHandler;
import net.bvanseghi.starcraft.lib.StarcraftConfig;

public class ModEntities {

	public static void init() {
		
		EntityHandler.RegisterCivilian(EntityCivilian.class, "Civilian", 13022529, 2412228);
		
		
			EntityHandler.RegisterLarva(EntityLarva.class, "Larva", 11403519, 7684608);
		
			EntityHandler.RegisterLarvaCocoon(EntityLarvaCocoon.class, "LarvaCocoon", 38400, 7684608);
		
		
		EntityHandler.RegisterProbe(EntityProbe.class, "Probe", 13022529, 2412228);

		EntityHandler.RegisterDarkProbe(EntityDarkProbe.class, "DarkProbe", 1447446, 12648448);

		EntityHandler.RegisterOverlord(EntityOverlord.class, "Overlord",
		38400/2, 7684608/2);

		EntityHandler.RegisterBroodling(EntityBroodling.class, "Broodling", 38400 / 2, 7684608 / 2);
		
		EntityHandler.RegisterArmoredZealot(EntityArmoredZealot.class, "ArmoredZealot", 38400 / 2, 7684608 / 2);
		
		// EntityHandler.RegisterDrone(EntityDrone.class, "Drone", 38400/2,
		// 7684608/2);
	}

}

package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.handlers.EntityHandler;

public class ModEntities {

	public static void init() {
		
		EntityHandler.RegisterCivilian(EntityCivilian.class, "Civilian", 13022529, 2412228);
		
		
			EntityHandler.RegisterLarva(EntityLarva.class, "Larva", 11403519, 7684608);
		
			EntityHandler.RegisterLarvaCocoon(EntityLarvaCocoon.class, "LarvaCocoon", 11403519, 7684608);
			
			EntityHandler.RegisterOverlord(EntityOverlord.class, "Overlord",
					11403519, 7684608);

			EntityHandler.RegisterBroodling(EntityBroodling.class, "Broodling", 11403519, 7684608);
			
			EntityHandler.RegisterZergling(EntityZergling.class, "Zergling", 11403519, 7684608);
			
			//EntityHandler.RegisterScourge(EntityScourge.class, "Scourge", 11403519, 7684608);
			
			// EntityHandler.RegisterDrone(EntityDrone.class, "Drone", 38400/2,
			// 7684608/2);
		
		
		EntityHandler.RegisterProbe(EntityProbe.class, "Probe", 13022529, 2412228);
		
		EntityHandler.RegisterZealot(EntityZealot.class, "Zealot", 13022529, 2412228);

		EntityHandler.RegisterDarkProbe(EntityDarkProbe.class, "DarkProbe", 1447446, 12648448);
		
		
	}

}

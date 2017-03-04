package net.bvanseghi.starcraft.worldgen;

import net.bvanseghi.starcraft.worldgen.aiur.WorldProviderAiur;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {

	public static final int AiurDimensionID = 4;
	public static final DimensionType AiurDT = DimensionType.register("Aiur", "_starcraft", AiurDimensionID, WorldProviderAiur.class, true);
	
	public static void mainRegistry() {
		registerDimension();
	}

	private static void registerDimension() {
		DimensionManager.registerDimension(AiurDimensionID, AiurDT);
	}
}

package ga.scmc.worldgen;

import ga.scmc.worldgen.aiur.WorldProviderAiur;
import ga.scmc.worldgen.provider.WorldProviderChar;
import ga.scmc.worldgen.provider.WorldProviderShakuras;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {

	public static final int AIUR_DIMENSION_ID = 4;
	public static final DimensionType AIUR_DT = DimensionType.register("Aiur", "_starcraft", AIUR_DIMENSION_ID, WorldProviderAiur.class, true);
	public static final WorldType AIUR_WT = new WorldType("AIUR");
	
	public static final int CHAR_DIMENSION_ID = 2;
	public static final DimensionType CHAR_DT = DimensionType.register("Char", "_starcraft", CHAR_DIMENSION_ID, WorldProviderChar.class, true);
	public static final WorldType CHAR_WT = new WorldType("CHAR");
	
	public static final int SHAKURAS_DIMENSION_ID = 3;
	public static final DimensionType SHAKURAS_DT = DimensionType.register("Shakuras", "_starcraft", SHAKURAS_DIMENSION_ID, WorldProviderShakuras.class, true);
	public static final WorldType SHAKURAS_WT = new WorldType("SHAKURAS");

	public static void registerDimensions() {
		DimensionManager.registerDimension(AIUR_DIMENSION_ID, AIUR_DT);
		DimensionManager.registerDimension(CHAR_DIMENSION_ID, CHAR_DT);
		DimensionManager.registerDimension(SHAKURAS_DIMENSION_ID, SHAKURAS_DT);
	}
}

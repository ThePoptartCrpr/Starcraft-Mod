package ga.scmc.worldgen;

//import ga.scmc.worldgen.aiur.WorldProviderAiur; TODO: move that class into ga.scmc.worldgen.provider (when Aiur's complete)
import ga.scmc.lib.StarcraftConfig;
import ga.scmc.worldgen.provider.WorldProviderChar;
import ga.scmc.worldgen.provider.WorldProviderShakuras;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {

//	public static final int AIUR_DIMENSION_ID = 4;
//	public static final DimensionType AIUR_DT = DimensionType.register("Aiur", "_starcraft", AIUR_DIMENSION_ID, WorldProviderAiur.class, true);
//	public static final WorldType AIUR_WT = new WorldType("AIUR");
	
	public static DimensionType char_dt = null;
	public static final WorldType CHAR_WT = new WorldType("CHAR");
	
	public static DimensionType shakuras_dt = null;
	public static final WorldType SHAKURAS_WT = new WorldType("SHAKURAS");

	public static void registerDimensions() {
		char_dt = DimensionType.register("Char", "_starcraft", StarcraftConfig.INT_DIMENSION_CHAR, WorldProviderChar.class, true);
		shakuras_dt = DimensionType.register("Shakuras", "_starcraft", StarcraftConfig.INT_DIMENSION_SHAKURAS, WorldProviderShakuras.class, true);
		
//		DimensionManager.registerDimension(AIUR_DIMENSION_ID, AIUR_DT);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_CHAR, char_dt);
		DimensionManager.registerDimension(StarcraftConfig.INT_DIMENSION_SHAKURAS, shakuras_dt);
	}
}

package scmc.worldgen.layer;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class GenLayerChar extends GenLayer {
	public GenLayerChar(long par1) {
		super(par1);
	}

	public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType type, String str) {
		GenLayer biomes = new GenLayerCharBiomes(100L);
		int biomeSize = 6;
		for (int i = 0; i < biomeSize; i++) {
			biomes = new GenLayerZoom((long)(1000+i), biomes);
		}
		
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);
		biomes.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);
		return new GenLayer[] { biomes, genlayervoronoizoom };
	}

	@Override
	public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight) {
		return null;
	}
}
package scmc.worldgen.layer;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import scmc.worldgen.biome.BiomesSC;

public class GenLayerShakurasBiomes extends GenLayer {
	public Biome[] dimBiomes = {BiomesSC.biomeShakurasDesert};

	public GenLayerShakurasBiomes(long par1) {
		super(par1);

	}

	public int[] getInts(int x, int z, int width, int depth) {
		int[] dest = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++) {
			for (int dx = 0; dx < width; dx++) {
				this.initChunkSeed(dx + x, dz + z);
//				dest[(dx + dz * width)] = this.dimBiomes[nextInt(this.dimBiomes.length)].getIdForBiome(this.dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome.getIdForBiome(this.dimBiomes[dz]);
			}
		}
		return dest;
	}

}

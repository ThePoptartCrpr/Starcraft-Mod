package net.bvanseghi.starcraft.worldgen.layer;

import net.bvanseghi.starcraft.worldgen.biome.BiomesSC;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCharBiomes extends GenLayer {

	public Biome[] dimBiomes = { BiomesSC.biomeCreepInfestationChar, BiomesSC.biomeAshPlains,
			BiomesSC.biomeMoltenInferno, };

	public GenLayerCharBiomes(long par1) {
		super(par1);

	}

	public int[] getInts(int x, int z, int width, int depth) {
		int[] dest = IntCache.getIntCache(width * depth);
		for (int dz = 0; dz < depth; dz++) {
			for (int dx = 0; dx < width; dx++) {
				this.initChunkSeed(dx + x, dz + z);
				dest[(dx + dz * width)] = this.dimBiomes[nextInt(this.dimBiomes.length)].biomeID;
			}
		}
		return dest;
	}

}

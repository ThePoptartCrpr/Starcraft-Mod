package scmc.worldgen.layer;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import scmc.worldgen.biome.BiomesSC;

public class GenLayerCharBiomes extends GenLayer {
	public Biome[] dimBiomes = {BiomesSC.biomeCharCreepInfestation, BiomesSC.biomeAshPlains, BiomesSC.biomeMoltenInferno};

	public GenLayerCharBiomes(long par1) {
		super(par1);
	}

	@Override
	public int[] getInts(int x, int z, int width, int length) {
		int[] dest = IntCache.getIntCache(width * length); //Simply allocates us some memory.
		for (int dz = 0; dz < length; dz++) {
			for (int dx = 0; dx < width; dx++) {
				this.initChunkSeed(dx + x, dz + z);
//				dest[(dx + dz * width)] = this.dimBiomes[nextInt(this.dimBiomes.length)].getIdForBiome(this.dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome.getIdForBiome(dimBiomes[nextInt(this.dimBiomes.length)]);
			}
		}
		return dest;
	}
}
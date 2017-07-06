package ga.scmc.worldgen.dimchar;

import ga.scmc.worldgen.BiomesSC;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCharBiomes extends GenLayer {

	public Biome[] dimBiomes = { BiomesSC.biomeCharCreepInfestation, BiomesSC.biomeAshPlains, BiomesSC.biomeMoltenInferno, BiomesSC.biomeAshPlateau, BiomesSC.biomeLavaOcean,
			BiomesSC.biomeAshHills, BiomesSC.biomeCharHills, BiomesSC.biomeDauntlessPlateau, BiomesSC.biomeAcidMarsh, BiomesSC.biomeBoneTrench,
			BiomesSC.biomeCharOutskirts };

	public GenLayerCharBiomes(long par1) {
		super(par1);
	}

	@Override
	public int[] getInts(int x, int z, int width, int length) {
		int[] dest = IntCache.getIntCache(width * length); // Simply allocates
															// us some memory.
		for(int dz = 0; dz < length; dz++) {
			for(int dx = 0; dx < width; dx++) {
				initChunkSeed(dx + x, dz + z);
				// dest[(dx + dz * width)] =
				// dimBiomes[nextInt(dimBiomes.length)].getIdForBiome(dimBiomes[dz]);
				dest[(dx + dz * width)] = Biome.getIdForBiome(dimBiomes[nextInt(dimBiomes.length)]);
			}
		}
		return dest;
	}
}
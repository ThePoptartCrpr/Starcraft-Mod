package ga.scmc.worldgen.biomeprovider;

import javax.annotation.Nullable;

import ga.scmc.worldgen.DimensionRegistry;
import ga.scmc.worldgen.biome.BiomesSC;
import ga.scmc.worldgen.layer.GenLayerShakuras;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraft.world.storage.WorldInfo;

public class ShakurasBiomeProvider extends BiomeProvider {

	/** The biome list. */
	private final BiomeCache biomeCache;
	/** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
	private GenLayer biomeIndexLayer;
	private GenLayer genBiomes;

	protected ShakurasBiomeProvider() {
		super();
		biomeCache = new BiomeCache(this);
	}

	private ShakurasBiomeProvider(long seed, WorldType worldTypeIn, String options) {
		this();
		GenLayer[] agenlayer = GenLayerShakuras.initializeAllBiomeGenerators(seed, worldTypeIn, options);
		agenlayer = getModdedBiomeGenerators(worldTypeIn, seed, agenlayer);

		genBiomes = agenlayer[0];
		biomeIndexLayer = agenlayer[1];
	}

	public ShakurasBiomeProvider(WorldInfo info) {
		this(info.getSeed(), DimensionRegistry.SHAKURAS_WT, info.getGeneratorOptions());
	}

	/**
	 * Return a list of biomes for the specified blocks. Args: listToReuse, x,
	 * y, width, length, cacheFlag (if false, don't check biomeCache to avoid
	 * infinite loop in BiomeCacheBlock)
	 */
	@Override
	public Biome[] getBiomeGenAt(@Nullable Biome[] listToReuse, int x, int z, int width, int length, boolean cacheFlag) {
		IntCache.resetIntCache();

		if(listToReuse == null || listToReuse.length < width * length) {
			listToReuse = new Biome[width * length];
		}

		if(cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (z & 15) == 0) {
			Biome[] abiome = biomeCache.getCachedBiomes(x, z);
			System.arraycopy(abiome, 0, listToReuse, 0, width * length);
			return listToReuse;
		} else {
			int[] aint = biomeIndexLayer.getInts(x, z, width, length);

			for(int i = 0; i < width * length; ++i) {
				listToReuse[i] = Biome.getBiome(aint[i], BiomesSC.biomeShakurasDesert);
			}

			return listToReuse;
		}
	}

	/**
	 * Returns an array of biomes for the location input.
	 */
	@Override
	public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height) {
		IntCache.resetIntCache();

		if(biomes == null || biomes.length < width * height) {
			biomes = new Biome[width * height];
		}

		int[] aint = genBiomes.getInts(x, z, width, height);

		try {
			for(int i = 0; i < width * height; ++i) {
				biomes[i] = Biome.getBiome(aint[i], BiomesSC.biomeShakurasDesert);
			}

			// System.out.println("Biomes enabled are: "+biomes.toString());

			return biomes;
		} catch(Throwable throwable) {
			CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
			CrashReportCategory crashreportcategory = crashreport.makeCategory("RawBiomeBlock");
			crashreportcategory.addCrashSection("biomes[] size", Integer.valueOf(biomes.length));
			crashreportcategory.addCrashSection("x", Integer.valueOf(x));
			crashreportcategory.addCrashSection("z", Integer.valueOf(z));
			crashreportcategory.addCrashSection("w", Integer.valueOf(width));
			crashreportcategory.addCrashSection("char_dt", Integer.valueOf(height));
			throw new ReportedException(crashreport);
		}
	}
}
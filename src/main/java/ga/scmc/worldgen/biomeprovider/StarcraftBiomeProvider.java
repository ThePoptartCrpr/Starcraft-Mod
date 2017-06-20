package ga.scmc.worldgen.biomeprovider;

import javax.annotation.Nullable;

import ga.scmc.worldgen.DimensionRegistry;
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

public class StarcraftBiomeProvider extends BiomeProvider {

	/** The biome list. */
	private final BiomeCache biomeCache;
	/** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
	private GenLayer biomeIndexLayer;
	private Biome defaultBiome;
	private GenLayer genBiomes;

	protected StarcraftBiomeProvider() {
		super();
		biomeCache = new BiomeCache(this);
	}

	private StarcraftBiomeProvider(long seed, WorldType worldTypeIn, String options, Class<? extends GenLayer> genLayer) {
		this();
		try {
			GenLayer[] agenlayer = (GenLayer[]) genLayer.getMethod("initializeAllBiomeGenerators", new Class<?>[] { long.class, WorldType.class, String.class }).invoke(null,
					new Object[] { seed, worldTypeIn, options });;
			agenlayer = getModdedBiomeGenerators(worldTypeIn, seed, agenlayer);

			genBiomes = agenlayer[0];
			biomeIndexLayer = agenlayer[1];
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public StarcraftBiomeProvider(WorldInfo info, Biome defaultBiome, Class<? extends GenLayer> genLayer) {
		this(info.getSeed(), DimensionRegistry.CHAR_WT, info.getGeneratorOptions(), genLayer);
		this.defaultBiome = defaultBiome;
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
				listToReuse[i] = Biome.getBiome(aint[i], defaultBiome);
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
				biomes[i] = Biome.getBiome(aint[i], defaultBiome);
			}

			return biomes;
		} catch(Throwable throwable) {
			CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
			CrashReportCategory crashreportcategory = crashreport.makeCategory("RawBiomeBlock");
			crashreportcategory.addCrashSection("biomes[] size", Integer.valueOf(biomes.length));
			crashreportcategory.addCrashSection("x", Integer.valueOf(x));
			crashreportcategory.addCrashSection("z", Integer.valueOf(z));
			crashreportcategory.addCrashSection("w", Integer.valueOf(width));
			crashreportcategory.addCrashSection("h", Integer.valueOf(height));
			throw new ReportedException(crashreport);
		}
	}

}

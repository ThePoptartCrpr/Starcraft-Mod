package net.bvanseghi.starcraft.worldgen.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.worldgen.biome.BiomesSC;
import net.bvanseghi.starcraft.worldgen.layer.GenLayerShakuras;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
public class WorldChunkManagerShakuras extends WorldChunkManager {
	public static ArrayList<BiomeGenBase> allowedBiomes = new ArrayList<BiomeGenBase>(
			Arrays.asList(BiomesSC.biomeShakurasDesert));
	private GenLayer genBiomes;
	/** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
	private GenLayer biomeIndexLayer;
	/** The BiomeCache object for this world. */
	private BiomeCache biomeCache;
	/** A list of biomes that the player can spawn in. */
	private List biomesToSpawnIn;
	private static final String __OBFID = "CL_00000166";
	private float rainfall;

	protected WorldChunkManagerShakuras() {
		this.biomeCache = new BiomeCache(this);
		this.biomesToSpawnIn = new ArrayList();
		this.biomesToSpawnIn.addAll(allowedBiomes);
	}

	public WorldChunkManagerShakuras(long par1, WorldType worldType) {
		this();
		GenLayer[] agenlayer = GenLayerShakuras.initGens(par1, worldType);
		agenlayer = getModdedBiomeGenerators(worldType, par1, agenlayer);
		this.genBiomes = agenlayer[0];
		this.biomeIndexLayer = agenlayer[1];
	}

	public WorldChunkManagerShakuras(World world) {
		this(world.getSeed(), world.getWorldInfo().getTerrainType());
	}

	/**
	 * Gets the list of valid biomes for the player to spawn in.
	 */
	public List getBiomesToSpawnIn() {
		return this.biomesToSpawnIn;
	}

	/**
	 * Returns the BiomeGenBase related to the x, z position on the world.
	 */
	public BiomeGenBase getBiomeGenAt(int x, int z) {
		return this.biomeCache.getBiomeGenAt(x, z);
	}

	/**
	 * Returns a list of rainfall values for the specified blocks. Args:
	 * listToReuse, x, z, width, length.
	 */
	public float[] getRainfall(float[] listToReuse, int x, int z, int width, int length) {
		IntCache.resetIntCache();

		if (listToReuse == null || listToReuse.length < width * length) {
			listToReuse = new float[width * length];
		}

		int[] aint = this.biomeIndexLayer.getInts(x, z, width, length);

		for (int i1 = 0; i1 < width * length; ++i1) {
			try {
				float f = (float) BiomeGenBase.getBiome(aint[i1]).getIntRainfall() / 65536.0F;

				if (f > 1.0F) {
					f = 1.0F;
				}

				listToReuse[i1] = f;
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
				CrashReportCategory crashreportcategory = crashreport.makeCategory("DownfallBlock");
				crashreportcategory.addCrashSection("biome id", Integer.valueOf(i1));
				crashreportcategory.addCrashSection("downfalls[] size", Integer.valueOf(listToReuse.length));
				crashreportcategory.addCrashSection("x", Integer.valueOf(x));
				crashreportcategory.addCrashSection("z", Integer.valueOf(z));
				crashreportcategory.addCrashSection("w", Integer.valueOf(width));
				crashreportcategory.addCrashSection("h", Integer.valueOf(length));
				throw new ReportedException(crashreport);
			}
		}

		return listToReuse;
	}

	/**
	 * Return an adjusted version of a given temperature based on the y height
	 */
	@SideOnly(Side.CLIENT)
	public float getTemperatureAtHeight(float par1, int par2) {
		return par1;
	}

	/**
	 * Returns an array of biomes for the location input.
	 */
	public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1, int par2, int par3, int par4, int par5) {
		IntCache.resetIntCache();

		if (par1 == null || par1.length < par4 * par5) {
			par1 = new BiomeGenBase[par4 * par5];
		}

		int[] aint = this.genBiomes.getInts(par2, par3, par4, par5);

		try {
			for (int i1 = 0; i1 < par4 * par5; ++i1) {
				par1[i1] = BiomeGenBase.getBiome(aint[i1]);
			}

			return par1;
		} catch (Throwable throwable) {
			CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
			CrashReportCategory crashreportcategory = crashreport.makeCategory("RawBiomeBlock");
			crashreportcategory.addCrashSection("biomes[] size", Integer.valueOf(par1.length));
			crashreportcategory.addCrashSection("x", Integer.valueOf(par2));
			crashreportcategory.addCrashSection("z", Integer.valueOf(par3));
			crashreportcategory.addCrashSection("w", Integer.valueOf(par4));
			crashreportcategory.addCrashSection("h", Integer.valueOf(par5));
			throw new ReportedException(crashreport);
		}
	}

	/**
	 * Returns biomes to use for the blocks and loads the other data like
	 * temperature and humidity onto the WorldChunkManager Args: oldBiomeList,
	 * x, z, width, depth
	 */
	public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] oldBiomeList, int x, int z, int width, int depth) {
		return this.getBiomeGenAt(oldBiomeList, x, z, width, depth, true);
	}

	/**
	 * Return a list of biomes for the specified blocks. Args: listToReuse, x,
	 * y, width, length, cacheFlag (if false, don't check biomeCache to avoid
	 * infinite loop in BiomeCacheBlock)
	 */
	public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] listToReuse, int x, int y, int width, int length,
			boolean cacheFlag) {
		IntCache.resetIntCache();

		if (listToReuse == null || listToReuse.length < width * length) {
			listToReuse = new BiomeGenBase[width * length];
		}

		if (cacheFlag && width == 16 && length == 16 && (x & 15) == 0 && (y & 15) == 0) {
			BiomeGenBase[] abiomegenbase1 = this.biomeCache.getCachedBiomes(x, y);
			System.arraycopy(abiomegenbase1, 0, listToReuse, 0, width * length);
			return listToReuse;
		} else {
			int[] aint = this.biomeIndexLayer.getInts(x, y, width, length);

			for (int i1 = 0; i1 < width * length; ++i1) {
				listToReuse[i1] = BiomeGenBase.getBiome(aint[i1]);
			}

			return listToReuse;
		}
	}

	/**
	 * checks given Chunk's Biomes against List of allowed ones
	 */
	public boolean areBiomesViable(int par1, int par2, int par3, List list) {
		IntCache.resetIntCache();
		int l = par1 - par3 >> 2;
		int i1 = par2 - par3 >> 2;
		int j1 = par1 + par3 >> 2;
		int k1 = par2 + par3 >> 2;
		int l1 = j1 - l + 1;
		int i2 = k1 - i1 + 1;
		int[] aint = this.genBiomes.getInts(l, i1, l1, i2);

		try {
			for (int j2 = 0; j2 < l1 * i2; ++j2) {
				BiomeGenBase biomegenbase = BiomeGenBase.getBiome(aint[j2]);

				if (!list.contains(biomegenbase)) {
					return false;
				}
			}

			return true;
		} catch (Throwable throwable) {
			CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
			CrashReportCategory crashreportcategory = crashreport.makeCategory("Layer");
			crashreportcategory.addCrashSection("Layer", this.genBiomes.toString());
			crashreportcategory.addCrashSection("x", Integer.valueOf(par1));
			crashreportcategory.addCrashSection("z", Integer.valueOf(par2));
			crashreportcategory.addCrashSection("radius", Integer.valueOf(par3));
			crashreportcategory.addCrashSection("allowed", list);
			throw new ReportedException(crashreport);
		}
	}

	public ChunkPosition findBiomePosition(int par1, int par2, int par3, List list, Random rand) {
		IntCache.resetIntCache();
		int l = par1 - par3 >> 2;
		int i1 = par2 - par3 >> 2;
		int j1 = par1 + par3 >> 2;
		int k1 = par2 + par3 >> 2;
		int l1 = j1 - l + 1;
		int i2 = k1 - i1 + 1;
		int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
		ChunkPosition chunkposition = null;
		int j2 = 0;

		for (int k2 = 0; k2 < l1 * i2; ++k2) {
			int l2 = l + k2 % l1 << 2;
			int i3 = i1 + k2 / l1 << 2;
			BiomeGenBase biomegenbase = BiomeGenBase.getBiome(aint[k2]);

			if (list.contains(biomegenbase) && (chunkposition == null || rand.nextInt(j2 + 1) == 0)) {
				chunkposition = new ChunkPosition(l2, 0, i3);
				++j2;
			}
		}

		return chunkposition;
	}

	/**
	 * Calls the WorldChunkManager's biomeCache.cleanupCache()
	 */
	public void cleanupCache() {
		this.biomeCache.cleanupCache();
	}

}
package scmc.worldgen.biomeprovider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Biomes;
import net.minecraft.util.ReportedException;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraft.world.storage.WorldInfo;
import scmc.worldgen.DimensionRegistry;
import scmc.worldgen.biome.BiomesSC;
import scmc.worldgen.layer.GenLayerShakuras;

@SuppressWarnings("unused")
public class ShakurasBiomeProvider extends BiomeProvider {
	
	private Biome biomeGenerator;
	
    public static List<Biome> allowedBiomes = Lists.newArrayList(BiomesSC.biomeShakurasDesert);
    private GenLayer genBiomes;
    /** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
    private GenLayer biomeIndexLayer;
    /** The biome list. */
    private final BiomeCache biomeCache;
    private final List<Biome> biomesToSpawnIn;

    protected ShakurasBiomeProvider() {
        biomeCache = new BiomeCache(this);
        biomesToSpawnIn = Lists.newArrayList(allowedBiomes);
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
     * Returns an array of biomes for the location input.
     */
    @Override
    public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height) {
        IntCache.resetIntCache();

        if (biomes == null || biomes.length < width * height)
        {
            biomes = new Biome[width * height];
        }

        int[] aint = this.genBiomes.getInts(x, z, width, height);

        try
        {
            for (int i = 0; i < width * height; ++i)
            {
                biomes[i] = Biome.getBiome(aint[i], BiomesSC.biomeShakurasDesert);
            }
            
            //System.out.println("Biomes enabled are: "+biomes.toString());
            
            return biomes;
        }
        catch (Throwable throwable)
        {
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

    /**
     * Returns biomes to use for the blocks and loads the other data like temperature and humidity onto the
     * WorldChunkManager Args: oldBiomeList, x, z, width, depth
     */
    @Override
    public Biome[] loadBlockGeneratorData(Biome[] oldBiomeList, int x, int z, int width, int depth)
    {
        if (oldBiomeList == null || oldBiomeList.length < width * depth)
        {
            oldBiomeList = new Biome[width * depth];
        }

        Arrays.fill(oldBiomeList, 0, width * depth, this.biomeGenerator);
        return oldBiomeList;
    }

    /**
     * Return a list of biomes for the specified blocks. Args: listToReuse, x, y, width, length, cacheFlag (if false,
     * don't check biomeCache to avoid infinite loop in BiomeCacheBlock)
     */
    @Override
    public Biome[] getBiomeGenAt(Biome[] listToReuse, int x, int z, int width, int length, boolean cacheFlag)
    {
        return this.loadBlockGeneratorData(listToReuse, x, z, width, length);
    }
    
    /**
     * checks given Chunk's Biomes against List of allowed ones
     */
    @Override
    public boolean areBiomesViable(int x, int z, int radius, List<Biome> allowed)
    {
        return allowed.contains(this.biomeGenerator);
    }
}
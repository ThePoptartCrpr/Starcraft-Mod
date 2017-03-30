package scmc.worldgen.biomeprovider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
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
import scmc.worldgen.layer.GenLayerChar;

@SuppressWarnings("unused")
public class CharBiomeProvider extends BiomeProvider {
	
	private Biome biomeGenerator;
	
    public static List<Biome> allowedBiomes = Lists.newArrayList(BiomesSC.biomeAshPlains, BiomesSC.biomeCharCreepInfestation, BiomesSC.biomeMoltenInferno);
    private GenLayer genBiomes;
    /** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
    private GenLayer biomeIndexLayer;
    /** The biome list. */
	private final BiomeCache biomeCache;
    private final List<Biome> biomesToSpawnIn;

    protected CharBiomeProvider() {
        biomeCache = new BiomeCache(this);
        biomesToSpawnIn = Lists.newArrayList(allowedBiomes);
    }

    private CharBiomeProvider(long seed, WorldType worldTypeIn, String options) {
        this();
        GenLayer[] agenlayer = GenLayerChar.initializeAllBiomeGenerators(seed, worldTypeIn, options);
        agenlayer = getModdedBiomeGenerators(worldTypeIn, seed, agenlayer);
        
        genBiomes = agenlayer[0];
        biomeIndexLayer = agenlayer[1];
    }

    public CharBiomeProvider(WorldInfo info) {
        this(info.getSeed(), DimensionRegistry.CHAR_WT, info.getGeneratorOptions());
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
                biomes[i] = Biome.getBiome(aint[i], BiomesSC.biomeAshPlains);
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
     * Returns a list of rainfall values for the specified blocks. Args: listToReuse, x, z, width, length.
     *//*
    public float[] getRainfall(float[] p_76936_1_, int p_76936_2_, int p_76936_3_, int p_76936_4_, int p_76936_5_)
    {
        if (p_76936_1_ == null || p_76936_1_.length < p_76936_4_ * p_76936_5_)
        {
            p_76936_1_ = new float[p_76936_4_ * p_76936_5_];
        }

        Arrays.fill(p_76936_1_, 0, p_76936_4_ * p_76936_5_, this.rainfall);
        return p_76936_1_;
    }*/

    /**
     * Returns biomes to use for the blocks and loads the other data like temperature and humidity onto the
     * WorldChunkManager Args: oldBiomeList, x, z, width, depth
     */
    @Override
    public Biome[] loadBlockGeneratorData(Biome[] listToReuse, int x, int z, int width, int depth)
    {
        if (listToReuse == null || listToReuse.length < width * depth)
        {
            listToReuse = new Biome[width * depth];
        }

        Arrays.fill(listToReuse, 0, width * depth, this.biomeGenerator);
        return listToReuse;
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
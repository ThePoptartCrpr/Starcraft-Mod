package scmc.worldgen.chunk;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraftforge.event.terraingen.TerrainGen;
import scmc.entity.EntityDarkProbe;
import scmc.entity.EntityDarkTemplar;
import scmc.entity.EntityProbe;
import scmc.entity.EntityZealot;
import scmc.worldgen.NormalTerrainGenerator;

public class ChunkProviderShakuras implements IChunkGenerator
{
    protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
    private final Random random;
    private final World worldObj;
    private Biome[] biomesForGeneration;
    
    private List<Biome.SpawnListEntry> mobs = Lists.newArrayList(
    		new Biome.SpawnListEntry(EntityZealot.class, 65, 2, 4),
    		new Biome.SpawnListEntry(EntityDarkTemplar.class, 15, 1, 2),
    		new Biome.SpawnListEntry(EntityProbe.class, 15, 1, 3),
    		new Biome.SpawnListEntry(EntityDarkProbe.class, 5, 1, 3));
    
    private MapGenBase caveGenerator = new MapGenCaves();
    private NormalTerrainGenerator terraingen = new NormalTerrainGenerator();

    public ChunkProviderShakuras(World worldObj) {
        this.worldObj = worldObj;
        long seed = worldObj.getSeed();
        this.random = new Random((seed + 516) * 314);
        terraingen.setup(worldObj, random);
        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
    }

    @Override
    public Chunk provideChunk(int x, int z) {
        ChunkPrimer chunkprimer = new ChunkPrimer();

        // Setup biomes for terraingen
        biomesForGeneration = worldObj.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
        terraingen.setBiomesForGeneration(biomesForGeneration);
        terraingen.generate(x, z, chunkprimer);

        // Setup biomes again for actual biome decoration
        biomesForGeneration = worldObj.getBiomeProvider().loadBlockGeneratorData(biomesForGeneration, x * 16, z * 16, 16, 16);
        terraingen.setBiomesForGeneration(biomesForGeneration);
        
        // This will replace stone with the biome specific stuff
        terraingen.replaceBiomeBlocks(x, z, chunkprimer, this);

        // Generate caves
        caveGenerator.generate(worldObj, x, z, chunkprimer);

        Chunk chunk = new Chunk(worldObj, chunkprimer, x, z);

        byte[] biomeArray = chunk.getBiomeArray();
        for (int i = 0; i < biomeArray.length; ++i) {
            biomeArray[i] = (byte)Biome.getIdForBiome(biomesForGeneration[i]);
        }

        chunk.generateSkylightMap();
        return chunk;
    }

    @Override
    public void populate(int x, int z) {
        int i = x * 16;
        int j = z * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        Biome biome = worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));

        // Add biome decorations (like flowers, grass, trees, ...)
        biome.decorate(worldObj, random, blockpos);

        // Make sure animals appropriate to the biome spawn here when the chunk is generated
        WorldEntitySpawner.performWorldGenSpawning(worldObj, biome, i + 8, j + 8, 16, 16, random);
    }
    
    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
            return mobs;
    }

    @Nullable
    @Override
    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {

    }
}
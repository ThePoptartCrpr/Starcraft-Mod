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
import scmc.entity.EntityZealot;
import scmc.worldgen.NormalTerrainGenerator;

public class ChunkProviderShakuras implements IChunkGenerator
{
    protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
    private final Random random;
    private final World worldObj;
    private Biome[] biomesForGeneration;
    
    private List<Biome.SpawnListEntry> mobs = Lists.newArrayList(new Biome.SpawnListEntry(EntityZealot.class, 100, 2, 2));
    
//    private ChunkProviderSettings settings;
//    private final boolean mapFeaturesEnabled;

    private MapGenBase caveGenerator = new MapGenCaves();
//    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
//    private MapGenVillage villageGenerator = new MapGenVillage();
//    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
//    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
//    private MapGenBase ravineGenerator = new MapGenRavine();
//    private StructureOceanMonument oceanMonumentGenerator = new StructureOceanMonument();
    private NormalTerrainGenerator terraingen = new NormalTerrainGenerator();

    public ChunkProviderShakuras(World worldObj/*, boolean mapFeaturesEnabled*/) {
//    	this.mapFeaturesEnabled = mapFeaturesEnabled;
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
        this.biomesForGeneration = this.worldObj.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
        terraingen.setBiomesForGeneration(biomesForGeneration);
        terraingen.generate(x, z, chunkprimer);

        // Setup biomes again for actual biome decoration
        this.biomesForGeneration = this.worldObj.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 16, z * 16, 16, 16);
        
        // This will replace stone with the biome specific stones
        terraingen.replaceBiomeBlocks(x, z, chunkprimer, this, biomesForGeneration);

        // Generate caves
        this.caveGenerator.generate(this.worldObj, x, z, chunkprimer);

        Chunk chunk = new Chunk(this.worldObj, chunkprimer, x, z);

        byte[] biomeArray = chunk.getBiomeArray();
        for (int i = 0; i < biomeArray.length; ++i) {
            biomeArray[i] = (byte)Biome.getIdForBiome(this.biomesForGeneration[i]);
        }

        chunk.generateSkylightMap();
        return chunk;
    }

    @Override
    public void populate(int x, int z) {
        int i = x * 16;
        int j = z * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        Biome biome = this.worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));

        // Add biome decorations (like flowers, grass, trees, ...)
        biome.decorate(this.worldObj, this.random, blockpos);

        // Make sure animals appropriate to the biome spawn here when the chunk is generated
        WorldEntitySpawner.performWorldGenSpawning(this.worldObj, biome, i + 8, j + 8, 16, 16, this.random);
    }
    
    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        // If you want normal creatures appropriate for this biome then uncomment the
        // following two lines:
//        Biome biome = this.worldObj.getBiome(pos);
//        return biome.getSpawnableList(creatureType);

        if (creatureType == EnumCreatureType.MONSTER){
            return mobs;
        }
        return ImmutableList.of();

    }

    @Nullable
    @Override
    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {

    }
    
    /*@Override
	public void populate(int x, int z)
    {
        BlockFalling.fallInstantly = true;
        int i = x * 16;
        int j = z * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        Biome biome = worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));
        random.setSeed(worldObj.getSeed());
        long k = random.nextLong() / 2L * 2L + 1L;
        long l = random.nextLong() / 2L * 2L + 1L;
        random.setSeed((long)x * k + (long)z * l ^ worldObj.getSeed());
        boolean flag = false;
        ChunkPos chunkpos = new ChunkPos(x, z);

        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, worldObj, random, x, z, flag);

        if (mapFeaturesEnabled)
        {
            if (settings.useMineShafts)
            {
                mineshaftGenerator.generateStructure(worldObj, random, chunkpos);
            }

            if (settings.useVillages)
            {
                flag = villageGenerator.generateStructure(worldObj, random, chunkpos);
            }

            if (settings.useStrongholds)
            {
                strongholdGenerator.generateStructure(worldObj, random, chunkpos);
            }

            if (settings.useTemples)
            {
                scatteredFeatureGenerator.generateStructure(worldObj, random, chunkpos);
            }

            if (settings.useMonuments)
            {
                oceanMonumentGenerator.generateStructure(worldObj, random, chunkpos);
            }
        }

        if (biome != Biomes.DESERT && biome != Biomes.DESERT_HILLS && settings.useWaterLakes && !flag && random.nextInt(settings.waterLakeChance) == 0)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, random, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE))
        {
            int i1 = random.nextInt(16) + 8;
            int j1 = random.nextInt(256);
            int k1 = random.nextInt(16) + 8;
            (new WorldGenLakes(Blocks.WATER)).generate(worldObj, random, blockpos.add(i1, j1, k1));
        }

        if (!flag && random.nextInt(settings.lavaLakeChance / 10) == 0 && settings.useLavaLakes)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, random, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA))
        {
            int i2 = random.nextInt(16) + 8;
            int l2 = random.nextInt(random.nextInt(248) + 8);
            int k3 = random.nextInt(16) + 8;

            if (l2 < worldObj.getSeaLevel() || random.nextInt(settings.lavaLakeChance / 8) == 0)
            {
                (new WorldGenLakes(Blocks.LAVA)).generate(worldObj, random, blockpos.add(i2, l2, k3));
            }
        }

        if (settings.useDungeons)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, random, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON))
        {
            for (int j2 = 0; j2 < settings.dungeonChance; ++j2)
            {
                int i3 = random.nextInt(16) + 8;
                int l3 = random.nextInt(256);
                int l1 = random.nextInt(16) + 8;
                (new WorldGenDungeons()).generate(worldObj, random, blockpos.add(i3, l3, l1));
            }
        }

        biome.decorate(worldObj, random, new BlockPos(i, 0, j));
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, random, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
        WorldEntitySpawner.performWorldGenSpawning(worldObj, biome, i + 8, j + 8, 16, 16, random);
        blockpos = blockpos.add(8, 0, 8);

        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, random, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE))
        {
        for (int k2 = 0; k2 < 16; ++k2)
        {
            for (int j3 = 0; j3 < 16; ++j3)
            {
                BlockPos blockpos1 = worldObj.getPrecipitationHeight(blockpos.add(k2, 0, j3));
                BlockPos blockpos2 = blockpos1.down();

                if (worldObj.canBlockFreezeWater(blockpos2))
                {
                    worldObj.setBlockState(blockpos2, Blocks.ICE.getDefaultState(), 2);
                }

                if (worldObj.canSnowAt(blockpos1, true))
                {
                    worldObj.setBlockState(blockpos1, Blocks.SNOW_LAYER.getDefaultState(), 2);
                }
            }
        }
        }//Forge: End ICE

        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, worldObj, random, x, z, flag);

        BlockFalling.fallInstantly = false;
    }

    @Override
	public boolean generateStructures(Chunk chunkIn, int x, int z)
    {
        boolean flag = false;

        if (settings.useMonuments && mapFeaturesEnabled && chunkIn.getInhabitedTime() < 3600L)
        {
            flag |= oceanMonumentGenerator.generateStructure(worldObj, random, new ChunkPos(x, z));
        }

        return flag;
    }

    @Override
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos)
    {
        Biome biome = worldObj.getBiomeGenForCoords(pos);

        if (mapFeaturesEnabled)
        {
            if (creatureType == EnumCreatureType.MONSTER && scatteredFeatureGenerator.isSwampHut(pos))
            {
                return scatteredFeatureGenerator.getScatteredFeatureSpawnList();
            }

            if (creatureType == EnumCreatureType.MONSTER && settings.useMonuments && oceanMonumentGenerator.isPositionInStructure(worldObj, pos))
            {
                return oceanMonumentGenerator.getScatteredFeatureSpawnList();
            }
        }

        return biome.getSpawnableList(creatureType);
    }

    @Override
	@Nullable
    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position)
    {
        return "Stronghold".equals(structureName) && strongholdGenerator != null ? strongholdGenerator.getClosestStrongholdPos(worldIn, position) : null;
    }

    @Override
	public void recreateStructures(Chunk chunkIn, int x, int z)
    {
        if (mapFeaturesEnabled)
        {
            if (settings.useMineShafts)
            {
                mineshaftGenerator.generate(worldObj, x, z, (ChunkPrimer)null);
            }

            if (settings.useVillages)
            {
                villageGenerator.generate(worldObj, x, z, (ChunkPrimer)null);
            }

            if (settings.useStrongholds)
            {
                strongholdGenerator.generate(worldObj, x, z, (ChunkPrimer)null);
            }

            if (settings.useTemples)
            {
                scatteredFeatureGenerator.generate(worldObj, x, z, (ChunkPrimer)null);
            }

            if (settings.useMonuments)
            {
                oceanMonumentGenerator.generate(worldObj, x, z, (ChunkPrimer)null);
            }
        }
    }*/
}
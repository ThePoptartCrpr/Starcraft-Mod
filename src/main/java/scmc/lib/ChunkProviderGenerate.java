package scmc.lib;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;

public class ChunkProviderGenerate implements IChunkGenerator {
    private static final IBlockState STONE = Blocks.STONE.getDefaultState();
    private final Random rand;
    private NoiseGeneratorOctaves minLimitPerlinNoise;
    private NoiseGeneratorOctaves maxLimitPerlinNoise;
    private NoiseGeneratorOctaves mainPerlinNoise;
    private NoiseGeneratorPerlin surfaceNoise;
    private NoiseGeneratorOctaves scaleNoise;
    private NoiseGeneratorOctaves depthNoise;
    private NoiseGeneratorOctaves forestNoise;
    private final World worldObj;
    private final boolean mapFeaturesEnabled;
    private final WorldType terrainType;
    private final double[] heightMap;
    private final float[] biomeWeights;
    private ChunkProviderSettings settings;
    private IBlockState oceanBlock = Blocks.WATER.getDefaultState();
    private double[] depthBuffer = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
    private MapGenVillage villageGenerator = new MapGenVillage();
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();
    private StructureOceanMonument oceanMonumentGenerator = new StructureOceanMonument();
    private Biome[] biomesForGeneration;
    private double[] mainNoiseRegion;
    private double[] minLimitRegion;
    private double[] maxLimitRegion;
    private double[] depthRegion;

    public ChunkProviderGenerate(World worldIn, long seed, boolean mapFeaturesEnabledIn, String str) {
    	caveGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(caveGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE);
    	strongholdGenerator = (MapGenStronghold)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(strongholdGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.STRONGHOLD);
    	villageGenerator = (MapGenVillage)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(villageGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.VILLAGE);
    	mineshaftGenerator = (MapGenMineshaft)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(mineshaftGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.MINESHAFT);
    	scatteredFeatureGenerator = (MapGenScatteredFeature)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(scatteredFeatureGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE);
    	ravineGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(ravineGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE);
    	oceanMonumentGenerator = (StructureOceanMonument)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(oceanMonumentGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.OCEAN_MONUMENT);
    	
        worldObj = worldIn;
        mapFeaturesEnabled = mapFeaturesEnabledIn;
        terrainType = worldIn.getWorldInfo().getTerrainType();
        rand = new Random(seed);
        minLimitPerlinNoise = new NoiseGeneratorOctaves(rand, 16);
        maxLimitPerlinNoise = new NoiseGeneratorOctaves(rand, 16);
        mainPerlinNoise = new NoiseGeneratorOctaves(rand, 8);
        surfaceNoise = new NoiseGeneratorPerlin(rand, 4);
        scaleNoise = new NoiseGeneratorOctaves(rand, 10);
        depthNoise = new NoiseGeneratorOctaves(rand, 16);
        forestNoise = new NoiseGeneratorOctaves(rand, 8);
        heightMap = new double[825];
        biomeWeights = new float[25];

        for(int i = -2; i <= 2; i++) {
            for(int j = -2; j <= 2; j++) {
                float f = 10 / MathHelper.sqrt_float((float)(i * i + j * j) + 0.2F);
                biomeWeights[i + 2 + (j + 2) * 5] = f;
            }
        }

        if(str != null) {
            settings = ChunkProviderSettings.Factory.jsonToFactory(str).build();
            oceanBlock = settings.useLavaOceans ? Blocks.LAVA.getDefaultState() : Blocks.WATER.getDefaultState();
            worldIn.setSeaLevel(settings.seaLevel);
        }

        net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld ctx = new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld(minLimitPerlinNoise, maxLimitPerlinNoise, mainPerlinNoise, surfaceNoise, scaleNoise, depthNoise, forestNoise);
        ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, rand, ctx);
        minLimitPerlinNoise = ctx.getLPerlin1();
        maxLimitPerlinNoise = ctx.getLPerlin2();
        mainPerlinNoise = ctx.getPerlin();
        surfaceNoise = ctx.getHeight();
        scaleNoise = ctx.getScale();
        depthNoise = ctx.getDepth();
        forestNoise = ctx.getForest();
    }

    public void setBlocksInChunk(int x, int z, ChunkPrimer primer) {
        biomesForGeneration = worldObj.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
        generateHeightmap(x * 4, 0, z * 4);

        for (int i = 0; i < 4; ++i)
        {
            int j = i * 5;
            int k = (i + 1) * 5;

            for (int l = 0; l < 4; ++l)
            {
                int i1 = (j + l) * 33;
                int j1 = (j + l + 1) * 33;
                int k1 = (k + l) * 33;
                int l1 = (k + l + 1) * 33;

                for (int i2 = 0; i2 < 32; ++i2)
                {
                    double d1 = heightMap[i1 + i2];
                    double d2 = heightMap[j1 + i2];
                    double d3 = heightMap[k1 + i2];
                    double d4 = heightMap[l1 + i2];
                    double d5 = (heightMap[i1 + i2 + 1] - d1) * 0.125D;
                    double d6 = (heightMap[j1 + i2 + 1] - d2) * 0.125D;
                    double d7 = (heightMap[k1 + i2 + 1] - d3) * 0.125D;
                    double d8 = (heightMap[l1 + i2 + 1] - d4) * 0.125D;

                    for (int j2 = 0; j2 < 8; ++j2)
                    {
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * 0.25D;
                        double d13 = (d4 - d2) * 0.25D;

                        for (int k2 = 0; k2 < 4; ++k2)
                        {
                            double d16 = (d11 - d10) * 0.25D;
                            double lvt_45_1_ = d10 - d16;

                            for (int l2 = 0; l2 < 4; ++l2)
                            {
                                if ((lvt_45_1_ += d16) > 0)
                                {
                                    primer.setBlockState(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, STONE);
                                }
                                else if (i2 * 8 + j2 < settings.seaLevel)
                                {
                                    primer.setBlockState(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, oceanBlock);
                                }
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    public void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {
        if (!net.minecraftforge.event.ForgeEventFactory.onReplaceBiomeBlocks(this, x, z, primer, worldObj)) return;
        depthBuffer = surfaceNoise.getRegion(depthBuffer, (double)(x * 16), (double)(z * 16), 16, 16, 0.0625D, 0.0625D, 1);

        for (int i = 0; i < 16; ++i)
        {
            for (int j = 0; j < 16; ++j)
            {
                Biome biome = biomesIn[j + i * 16];
                biome.genTerrainBlocks(worldObj, rand, primer, x * 16 + i, z * 16 + j, depthBuffer[j + i * 16]);
            }
        }
    }

    @Override
    public Chunk provideChunk(int x, int z) {
        rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
        ChunkPrimer chunkprimer = new ChunkPrimer();
        setBlocksInChunk(x, z, chunkprimer);
        biomesForGeneration = worldObj.getBiomeProvider().loadBlockGeneratorData(biomesForGeneration, x * 16, z * 16, 16, 16);
        replaceBiomeBlocks(x, z, chunkprimer, biomesForGeneration);

        if (settings.useCaves)
        {
            caveGenerator.generate(worldObj, x, z, chunkprimer);
        }

        if (settings.useRavines)
        {
            ravineGenerator.generate(worldObj, x, z, chunkprimer);
        }

        if (mapFeaturesEnabled)
        {
            if (settings.useMineShafts)
            {
                mineshaftGenerator.generate(worldObj, x, z, chunkprimer);
            }

            if (settings.useVillages)
            {
                villageGenerator.generate(worldObj, x, z, chunkprimer);
            }

            if (settings.useStrongholds)
            {
                strongholdGenerator.generate(worldObj, x, z, chunkprimer);
            }

            if (settings.useTemples)
            {
                scatteredFeatureGenerator.generate(worldObj, x, z, chunkprimer);
            }

            if (settings.useMonuments)
            {
                oceanMonumentGenerator.generate(worldObj, x, z, chunkprimer);
            }
        }

        Chunk chunk = new Chunk(worldObj, chunkprimer, x, z);
        byte[] abyte = chunk.getBiomeArray();

        for (int i = 0; i < abyte.length; ++i)
        {
            abyte[i] = (byte)Biome.getIdForBiome(biomesForGeneration[i]);
        }

        chunk.generateSkylightMap();
        return chunk;
    }

    private void generateHeightmap(int p_185978_1_, int p_185978_2_, int p_185978_3_) {
        depthRegion = depthNoise.generateNoiseOctaves(depthRegion, p_185978_1_, p_185978_3_, 5, 5, (double)settings.depthNoiseScaleX, (double)settings.depthNoiseScaleZ, (double)settings.depthNoiseScaleExponent);
        float f = settings.coordinateScale;
        float f1 = settings.heightScale;
        mainNoiseRegion = mainPerlinNoise.generateNoiseOctaves(mainNoiseRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)(f / settings.mainNoiseScaleX), (double)(f1 / settings.mainNoiseScaleY), (double)(f / settings.mainNoiseScaleZ));
        minLimitRegion = minLimitPerlinNoise.generateNoiseOctaves(minLimitRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)f, (double)f1, (double)f);
        maxLimitRegion = maxLimitPerlinNoise.generateNoiseOctaves(maxLimitRegion, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double)f, (double)f1, (double)f);
        int i = 0;
        int j = 0;

        for (int k = 0; k < 5; ++k)
        {
            for (int l = 0; l < 5; ++l)
            {
                float f2 = 0;
                float f3 = 0;
                float f4 = 0;
                Biome biome = biomesForGeneration[k + 2 + (l + 2) * 10];

                for (int j1 = -2; j1 <= 2; ++j1)
                {
                    for (int k1 = -2; k1 <= 2; ++k1)
                    {
                        Biome biome1 = biomesForGeneration[k + j1 + 2 + (l + k1 + 2) * 10];
                        float f5 = settings.biomeDepthOffSet + biome1.getBaseHeight() * settings.biomeDepthWeight;
                        float f6 = settings.biomeScaleOffset + biome1.getHeightVariation() * settings.biomeScaleWeight;

                        if (terrainType == WorldType.AMPLIFIED && f5 > 0)
                        {
                            f5 = 1 + f5 * 2;
                            f6 = 1 + f6 * 4;
                        }

                        float f7 = biomeWeights[j1 + 2 + (k1 + 2) * 5] / (f5 + 2);

                        if (biome1.getBaseHeight() > biome.getBaseHeight())
                        {
                            f7 /= 2;
                        }

                        f2 += f6 * f7;
                        f3 += f5 * f7;
                        f4 += f7;
                    }
                }

                f2 = f2 / f4;
                f3 = f3 / f4;
                f2 = f2 * 0.9F + 0.1F;
                f3 = (f3 * 4 - 1) / 8;
                double d7 = depthRegion[j] / 8000;

                if (d7 < 0)
                {
                    d7 = -d7 * 0.3D;
                }

                d7 = d7 * 3 - 2;

                if (d7 < 0)
                {
                    d7 = d7 / 2;

                    if (d7 < -1)
                    {
                        d7 = -1;
                    }

                    d7 = d7 / 1.4D;
                    d7 = d7 / 2;
                }
                else
                {
                    if (d7 > 1)
                    {
                        d7 = 1;
                    }

                    d7 = d7 / 8;
                }

                ++j;
                double d8 = (double)f3;
                double d9 = (double)f2;
                d8 = d8 + d7 * 0.2D;
                d8 = d8 * (double)settings.baseSize / 8;
                double d0 = (double)settings.baseSize + d8 * 4;

                for (int l1 = 0; l1 < 33; ++l1)
                {
                    double d1 = ((double)l1 - d0) * (double)settings.stretchY * 128 / 256 / d9;

                    if (d1 < 0)
                    {
                        d1 *= 4;
                    }

                    double d2 = minLimitRegion[i] / (double)settings.lowerLimitScale;
                    double d3 = maxLimitRegion[i] / (double)settings.upperLimitScale;
                    double d4 = (mainNoiseRegion[i] / 10 + 1) / 2;
                    double d5 = MathHelper.denormalizeClamp(d2, d3, d4) - d1;

                    if (l1 > 29)
                    {
                        double d6 = (double) ((float) (l1 - 29)/3);
                        d5 = d5 * (1 - d6) + -10 * d6;
                    }

                    heightMap[i] = d5;
                    ++i;
                }
            }
        }
    }

    @Override
    public void populate(int x, int z) {
        BlockFalling.fallInstantly = true;
        int i = x * 16;
        int j = z * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        Biome biome = worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));
        rand.setSeed(worldObj.getSeed());
        long k = rand.nextLong() / 2L * 2L + 1L;
        long l = rand.nextLong() / 2L * 2L + 1L;
        rand.setSeed((long)x * k + (long)z * l ^ worldObj.getSeed());
        boolean flag = false;
        ChunkPos chunkpos = new ChunkPos(x, z);

        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, worldObj, rand, x, z, flag);

        if (mapFeaturesEnabled)
        {
            if (settings.useMineShafts)
            {
                mineshaftGenerator.generateStructure(worldObj, rand, chunkpos);
            }

            if (settings.useVillages)
            {
                flag = villageGenerator.generateStructure(worldObj, rand, chunkpos);
            }

            if (settings.useStrongholds)
            {
                strongholdGenerator.generateStructure(worldObj, rand, chunkpos);
            }

            if (settings.useTemples)
            {
                scatteredFeatureGenerator.generateStructure(worldObj, rand, chunkpos);
            }

            if (settings.useMonuments)
            {
                oceanMonumentGenerator.generateStructure(worldObj, rand, chunkpos);
            }
        }

        if (biome != Biomes.DESERT && biome != Biomes.DESERT_HILLS && settings.useWaterLakes && !flag && rand.nextInt(settings.waterLakeChance) == 0)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE))
        {
            int i1 = rand.nextInt(16) + 8;
            int j1 = rand.nextInt(256);
            int k1 = rand.nextInt(16) + 8;
            (new WorldGenLakes(Blocks.WATER)).generate(worldObj, rand, blockpos.add(i1, j1, k1));
        }

        if (!flag && rand.nextInt(settings.lavaLakeChance / 10) == 0 && settings.useLavaLakes)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA))
        {
            int i2 = rand.nextInt(16) + 8;
            int l2 = rand.nextInt(rand.nextInt(248) + 8);
            int k3 = rand.nextInt(16) + 8;

            if (l2 < worldObj.getSeaLevel() || rand.nextInt(settings.lavaLakeChance / 8) == 0)
            {
                (new WorldGenLakes(Blocks.LAVA)).generate(worldObj, rand, blockpos.add(i2, l2, k3));
            }
        }

        if (settings.useDungeons)
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON))
        {
            for (int j2 = 0; j2 < settings.dungeonChance; ++j2)
            {
                int i3 = rand.nextInt(16) + 8;
                int l3 = rand.nextInt(256);
                int l1 = rand.nextInt(16) + 8;
                (new WorldGenDungeons()).generate(worldObj, rand, blockpos.add(i3, l3, l1));
            }
        }

        biome.decorate(worldObj, rand, new BlockPos(i, 0, j));
        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
        WorldEntitySpawner.performWorldGenSpawning(worldObj, biome, i + 8, j + 8, 16, 16, rand);
        blockpos = blockpos.add(8, 0, 8);

        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, worldObj, rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE))
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

        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, worldObj, rand, x, z, flag);

        BlockFalling.fallInstantly = false;
    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        boolean flag = false;

        if (settings.useMonuments && mapFeaturesEnabled && chunkIn.getInhabitedTime() < 3600L)
        {
            flag |= oceanMonumentGenerator.generateStructure(worldObj, rand, new ChunkPos(x, z));
        }

        return flag;
    }

    @Override
    public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
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
    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
        return "Stronghold".equals(structureName) && strongholdGenerator != null ? strongholdGenerator.getClosestStrongholdPos(worldIn, position) : null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {
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
    }
}

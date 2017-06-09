package scmc.worldgen.aiur;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.minecraft.entity.EnumCreatureType;
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

public class ChunkProviderAiur implements IChunkGenerator {

	private Biome[] biomesForGeneration;
	private MapGenBase caveGenerator = new MapGenCaves();
	private List<Biome.SpawnListEntry> mobs = Lists.newArrayList(new Biome.SpawnListEntry(EntityZealot.class, 100, 2, 2));

	private Random random;

	private NormalTerrainGenerator terraingen = new NormalTerrainGenerator();
	private final World worldObj;

	public ChunkProviderAiur(World worldObj) {
		this.worldObj = worldObj;
		long seed = worldObj.getSeed();
		random = new Random((seed + 516) * 314);
		terraingen.setup(worldObj, random);
		caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		return false;
	}

	@Override
	public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		// If you want normal creatures appropriate for this biome then
		// uncomment the
		// following two lines:
		// Biome biome = this.worldObj.getBiome(pos);
		// return biome.getSpawnableList(creatureType);

		if(creatureType == EnumCreatureType.MONSTER) {
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
	public void populate(int x, int z) {
		int i = x * 16;
		int j = z * 16;
		BlockPos blockpos = new BlockPos(i, 0, j);
		Biome biome = worldObj.getBiomeGenForCoords(blockpos.add(16, 0, 16));

		// Add biome decorations (like flowers, grass, trees, ...)
		biome.decorate(worldObj, random, blockpos);

		// Make sure animals appropriate to the biome spawn here when the chunk
		// is generated
		WorldEntitySpawner.performWorldGenSpawning(worldObj, biome, i + 8, j + 8, 16, 16, random);
	}

	@Override
	public Chunk provideChunk(int x, int z) {
		ChunkPrimer chunkprimer = new ChunkPrimer();

		// Setup biomes for terraingen
		this.biomesForGeneration = worldObj.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
		terraingen.setBiomesForGeneration(biomesForGeneration);
		terraingen.generate(x, z, chunkprimer);

		// Setup biomes again for actual biome decoration
		this.biomesForGeneration = worldObj.getBiomeProvider().getBiomesForGeneration(biomesForGeneration, x * 16, z * 16, 16, 16);
		terraingen.setBiomesForGeneration(biomesForGeneration);
		// This will replace stone with the biome specific stones
		terraingen.replaceBiomeBlocks(x, z, chunkprimer, this);

		// Generate caves
		caveGenerator.generate(worldObj, x, z, chunkprimer);

		Chunk chunk = new Chunk(worldObj, chunkprimer, x, z);

		byte[] biomeArray = chunk.getBiomeArray();
		for(int i = 0; i < biomeArray.length; ++i) {
			biomeArray[i] = (byte) Biome.getIdForBiome(biomesForGeneration[i]);
		}

		chunk.generateSkylightMap();
		return chunk;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		//TODO: what dis?
	}
}
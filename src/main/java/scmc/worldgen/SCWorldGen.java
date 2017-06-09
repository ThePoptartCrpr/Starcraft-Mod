package scmc.worldgen;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.blocks.ModBlocks;
import scmc.lib.StarcraftConfig;
import scmc.worldgen.features.CharWorldGenMinable;
import scmc.worldgen.features.ShakurasWorldGenMinable;
import scmc.worldgen.structure.SCWorldGenerator;
import scmc.worldgen.structure.StructureProtossPylonTemplate;
import scmc.worldgen.structure.StructureProtossWarpGateTemplate;
import scmc.worldgen.structure.StructureTerranBunker;
import scmc.worldgen.structure.StructureZergSpawningPool;
import scmc.worldgen.structure.StructureZergSpire;

public class SCWorldGen implements IWorldGenerator {
	private WorldGenerator COPPER_OVERWORLD;
	private WorldGenerator TITANIUM_OVERWORLD;
	private WorldGenerator URANIUM_OVERWORLD;
	
	private WorldGenerator COAL_CHAR;
	private WorldGenerator COPPER_CHAR;
	private WorldGenerator DIAMOND_CHAR;
	private WorldGenerator GOLD_CHAR;
	private WorldGenerator IRON_CHAR;
	private WorldGenerator LAPIS_CHAR;
	private WorldGenerator MINERAL_CHAR;
	private WorldGenerator REDSTONE_CHAR;
	private WorldGenerator RICHMINERAL_CHAR;
	private WorldGenerator TITANIUM_CHAR;
	private WorldGenerator URANIUM_CHAR;
	private WorldGenerator MAGMA_CHAR;
	
	private WorldGenerator COAL_SHAKURAS;
	private WorldGenerator COPPER_SHAKURAS;
	private WorldGenerator DIAMOND_SHAKURAS;
	private WorldGenerator GOLD_SHAKURAS;
	private WorldGenerator IRON_SHAKURAS;
	private WorldGenerator LAPIS_SHAKURAS;
	private WorldGenerator MINERAL_SHAKURAS;
	private WorldGenerator REDSTONE_SHAKURAS;
	private WorldGenerator RICHMINERAL_SHAKURAS;
	private WorldGenerator TITANIUM_SHAKURAS;
	private WorldGenerator URANIUM_SHAKURAS;
	
	private SCWorldGenerator SPAWNING_POOL;
	private SCWorldGenerator ZERG_SPIRE;
	private SCWorldGenerator TERRAN_BUNKER;
	private SCWorldGenerator PROTOSS_PYLON;
	private SCWorldGenerator PROTOSS_WARPGATE;
	
	public SCWorldGen() {
		COPPER_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_COPPER_OW.getDefaultState(), 8);
		TITANIUM_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_TITANIUM_OW.getDefaultState(), 8);
		URANIUM_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_URANIUM_OW.getDefaultState(), 8);
		
		TITANIUM_CHAR = new CharWorldGenMinable(ModBlocks.ORE_TITANIUM_CHAR.getDefaultState(), 8);
		COAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_COAL_CHAR.getDefaultState(), 16);
		COPPER_CHAR = new CharWorldGenMinable(ModBlocks.ORE_COPPER_CHAR.getDefaultState(), 8);
		DIAMOND_CHAR = new CharWorldGenMinable(ModBlocks.ORE_DIAMOND_CHAR.getDefaultState(), 8);
		GOLD_CHAR = new CharWorldGenMinable(ModBlocks.ORE_GOLD_CHAR.getDefaultState(), 8);
		IRON_CHAR = new CharWorldGenMinable(ModBlocks.ORE_IRON_CHAR.getDefaultState(), 8);
		LAPIS_CHAR = new CharWorldGenMinable(ModBlocks.ORE_LAPIS_CHAR.getDefaultState(), 8);
		MINERAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_MINERAL_CHAR.getDefaultState(), 8);
		REDSTONE_CHAR = new CharWorldGenMinable(ModBlocks.ORE_REDSTONE_CHAR.getDefaultState(), 8);
		RICHMINERAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
		URANIUM_CHAR = new CharWorldGenMinable(ModBlocks.ORE_URANIUM_CHAR.getDefaultState(), 8);
		MAGMA_CHAR = new CharWorldGenMinable(ModBlocks.MAGMA_CHAR.getDefaultState(), 16);
		
	
		TITANIUM_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
		COAL_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_COAL_SHAKURAS.getDefaultState(), 16);
		COPPER_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_COPPER_SHAKURAS.getDefaultState(), 8);
		DIAMOND_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_DIAMOND_SHAKURAS.getDefaultState(), 8);
		GOLD_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_GOLD_SHAKURAS.getDefaultState(), 8);
		IRON_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_IRON_SHAKURAS.getDefaultState(), 8);
		LAPIS_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_LAPIS_SHAKURAS.getDefaultState(), 8);
		MINERAL_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_MINERAL_SHAKURAS.getDefaultState(), 8);
		REDSTONE_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_REDSTONE_SHAKURAS.getDefaultState(), 8);
		RICHMINERAL_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_RICHMINERAL_SHAKURAS.getDefaultState(), 8);
		TITANIUM_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
		URANIUM_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_URANIUM_SHAKURAS.getDefaultState(), 8);
		
		SPAWNING_POOL = new StructureZergSpawningPool();
		ZERG_SPIRE = new StructureZergSpire();
		TERRAN_BUNKER = new StructureTerranBunker();
		PROTOSS_PYLON = new StructureProtossPylonTemplate();
		PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		Random rnd = new Random();
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 20, 4, 64);
			runGenerator(TITANIUM_OVERWORLD, world, random, chunkX, chunkZ, 8, 4, 28);
			runGenerator(URANIUM_OVERWORLD, world, random, chunkX, chunkZ, 1, 0, 20);
			
			runGenerator(TERRAN_BUNKER, world, random, chunkX, chunkZ, 0, 0, 0, 1, 60, 70);
			
			runGenerator(PROTOSS_PYLON, world, random, chunkX, chunkZ, 0, 0, 0, 1, 60, 70);
			runGenerator(PROTOSS_WARPGATE, world, random, chunkX, chunkZ, 0, 0, 0, 1, 60, 70);
		case -1: //Nether
			
		case 1: //End
			
		default: //check for our dimensions
			if (world.provider.getDimension() == StarcraftConfig.dimChar) {
				runGenerator(COAL_CHAR, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_CHAR, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_CHAR, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_CHAR, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_CHAR, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_CHAR, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_CHAR, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_CHAR, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_CHAR, world, random, chunkX, chunkZ, 8, 4, 28);
				runGenerator(URANIUM_CHAR, world, random, chunkX, chunkZ, 1, 0, 20);
				runGenerator(MAGMA_CHAR, world, random, chunkX, chunkZ, 25, 0, 128);
				
				if(rnd.nextInt(100) < 20) {
					runGenerator(SPAWNING_POOL, world, random, chunkX, chunkZ, 0, 1, 0, 1, 60, 70);
				}
				if(rnd.nextInt(100) < 15) {
					runGenerator(ZERG_SPIRE, world, random, chunkX, chunkZ, 0, 1, 0, 1, 60, 70);
				}
				if(rnd.nextInt(100) < 10) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, -1, 0, 1, 60, 70);
				}
				
			} else if (world.provider.getDimension() == StarcraftConfig.dimShakuras) {
				runGenerator(COAL_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 128);
				runGenerator(COPPER_SHAKURAS, world, random, chunkX, chunkZ, 15, 4, 64);
				runGenerator(DIAMOND_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(GOLD_SHAKURAS, world, random, chunkX, chunkZ, 2, 0, 32);
				runGenerator(IRON_SHAKURAS, world, random, chunkX, chunkZ, 20, 0, 64);
				runGenerator(LAPIS_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 16);
				runGenerator(MINERAL_SHAKURAS, world, random, chunkX, chunkZ, 12, 28, 50);
				runGenerator(REDSTONE_SHAKURAS, world, random, chunkX, chunkZ, 8, 0, 16);
				runGenerator(RICHMINERAL_SHAKURAS, world, random, chunkX, chunkZ, 6, 4, 28);
				runGenerator(TITANIUM_SHAKURAS, world, random, chunkX, chunkZ, 8, 4, 28);
				runGenerator(URANIUM_SHAKURAS, world, random, chunkX, chunkZ, 1, 0, 20);
				
				if(rnd.nextInt(100) < 30) {
					runGenerator(PROTOSS_PYLON, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 1, 60, 70);
				}
				if(rnd.nextInt(100) < 10) {
					runGenerator(PROTOSS_WARPGATE, 1, 2, world, random, chunkX, chunkZ, 0, 0, 0, 1, 60, 70);
				}
			}
			
			break;
		}
		
	}
	
	//for ores and such
	private static void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	//for generic structures
	private static void runGenerator(SCWorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			
			generator.generate(world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z));
		}
	}
	
	//for structures that use team colors and stuff
	private static void runGenerator(SCWorldGenerator generator, int metaColor, int metaSecColor, World world, Random rand, int chunk_X, int chunk_Z, int offsetX, int offsetY, int offsetZ, int chancesToSpawn, int minHeight, int maxHeight) {
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}

		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			
			generator.generate(metaColor, metaSecColor, world, rand, offsetX, offsetY, offsetZ, new BlockPos(x, y, z));
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void preInit() {
		SCWorldGen eventWorldGen = new SCWorldGen();
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}
}
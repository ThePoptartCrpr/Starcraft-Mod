package net.bvanseghi.starcraft.worldgen;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.ChunkProviderGenerate;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.worldgen.features.CharWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.features.ShakurasWorldGenMinable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SCWorldGen implements IWorldGenerator {

	ChunkProviderGenerate o;

	public static void setupWorldgen() {
		DimensionManager.registerDimension(StarcraftConfig.dimChar, DimensionType.OVERWORLD);
		DimensionManager.registerDimension(StarcraftConfig.dimShakuras, DimensionType.OVERWORLD);
		//TODO: figure out how to register dimensions using dimType
	}

	private WorldGenerator COPPER_OVERWORLD;
	private WorldGenerator TITANIUM_OVERWORLD;
	private WorldGenerator URANIUM_OVERWORLD;
	
//	private WorldGenerator ALIEN_CHAR;
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
	
//	private WorldGenerator ALIEN_SHAKURAS;
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
	
	public SCWorldGen() {
		COPPER_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_COPPER_OW.getDefaultState(), 8);
		TITANIUM_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_TITANIUM_OW.getDefaultState(), 8);
		URANIUM_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_URANIUM_OW.getDefaultState(), 8);
		
		TITANIUM_CHAR = new CharWorldGenMinable(ModBlocks.ORE_TITANIUM_CHAR.getDefaultState(), 8);
		//ALIEN_CHAR = new CharWorldGenMinable(ModBlocks.ORE_ALIEN_CHAR.getDefaultState(), 8);
		COAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_COAL_CHAR.getDefaultState(), 8);
		COPPER_CHAR = new CharWorldGenMinable(ModBlocks.ORE_COPPER_CHAR.getDefaultState(), 8);
		DIAMOND_CHAR = new CharWorldGenMinable(ModBlocks.ORE_DIAMOND_CHAR.getDefaultState(), 8);
		GOLD_CHAR = new CharWorldGenMinable(ModBlocks.ORE_GOLD_CHAR.getDefaultState(), 8);
		IRON_CHAR = new CharWorldGenMinable(ModBlocks.ORE_IRON_CHAR.getDefaultState(), 8);
		LAPIS_CHAR = new CharWorldGenMinable(ModBlocks.ORE_LAPIS_CHAR.getDefaultState(), 8);
		MINERAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_MINERAL_CHAR.getDefaultState(), 8);
		REDSTONE_CHAR = new CharWorldGenMinable(ModBlocks.ORE_REDSTONE_CHAR.getDefaultState(), 8);
		RICHMINERAL_CHAR = new CharWorldGenMinable(ModBlocks.ORE_RICHMINERAL_CHAR.getDefaultState(), 8);
		URANIUM_CHAR = new CharWorldGenMinable(ModBlocks.ORE_URANIUM_CHAR.getDefaultState(), 8);
		
	
		TITANIUM_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_TITANIUM_SHAKURAS.getDefaultState(), 8);
		//ALIEN_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_ALIEN_SHAKURAS.getDefaultState(), 8);
		COAL_SHAKURAS = new ShakurasWorldGenMinable(ModBlocks.ORE_COAL_SHAKURAS.getDefaultState(), 8);
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
	}
	@Override
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			this.runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 25, 4, 64);
			this.runGenerator(TITANIUM_OVERWORLD, world, random, chunkX, chunkZ, 25, 4, 64);
			this.runGenerator(URANIUM_OVERWORLD, world, random, chunkX, chunkZ, 25, 4, 64);
		case -1: //Nether
			
		case 1: //End
			
		default: //check for OUR dimensions
			if(world.provider.getDimension() == StarcraftConfig.dimChar) {
				this.runGenerator(COAL_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(COPPER_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(DIAMOND_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(GOLD_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(IRON_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(LAPIS_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(MINERAL_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(REDSTONE_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(RICHMINERAL_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(TITANIUM_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(URANIUM_CHAR, world, random, chunkX, chunkZ, 25, 4, 64);
				
			}else if(world.provider.getDimension() == StarcraftConfig.dimShakuras){
				this.runGenerator(COAL_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(COPPER_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(DIAMOND_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(GOLD_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(IRON_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(LAPIS_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(MINERAL_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(REDSTONE_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(RICHMINERAL_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(TITANIUM_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				this.runGenerator(URANIUM_SHAKURAS, world, random, chunkX, chunkZ, 25, 4, 64);
				
			}
			break;
		}
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	

	public static void preInit() {
		SCWorldGen eventWorldGen = new SCWorldGen();

		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}

	

}

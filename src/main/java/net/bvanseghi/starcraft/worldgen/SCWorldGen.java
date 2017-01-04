package net.bvanseghi.starcraft.worldgen;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.ChunkProviderGenerate;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.worldgen.biome.CharBiomeGenCreepInfestation;
import net.bvanseghi.starcraft.worldgen.features.CharWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.features.ShakurasWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderChar;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderShakuras;
import net.bvanseghi.starcraft.worldgen.structure.StructureMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossPylonTemplate;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateTemplate;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureTerranBunker;
import net.bvanseghi.starcraft.worldgen.structure.StructureVespeneGeyserTemplate;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpawningPool;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpire;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
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
		// Char
			//DimensionManager.registerDimension(StarcraftConfig.dimChar, StarcraftConfig.dimChar);

		// Shakuras
			//DimensionManager.registerDimension(StarcraftConfig.dimShakuras, new WorldProviderShakuras());
		//TODO: figure out how to register dimensions using dimType
	}

	private WorldGenerator COPPER_OVERWORLD;
	private WorldGenerator TITANIUM_OVERWORLD;
	
	public SCWorldGen() {
		COPPER_OVERWORLD = new WorldGenMinable(ModBlocks.ORE_COPPER_OW.getDefaultState(), 8);
	}
	@Override
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			this.runGenerator(COPPER_OVERWORLD, world, random, chunkX, chunkZ, 25, 4, 64);
		case -1: //Nether
			
		case 1: //End
			
		default: //check for OUR dimensions
			if(world.provider.getDimension() == StarcraftConfig.dimChar) {
				
			}else if(world.provider.getDimension() == StarcraftConfig.dimShakuras){
			
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

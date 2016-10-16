package net.bvanseghi.starcraft.worldgen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.ChunkProviderGenerate;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.worldgen.biome.CharBiomeGenCreepInfestation;
import net.bvanseghi.starcraft.worldgen.features.CharWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.features.ShakurasWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderChar;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderShakuras;
import net.bvanseghi.starcraft.worldgen.structure.StructureMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossDarkPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossDarkWarpGateChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossDarkWarpGateOverworld;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossVoidPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateOverworld;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateShakuras;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichVespeneGeyserChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureTerranBunker;
import net.bvanseghi.starcraft.worldgen.structure.StructureVespeneGeyserChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpawningPool;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpire;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.DimensionManager;

public class SCWorldGen implements IWorldGenerator {

	ChunkProviderGenerate o;

	public static void setupWorldgen() {
		// Char
		DimensionManager.registerProviderType(StarcraftConfig.dimChar, WorldProviderChar.class, true);
		DimensionManager.registerDimension(StarcraftConfig.dimChar, StarcraftConfig.dimChar);

		// Shakuras
		DimensionManager.registerProviderType(StarcraftConfig.dimShakuras, WorldProviderShakuras.class, true);
		DimensionManager.registerDimension(StarcraftConfig.dimShakuras, StarcraftConfig.dimShakuras);

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {

		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			if(world.provider.dimensionId == StarcraftConfig.dimChar) {
				generateChar(world, random, chunkX * 16, chunkZ * 16);
				break;
			}else if(world.provider.dimensionId == StarcraftConfig.dimShakuras){
				generateShakuras(world, random, chunkX * 16, chunkZ * 16);
				break;
			}
			break;
		}
	}

	@SuppressWarnings("unused")
	public void generateSurface(World world, Random random, int x, int z) {
		int chanceVespeneGeyser = random.nextInt(1500);
		int chanceRichVespeneGeyser = random.nextInt(2500);
		int chanceMineralBed = random.nextInt(1500);
		int chanceRichMineralBed = random.nextInt(2500);
		int chanceTerranBunker = random.nextInt(4000);
		int chanceProtossWarpGateShakuras = random.nextInt(4000);
		
			this.addOreSpawn(ModBlocks.oreTitaniumOW, world, Blocks.stone, random, x, z, 16, 16,
					1 + random.nextInt(7), 9, 4, 28);
		
			this.addOreSpawn(ModBlocks.oreCopperOW, world, Blocks.stone, random, x, z, 16, 16,
					1 + random.nextInt(7), 25, 4, 64);
		
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGateShakuras < 50) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossWarpGateShakuras().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGateShakuras < 50) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossWarpGateChar().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceTerranBunker < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureTerranBunker().generate(world, random, i, j, k);
				}
			}
		} else {

		}

	}

	public void generateChar(World world, Random random, int x, int z) {
		int chanceSpawningPool = random.nextInt(2000);
		int chanceSpire = random.nextInt(3000);
		int chanceVespeneGeyser = random.nextInt(1500);
		int chanceRichVespeneGeyser = random.nextInt(2500);
		int chanceMineralBed = random.nextInt(1500);
		int chanceRichMineralBed = random.nextInt(2500);
		int chanceProtossWarpGateOverworld = random.nextInt(4000);
		int chanceProtossWarpGateShakuras = random.nextInt(4000);

			this.addOreSpawnChar(ModBlocks.oreMineralC, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					3 + random.nextInt(4), 13, 28, 50);
		
			this.addOreSpawnChar(ModBlocks.oreRichMineralC, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					3 + random.nextInt(4), 9, 4, 28);
		
			this.addOreSpawnChar(ModBlocks.oreAlienC, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					2 + random.nextInt(3), 5, 4, 20);
		
			this.addOreSpawnChar(ModBlocks.oreTitaniumC, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					1 + random.nextInt(7), 9, 4, 28);
		
			this.addOreSpawnChar(ModBlocks.oreCopperC, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					1 + random.nextInt(7), 25, 4, 64);
		
		// Coal
		this.addOreSpawnChar(ModBlocks.oreCoalC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 4 + random.nextInt(12),
				20, 0, 128);

		// Iron
		this.addOreSpawnChar(ModBlocks.oreIronC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 1 + random.nextInt(7),
				20, 0, 64);

		// Gold
		this.addOreSpawnChar(ModBlocks.oreGoldC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 4 + random.nextInt(4), 2,
				0, 32);

		// Redstone
		this.addOreSpawnChar(ModBlocks.oreRedstoneC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 3 + random.nextInt(4), 8,
				0, 16);

		// Lapis
		this.addOreSpawnChar(ModBlocks.oreLapisC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 2 + random.nextInt(4), 1,
				0, 16);

		// Diamond
		this.addOreSpawnChar(ModBlocks.oreDiamondC, world, ModBlocks.stoneChar, random, x, z, 16, 16, 2 + random.nextInt(5),
				1, 0, 16);

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);

		
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceSpire < 31) {
				if ((biome instanceof CharBiomeGenCreepInfestation)) {
					for (int a = 0; a < 1; a++) {
						int i = x + random.nextInt(16);
						int k = z + random.nextInt(16);
						int j = world.getHeightValue(i, k);

						new StructureZergSpire().generate(world, random, i, j, k);
					}
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceSpawningPool < 51) {
				if ((biome instanceof CharBiomeGenCreepInfestation)) {
					for (int a = 0; a < 1; a++) {
						int i = x + random.nextInt(16);
						int k = z + random.nextInt(16);
						int j = world.getHeightValue(i, k);

						new StructureZergSpawningPool().generate(world, random, i, j, k);
					}
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGateOverworld < 50) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossWarpGateOverworld().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGateShakuras < 50) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossWarpGateShakuras().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceVespeneGeyser < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureVespeneGeyserChar().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceRichVespeneGeyser < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureRichVespeneGeyserChar().generate(world, random, i, j, k);
				}
			}
		} else {

		}
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceMineralBed < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureMineralBed().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceRichMineralBed < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureRichMineralBed().generate(world, random, i, j, k);
				}
			}
		} else {

		}

	}

	public void generateShakuras(World world, Random random, int x, int z) {
		int chanceVespeneGeyser = random.nextInt(1500);
		int chanceRichVespeneGeyser = random.nextInt(2500);
		int chanceMineralBed = random.nextInt(1500);
		int chanceRichMineralBed = random.nextInt(2500);
		int chanceProtossPylon = random.nextInt(4000);
		int chanceDarkProtossPylon = random.nextInt(4000);
		int chanceVoidProtossPylon = random.nextInt(4000);
		int chanceProtossWarpGate = random.nextInt(6000);
		int chanceProtossWarpGateOverworld = random.nextInt(6000);

		
			this.addOreSpawnShakuras(ModBlocks.oreMineralS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					3 + random.nextInt(4), 9, 28, 50);
		
			this.addOreSpawnShakuras(ModBlocks.oreRichMineralS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					3 + random.nextInt(4), 6, 4, 28);
		
			this.addOreSpawnShakuras(ModBlocks.oreAlienS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					2 + random.nextInt(3), 5, 4, 20);
		
			this.addOreSpawnShakuras(ModBlocks.oreTitaniumS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					1 + random.nextInt(7), 9, 4, 28);
		
			this.addOreSpawnShakuras(ModBlocks.oreCopperS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					1 + random.nextInt(7), 25, 4, 64);

		// Coal
		this.addOreSpawnShakuras(ModBlocks.oreCoalS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 4 + random.nextInt(12),
				20, 0, 128);

		// Iron
		this.addOreSpawnShakuras(ModBlocks.oreIronS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 1 + random.nextInt(7),
				20, 0, 64);

		// Gold
		this.addOreSpawnShakuras(ModBlocks.oreGoldS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 4 + random.nextInt(4), 2,
				0, 32);

		// Redstone
		this.addOreSpawnShakuras(ModBlocks.oreRedstoneS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 3 + random.nextInt(4), 8,
				0, 16);

		// Lapis
		this.addOreSpawnShakuras(ModBlocks.oreLapisS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 2 + random.nextInt(4), 1,
				0, 16);

		// Diamond
		this.addOreSpawnShakuras(ModBlocks.oreDiamondS, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 2 + random.nextInt(5),
				1, 0, 16);

		@SuppressWarnings("unused")
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x, z);

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossPylon < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossPylon().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceDarkProtossPylon < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossDarkPylon().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceVoidProtossPylon < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossVoidPylon().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGate < 35) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossDarkWarpGateChar().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceProtossWarpGateOverworld < 35) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureProtossDarkWarpGateOverworld().generate(world, random, i, j - 1, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceVespeneGeyser < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureVespeneGeyserChar().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceRichVespeneGeyser < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureRichVespeneGeyserChar().generate(world, random, i, j, k);
				}
			}
		} else {

		}
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceMineralBed < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureMineralBed().generate(world, random, i, j, k);
				}
			}
		} else {

		}

		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceRichMineralBed < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureRichMineralBed().generate(world, random, i, j, k);
				}
			}
		} else {

		}

	}

	public void generateNether(World world, Random random, int x, int z) {}

	public void generateEnd(World world, Random random, int x, int z) {}

	private void addOreSpawn(Block block, World world, Block target, Random random, int blockXPos, int blockZPos,
			int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
	@SuppressWarnings("unused")
	private void addOreSpawn(Block block, int meta, World world, Block target, Random random, int blockXPos, int blockZPos,
			int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, meta, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}

	private void addOreSpawnChar(Block block, World world, Block target, Random random, int blockXPos, int blockZPos,
			int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new CharWorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

	@SuppressWarnings("unused")
	private void addOreSpawnChar(Block block, int meta, World world, Block target, Random random, int blockXPos,
			int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new CharWorldGenMinable(block, meta, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}

	private void addOreSpawnShakuras(Block block, World world, Block target, Random random, int blockXPos,
			int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new ShakurasWorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
	@SuppressWarnings("unused")
	private void addOreSpawnShakuras(Block block, int meta, World world, Block target, Random random, int blockXPos,
			int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new ShakurasWorldGenMinable(block, meta, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}

	public static void preInit() {
		SCWorldGen eventWorldGen = new SCWorldGen();

		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}

}

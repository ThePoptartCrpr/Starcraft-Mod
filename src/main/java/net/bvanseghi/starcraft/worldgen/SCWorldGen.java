package net.bvanseghi.starcraft.worldgen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.Starcraft;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.ChunkProviderGenerate;
import net.bvanseghi.starcraft.lib.SCWorldSettings;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.worldgen.biome.BiomeGenCreepInfestation;
import net.bvanseghi.starcraft.worldgen.biome.CharBiomeGenCreepInfestation;
import net.bvanseghi.starcraft.worldgen.chunk.ChunkProviderChar;
import net.bvanseghi.starcraft.worldgen.features.CharWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.features.ShakurasWorldGenMinable;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderChar;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderShakuras;
import net.bvanseghi.starcraft.worldgen.structure.StructureDarkProtossPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossVoidPylon;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateOverworld;
import net.bvanseghi.starcraft.worldgen.structure.StructureProtossWarpGateShakuras;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichMineralBed;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichVespeneGeyser;
import net.bvanseghi.starcraft.worldgen.structure.StructureRichVespeneGeyserChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureTerranBunker;
import net.bvanseghi.starcraft.worldgen.structure.StructureVespeneGeyser;
import net.bvanseghi.starcraft.worldgen.structure.StructureVespeneGeyserChar;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpawningPool;
import net.bvanseghi.starcraft.worldgen.structure.StructureZergSpire;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.DimensionManager;

public class SCWorldGen implements IWorldGenerator {

	ChunkProviderGenerate o;

	public static void setupWorldgen() {
		// Char
		DimensionManager.registerProviderType(2, WorldProviderChar.class, true);
		DimensionManager.registerDimension(2, 2);

		// Shakuras
		DimensionManager.registerProviderType(3, WorldProviderShakuras.class, true);
		DimensionManager.registerDimension(3, 3);

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
		case 2:
			generateChar(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 3:
			generateShakuras(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}

	public void generateSurface(World world, Random random, int x, int z) {
		int chanceVespeneGeyser = random.nextInt(1500);
		int chanceRichVespeneGeyser = random.nextInt(2500);
		int chanceMineralBed = random.nextInt(1500);
		int chanceRichMineralBed = random.nextInt(2500);
		int chanceTerranBunker = random.nextInt(4000);
		int chanceProtossWarpGateShakuras = random.nextInt(4000);

			this.addOreSpawn(ModBlocks.ores, 0, world, Blocks.stone, random, x, z, 16, 16,
					4 + random.nextInt(2), 7, 28, 50);
		
			this.addOreSpawn(ModBlocks.ores, 1, world, Blocks.stone, random, x, z, 16, 16,
					4 + random.nextInt(2), 5, 4, 28);
		
			this.addOreSpawn(ModBlocks.ores, 2, world, Blocks.stone, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 20);
		
			this.addOreSpawn(ModBlocks.ores, 3, world, Blocks.stone, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 28);
		
			this.addOreSpawn(ModBlocks.ores, 9, world, Blocks.stone, random, x, z, 16, 16,
					4 + random.nextInt(6), 6, 4, 50);
		
		if (world.getWorldInfo().isMapFeaturesEnabled()) {
			if (chanceVespeneGeyser < 21) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureVespeneGeyser().generate(world, random, i, j, k);
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
			if (chanceRichVespeneGeyser < 11) {
				for (int a = 0; a < 1; a++) {
					int i = x + random.nextInt(16);
					int k = z + random.nextInt(16);
					int j = world.getHeightValue(i, k);

					new StructureRichVespeneGeyser().generate(world, random, i, j, k);
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

			this.addOreSpawnChar(ModBlocks.ores, 11, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					4 + random.nextInt(2), 7, 28, 50);
		
			this.addOreSpawnChar(ModBlocks.ores, 12, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					4 + random.nextInt(2), 5, 4, 28);
		
			this.addOreSpawnChar(ModBlocks.ores, 13, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 20);
		
			this.addOreSpawnChar(ModBlocks.ores, 14, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 28);
		
			this.addOreSpawnChar(ModBlocks.ores, 15, world, ModBlocks.stoneChar, random, x, z, 16, 16,
					4 + random.nextInt(6), 6, 4, 50);
		
		// Coal
		this.addOreSpawnChar(ModBlocks.ores, 5, world, ModBlocks.stoneChar, random, x, z, 16, 16, 4 + random.nextInt(12),
				20, 0, 128);

		// Iron
		this.addOreSpawnChar(ModBlocks.ores, 6, world, ModBlocks.stoneChar, random, x, z, 16, 16, 1 + random.nextInt(7),
				20, 0, 64);

		// Gold
		this.addOreSpawnChar(ModBlocks.ores, 7, world, ModBlocks.stoneChar, random, x, z, 16, 16, 4 + random.nextInt(4), 2,
				0, 32);

		// Redstone
		this.addOreSpawnChar(ModBlocks.ores, 8, world, ModBlocks.stoneChar, random, x, z, 16, 16, 3 + random.nextInt(4), 8,
				0, 16);

		// Lapis
		this.addOreSpawnChar(ModBlocks.ores, 4, world, ModBlocks.stoneChar, random, x, z, 16, 16, 2 + random.nextInt(4), 1,
				0, 16);

		// Diamond
		this.addOreSpawnChar(ModBlocks.ores, 10, world, ModBlocks.stoneChar, random, x, z, 16, 16, 2 + random.nextInt(5),
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

		
			this.addOreSpawnShakuras(ModBlocks.ores2, 6, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					4 + random.nextInt(2), 7, 28, 50);
		
			this.addOreSpawnShakuras(ModBlocks.ores2, 7, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					4 + random.nextInt(2), 5, 4, 28);
		
			this.addOreSpawnShakuras(ModBlocks.ores2, 8, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 20);
		
			this.addOreSpawnShakuras(ModBlocks.ores2, 9, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					4 + random.nextInt(6), 5, 4, 28);
		
			this.addOreSpawnShakuras(ModBlocks.ores2, 10, world, ModBlocks.stoneShakuras, random, x, z, 16, 16,
					4 + random.nextInt(6), 6, 4, 50);

		// Coal
		this.addOreSpawnShakuras(ModBlocks.ores2, 0, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 4 + random.nextInt(12),
				20, 0, 128);

		// Iron
		this.addOreSpawnShakuras(ModBlocks.ores2, 1, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 1 + random.nextInt(7),
				20, 0, 64);

		// Gold
		this.addOreSpawnShakuras(ModBlocks.ores2, 2, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 4 + random.nextInt(4), 2,
				0, 32);

		// Redstone
		this.addOreSpawnShakuras(ModBlocks.ores2, 3, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 3 + random.nextInt(4), 8,
				0, 16);

		// Lapis
		this.addOreSpawnShakuras(ModBlocks.ores2, 4, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 2 + random.nextInt(4), 1,
				0, 16);

		// Diamond
		this.addOreSpawnShakuras(ModBlocks.ores2, 5, world, ModBlocks.stoneShakuras, random, x, z, 16, 16, 2 + random.nextInt(5),
				1, 0, 16);

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

					new StructureDarkProtossPylon().generate(world, random, i, j, k);
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
			if (chanceProtossWarpGate < 50) {
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

	public void generateNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub

	}

	public void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub

	}

	private void addOreSpawn(Block block, World world, Block target, Random random, int blockXPos, int blockZPos,
			int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
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

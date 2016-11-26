package net.bvanseghi.starcraft.worldgen.structure;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureRichVespeneGeyserChar extends WorldGenerator {
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { ModBlocks.ashChar, ModBlocks.dirtChar, ModBlocks.stoneChar, Blocks.obsidian };
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z) {
		int distanceToAir = 0;
		Block checkBlock = world.getBlock(x, y, z);

		while (checkBlock != Blocks.AIR) {
			distanceToAir++;
			checkBlock = world.getBlock(x, y + distanceToAir, z);
		}

		if (distanceToAir > 1) {
			return false;
		}

		y += distanceToAir - 1;

		Block block = world.getBlock(x, y, z);
		Block blockAbove = world.getBlock(x, y + 1, z);
		Block blockBelow = world.getBlock(x, y - 1, z);

		for (Block i : GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (block == i) {
				return true;
			} else if (block == Blocks.snow_layer && blockBelow == i) {
				return true;
			} else if (block.getMaterial() == Material.plants && blockBelow == i) {
				return true;
			}
		}
		return false;
	}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		int i = rand.nextInt(1);

		if (i == 0) {
			generate_r0(world, rand, x, y, z);
		}

		return true;

	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z) {
		if (!LocationIsValidSpawn(world, x, y, z) || !LocationIsValidSpawn(world, x + 6, y, z)
				|| !LocationIsValidSpawn(world, x + 6, y, z + 3) || !LocationIsValidSpawn(world, x, y, z + 3)) {
			return false;
		}

		world.setBlock(x + 0, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 1, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 2, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 0, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 4, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 6, y + 0, z + 0, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 0, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 1, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 2, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 6, y + 0, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 0, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 1, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 0, y + 0, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 0, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 0, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 0, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 6, y + 0, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 4, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 1, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 1, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 1, z + 1, ModBlocks.richVespeneGeyserChar, 0, 3);
		world.setBlock(x + 2, y + 1, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 1, z + 1, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 1, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 1, z + 1, ModBlocks.richVespeneGeyserChar, 0, 3);
		world.setBlock(x + 6, y + 1, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 1, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 1, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 1, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 1, z + 2, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 1, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 1, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 1, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 1, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 4, y + 1, z + 3, ModBlocks.vespeneGeyserBaseChar, 0, 3);
		world.setBlock(x + 5, y + 1, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 1, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 4, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 2, z + 0, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, ModBlocks.richVespeneGeyserChar, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.AIR, 0, 3);
		world.setBlock(x + 0, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 1, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 4, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.AIR, 0, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.AIR, 0, 3);
		return true;

	}

}
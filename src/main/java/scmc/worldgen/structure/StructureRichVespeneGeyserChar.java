package net.bvanseghi.starcraft.worldgen.structure;

import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructureRichVespeneGeyserChar extends WorldGenerator {
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, };
	}

	int x = 0;
	int y = 0;
	int z = 0;

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {
		int distanceToAir = 0;
		Block checkBlock = world.getBlockState(pos).getBlock();

		while (checkBlock != Blocks.AIR) {
			distanceToAir++;
			checkBlock = world.getBlockState(pos.add(x, y + distanceToAir, z)).getBlock();
		}

		if (distanceToAir > 1) {
			return false;
		}

		y += distanceToAir - 1;
		
		Block block = world.getBlockState(pos).getBlock();
		Material m = block.getBlockState().getBaseState().getMaterial();
		Block blockAbove = world.getBlockState(pos.up()).getBlock();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (block == i) {
				return true;
			} else if (block == Blocks.SNOW_LAYER && blockBelow == i) {
				return true;
			} else if (m == Material.PLANTS && blockBelow == i) {
				world.getBlockState(pos).getMaterial();
				return true;
			}
		}
		return false;
	}
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = rand.nextInt(1);

		if (i == 0) {
			generate_r0(world, rand, pos);
		}

		return true;

	}

	public boolean generate_r0(World world, Random rand, BlockPos pos) {
		if (!LocationIsValidSpawn(world, pos.add(x, y, z)) || !LocationIsValidSpawn(world, pos.add(x + 6, y, z))
				|| !LocationIsValidSpawn(world, pos.add(x + 6, y, z + 3)) || !LocationIsValidSpawn(world, pos.add(x, y, z + 3))) {
			return false;
		}
		world.setBlockState(pos.add(x + 0, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 0, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 0, z + 0), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 0, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 0, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 0, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 0, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 0, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 0, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 0, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 0, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 0, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 1, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 1, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 1, z + 1), ModBlocks.RICH_VESPENE_GEYSER_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 1, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 1, z + 1), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 1, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 1, z + 1), ModBlocks.RICH_VESPENE_GEYSER_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 1, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 1, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 1, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 1, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 1, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 1, z + 2), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 1, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 1, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 1, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 1, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 1, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 1, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 1, z + 3), ModBlocks.VESPENE_GEYSER_BASE_CHAR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 1, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 1, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 2, z + 0), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 2, z + 1), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 2, z + 2), ModBlocks.RICH_VESPENE_GEYSER_CHAR.getDefaultState());
		
		world.setBlockState(pos.add(x + 4, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 2, z + 2), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 0, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 1, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 2, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 3, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 4, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 5, y + 2, z + 3), Blocks.AIR.getDefaultState());
		world.setBlockState(pos.add(x + 6, y + 2, z + 3), Blocks.AIR.getDefaultState());
		return true;

	}
}
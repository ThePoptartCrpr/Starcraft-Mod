package net.bvanseghi.starcraft.lib;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Copyright 2016 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class Library {
	
	/**
	 * Makes a cube out of {@code block}.
	 * Anchor: bottom-middle
	 * @param world the world
	 * @param blockState the blockState to
	 * make a cube of (use
	 * {@link Block#getDefaultState()} if
	 * unsure)
	 * @param xIn the X coordinate of the
	 * anchor position
	 * @param yIn the Y coordinate of the
	 * anchor position
	 * @param zIn the Z coordinate of the
	 * anchor position
	 */
	public static void blockCube(World world, IBlockState blockState, int xIn, int yIn, int zIn) {
		for(int x = -1; x < 2; x++) {
			for(int y = 0; y < 3; y++) {
				for(int z = -1; z < 2; z++) {
					if(x == 0 && y == 0 && z== 0) {
						continue;
					} else {
						world.setBlockState(new BlockPos(xIn + x, yIn + y, zIn + z), blockState);
					}
				}
			}
		}
	}
	
	/**
	 * Checks a 3x3x3 area for any instances
	 * of {@code block}. The center is in
	 * the absolute center of the cube<br>
	 * @param world the world
	 * @param block the {@link Block} to check for
	 * @param xIn center X coord
	 * @param yIn center Y coord
	 * @param zIn center Z coord
	 * @return true if at least one instance
	 * of {@code block} is found
	 */
	public static boolean checkCube(World world, Block block, int xIn, int yIn, int zIn) {
		for(int x = -1; x < 2; x++) {
			for(int y = -1; y < 2; y++) {
				for(int z = -1; z < 2; z++) {
					if(world.getBlockState(new BlockPos(xIn + x, yIn + y, zIn + z)).getBlock() == block) {
						return true;
					}
				}
			}
		}
		
		return false; //Only runs if we never find the block in question
	}
}

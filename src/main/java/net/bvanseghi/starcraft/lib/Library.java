package net.bvanseghi.starcraft.lib;

import java.util.ArrayList;

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
	 * Makes a cube out of {@code blockState}
	 * anchored at the bottom-middle. NOTE:
	 * this ignores the anchor. Also, make
	 * sure the side length is an odd number,
	 * else you'll break something
	 * @param world the world
	 * @param blockState the blockState to
	 * make a cube of (use
	 * {@link Block#getDefaultState()} if
	 * unsure)
	 * @param pos the {@link BlockPos} of
	 * the anchor
	 * @param sideLength the length of the
	 * sides of the cube
	 */
	public static void blockCube(World world, IBlockState blockState, BlockPos pos, int sideLength) {
		for(int x = -sideLength/2; x < sideLength/2 + 1; x++) {
			for(int y = -sideLength/2; y < sideLength/2 + 1; y++) {
				for(int z = -sideLength/2; z < sideLength/2 + 1; z++) {
					if(x == 0 && y == 0 && z== 0) {
						continue;
					} else {
						world.setBlockState(new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z), blockState);
					}
				}
			}
		}
	}
	
	/**
	 * Checks a cubic volume for any instances
	 * of {@code blockState}. The anchor is in
	 * the absolute center of the cube. Make
	 * sure the side length is an odd number,
	 * else you'll break something
	 * @param world the world
	 * @param blockState the {@link IBlockState}
	 * to check for
	 * @param pos the anchor {@link BlockPos}
	 * @param sideLength the length of the cube's
	 * sides
	 * @return ArrayList of all the BlockPos
	 * instances that contain {@code blockState}
	 */
	public static ArrayList<BlockPos> checkCube(World world, IBlockState blockState, BlockPos pos, int sideLength) {
		ArrayList<BlockPos> posList = new ArrayList<BlockPos>();
		
		for(int x = -sideLength/2; x < sideLength/2 + 1; x++) {
			for(int y = -sideLength/2; y < sideLength/2 + 1; y++) {
				for(int z = -sideLength/2; z < sideLength/2 + 1; z++) {
					BlockPos currPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
					
					if(world.getBlockState(currPos) == blockState) {
						posList.add(currPos);
					}
				}
			}
		}
		
		return posList;
	}
}

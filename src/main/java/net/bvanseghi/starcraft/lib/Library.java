package net.bvanseghi.starcraft.lib;

import java.util.ArrayList;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A bunch of stuff that does stuff. No really
 * "good" name for it that I can think of, so
 * it's called Library<br>
 * Copyright 2017 the Starcraft Minecraft mod team
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
	
	
	/**
	 * 
	 * @param world for world
	 * @param pos
	 * @param sideLength the length of the cube's sides. Must be an odd number.
	 * @param blockState the {@link IBlockState}
	 * @return ArrayList of all the BlockPos
	 * instances that contain {@code blockState}. This accepts an undefined # of parameters
	 * to check for multiple protoss machine types.
	 */
	public static ArrayList<BlockPos> pylonSearch(World world, BlockPos pos, int sideLength,  IBlockState... blockState) {
		ArrayList<BlockPos> posList = new ArrayList<BlockPos>();
		int flag = 0;
		for(int x = -sideLength/2; x < sideLength/2 + 1; x++) {
			for(int y = -sideLength/2; y < sideLength/2 + 1; y++) {
				for(int z = -sideLength/2; z < sideLength/2 + 1; z++) {
					BlockPos currPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
					if(world.getBlockState(currPos) == blockState[flag]) {
						posList.add(currPos);
						feedPower(currPos, blockState[flag]);
					}
					flag++;
				}
			}
		}
		return posList;
	}
	
	/**
	 * 
	 * @param pos for the position of the block taken from pylonSearch();
	 * @param block to check if the block is a Protoss machine.
	 * This method can be adapted to manipulate integers to set speeds of the machines
	 * based on the distance the power is traveling. 
	 * If a block is NOT a Protoss machine, it is set to unpowered by default.
	 */
	public static void feedPower(BlockPos pos, IBlockState blockstate) {
		if(blockstate == ModBlocks.PROTOSS_METAL.getDefaultState()) {
					((ModBlocks) blockstate).PoweredByPSI(true);
				}else {
					((ModBlocks) blockstate).PoweredByPSI(false);
				}
	}
	
	public static void createShields(World world, BlockPos pos, int domeHeight) {
		//creates peak block of which we will build layers down from
		world.setBlockState(pos.up(domeHeight), ModBlocks.COBBLESTONE_CHAR.getDefaultState());
		//some useful integers to help us keep track of stuff
		int level = 0;
		int domeLevelLength = 2;
		int factorX = 1;
		int factorZ = 1;
		int cornerOffset = 1;
		//start by counting layers of our dome! As we finish off layers, we go down a level and generate the next level
		for(int h = domeHeight; h > 0; h--) {
			//we start at -(cornerOffset) because that is our corner we want to start generating from. Our Maximum is our entire side length, or domeLevelLength. After every single level, we increase those numbers
			for(int x = -cornerOffset; x < domeLevelLength; x++) {
				world.setBlockState(pos.add(pos.getX() + (-cornerOffset), pos.getY() + h, pos.getZ()), ModBlocks.COBBLESTONE_CHAR.getDefaultState());
			}
			//we generate the next side length of our dome!
			for(int z = -cornerOffset; z < domeLevelLength; z++) {
				world.setBlockState(pos.add(pos.getX(), pos.getY() + h, pos.getZ() + (-cornerOffset)), ModBlocks.COBBLESTONE_CHAR.getDefaultState());
				
			}
			//Now we REVERSE our dome generation using the first for loop, but just going backwards now :p
			for(int x = cornerOffset; x < domeLevelLength; x++) {
				world.setBlockState(pos.add(pos.getX() + cornerOffset, pos.getY() + h, pos.getZ()), ModBlocks.COBBLESTONE_CHAR.getDefaultState());
			}
			//Same for the Z axis!
			for(int z = cornerOffset; z < domeLevelLength; z++) {
				world.setBlockState(pos.add(pos.getX(), pos.getY() + h, pos.getZ() + cornerOffset), ModBlocks.COBBLESTONE_CHAR.getDefaultState());
				
			}
			//Here we offset our corner by incrementing it, so we get a nice new layer thats larger than the previous. We also increase our Dome Length to be larger
			cornerOffset++;
			domeLevelLength += 2;
		}
		
	}
	
	//To be created!
	public static void regenerateShields() {
		
	}

}

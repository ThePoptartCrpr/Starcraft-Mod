package net.bvanseghi.starcraft.lib;

import java.util.ArrayList;
import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.blocks.metablocks.ModMetaBlocks;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.entity.EntityZergling;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A set of utilities that simplify code in other areas<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team</b></em>
 * @author wundrweapon
 * @author bvanseghi
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
						world.setBlockState(pos.add(x, y, z), blockState);
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
					BlockPos currPos = pos.add(x, y, z);
					
					if(world.getBlockState(currPos) == blockState) {
						posList.add(currPos);
					}
				}
			}
		}
		
		return posList;
	}
	
	
	/**
	 * Searches for Pylons... I think
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
		int counter = 0;
		
		for(int x = -sideLength/2; x < sideLength/2 + 1; x++) {
			for(int y = -sideLength/2; y < sideLength/2 + 1; y++) {
				for(int z = -sideLength/2; z < sideLength/2 + 1; z++) {
					BlockPos currPos = pos.add(x, y, z);
					
					if(world.getBlockState(currPos) == blockState[counter]) {
						posList.add(currPos);
						feedPower(currPos, blockState[counter]);
					}
					
					counter++;
				}
			}
		}
		
		return posList;
	}
	
	/**
	 * "Unlimited POWER!!!" -Palpatine, I think<br>
	 * This method can be adapted to manipulate integers to set speeds of the machines
	 * based on the distance the power is traveling<br>
	 * If a block is NOT a Protoss machine, it is set to unpowered by default.
	 * @param pos for the position of the block taken from {@link #pylonSearch}
	 * @param blockstate to check if the block is a Protoss machine
	 */
	public static void feedPower(BlockPos pos, IBlockState blockstate) {
		if(blockstate == ModMetaBlocks.PROTOSS_METAL.getDefaultState()) {
			((ModBlocks) blockstate).PoweredByPSI(true);
		} else {
			((ModBlocks) blockstate).PoweredByPSI(false);
		}
	}
	
	/**
	 * Creates the glorious shields
	 * @param world the world
	 * @param pos the bottom-middle of the shield
	 * @param domeHeight difference in height between
	 * {@code pos} and the peak of the dome
	 */
	@SuppressWarnings("unused")
	public static void createShields(World world, BlockPos pos, int domeHeight) {
		
		//creates peak block of which we will build layers down from
		world.setBlockState(pos.up(domeHeight), Blocks.GLASS.getDefaultState());
		
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
				world.setBlockState(pos.add(x - cornerOffset, h, 0), Blocks.GLASS.getDefaultState());
				System.out.println("(" + pos.add(x - cornerOffset, h, 0).getX() + ", " + pos.add(x - cornerOffset, h, 0).getY() + ", " + pos.add(x - cornerOffset, h, 0).getZ() + ")");
//				LogHelper.logger.log(Level.INFO, pos.getX() + ":" + pos.getY() + ":" + pos.getZ());
			}
			
			//we generate the next side length of our dome!
			for(int z = -cornerOffset; z < domeLevelLength; z++) {
				world.setBlockState(pos.add(0, h, z + (-cornerOffset)), Blocks.GLASS.getDefaultState());
//				LogHelper.logger.log(Level.INFO, pos.getX() + ":" + pos.getY() + ":" + pos.getZ());
			}
			
			//Now we REVERSE our dome generation using the first for loop, but just going backwards now :p
			for(int x = cornerOffset; x < domeLevelLength; x++) {
				world.setBlockState(pos.add(x + cornerOffset, pos.getY() + h, 0), Blocks.GLASS.getDefaultState());
//				LogHelper.logger.log(Level.INFO, pos.getX() + ":" + pos.getY() + ":" + pos.getZ());
			}
			
			//Same for the Z axis!
			for(int z = cornerOffset; z < domeLevelLength; z++) {
				world.setBlockState(pos.add(0, h, z + cornerOffset), Blocks.GLASS.getDefaultState());
//				LogHelper.logger.log(Level.INFO, pos.getX() + ":" + pos.getY() + ":" + pos.getZ());
			}
			
			//Here we offset our corner by incrementing it, so we get a nice new layer thats larger than the previous. We also increase our Dome Length to be larger
			cornerOffset++;
			domeLevelLength += 2;
		}
	}
	
	/**
	 * Later...
	 */
	public static void regenerateShields() {
		//TODO: this
	}
	
	/**
	 * <em>Use this one because it saves three params.
	 * At some point, I'll eliminate the other and just
	 * use this, but for now I did some lazy method invocation</em><br>
	 * Larva -> cocoon. Simple
	 * @param world the world
	 * @param larva the larva in question
	 * @param rand {@link Random} instance which will eventually
	 * determine what gets pooped out later
	 */
	public static void larvaMorph(World world, EntityLarva larva, Random rand) {
		if(!world.isRemote){
			EntityLarvaCocoon cocoon = new EntityLarvaCocoon(world);
			cocoon.setLocationAndAngles(larva.posX, larva.posY, larva.posZ, 0, 0);
			world.spawnEntityInWorld(cocoon);
			larva.setDead();
		}
	}
	
	/**
	 * <em>Use this one because it saves three params.
	 * At some point, I'll eliminate the other and just
	 * use this, but for now I did some lazy method invocation</em><br>
	 * Cocoon -> Zergling. Simple
	 * @param world the world
	 * @param cocoon the larva in question
	 * @param rand {@link Random} instance which will eventually
	 * determine what gets pooped out later
	 */
	public static void larvaCocoonMorph(World world, EntityLarvaCocoon cocoon, Random rand) {
		if(!world.isRemote){
			EntityZergling zergling = new EntityZergling(world);
			zergling.setLocationAndAngles(cocoon.posX, cocoon.posY, cocoon.posZ, 0, 0);
			world.spawnEntityInWorld(zergling);
			cocoon.setDead();
		}
	}
}

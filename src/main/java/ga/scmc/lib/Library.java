package ga.scmc.lib;

import java.util.ArrayList;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.blocks.metablocks.ModMetaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A set of utilities that simplify code in other areas<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team</b></em>
 * @author wundrweapon
 * @author He who is nameless
 */
public class Library {

	/**
	 * Makes a cube out of {@code blockState} anchored at the bottom-middle.
	 * NOTE: this ignores the anchor. Also, make sure the side length is an odd
	 * natural number, else you'll break something
	 * @param world the world
	 * @param blockState the blockState to make a cube of (use
	 * {@link Block#getDefaultState()} if unsure)
	 * @param pos the {@link BlockPos} of the anchor
	 * @param sideLength the length of the sides of the cube
	 */
	public static void blockCube(World world, IBlockState blockState, BlockPos pos, int sideLength) {
		for(int x = -sideLength / 2; x < sideLength / 2 + 1; x++) {
			for(int y = 0; y < sideLength + 1; y++) {
				for(int z = -sideLength / 2; z < sideLength / 2 + 1; z++) {
					if(x == 0 && y == 0 && z == 0) {
						continue;
					} else {
						world.setBlockState(pos.add(x, y, z), blockState);
					}
				}
			}
		}
	}

	/**
	 * Checks a cubic volume for any instances of {@code blockState}. The anchor
	 * is in the absolute center of the cube. Make sure the side length is an
	 * odd number, else you'll break something
	 * @param world the world
	 * @param blockState the {@link IBlockState} to check for
	 * @param pos the anchor {@link BlockPos}
	 * @param sideLength the length of the cube's sides
	 * @return {@link ArrayList} of all the BlockPos instances that contain
	 * {@code blockState}
	 */
	public static ArrayList<BlockPos> checkCube(World world, IBlockState blockState, BlockPos pos, int sideLength) {
		ArrayList<BlockPos> posList = new ArrayList<BlockPos>();

		for(int x = -sideLength / 2; x < sideLength / 2 + 1; x++) {
			for(int y = -sideLength / 2; y < sideLength / 2 + 1; y++) {
				for(int z = -sideLength / 2; z < sideLength / 2 + 1; z++) {
					BlockPos currPos = pos.add(x, y, z);

					if(world.getBlockState(currPos).equals(blockState)) {
						posList.add(currPos);
					}
				}
			}
		}

		return posList;
	}

	/**
	 * "Unlimited POWER!!!" -Palpatine, I think<br>
	 * This method can be adapted to manipulate integers to set speeds of the
	 * machines based on the distance the power is traveling<br>
	 * If a block is NOT a Protoss machine, it is set to unpowered by default.
	 * @param pos for the position of the block taken from {@link #pylonSearch}
	 * @param blockstate to check if the block is a Protoss machine
	 */
	public static void feedPower(BlockPos pos, IBlockState blockstate) {
		if(blockstate == ModMetaBlocks.PROTOSS_METAL_T1.getDefaultState()) {
			((ModBlocks) blockstate).PoweredByPSI(true);
		} else {
			((ModBlocks) blockstate).PoweredByPSI(false);
		}
	}

    /**
	 * Searches for Pylons... I think<br>
	 * TODO: ensure that this works
	 * @param world for world
	 * @param pos
	 * @param sideLength the length of the cube's sides. Must be an odd number.
	 * @param blockState the {@link IBlockState}
	 * @return ArrayList of all the BlockPos instances that contain
	 * {@code blockState}. This accepts an undefined # of parameters to check
	 * for multiple protoss machine types.
	 */
	public static ArrayList<BlockPos> pylonSearch(World world, BlockPos pos, int sideLength, IBlockState... blockState) {
		ArrayList<BlockPos> posList = new ArrayList<BlockPos>();
		int counter = 0;

		for(int x = -sideLength / 2; x < sideLength / 2 + 1; x++) {
			for(int y = -sideLength / 2; y < sideLength / 2 + 1; y++) {
				for(int z = -sideLength / 2; z < sideLength / 2 + 1; z++) {
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
	 * Later...
	 */
	public static void regenerateShields() {
		// TODO: this
	}

	/**
	 * Replaces {@code current} with {@code next} in the same world. Can
	 * transfer pitch and yaw rotation angles from {@code current} to
	 * {@code next}. If pitch/yaw not transferred, they are both set to
	 * {@code 0}
	 * @param current the entity to replace
	 * @param next the replacement
	 * @param keepRot whether or not to transfer the pitch and yaw rotation
	 * angles of {@code current} to {@code next}
	 */
	public static void replaceEntity(boolean keepRot, Entity current, Entity... next) {
		if(!current.worldObj.isRemote) {
			if(keepRot) {
				for(Entity e : next) {
					e.setLocationAndAngles(current.posX, current.posY, current.posZ, current.rotationYaw, current.rotationPitch);
				}
			} else {
				for(Entity e : next) {
					e.setLocationAndAngles(current.posX, current.posY, current.posZ, 0, 0);
				}
			}

			for(Entity e : next) {
				current.worldObj.spawnEntityInWorld(e);
			}

			current.setDead();
		}
	}

	/**
	 * Replaces {@code current} with {@code next} in the same world. Sets the
	 * pitch/yaw of all objects on {@code next} to {@code pitch} and
	 * {@code yaw}, respectively.<br>
	 * This is done by setting {@code current}'s pitch/yaw, then calling
	 * {@link #replaceEntity(boolean, Entity, Entity)} with parameters
	 * {@code true}, {@code current}, and {@code next} as a means of
	 * transferring {@code current}'s new pitch/yaw angles to {@code next}
	 * @param pitch the pitch to use
	 * @param yaw the yaw to use
	 * @param current the {@link Entity} to replace
	 * @param next the {@link Entity} objects to replace {@code current}
	 */
	public static void replaceEntity(float pitch, float yaw, Entity current, Entity... next) {
		if(!current.worldObj.isRemote) {
			current.setAngles(yaw, pitch);
			replaceEntity(true, current, next);
		}
	}
	
	public static void square(World world, BlockPos center, int radius, IBlockState state) {
        BlockPos pos = center.add(-radius, 0, -radius);
        EnumFacing facing = EnumFacing.EAST;
        for (int i = 0; i < 4; i++) {
            for (int k = radius * 2 - 1; k >= 0; k--) {
                if (world.getBlockState(pos).getBlock() == Blocks.AIR)
                    world.setBlockState(pos, state);
                pos = pos.offset(facing);
            }
            facing = facing.rotateY();
        }
    }

    /**
	 * Creates the glorious shields
	 * @param world the world
	 * @param pos the bottom-middle of the shield
	 * @param domeHeight difference in height between {@code pos} and the peak
	 * of the dome
	 */
	 /**
     * SliceThePi's proprietary blend of all-natural spaghetti code
     */
    public static void truncatedPyramid(World world, BlockPos pos, IBlockState state, int domeHeight, int domeTopLength,
            int slope) {
        int radius = domeTopLength / 2;
        for (int i = domeHeight - 1; i >= 0; i -= slope) {
            for (int k = 0; k >= -slope + 1 && i + k >= 0; k--)
                square(world, new BlockPos(pos.getX(), pos.getY() + i + k, pos.getZ()),
                        (domeHeight - i - 1) / slope + radius, state);
        }
        for (int x = -radius; x <= radius; x++)
            for (int z = -radius; z <= radius; z++)
                if (world.getBlockState(pos.add(x, domeHeight - 1, z)).getBlock() == Blocks.AIR)
                    world.setBlockState(pos.add(x, domeHeight - 1, z), state);
    }
}
package net.bvanseghi.starcraft.lib;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class Library {
	
	/**
	 * Makes a cube out of {@code block}.
	 * Anchor: bottom-middle
	 * @param world the world
	 * @param block the block to make a
	 * cube of
	 * @param x the X coordinate of the
	 * anchor position
	 * @param y the Y coordinate of the
	 * anchor position
	 * @param z the Z coordinate of the
	 * anchor position
	 */
	public void blockCube(World world, Block block, int x, int y, int z) {
		boolean killLoop = false;
		byte yOffsetIndex = 0;
		byte zOffsetIndex = 0;
		byte[] xOffsets = {-1, 0, 1};
		byte[] yOffsets = {0, 1, 2};
		byte[] zOffsets = {-1, 0, 1};
		
		for(byte xOffsetIndex = 0; xOffsetIndex < 3; xOffsetIndex++) {
			
			//Don't place block at anchor
			if(xOffsets[xOffsetIndex] != 0 || zOffsets[zOffsetIndex] != 0) {
				world.setBlock(x + xOffsets[xOffsetIndex], y + yOffsets[yOffsetIndex], z + zOffsets[zOffsetIndex], block);
			} else if(yOffsets[yOffsetIndex] != 0) {
				world.setBlock(x + xOffsets[xOffsetIndex], y + yOffsets[yOffsetIndex], z + zOffsets[zOffsetIndex], block);
			}
			
			//Reset X index to 0 after going past the final column
			if(xOffsetIndex + 1 == 3) {
				xOffsetIndex = -1;
				zOffsetIndex++;
				
				//Reset Z index and raise Y index after going past the final row
				if(zOffsetIndex == 3) {
					zOffsetIndex = 0;
					yOffsetIndex++;
					
					if(yOffsetIndex == 3) {
						killLoop = true;
					}
				}
			}
			
			if(killLoop) {
				break;
			}
		}
	}
}
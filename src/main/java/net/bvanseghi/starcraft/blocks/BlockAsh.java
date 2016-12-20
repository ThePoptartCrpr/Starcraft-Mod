package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAsh extends BlockSnow {
    
    @SuppressWarnings("unused")
	private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.canPlaceBlockAt(worldIn, pos))
        {
            worldIn.setBlockToAir(pos);
            return false;
        }
        else
        {
            return true;
        }
    }
}

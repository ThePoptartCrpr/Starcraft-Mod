package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.lib.Reference;

//FIXME: find the source of the ash-makes-snow bug. it's probably due to a missing override
public class BlockAsh extends BlockSnow {
	public BlockAsh() {
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ASH_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ASH_C.getRegistryRL());
	}
    
	//No @Override because the super method is private
	private boolean checkAndDropBlock(World world, BlockPos pos, IBlockState state) {
        if(!canPlaceBlockAt(world, pos)) {
            world.setBlockToAir(pos);
            return false;
        } else {
            return true;
        }
    }
	
	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block) {
		checkAndDropBlock(world, pos, state);
	}
}

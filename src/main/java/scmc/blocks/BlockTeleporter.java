package scmc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTeleporter extends BlockPortal {

	public BlockTeleporter() {
		super();
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if(!entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn.isNonBoss()) {
            entityIn.setPortal(pos);
        }
    }

	@Override
	public boolean trySpawnPortal(World worldIn, BlockPos pos) {
        return false;
    }

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {}
}
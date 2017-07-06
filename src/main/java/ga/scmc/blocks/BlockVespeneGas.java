package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockVespeneGas extends ModBlocks {

	public BlockVespeneGas() {
		super(Material.AIR);
		setTickRandomly(true);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_GAS_VESPENE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_GAS_VESPENE.getRegistryRL());
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if(world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			if(pos.getY() <= 100) {
			world.setBlockState(pos.up(), ModBlocks.GAS_VESPENE.getDefaultState());
			world.setBlockState(pos, Blocks.AIR.getDefaultState());
			}else {
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
			}
		}
		super.updateTick(world, pos, state, rand);
	}
}

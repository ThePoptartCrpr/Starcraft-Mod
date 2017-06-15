package scmc.blocks.coreblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Library;
import scmc.lib.Reference;

public class BlockCoreWarpGateDark extends ModBlocks {

	public BlockCoreWarpGateDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_DARK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_WARPGATE_DARK.getRegistryRL());
		setSoundType(SoundType.STONE);
		// setHardness(2.0F);
		// setResistance(5.0F);
		// setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.truncatedPyramid(worldIn, pos.add(0, -5, 0), ModBlocks.PROTOSS_SHIELD.getDefaultState(), 16, 24, 3);
	}
}

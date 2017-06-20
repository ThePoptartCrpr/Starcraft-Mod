package ga.scmc.blocks.coreblocks;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.blocks.ModBlocks;
import ga.scmc.lib.Library;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoreCyberneticsCoreKhalai extends ModBlocks {

	public BlockCoreCyberneticsCoreKhalai() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_CYBERNETICSCORE_KHALAI.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_CYBERNETICSCORE_KHALAI.getRegistryRL());
		setSoundType(SoundType.STONE);
		// setHardness(2.0F);
		// setResistance(5.0F);
		// setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.truncatedPyramid(worldIn, pos.add(0, -5, 0), ModBlocks.PROTOSS_SHIELD.getDefaultState(), 16, 24, 3);
	}
}

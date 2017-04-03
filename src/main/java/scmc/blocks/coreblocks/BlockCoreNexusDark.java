package scmc.blocks.coreblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Library;
import scmc.lib.Reference;

public class BlockCoreNexusDark extends Block {
	public BlockCoreNexusDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getRegistryRL());
		setSoundType(SoundType.STONE);
		//setHardness(2.0F);
		//setResistance(5.0F);
		//setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.createShields(worldIn, pos, 50);
	}
}
=======
package scmc.blocks.coreblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.Library;
import scmc.lib.Reference;

public class BlockCoreNexusDark extends ModBlocks {
	public BlockCoreNexusDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_NEXUS_DARK.getRegistryRL());
		setSoundType(SoundType.STONE);
		//setHardness(2.0F);
		//setResistance(5.0F);
		//setHarvestLevel("pickaxe", 0);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.createShields(worldIn, pos, 50);
	}
}

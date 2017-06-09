package scmc.blocks.coreblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class BlockCorePylonDark extends ModBlocks {

	public BlockCorePylonDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_PYLON_DARK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_PYLON_DARK.getRegistryRL());
		setSoundType(SoundType.STONE);
		// setHardness(2.0F);
		// setResistance(5.0F);
		// setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
}

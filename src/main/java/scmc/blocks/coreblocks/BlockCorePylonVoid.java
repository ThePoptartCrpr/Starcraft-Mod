package scmc.blocks.coreblocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class BlockCorePylonVoid extends Block {
	public BlockCorePylonVoid() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_CORE_PYLON_VOID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_CORE_PYLON_VOID.getRegistryRL());
		setSoundType(SoundType.STONE);
		//setHardness(2.0F);
		//setResistance(5.0F);
		//setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}
}

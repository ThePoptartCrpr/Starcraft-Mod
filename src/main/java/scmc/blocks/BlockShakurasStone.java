package scmc.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class BlockShakurasStone extends ModBlocks {

	public BlockShakurasStone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_STONE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_STONE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
	}

	// @Override
	// public int damageDropped(IBlockState state) {
	// return getMetaFromState(state);
	// }

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.COBBLESTONE_SHAKURAS);
	}
}

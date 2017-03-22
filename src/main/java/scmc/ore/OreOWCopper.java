package scmc.ore;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreOWCopper extends ModBlocks {
	public OreOWCopper() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setUnlocalizedName(Reference.ModBlocks.ORE_COPPER_OW.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_COPPER_OW.getRegistryRL());
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Item.getItemFromBlock(this);
	}
}

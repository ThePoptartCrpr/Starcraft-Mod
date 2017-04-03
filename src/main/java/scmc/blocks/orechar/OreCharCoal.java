package scmc.blocks.orechar;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class OreCharCoal extends ModBlocks {
	public OreCharCoal() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.ORE_COAL_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_COAL_C.getRegistryRL());
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.COAL;
	}
}

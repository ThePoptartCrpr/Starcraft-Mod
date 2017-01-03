package net.bvanseghi.starcraft.blocks;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCompressedMetals extends Block {

	/**
	 *  Aiur = yellow, Dark = dark grey.
	 */
	public static final String[] subBlocks = new String[] {"Copper", "Titanium", "Steel"};
	
	public BlockCompressedMetals() {
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
}

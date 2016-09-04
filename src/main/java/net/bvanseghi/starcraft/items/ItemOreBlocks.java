package net.bvanseghi.starcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemOreBlocks extends ItemBlock {

	public ItemOreBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	/**
	 * 0, 1, 2, 3, 4, 5C, 6C, 7C, 8C, 9C, 10C, 11C, 12C, 13C, 14C, 15C, 16S,
	 * 17S, 18S, 19S, 20S, 21S, 22S, 23S, 24S, 25S 26S
	 */
	public static final String[] names = new String[] { "Mineral", "RichMineral", "Alien", "Titanium", "Copper",

			// 5-15
			"CoalC", "IronC", "GoldC", "RedstoneC", "LapisC", "DiamondC", "MineralC", "RichMineralC", "AlienC",
			"TitaniumC", "CopperC" };
	
	
	
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= names.length) {
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + names[i];
	}
	
	public int getMetadata(int meta) {
		return meta;
	}
}



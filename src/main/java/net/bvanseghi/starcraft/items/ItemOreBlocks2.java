package net.bvanseghi.starcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemOreBlocks2 extends ItemBlock {

	public ItemOreBlocks2(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}

	public static final String[] names = new String[] { 
			"CoalS", "IronS", "GoldS", "RedstoneS", "LapisS", "DiamondS",
			"MineralS", "RichMineralS", "AlienS", "TitaniumS", "CopperS", };

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

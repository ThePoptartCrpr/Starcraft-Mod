package net.bvanseghi.starcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemCompressedMetalBlocks extends ItemBlock {

	public ItemCompressedMetalBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public static final String[] names = new String[] { "Copper", "Titanium", "Steel" };
	
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



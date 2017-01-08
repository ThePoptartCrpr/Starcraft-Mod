package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemAcidBucket extends ItemBucket {

	public ItemAcidBucket(Block block) {
		super(block);
		setUnlocalizedName(Reference.ModItems.ITEM_BUCKET_ACID.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_BUCKET_ACID.getRegistryRL());
		this.setCreativeTab(CreativeTab.TabStarcraftMisc);

	}

}

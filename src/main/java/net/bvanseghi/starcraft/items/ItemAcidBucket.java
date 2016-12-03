package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemAcidBucket extends ItemBucket {

	public ItemAcidBucket(Block block) {
		super(block);

		this.setTextureName(Reference.MODID + ":acidBucket");
		this.setCreativeTab(CreativeTab.TabStarcraftMisc);

	}

}

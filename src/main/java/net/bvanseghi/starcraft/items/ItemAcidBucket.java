package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemAcidBucket extends ItemBucket {

	public ItemAcidBucket(Block block) {
		super(block);

		this.setTextureName(REFERENCE.MODID + ":acidBucket");
		this.setCreativeTab(CreativeTab.TabStarcraftMisc);

	}

}

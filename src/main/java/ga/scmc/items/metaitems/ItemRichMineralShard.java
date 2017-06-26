package ga.scmc.items.metaitems;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;

public class ItemRichMineralShard extends ModItems {
	public ItemRichMineralShard() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_RICHMINERAL_SHARD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_RICHMINERAL_SHARD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}

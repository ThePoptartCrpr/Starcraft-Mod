package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemHydraliskNeedle extends ModItems {
	public ItemHydraliskNeedle() {
		setUnlocalizedName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

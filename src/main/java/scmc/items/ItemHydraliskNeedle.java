package scmc.items;

import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ItemHydraliskNeedle extends ModItems {

	public ItemHydraliskNeedle() {
		setUnlocalizedName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
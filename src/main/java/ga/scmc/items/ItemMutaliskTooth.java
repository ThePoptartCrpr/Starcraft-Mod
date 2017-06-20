package ga.scmc.items;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemMutaliskTooth extends ModItems {

	public ItemMutaliskTooth() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_MUTALISK_TOOTH.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_MUTALISK_TOOTH.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
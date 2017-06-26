package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemKeystone extends ModItems {

	public ItemKeystone() {
		setUnlocalizedName(Reference.ModItems.ITEM_KEYSTONE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_KEYSTONE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
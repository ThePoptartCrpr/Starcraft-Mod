package ga.scmc.items;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemProtossModule extends ModItems {

	public ItemProtossModule() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_MODULE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_MODULE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
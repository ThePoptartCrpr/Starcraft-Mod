package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemUraj extends ModItems {

	public ItemUraj() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_URAJ.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_URAJ.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
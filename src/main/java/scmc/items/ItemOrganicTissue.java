package scmc.items;

import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ItemOrganicTissue extends ModItems {

	public ItemOrganicTissue() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_ORGANIC_TISSUE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_ORGANIC_TISSUE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
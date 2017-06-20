package ga.scmc.items;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemProtossScrapMetal extends ModItems {

	public ItemProtossScrapMetal() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_SCRAP_METAL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_SCRAP_METAL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
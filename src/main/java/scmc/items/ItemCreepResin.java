package scmc.items;

import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ItemCreepResin extends ModItems {

	public ItemCreepResin() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
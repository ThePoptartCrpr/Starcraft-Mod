package ga.scmc.items;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemCreepResin extends ModItems {

	public ItemCreepResin() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
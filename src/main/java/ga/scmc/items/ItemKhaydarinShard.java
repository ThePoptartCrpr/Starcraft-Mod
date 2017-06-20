package ga.scmc.items;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;

public class ItemKhaydarinShard extends ModItems {

	public ItemKhaydarinShard() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_KHAYDARIN_SHARD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_KHAYDARIN_SHARD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
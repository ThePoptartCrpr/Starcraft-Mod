package ga.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ga.scmc.items.ModItems;

public class StarcraftCreativeTabProtoss extends CreativeTabs{

	public StarcraftCreativeTabProtoss() {
		super("protoss");
		setBackgroundImageName("item_search_protoss.png");
	
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ICON_PROTOSS;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}

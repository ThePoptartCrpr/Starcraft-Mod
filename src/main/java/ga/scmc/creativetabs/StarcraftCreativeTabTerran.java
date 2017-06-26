package ga.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ga.scmc.items.ModItems;

public class StarcraftCreativeTabTerran extends CreativeTabs{

	public StarcraftCreativeTabTerran() {
		super("terran");
		setBackgroundImageName("item_search_terran.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ICON_TERRAN;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}

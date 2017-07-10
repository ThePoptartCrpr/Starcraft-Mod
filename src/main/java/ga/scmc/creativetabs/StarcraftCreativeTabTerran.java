package ga.scmc.creativetabs;

import ga.scmc.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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

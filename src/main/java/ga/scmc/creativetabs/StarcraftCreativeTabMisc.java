package ga.scmc.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ga.scmc.items.ModItems;

public class StarcraftCreativeTabMisc extends CreativeTabs{

	public StarcraftCreativeTabMisc() {
		super("misc");
		setBackgroundImageName("item_search.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ENERGY;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}

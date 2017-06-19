package scmc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import scmc.items.ModItems;

public class StarcraftCreativeTabZerg extends CreativeTabs{

	public StarcraftCreativeTabZerg() {
		super("zerg");
		setBackgroundImageName("item_search_zerg.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ICON_ZERG;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
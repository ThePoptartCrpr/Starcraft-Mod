package ga.scmc;

import ga.scmc.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
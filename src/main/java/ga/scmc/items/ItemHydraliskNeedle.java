package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemHydraliskNeedle.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemHydraliskNeedle.java

public class ItemHydraliskNeedle extends ModItems {

	public ItemHydraliskNeedle() {
		setUnlocalizedName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_HYDRALISK_NEEDLE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
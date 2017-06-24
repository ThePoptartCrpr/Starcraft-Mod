package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemMutaliskTooth.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemMutaliskTooth.java

public class ItemMutaliskTooth extends ModItems {

	public ItemMutaliskTooth() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_MUTALISK_TOOTH.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_MUTALISK_TOOTH.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
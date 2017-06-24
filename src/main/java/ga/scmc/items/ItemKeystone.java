package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemKeystone.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemKeystone.java

public class ItemKeystone extends ModItems {

	public ItemKeystone() {
		setUnlocalizedName(Reference.ModItems.ITEM_KEYSTONE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_KEYSTONE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
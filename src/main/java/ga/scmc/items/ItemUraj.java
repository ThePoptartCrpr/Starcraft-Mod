package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemUraj.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemUraj.java

public class ItemUraj extends ModItems {

	public ItemUraj() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_URAJ.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_URAJ.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
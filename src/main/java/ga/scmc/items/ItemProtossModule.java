package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemProtossModule.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemProtossModule.java

public class ItemProtossModule extends ModItems {

	public ItemProtossModule() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_MODULE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_MODULE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
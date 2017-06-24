package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemProtossScrapMetal.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemProtossScrapMetal.java

public class ItemProtossScrapMetal extends ModItems {

	public ItemProtossScrapMetal() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_SCRAP_METAL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_SCRAP_METAL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}
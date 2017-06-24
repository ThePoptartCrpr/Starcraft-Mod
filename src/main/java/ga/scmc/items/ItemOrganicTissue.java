package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemOrganicTissue.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemOrganicTissue.java

public class ItemOrganicTissue extends ModItems {

	public ItemOrganicTissue() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_ORGANIC_TISSUE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_ORGANIC_TISSUE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
package ga.scmc.items;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/ItemCreepResin.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/ItemCreepResin.java

public class ItemCreepResin extends ModItems {

	public ItemCreepResin() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_CREEP_RESIN.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}
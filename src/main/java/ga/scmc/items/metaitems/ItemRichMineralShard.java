package ga.scmc.items.metaitems;

<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/metaitems/ItemRichMineralShard.java
import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
=======
import scmc.creativetabs.StarcraftCreativeTabs;
import scmc.items.ModItems;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/metaitems/ItemRichMineralShard.java

public class ItemRichMineralShard extends ModItems {

	public ItemRichMineralShard() {
		super();
		setUnlocalizedName(Reference.ModItems.ITEM_RICHMINERAL_SHARD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_RICHMINERAL_SHARD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}
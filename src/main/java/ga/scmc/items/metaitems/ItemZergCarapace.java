package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.items.metaitems.ItemEnumHandler.CarapaceType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/metaitems/ItemZergCarapace.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/metaitems/ItemZergCarapace.java

public class ItemZergCarapace extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemZergCarapace() {
		setUnlocalizedName(Reference.ModItems.ITEM_ZERG_CARAPACE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ZERG_CARAPACE.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < CarapaceType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link CarapaceTypeType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < CarapaceType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + CarapaceType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + CarapaceType.T1.getName();
	}
}
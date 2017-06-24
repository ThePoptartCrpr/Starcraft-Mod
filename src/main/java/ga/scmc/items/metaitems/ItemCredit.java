package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.items.metaitems.ItemEnumHandler.CreditType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/metaitems/ItemCredit.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/metaitems/ItemCredit.java

public class ItemCredit extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemCredit() {
		setUnlocalizedName(Reference.ModItems.ITEM_CREDIT.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_CREDIT.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < CreditType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link CreditType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < CreditType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + CreditType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + CreditType.BRONZE.getName();
	}
}
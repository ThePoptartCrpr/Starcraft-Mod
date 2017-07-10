package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.items.metaitems.ItemEnumHandler.IngotType;
import ga.scmc.items.metaitems.ItemEnumHandler.ProtossIngotType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemProtossIngot extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemProtossIngot() {
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_INGOT.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_INGOT.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < ProtossIngotType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link IngotType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < ProtossIngotType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ProtossIngotType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossIngotType.KHALAI.getName();
	}
}
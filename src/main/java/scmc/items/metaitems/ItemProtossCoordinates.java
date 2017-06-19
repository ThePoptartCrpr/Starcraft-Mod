package scmc.items.metaitems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scmc.StarcraftCreativeTabs;
import scmc.items.metaitems.ItemEnumHandler.CoordinateType;
import scmc.lib.Reference;

public class ItemProtossCoordinates extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemProtossCoordinates() {
		setUnlocalizedName(Reference.ModItems.ITEM_COORDINATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_COORDINATE.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < CoordinateType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link CoordinateType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < CoordinateType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + CoordinateType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + CoordinateType.CHAR.getName();
	}
}
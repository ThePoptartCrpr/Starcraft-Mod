package scmc.items.metaitems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scmc.StarcraftCreativeTabs;
import scmc.items.metaitems.ItemEnumHandler.MineralType;
import scmc.items.metaitems.ItemEnumHandler.MutaliskWingType;
import scmc.lib.Reference;

public class ItemMutaliskWing extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemMutaliskWing() {
		setUnlocalizedName(Reference.ModItems.ITEM_MUTALISK_WING.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_MUTALISK_WING.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < MutaliskWingType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link MineralType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < MutaliskWingType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + MutaliskWingType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + MutaliskWingType.PURPLE.getName();
	}
}
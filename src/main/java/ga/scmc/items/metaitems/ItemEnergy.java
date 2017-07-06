package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.ItemEnumHandler.EnergyType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEnergy extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemEnergy() {
		setUnlocalizedName(Reference.ModItems.ITEM_ENERGY.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_ENERGY.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < EnergyType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link EnergyType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < EnergyType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + EnergyType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + EnergyType.PURE.getName();
	}
}
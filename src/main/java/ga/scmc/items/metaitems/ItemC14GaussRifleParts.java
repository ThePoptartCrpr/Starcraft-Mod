package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.items.metaitems.ItemEnumHandler.C14PartType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemC14GaussRifleParts extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemC14GaussRifleParts() {
		setUnlocalizedName(Reference.ModItems.ITEM_PART_C14_GAUSS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PART_C14_GAUSS.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < C14PartType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link c14PartTypeType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < C14PartType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + C14PartType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + C14PartType.BARREL.getName();
	}
}
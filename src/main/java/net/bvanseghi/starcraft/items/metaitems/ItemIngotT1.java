package net.bvanseghi.starcraft.items.metaitems;

import java.util.List;

import net.bvanseghi.starcraft.items.metaitems.ItemEnumHandler.IngotTypeT1;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemIngotT1 extends Item {
	
	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemIngotT1(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.RL_BASE + unlocalizedName));
		this.setHasSubtypes(true); //This just says the item has metadata
	}
	
	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < IngotTypeT1.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}
	
	/**
	 * Gets the correct unlocalized name using the {@link IngotTypeT1} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < IngotTypeT1.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + IngotTypeT1.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + IngotTypeT1.COPPER.getName();
	}
}
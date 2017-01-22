package net.bvanseghi.starcraft.items.meta;

import java.util.List;

import net.bvanseghi.starcraft.items.meta.ItemEnumHandler.CoordinateType;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemProtossCoordinates extends Item {
	
	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemProtossCoordinates(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.RL_BASE + unlocalizedName));
		this.setHasSubtypes(true); //This just says the item has metadata
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
				return this.getUnlocalizedName() + "." + CoordinateType.values()[i].getName();
			}
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + CoordinateType.CHAR.getName();
	}
}
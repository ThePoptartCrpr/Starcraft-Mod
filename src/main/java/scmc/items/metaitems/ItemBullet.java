package scmc.items.metaitems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scmc.items.metaitems.ItemEnumHandler.BulletType;
import scmc.lib.Reference;

public class ItemBullet extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemBullet() {
		this.setUnlocalizedName(Reference.ModItems.BULLET_RIFLE_C14_GAUSS.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.BULLET_RIFLE_C14_GAUSS.getRegistryRL());
		this.setHasSubtypes(true); // This just says the item has metadata
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < BulletType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link BulletType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < BulletType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return this.getUnlocalizedName() + "." + BulletType.values()[i].getName();
			} else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + BulletType.C14.getName();
	}
}
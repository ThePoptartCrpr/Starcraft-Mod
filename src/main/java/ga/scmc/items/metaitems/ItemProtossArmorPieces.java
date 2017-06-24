package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.items.metaitems.ItemEnumHandler.EnergyType;
import ga.scmc.items.metaitems.ItemEnumHandler.ProtossArmorPiecesType;
import ga.scmc.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/metaitems/ItemProtossArmorPieces.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/metaitems/ItemProtossArmorPieces.java

public class ItemProtossArmorPieces extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 * @param unlocalizedName
	 */
	public ItemProtossArmorPieces() {
		setUnlocalizedName(Reference.ModItems.ITEM_PROTOSS_ARMOR_PIECES.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ITEM_PROTOSS_ARMOR_PIECES.getRegistryRL());
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for(int i = 0; i < ProtossArmorPiecesType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link EnergyType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for(int i = 0; i < ProtossArmorPiecesType.values().length; i++) {
			if(stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ProtossArmorPiecesType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossArmorPiecesType.KHAYDARIN_NODES.getName();
	}
}
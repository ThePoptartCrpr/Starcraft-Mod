package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorTitaniumChestplate extends ItemArmor {

	public ArmorTitaniumChestplate(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_TITANIUM_CHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_TITANIUM_CHESTPLATE.getRegistryRL());
	}
}
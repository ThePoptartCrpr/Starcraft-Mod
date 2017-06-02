package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorAdeptLeggingsT3 extends ItemArmor {
	public ArmorAdeptLeggingsT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ADEPT_LEGGINGS_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ADEPT_LEGGINGS_T3.getRegistryRL());
	}
}
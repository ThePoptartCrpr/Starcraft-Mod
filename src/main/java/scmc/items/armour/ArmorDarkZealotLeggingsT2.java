package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorDarkZealotLeggingsT2 extends ItemArmor {
	public ArmorDarkZealotLeggingsT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_DARK_ZEALOT_LEGGINGS_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_DARK_ZEALOT_LEGGINGS_T2.getRegistryRL());
	}
}
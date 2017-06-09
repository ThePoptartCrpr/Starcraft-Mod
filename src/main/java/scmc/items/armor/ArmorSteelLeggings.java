package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorSteelLeggings extends ItemArmor {

	public ArmorSteelLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_LEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_STEEL_LEGGINGS.getRegistryRL());
	}
}
package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourSteelHelmet extends ItemArmor {

	public ArmourSteelHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_STEEL_HELMET.getRegistryRL());
	}
}
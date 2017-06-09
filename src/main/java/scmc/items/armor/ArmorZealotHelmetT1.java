package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorZealotHelmetT1 extends ItemArmor {

	public ArmorZealotHelmetT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZEALOT_HELMET_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZEALOT_HELMET_T1.getRegistryRL());
	}
}

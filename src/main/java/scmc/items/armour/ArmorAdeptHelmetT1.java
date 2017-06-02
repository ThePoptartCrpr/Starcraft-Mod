package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorAdeptHelmetT1 extends ItemArmor {
	public ArmorAdeptHelmetT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ADEPT_HELMET_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ADEPT_HELMET_T1.getRegistryRL());
	}
}
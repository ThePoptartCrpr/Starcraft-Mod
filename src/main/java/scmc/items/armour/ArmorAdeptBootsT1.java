package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorAdeptBootsT1 extends ItemArmor {
	public ArmorAdeptBootsT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ADEPT_BOOTS_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ADEPT_BOOTS_T1.getRegistryRL());
	}
}
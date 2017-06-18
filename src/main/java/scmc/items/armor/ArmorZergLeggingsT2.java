package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorZergLeggingsT2 extends ItemArmor {

	public ArmorZergLeggingsT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_LEGGINGS_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_LEGGINGS_T2.getRegistryRL());
	}
}

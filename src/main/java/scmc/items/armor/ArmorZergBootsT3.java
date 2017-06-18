package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorZergBootsT3 extends ItemArmor {

	public ArmorZergBootsT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_BOOTS_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_BOOTS_T3.getRegistryRL());
	}
}

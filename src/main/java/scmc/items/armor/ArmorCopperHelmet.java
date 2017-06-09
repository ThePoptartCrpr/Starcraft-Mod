package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorCopperHelmet extends ItemArmor {

	public ArmorCopperHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_HELMET.getRegistryRL());
	}
}

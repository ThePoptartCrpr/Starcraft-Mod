package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourCopperHelmet extends ItemArmor {

	public ArmourCopperHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_HELMET.getRegistryRL());
	}
}

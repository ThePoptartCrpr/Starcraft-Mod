package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourCopperBoots extends ItemArmor {

	public ArmourCopperBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_BOOTS.getRegistryRL());
	}
}

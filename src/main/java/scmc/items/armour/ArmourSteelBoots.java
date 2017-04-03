package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourSteelBoots extends ItemArmor {
	public ArmourSteelBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_BOOTS.getUnlocalizedName());
 		setRegistryName(Reference.ModItems.ARMOR_STEEL_BOOTS.getRegistryRL());
	}
}
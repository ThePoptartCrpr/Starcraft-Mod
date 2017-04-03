package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourGhostBoots extends ItemArmor {
	public ArmourGhostBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_BOOTS.getUnlocalizedName());
 		setRegistryName(Reference.ModItems.ARMOR_GHOST_BOOTS.getRegistryRL());
	}
}

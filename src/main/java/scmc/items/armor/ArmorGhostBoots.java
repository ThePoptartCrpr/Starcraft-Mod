package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorGhostBoots extends ItemArmor {

	public ArmorGhostBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_GHOST_BOOTS.getRegistryRL());
	}
}

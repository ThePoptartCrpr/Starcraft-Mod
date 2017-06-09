package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorGhostHelmet extends ItemArmor {

	public ArmorGhostHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_GHOST_HELMET.getRegistryRL());
	}
}

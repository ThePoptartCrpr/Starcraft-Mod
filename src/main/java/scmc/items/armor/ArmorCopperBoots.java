package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorCopperBoots extends ItemArmor {

	public ArmorCopperBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_BOOTS.getRegistryRL());
	}
}

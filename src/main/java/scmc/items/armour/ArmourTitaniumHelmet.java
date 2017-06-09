package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmourTitaniumHelmet extends ItemArmor {

	public ArmourTitaniumHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_TITANIUM_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_TITANIUM_HELMET.getRegistryRL());
	}
}

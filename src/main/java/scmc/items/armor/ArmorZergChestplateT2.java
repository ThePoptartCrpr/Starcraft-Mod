package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorZergChestplateT2 extends ItemArmor {

	public ArmorZergChestplateT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T2.getRegistryRL());
	}
}

package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorZergBootsT2 extends ItemArmor {

	public ArmorZergBootsT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_BOOTS_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_BOOTS_T2.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

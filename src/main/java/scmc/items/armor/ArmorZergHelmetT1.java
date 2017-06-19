package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorZergHelmetT1 extends ItemArmor {

	public ArmorZergHelmetT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_HELMET_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_HELMET_T1.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

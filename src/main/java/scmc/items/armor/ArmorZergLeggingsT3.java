package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorZergLeggingsT3 extends ItemArmor {

	public ArmorZergLeggingsT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_LEGGINGS_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_LEGGINGS_T3.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

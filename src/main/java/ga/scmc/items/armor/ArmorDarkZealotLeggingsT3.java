package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorDarkZealotLeggingsT3 extends ItemArmor {

	public ArmorDarkZealotLeggingsT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_DARK_ZEALOT_LEGGINGS_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_DARK_ZEALOT_LEGGINGS_T3.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

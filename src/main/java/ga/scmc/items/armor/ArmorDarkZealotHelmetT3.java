package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorDarkZealotHelmetT3 extends ItemArmor {

	public ArmorDarkZealotHelmetT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_DARK_ZEALOT_HELMET_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_DARK_ZEALOT_HELMET_T3.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

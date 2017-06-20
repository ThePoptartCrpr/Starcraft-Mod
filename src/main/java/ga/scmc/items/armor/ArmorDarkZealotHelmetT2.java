package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorDarkZealotHelmetT2 extends ItemArmor {

	public ArmorDarkZealotHelmetT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_DARK_ZEALOT_HELMET_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_DARK_ZEALOT_HELMET_T2.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

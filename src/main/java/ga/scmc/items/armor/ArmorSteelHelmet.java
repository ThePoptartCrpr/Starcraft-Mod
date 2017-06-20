package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorSteelHelmet extends ItemArmor {

	public ArmorSteelHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_STEEL_HELMET.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
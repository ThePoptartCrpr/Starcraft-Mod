package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorSteelBoots extends ItemArmor {

	public ArmorSteelBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_STEEL_BOOTS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
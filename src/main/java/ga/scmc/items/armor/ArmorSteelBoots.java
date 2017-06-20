package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorSteelBoots extends ItemArmor {

	public ArmorSteelBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_STEEL_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_STEEL_BOOTS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
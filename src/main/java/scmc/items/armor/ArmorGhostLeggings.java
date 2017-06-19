package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorGhostLeggings extends ItemArmor {

	public ArmorGhostLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_LEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_GHOST_LEGGINGS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorGhostBoots extends ItemArmor {
	public ArmorGhostBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_GHOST_BOOTS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

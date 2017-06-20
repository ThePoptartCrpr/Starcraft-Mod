package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorGhostHelmet extends ItemArmor {

	public ArmorGhostHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_GHOST_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_GHOST_HELMET.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

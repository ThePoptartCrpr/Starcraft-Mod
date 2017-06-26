package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorCopperHelmet extends ItemArmor {

	public ArmorCopperHelmet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_HELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_HELMET.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

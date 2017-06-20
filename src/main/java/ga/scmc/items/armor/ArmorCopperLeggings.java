package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorCopperLeggings extends ItemArmor {

	public ArmorCopperLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_LEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_LEGGINGS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
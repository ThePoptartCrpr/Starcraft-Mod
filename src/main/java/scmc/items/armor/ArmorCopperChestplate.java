package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorCopperChestplate extends ItemArmor {

	public ArmorCopperChestplate(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_CHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_CHESTPLATE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
package scmc.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ArmorZergChestplateT3 extends ItemArmor {

	public ArmorZergChestplateT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T3.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

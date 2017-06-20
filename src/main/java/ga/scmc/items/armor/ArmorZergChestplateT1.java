package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorZergChestplateT1 extends ItemArmor {

	public ArmorZergChestplateT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ZERG_CHESTPLATE_T1.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
}

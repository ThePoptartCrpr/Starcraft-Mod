package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorPurifierAdeptChestplateT1 extends ItemArmor {

	public ArmorPurifierAdeptChestplateT1(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_PURIFIER_ADEPT_CHESTPLATE_T1.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_PURIFIER_ADEPT_CHESTPLATE_T1.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

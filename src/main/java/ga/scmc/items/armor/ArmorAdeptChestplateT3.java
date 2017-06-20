package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorAdeptChestplateT3 extends ItemArmor {

	public ArmorAdeptChestplateT3(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ADEPT_CHESTPLATE_T3.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ADEPT_CHESTPLATE_T3.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

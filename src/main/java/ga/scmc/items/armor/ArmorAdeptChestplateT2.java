package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorAdeptChestplateT2 extends ItemArmor {

	public ArmorAdeptChestplateT2(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_ADEPT_CHESTPLATE_T2.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_ADEPT_CHESTPLATE_T2.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
}

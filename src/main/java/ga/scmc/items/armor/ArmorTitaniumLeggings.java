package ga.scmc.items.armor;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorTitaniumLeggings extends ItemArmor {

	public ArmorTitaniumLeggings(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_TITANIUM_LEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_TITANIUM_LEGGINGS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
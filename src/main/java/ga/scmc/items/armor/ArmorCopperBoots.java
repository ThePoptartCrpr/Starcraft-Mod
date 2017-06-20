package ga.scmc.items.armor;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorCopperBoots extends ItemArmor {

	public ArmorCopperBoots(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_COPPER_BOOTS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_COPPER_BOOTS.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

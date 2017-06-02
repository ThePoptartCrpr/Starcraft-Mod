package scmc.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import scmc.lib.Reference;

public class ArmorDarkKhaydarinAmulet extends ItemArmor {
	public ArmorDarkKhaydarinAmulet(ArmorMaterial armourMaterial, int renderIndex, EntityEquipmentSlot armourType) {
		super(armourMaterial, renderIndex, armourType);
		setUnlocalizedName(Reference.ModItems.ARMOR_DARK_KHAYDARIN_AMULET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ARMOR_DARK_KHAYDARIN_AMULET.getRegistryRL());
	}
}
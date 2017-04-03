package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponSteelSword extends ItemSword {

	public WeaponSteelSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_STEEL_SWORD.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_STEEL_SWORD.getRegistryRL());
	}
}
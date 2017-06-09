package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponCopperSword extends ItemSword {

	public WeaponCopperSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_COPPER_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_COPPER_SWORD.getRegistryRL());
	}
}
package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponCopperSword extends ItemSword {

	public WeaponCopperSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_COPPER_SWORD.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_COPPER_SWORD.getRegistryRL());
	}
}
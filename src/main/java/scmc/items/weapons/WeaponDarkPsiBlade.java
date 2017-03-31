package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponDarkPsiBlade extends ItemSword {

	public WeaponDarkPsiBlade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_DARK_PSIBLADE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_DARK_PSIBLADE.getRegistryRL());
	}
}
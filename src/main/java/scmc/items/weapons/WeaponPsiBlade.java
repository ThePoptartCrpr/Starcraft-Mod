package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponPsiBlade extends ItemSword {

	public WeaponPsiBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_PSIBLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_PSIBLADE.getRegistryRL());
	}
}
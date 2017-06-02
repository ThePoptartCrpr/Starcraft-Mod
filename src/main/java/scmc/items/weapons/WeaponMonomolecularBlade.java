package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponMonomolecularBlade extends ItemSword {

	public WeaponMonomolecularBlade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getRegistryRL());
	}
}
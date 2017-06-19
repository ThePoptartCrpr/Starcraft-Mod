package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class WeaponMonomolecularBlade extends ItemSword {

	public WeaponMonomolecularBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
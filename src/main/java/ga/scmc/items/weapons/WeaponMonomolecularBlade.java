package ga.scmc.items.weapons;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponMonomolecularBlade extends ItemSword {

	public WeaponMonomolecularBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
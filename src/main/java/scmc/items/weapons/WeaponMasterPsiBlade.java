package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponMasterPsiBlade extends ItemSword {

	public WeaponMasterPsiBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MASTER_PSI_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MASTER_PSI_BLADE.getRegistryRL());
	}
}
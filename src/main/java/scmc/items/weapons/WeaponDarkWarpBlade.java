package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponDarkWarpBlade extends ItemSword {

	public WeaponDarkWarpBlade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_DARK_WARP_BLADE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_DARK_WARP_BLADE.getRegistryRL());
	}
}
package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponWarpBlade extends ItemSword {

	public WeaponWarpBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_WARP_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_WARP_BLADE.getRegistryRL());
	}
}
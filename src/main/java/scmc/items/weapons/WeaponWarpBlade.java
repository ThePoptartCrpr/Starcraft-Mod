package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponWarpBlade extends ItemSword {

	public WeaponWarpBlade(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_WARP_BLADE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_WARP_BLADE.getRegistryRL());
	}
}
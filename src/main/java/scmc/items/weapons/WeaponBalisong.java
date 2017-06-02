package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_BALISONG.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_BALISONG.getRegistryRL());
	}
}
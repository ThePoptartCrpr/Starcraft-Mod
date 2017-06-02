package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.lib.Reference;

public class WeaponMilitaryKnife extends ItemSword {

	public WeaponMilitaryKnife(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getRegistryRL());
	}
}
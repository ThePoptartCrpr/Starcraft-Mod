package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class WeaponSteelSword extends ItemSword {

	public WeaponSteelSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_STEEL_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_STEEL_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
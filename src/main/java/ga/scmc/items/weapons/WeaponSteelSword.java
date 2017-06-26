package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponSteelSword extends ItemSword {

	public WeaponSteelSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_STEEL_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_STEEL_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
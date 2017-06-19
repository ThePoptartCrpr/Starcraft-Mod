package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_BALISONG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_BALISONG.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
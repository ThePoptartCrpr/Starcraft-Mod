package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_BALISONG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_BALISONG.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
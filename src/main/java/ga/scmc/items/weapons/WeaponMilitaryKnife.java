package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponMilitaryKnife extends ItemSword {

	public WeaponMilitaryKnife(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
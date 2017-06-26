package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponTitaniumSword extends ItemSword {

	public WeaponTitaniumSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_TITANIUM_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_TITANIUM_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
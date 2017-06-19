package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class WeaponTitaniumSword extends ItemSword {

	public WeaponTitaniumSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_TITANIUM_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_TITANIUM_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
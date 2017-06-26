package ga.scmc.items.weapons;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponCopperSword extends ItemSword {
	public WeaponCopperSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_COPPER_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_COPPER_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}

package ga.scmc.items.weapons;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/weapons/WeaponSteelSword.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/weapons/WeaponSteelSword.java

public class WeaponSteelSword extends ItemSword {

	public WeaponSteelSword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_STEEL_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_STEEL_SWORD.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
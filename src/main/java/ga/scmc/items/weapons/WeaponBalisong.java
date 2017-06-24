package ga.scmc.items.weapons;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/weapons/WeaponBalisong.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/weapons/WeaponBalisong.java

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_BALISONG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_BALISONG.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
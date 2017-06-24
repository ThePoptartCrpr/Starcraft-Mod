package ga.scmc.items.weapons;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/weapons/WeaponMilitaryKnife.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/weapons/WeaponMilitaryKnife.java

public class WeaponMilitaryKnife extends ItemSword {

	public WeaponMilitaryKnife(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MILITARY_KNIFE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
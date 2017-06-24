package ga.scmc.items.weapons;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSword;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/weapons/WeaponMonomolecularBlade.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/weapons/WeaponMonomolecularBlade.java

public class WeaponMonomolecularBlade extends ItemSword {

	public WeaponMonomolecularBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_MONOMOLECULAR_BLADE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
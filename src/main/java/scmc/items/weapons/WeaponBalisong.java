package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.lib.Reference;

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.WEAPON_BALISONG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.WEAPON_BALISONG.getRegistryRL());
	}
}
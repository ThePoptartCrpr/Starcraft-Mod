package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponDarkWarpBlade extends ItemSword {

	public static final String name = "darkWarpBlade";

	public WeaponDarkWarpBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}
}

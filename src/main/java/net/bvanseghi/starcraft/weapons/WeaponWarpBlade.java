package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponWarpBlade extends ItemSword {

	public static final String name = "warpBlade";

	public WeaponWarpBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}
}

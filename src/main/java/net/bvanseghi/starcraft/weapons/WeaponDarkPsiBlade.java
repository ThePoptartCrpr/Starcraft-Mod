package net.bvanseghi.starcraft.weapons;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSword;

public class WeaponDarkPsiBlade extends ItemSword {

	public static final String name = "darkPsiBlade";

	public WeaponDarkPsiBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftCombat);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}
	
}

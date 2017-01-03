package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemSpade;

public class ToolCopperShovel extends ItemSpade {

	public static final String name = "copperShovel";

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

}

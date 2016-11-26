package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.item.ItemAxe;

public class ToolCopperAxe extends ItemAxe {

	public static final String name = "copperAxe";

	public ToolCopperAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
	}

}

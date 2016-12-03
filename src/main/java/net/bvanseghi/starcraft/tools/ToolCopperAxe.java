package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemAxe;

public class ToolCopperAxe extends ItemAxe {

	public static final String name = "copperAxe";

	public ToolCopperAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}

}

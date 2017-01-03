package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemHoe;

public class ToolCopperHoe extends ItemHoe {

	public static final String name = "copperHoe";

	public ToolCopperHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

}

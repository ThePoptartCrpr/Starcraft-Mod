package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemHoe;

public class ToolTitaniumHoe extends ItemHoe {

	public static final String name = "titaniumHoe";

	public ToolTitaniumHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UNLOCALIZED_NAME_PATH_BASE + name);
	}

}

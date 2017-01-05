package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemAxe;

public class ToolTitaniumAxe extends ItemAxe {

	public static final String name = "titaniumAxe";

	public ToolTitaniumAxe(ToolMaterial material, int i, int j) {
		super(material, i, j);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

}

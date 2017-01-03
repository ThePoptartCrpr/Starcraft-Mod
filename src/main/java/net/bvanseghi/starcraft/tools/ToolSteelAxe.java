package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemAxe;

public class ToolSteelAxe extends ItemAxe {

	public static final String name = "steelAxe";

	public ToolSteelAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

}

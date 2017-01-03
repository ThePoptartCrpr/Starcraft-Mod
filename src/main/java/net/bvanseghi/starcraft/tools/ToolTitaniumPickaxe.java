package net.bvanseghi.starcraft.tools;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.item.ItemPickaxe;

public class ToolTitaniumPickaxe extends ItemPickaxe {

	public static final String name = "titaniumPickaxe";

	public ToolTitaniumPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.TabStarcraftTools);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

}

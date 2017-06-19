package scmc.items.tools;

import net.minecraft.item.ItemPickaxe;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ToolSteelPickaxe extends ItemPickaxe {

	public ToolSteelPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
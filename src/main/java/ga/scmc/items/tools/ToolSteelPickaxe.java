package ga.scmc.items.tools;

import ga.scmc.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemPickaxe;

public class ToolSteelPickaxe extends ItemPickaxe {

	public ToolSteelPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
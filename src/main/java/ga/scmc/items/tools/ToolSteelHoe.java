package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemHoe;

public class ToolSteelHoe extends ItemHoe {

	public ToolSteelHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_STEEL_HOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_STEEL_HOE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
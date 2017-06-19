package scmc.items.tools;

import net.minecraft.item.ItemPickaxe;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
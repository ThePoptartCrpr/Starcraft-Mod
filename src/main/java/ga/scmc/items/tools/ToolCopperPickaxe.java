package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Reference;
import net.minecraft.item.ItemPickaxe;

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
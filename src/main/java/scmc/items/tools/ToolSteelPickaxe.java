package scmc.items.tools;

import net.minecraft.item.ItemPickaxe;
import scmc.lib.Reference;

public class ToolSteelPickaxe extends ItemPickaxe {

	public ToolSteelPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_STEEL_PICKAXE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_STEEL_PICKAXE.getRegistryRL());
	}
}
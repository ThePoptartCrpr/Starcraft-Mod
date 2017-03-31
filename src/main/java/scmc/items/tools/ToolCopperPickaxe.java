package scmc.items.tools;

import net.minecraft.item.ItemPickaxe;
import scmc.lib.Reference;

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Reference.ModItems.TOOL_COPPER_PICKAXE.getUnlocalizedName());
		this.setRegistryName(Reference.ModItems.TOOL_COPPER_PICKAXE.getRegistryRL());
	}
}
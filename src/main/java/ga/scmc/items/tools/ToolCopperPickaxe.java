package ga.scmc.items.tools;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemPickaxe;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/tools/ToolCopperPickaxe.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/tools/ToolCopperPickaxe.java

public class ToolCopperPickaxe extends ItemPickaxe {

	public ToolCopperPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_PICKAXE.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
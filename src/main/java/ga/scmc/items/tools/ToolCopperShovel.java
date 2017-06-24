package ga.scmc.items.tools;

import ga.scmc.lib.Reference;
import net.minecraft.item.ItemSpade;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/items/tools/ToolCopperShovel.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/items/tools/ToolCopperShovel.java

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.TOOL_COPPER_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TOOL_COPPER_SHOVEL.getRegistryRL());
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
}
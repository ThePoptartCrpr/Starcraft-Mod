package scmc.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ToolCopperShovel extends ItemSpade {

	public ToolCopperShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}
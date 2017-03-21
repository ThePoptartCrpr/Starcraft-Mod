package scmc.items;

import net.minecraft.util.ResourceLocation;
import scmc.lib.Reference;

public class ItemKeystone extends ModItems {

	public ItemKeystone(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.RL_BASE + name));
	}
}

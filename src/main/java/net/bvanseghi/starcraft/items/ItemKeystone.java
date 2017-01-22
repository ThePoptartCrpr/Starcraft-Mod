package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.util.ResourceLocation;

public class ItemKeystone extends ModItems {

	public ItemKeystone(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.RL_BASE + name));
	}
}

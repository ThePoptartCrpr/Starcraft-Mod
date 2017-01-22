package net.bvanseghi.starcraft.fluids;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class ModFluids {
	public static Fluid acid = new Fluid("acid", new ResourceLocation(Reference.MODID + ":acid_still"), new ResourceLocation(Reference.MODID + ":acid_flowing"));
	public static Fluid blood = new Fluid("acid", new ResourceLocation(Reference.MODID + ":blood_still"), new ResourceLocation(Reference.MODID + ":blood_flowing"));
}

package net.bvanseghi.starcraft.fluids;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class ModFluids {
	public static Fluid acid = new Fluid("acid", new ResourceLocation(Reference.RL_BASE + "acid_fluid_still"), new ResourceLocation(Reference.RL_BASE + "acid_fluid_flowing"));
	public static Fluid blood = new Fluid("acid", new ResourceLocation(Reference.RL_BASE + "blood_fluid_still"), new ResourceLocation(Reference.RL_BASE + "blood_fluid_flowing"));
}

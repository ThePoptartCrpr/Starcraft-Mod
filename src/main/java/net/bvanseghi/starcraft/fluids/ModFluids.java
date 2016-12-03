package net.bvanseghi.starcraft.fluids;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

	public static Fluid acid;
	public static Fluid blood;

	public static void preInit() {
//		acid = new Fluid("fluidAcid");
		acid = new Fluid("acid", new ResourceLocation(Reference.MODID + ":acid_still"), new ResourceLocation(Reference.MODID + ":acid_flowing"));
		FluidRegistry.registerFluid(acid);

//		blood = new Fluid("fluidBlood");
		blood = new Fluid("acid", new ResourceLocation(Reference.MODID + ":blood_still"), new ResourceLocation(Reference.MODID + ":blood_flowing"));
		FluidRegistry.registerFluid(blood);
	}
}

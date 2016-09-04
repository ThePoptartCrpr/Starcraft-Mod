package net.bvanseghi.starcraft.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

	public static Fluid acid;
	public static Fluid blood;

	public static void preInit() {
		acid = new Fluid("fluidAcid");
		FluidRegistry.registerFluid(acid);

		blood = new Fluid("fluidBlood");
		FluidRegistry.registerFluid(blood);
	}
}

package ga.scmc.fluids;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.lib.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {

	public static Fluid acid = new Fluid("fluid_acid", new ResourceLocation(Reference.RL_BASE + "blocks/acid_fluid_still"), new ResourceLocation(Reference.RL_BASE + "blocks/acid_fluid_still")).setBlock(ModBlocks.FLUID_ACID); //FIXME: get a flowing texture and set it here
	public static Fluid blood = new Fluid("fluid_blood", new ResourceLocation(Reference.RL_BASE + "blocks/blood_fluid_still"), new ResourceLocation(Reference.RL_BASE + "blocks/blood_fluid_flowing")).setBlock(ModBlocks.FLUID_BLOOD);

	public static void register() {
		acid.setUnlocalizedName(Reference.ModBlocks.FLUID_ACID.getUnlocalizedName());
		blood.setUnlocalizedName(Reference.ModBlocks.FLUID_BLOOD.getUnlocalizedName());
		FluidRegistry.registerFluid(acid);
		FluidRegistry.registerFluid(blood);
	}
}
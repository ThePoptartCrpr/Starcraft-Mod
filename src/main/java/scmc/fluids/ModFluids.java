package scmc.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;

public class ModFluids {
	public static Fluid acid = new Fluid("acid", new ResourceLocation(Reference.RL_BASE + "acid_fluid_still"), new ResourceLocation(Reference.RL_BASE + "acid_fluid_still")).setBlock(ModBlocks.FLUID_ACID); //FIXME: get a flowing texture and set it here
	public static Fluid blood = new Fluid("blood", new ResourceLocation(Reference.RL_BASE + "blood_fluid_still"), new ResourceLocation(Reference.RL_BASE + "blood_fluid_flowing")).setBlock(ModBlocks.FLUID_BLOOD);
}

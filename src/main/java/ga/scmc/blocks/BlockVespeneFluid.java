package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.fluids.ModFluids;
import ga.scmc.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Vespene Fluid<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * @author Hypeirochus
 */
public class BlockVespeneFluid extends BlockFluidClassic {

	public BlockVespeneFluid() {
		super(ModFluids.vespene, Material.WATER);
		setCreativeTab(null);
		setUnlocalizedName(Reference.ModBlocks.FLUID_VESPENE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.FLUID_VESPENE.getRegistryRL());
	}

	@Override
	public int tickRate(World world) {
		return 160;
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if(world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			world.setBlockState(pos.up(), ModBlocks.GAS_VESPENE.getDefaultState());
		}
		super.updateTick(world, pos, state, rand);
	}
}

package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Blood fluid.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockBloodFluid extends BlockFluidClassic {
	
	/**
	 * @param fluid the fluid
	 * @param material the material of the fluid
	 */
	public BlockBloodFluid(Fluid fluid, Material material) {
		super(fluid, material);
		setCreativeTab(null);
		setUnlocalizedName(Reference.ModBlocks.FLUID_BLOOD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.FLUID_BLOOD.getRegistryRL());
	}

	/**
	 * Checks if other fluids can override this fluid?
	 * @param world allows to get block states based on their position
	 * @param pos the position of the block
	 */
	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		if(world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}
		
		return super.canDisplace(world, pos);
	}

	/**
	 * Allows other fluids to displace this fluid if possible
	 * @param world the world
	 * @param the position of the block
	 */
	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		if(world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}
		
		return super.displaceIfPossible(world, pos);
	}
}

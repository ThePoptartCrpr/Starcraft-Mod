package scmc.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import scmc.lib.Reference;

public class BlockBloodFluid extends BlockFluidClassic {
	public BlockBloodFluid(Fluid fluid, Material material) {
		super(fluid, material);
		setCreativeTab(null);
		setUnlocalizedName(Reference.ModBlocks.FLUID_BLOOD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.FLUID_BLOOD.getRegistryRL());
	}

	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		if(world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}
		
		return super.canDisplace(world, pos);
	}

	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		if(world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}
		
		return super.displaceIfPossible(world, pos);
	}
}

package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockBloodFluid extends BlockFluidClassic {
	public BlockBloodFluid(Fluid fluid, Material material) {
		super(fluid, material);
		this.setCreativeTab(null);
	}

	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;

	@Override
	public IIcon getIcon(int side, int meta) {
		return (side == 0 || side == 1) ? stillIcon : flowingIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register) {
		stillIcon = register.registerIcon("Starcraft:bloodFluidStill");
		flowingIcon = register.registerIcon("Starcraft:bloodFluidFlowing");
	}*/

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

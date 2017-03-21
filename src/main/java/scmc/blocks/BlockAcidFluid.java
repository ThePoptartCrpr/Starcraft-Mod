package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockAcidFluid extends BlockFluidClassic {
	public BlockAcidFluid(Fluid fluid, Material material) {
		super(ModFluids.acid, Material.WATER);
		setCreativeTab(null);
		setUnlocalizedName(Reference.ModBlocks.FLUID_ACID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.FLUID_ACID.getRegistryRL());
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		entity.attackEntityFrom(DamageSource.cactus, 1.0F);
	}
}

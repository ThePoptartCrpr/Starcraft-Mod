package ga.scmc.blocks;

import ga.scmc.StarcraftDamageSources;
import ga.scmc.fluids.ModFluids;
import ga.scmc.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Acid fluid. Hurts entities that come into contact<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author He of a Former Time
 */
public class BlockAcidFluid extends BlockFluidClassic {

	public BlockAcidFluid() {
		super(ModFluids.acid, Material.WATER);
		setCreativeTab(null);
		setUnlocalizedName(Reference.ModBlocks.FLUID_ACID.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.FLUID_ACID.getRegistryRL());
	}

	/**
	 * Executes code when an entity collides with this block's bounds
	 * 
	 * @param world
	 *            the world
	 * @param pos
	 *            position of the block
	 * @param state
	 *            state of the block
	 * @param entity
	 *            that collides with the block
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		//TODO add death.attack.acid to the language files
		entity.attackEntityFrom(StarcraftDamageSources.acid, 1.0F);
	}
}

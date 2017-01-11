package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Magma block. Makes lava source when broken or
 * when lava is found near it on a random tick<br>
 * Copyright 2016 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class BlockCharMagma extends Block {
	public BlockCharMagma() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_MAGMA_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_MAGMA_C.getRegistryRL());
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		world.setBlockState(pos, Blocks.FLOWING_LAVA.getDefaultState());
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		if(!Library.checkCube(world, Blocks.FLOWING_LAVA.getDefaultState(), pos, 3).isEmpty()) {
			breakBlock(world, pos, state);
		}
	}
}

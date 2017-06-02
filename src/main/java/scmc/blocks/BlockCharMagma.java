package scmc.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Library;
import scmc.lib.Reference;

/**
 * Magma block. Makes lava source when broken or
 * when lava is found near it on a random tick<br>
 * Copyright 2016 the Starcraft Minecraft (SCMC) mod team
 * @author wundrweapon
 */
public class BlockCharMagma extends Block {
	public BlockCharMagma() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_MAGMA_CHAR.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_MAGMA_CHAR.getRegistryRL());
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

package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Magma block. Makes lava source on break<br>
 * Copyright 2016 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class BlockCharMagma extends ModBlocks {
	public static final String name = "char_magma";
	
	public BlockCharMagma() {
		super(name, name, Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setRegistryName(new ResourceLocation(Reference.MODID + ":" + name));
		setUnlocalizedName(name);
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

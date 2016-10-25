package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Magma block. Makes lava source on break<br>
 * Copyright 2016 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class BlockMagma extends ModBlocks {
	public static final String name = "charMagma";
	
	public BlockMagma() {
		super(name, name, Material.ground);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setTickRandomly(true);
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int par6int) {
		world.setBlock(x, y, z, Blocks.flowing_lava);
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		if(Library.checkCube(world, Blocks.lava, x, y, z)) {
			breakBlock(world, x, y, z, this, 0);
		}
	}
}

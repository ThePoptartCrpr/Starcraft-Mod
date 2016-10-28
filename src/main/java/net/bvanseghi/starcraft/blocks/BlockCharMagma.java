package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Magma block. Makes lava source on break<br>
 * Copyright 2016 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class BlockCharMagma extends ModBlocks {
	public static final String name = "charMagma";
	
	public BlockCharMagma() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setBlockName(name);
		setBlockTextureName(REFERENCE.MODID + ":" + name);
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

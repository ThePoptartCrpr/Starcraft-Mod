package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockCharDirt extends ModBlocks {

	public static final String name = "charDirt";

	public BlockCharDirt() {
		super(name, name, Material.ground);
		setStepSound(soundTypeGravel);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
	}
}

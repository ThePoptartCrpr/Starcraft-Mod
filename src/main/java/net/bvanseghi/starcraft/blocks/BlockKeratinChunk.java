package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockKeratinChunk extends ModBlocks {

	public static final String name = "keratinChunk";

	public BlockKeratinChunk() {
		super(name, name, Material.ground);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}

package scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

/**
 * Char Stone block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockCharStone extends Block {
	public BlockCharStone() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(StarcraftCreativeTabs.BUILDING);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_STONE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_STONE_C.getRegistryRL());
	}
	
	/**
	 * Gets the item dropped
	 * @param state the state of the block
	 * @param rand an object of the Random class
	 * @param fortune the magnitude of the fortune enchantment effect on this block
	 */
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.COBBLESTONE_CHAR);
	}
}

package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
 * Protoss Energy Channel block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockProtossEnergyChannel extends Block {
	public BlockProtossEnergyChannel() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_CHANNEL.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_ENERGY_CHANNEL.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}
	
	/**
	 * Returns the item dropped by this block
	 * @param state the state of the block
	 * @param rand an object of the Random class
	 * @param fortune the magnitude of the fortune enchantment effect
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.energy;
    }
}

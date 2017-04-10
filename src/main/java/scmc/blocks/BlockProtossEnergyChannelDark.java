package scmc.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scmc.items.ModItems;
import scmc.lib.Reference;

/**
 * Dark Protoss Energy Channel block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockProtossEnergyChannelDark extends ModBlocks {
	public BlockProtossEnergyChannelDark() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_CHANNEL.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_DARK_ENERGY_CHANNEL.getRegistryRL());
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
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
	
	/**
	 * Gets the state of the block being dropped
	 * @param state the state of the block
	 */
	@Override
	public int damageDropped(IBlockState state) {
		return 1;
    }
}

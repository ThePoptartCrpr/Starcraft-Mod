package scmc.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import scmc.CreativeTab;
import scmc.items.ModItems;
import scmc.lib.Reference;

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
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.energy;
    }
}

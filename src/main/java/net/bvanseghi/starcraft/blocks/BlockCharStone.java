package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockCharStone extends Block {
	public BlockCharStone() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		setUnlocalizedName("charStone");
		setRegistryName(Reference.MODID + ":char_stone");
	}
	
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.cobblestoneChar);
	}
}

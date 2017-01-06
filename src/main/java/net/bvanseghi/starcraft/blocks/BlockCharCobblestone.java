package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockCharCobblestone extends Block {
	public BlockCharCobblestone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_COBBLESTONE_C.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0); //TODO: ensure this is correct
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
}

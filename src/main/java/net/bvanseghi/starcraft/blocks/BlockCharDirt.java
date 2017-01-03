package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockCharDirt extends Block {
	public BlockCharDirt() {
		super(Material.GROUND);
		setRegistryName(new ResourceLocation(Reference.MODID + ":char_dirt"));
		setUnlocalizedName("charDirt");
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
}

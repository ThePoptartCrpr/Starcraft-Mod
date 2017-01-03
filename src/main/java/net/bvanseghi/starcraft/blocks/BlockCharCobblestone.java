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
		setRegistryName(new ResourceLocation(Reference.MODID + ":char_cobble"));
		setUnlocalizedName("charCobble");
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0); //TODO: ensure this is correct
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
}

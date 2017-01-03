package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockKeratinChunk extends ModBlocks {
	public BlockKeratinChunk() {
		super(Material.GROUND);
		setRegistryName(new ResourceLocation(Reference.MODID + ":keratin_chunk"));
		setUnlocalizedName("keratinChunk");
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}

package scmc.worldgen.features;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.MapGenCaves;
import scmc.blocks.ModBlocks;

public class CharGenCaves extends MapGenCaves {
	@Override
	protected boolean canReplaceBlock(IBlockState p_175793_1_, IBlockState p_175793_2_) {
		Block test = p_175793_1_.getBlock();
        return (test == ModBlocks.STONE_CHAR || test == ModBlocks.DIRT_CHAR || test == ModBlocks.ASH_CHAR || test == ModBlocks.ZERG_CREEP ? true : (test == Blocks.SAND || test == Blocks.GRAVEL) && p_175793_2_.getMaterial() != Material.LAVA);
    }
}

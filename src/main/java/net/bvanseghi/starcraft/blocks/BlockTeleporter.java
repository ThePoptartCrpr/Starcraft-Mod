package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockTeleporter extends BlockPortal {

	public BlockTeleporter() {
		super();
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {

	}

	public boolean tryToCreatePortal(World world, int x, int y, int z) {
		return false;
	}

	@Override
	public void onNeighborBlockChange(World world, int par2, int par3, int par4, Block block) {

	}
}

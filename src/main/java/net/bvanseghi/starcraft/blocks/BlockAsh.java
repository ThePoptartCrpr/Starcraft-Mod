package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAsh extends ModBlocks {

	public static final String name = "charAsh";

	public BlockAsh() {
		super(name, name, Material.snow);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
		setStepSound(soundTypeSnow);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 1);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this
	 * box can change after the pool has been cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int par1, int par2, int par3) {
		int l = world.getBlockMetadata(par1, par2, par3) & 7;
		float f = 0.125F;
		return AxisAlignedBB.getBoundingBox((double) par1 + this.minX, (double) par2 + this.minY,
				(double) par3 + this.minZ, (double) par1 + this.maxX, (double) ((float) par2 + (float) l * f),
				(double) par3 + this.maxZ);
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	/**
	 * Sets the block's bounds for rendering it as an item
	 */
	public void setBlockBoundsForItemRender() {
		this.func_150154_b(0);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y,
	 * z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		this.func_150154_b(world.getBlockMetadata(x, y, z));
	}

	protected void func_150154_b(int par1) {
		int j = par1 & 7;
		float f = (float) (2 * (1 + j)) / 16.0F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
	}

}

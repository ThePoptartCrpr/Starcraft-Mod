package scmc.worldgen.structure;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class SCWorldGenerator {

	/**
	 * Sets wither or not the generator should notify blocks of blocks it
	 * changes. When the world is first generated, this is false, when saplings
	 * grow, this is true.
	 */
	private final boolean doBlockNotify;

	public SCWorldGenerator() {
		this(false);
	}

	public SCWorldGenerator(boolean notify) {
		this.doBlockNotify = notify;
	}

	public boolean generate(int metaDim, int metaPrimColor, int metaSecColor, World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos) {
		return true;
	}

	public boolean generate(int metaColor, int metaSecColor, World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	public boolean generate(World worldIn, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return true;
	}

	protected void setBlockAndNotifyAdequately(World worldIn, BlockPos pos, IBlockState state) {
		if(this.doBlockNotify) {
			worldIn.setBlockState(pos, state, 3);
		} else {
			worldIn.setBlockState(pos, state, 2);
		}
	}

	public void setDecorationDefaults() {}
}
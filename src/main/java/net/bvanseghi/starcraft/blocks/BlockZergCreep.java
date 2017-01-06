package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class BlockZergCreep extends ModBlocks {

	public static final String name = "zergCreep";

	public BlockZergCreep() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		this.setTickRandomly(true);
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return ModItems.creepResin;
	}

	public int quantityDropped(Random par1) {
		return 2 + par1.nextInt(2);
	}

	protected boolean canSilkHarvest() {
		return true;
	}

	// TODO: Redo the Zerg Creep effect
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote) {
			if (worldIn.getLightFromNeighbors(pos.up()) < 4
					&& worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2) {
				worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
			} else {
				if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
					for (int i = 0; i < 4; ++i) {
						BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

						if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
							return;
						}

						IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

						if (iblockstate1.getBlock() == Blocks.DIRT
								&& iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT
								&& worldIn.getLightFromNeighbors(blockpos.up()) >= 4
								&& iblockstate.getLightOpacity(worldIn, pos.up()) <= 2) {
							worldIn.setBlockState(blockpos, Blocks.GRASS.getDefaultState());
						}
					}
				}
			}
		}
	}
}

package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockZergCreep extends ModBlocks {
	public BlockZergCreep() {
		super(Material.GROUND);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "zerg_creep"));
		setUnlocalizedName(Reference.UN_BASE + "zergCreep");
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.creepResin;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 2 + rand.nextInt(2);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	// TODO: Redo the Zerg Creep effect
	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(!worldIn.isRemote) {
			if(worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2) {
				worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
			} else if(worldIn.getLightFromNeighbors(pos.up()) >= 9) {
				for(int i = 0; i < 4; i++) {
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if(blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
						return;
					}

					IBlockState currState= worldIn.getBlockState(blockpos);
					IBlockState upState = worldIn.getBlockState(blockpos.up());

					if (currState.getBlock() == Blocks.DIRT && currState.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && upState.getLightOpacity(worldIn, pos.up()) <= 2) {
						worldIn.setBlockState(blockpos, Blocks.GRASS.getDefaultState());
					}
				}
			}
		}
	}
}

package scmc.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.StarcraftCreativeTabs;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityZergPassive;
import scmc.items.ModItems;
import scmc.lib.Reference;

public class BlockZergCreep extends ModBlocks {

	// TODO: Review the sound creep makes (sand?...)
	public BlockZergCreep() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setCreativeTab(StarcraftCreativeTabs.DECORATION);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.creepResin;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if(entityIn instanceof EntityZergMob || entityIn instanceof EntityZergPassive) {
			entityIn.motionX *= 1.2D;
			entityIn.motionZ *= 1.2D;
		}
	}

	// FIXME: Creep spread speed and block params
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(!worldIn.isRemote) {

			if(worldIn.getLightFromNeighbors(pos.up()) >= 9) {
				for(int i = 0; i < 1000; ++i) {
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if(blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
						return;
					}

					IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
					IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

					if(iblockstate1.getBlock() == Blocks.GRASS) {
						worldIn.setBlockState(blockpos, ModBlocks.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}

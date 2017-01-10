package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockZergCreep extends ModBlocks {
	
	public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);
	protected static final AxisAlignedBB[] SNOW_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

	 
	public BlockZergCreep() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
	}
	
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SNOW_AABB[((Integer)state.getValue(LAYERS)).intValue()];
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
						worldIn.setBlockState(blockpos, ModBlocks.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}

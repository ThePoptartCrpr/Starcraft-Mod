package scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.items.ModItems;
import scmc.lib.Reference;

public class BlockZergCreep extends ModBlocks {
	private static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);
	private static final AxisAlignedBB[] SNOW_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
	 
	public BlockZergCreep() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_ZERG_CREEP.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setDefaultState(blockState.getBaseState().withProperty(LAYERS, Integer.valueOf(1)));
	}
	
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SNOW_AABB[((Integer) state.getValue(LAYERS)).intValue()];
    }

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.creepResin;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {LAYERS});
	}

	@Override
	public int quantityDropped(Random rand) {
		return 2 + rand.nextInt(2);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
	
	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
	    return ((Integer) worldIn.getBlockState(pos).getValue(LAYERS)).intValue() < 5;
	}

	/**
	 * Checks if this block in state {@code state} represents a block that is opaque and a full cube
	 * @param state the state this block is in
	 * @return true if the state is a full, opaque cube
	 */
	@Override
	public boolean isFullyOpaque(IBlockState state) {
	    return ((Integer) state.getValue(LAYERS)).intValue() == 7;
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
	    int i = ((Integer) blockState.getValue(LAYERS)).intValue() - 1;
	    AxisAlignedBB axisalignedbb = blockState.getBoundingBox(worldIn, pos);
	    return new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, axisalignedbb.maxX, i * .125, axisalignedbb.maxZ);
	}

	/**
	 * Used to determine ambient occlusion and culling when rebuilding chunks for render
	 */
	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
	    IBlockState iblockstate = worldIn.getBlockState(pos.down());
	    Block block = iblockstate.getBlock();
	    return block != Blocks.ICE && block != Blocks.PACKED_ICE ? (iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()) ? true : (block == this && ((Integer) iblockstate.getValue(LAYERS)).intValue() >= 7 ? true : iblockstate.isOpaqueCube() && iblockstate.getMaterial().blocksMovement())) : false;
	}

	/**
	 * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
	 * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
	 * block, etc.
	 */
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
	    checkAndDropBlock(worldIn, pos, state);
	}

	private boolean checkAndDropBlock(World worldIn, BlockPos pos, @SuppressWarnings("unused") IBlockState state) {
		if(!canPlaceBlockAt(worldIn, pos)) {
	        worldIn.setBlockToAir(pos);
	        return false;
	    } else {
	        return true;
	    }
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
	    super.harvestBlock(worldIn, player, pos, state, te, stack);
	    worldIn.setBlockToAir(pos);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	    if(worldIn.getLightFor(EnumSkyBlock.BLOCK, pos) > 11) {
	        worldIn.setBlockToAir(pos);
	    }
	}

	@SuppressWarnings("deprecation")
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
	    if(side == EnumFacing.UP) {
	        return true;
	    } else {
	        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
	        return iblockstate.getBlock() == this && ((Integer) iblockstate.getValue(LAYERS)).intValue() >= ((Integer) blockState.getValue(LAYERS)).intValue() ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side); //TODO: get the better version of this
	    }
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	@Override
	public IBlockState getStateFromMeta(int meta) {
	    return getDefaultState().withProperty(LAYERS, Integer.valueOf((meta & 7) + 1));
	}

	/**
	 * Whether this Block can be replaced directly by other blocks (true for e.g. tall grass)
	 */
	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
	    return ((Integer) worldIn.getBlockState(pos).getValue(LAYERS)).intValue() == 1;
	}

	/**
	 * Convert the BlockState into the correct metadata value
	 */
	@Override
	public int getMetaFromState(IBlockState state) {
	    return ((Integer) state.getValue(LAYERS)).intValue() - 1;
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return ((Integer) state.getValue(LAYERS)) + 1;
	}

	//TODO: Redo the Zerg Creep effect
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

					if(currState.getBlock() == Blocks.DIRT && currState.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && upState.getLightOpacity(worldIn, pos.up()) <= 2) {
						worldIn.setBlockState(blockpos, ModBlocks.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}

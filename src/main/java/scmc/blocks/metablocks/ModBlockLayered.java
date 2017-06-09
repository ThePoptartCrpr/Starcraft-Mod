package scmc.blocks.metablocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.blocks.ModBlocks;

public abstract class ModBlockLayered extends ModBlocks {

	public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);
	protected static final AxisAlignedBB[] LAYERS_AABB = new AxisAlignedBB[] { new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D) };

	public ModBlockLayered(Material material) {
		super(material);
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.getBlockState(pos.down());
		Block block = iblockstate.getBlock();
		return block != Blocks.ICE && block != Blocks.PACKED_ICE
				? (iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()) ? true
						: (block == this && iblockstate.getValue(LAYERS).intValue() >= 7 ? true : iblockstate.isOpaqueCube() && iblockstate.getMaterial().blocksMovement()))
				: false;
	}

	private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state) {
		if(!this.canPlaceBlockAt(worldIn, pos)) {
			worldIn.setBlockToAir(pos);
			return false;
		} else {
			return true;
		}
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { LAYERS });
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return LAYERS_AABB[state.getValue(LAYERS).intValue()];
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
		int i = blockState.getValue(LAYERS).intValue() - 1;
		AxisAlignedBB axisalignedbb = blockState.getBoundingBox(worldIn, pos);
		return new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, axisalignedbb.maxX, i * 0.125F, axisalignedbb.maxZ);
	}

	@Nullable
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(LAYERS).intValue() - 1;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(LAYERS, Integer.valueOf((meta & 7) + 1));
	}

	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
		super.harvestBlock(worldIn, player, pos, state, te, stack);
		worldIn.setBlockToAir(pos);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return state.getValue(LAYERS).intValue() == 7;
	}

	@Override
	public boolean isFullyOpaque(IBlockState state) {
		return state.getValue(LAYERS).intValue() == 7;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
		return worldIn.getBlockState(pos).getValue(LAYERS).intValue() < 5;
	}

	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
		return worldIn.getBlockState(pos).getValue(LAYERS).intValue() == 1;
	}

	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		this.checkAndDropBlock(worldIn, pos, state);
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return (state.getValue(LAYERS)) + 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		if(side == EnumFacing.UP) {
			return true;
		} else {
			IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
			return iblockstate.getBlock() == this && iblockstate.getValue(LAYERS).intValue() >= blockState.getValue(LAYERS).intValue() ? true
					: super.shouldSideBeRendered(blockState, blockAccess, pos, side);
		}
	}
}

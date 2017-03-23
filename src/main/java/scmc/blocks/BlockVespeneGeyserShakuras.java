package scmc.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scmc.CreativeTab;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.tileentity.TileEntityBlockVespeneGeyserShakuras;

public class BlockVespeneGeyserShakuras extends BlockContainer {
	private static final AxisAlignedBB THIS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	
	public BlockVespeneGeyserShakuras(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_VESPENE_GEYSER_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2, int par3) {
		return ModItems.vespene;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return 3;
	}

	@Override
	public int quantityDropped(Random par1) {
		return 4 + par1.nextInt(2);
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	@Override
	public boolean isBlockSolid(IBlockAccess access, BlockPos pos, EnumFacing side) {
		return false;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess access, BlockPos pos) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return THIS_AABB;
    }
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockVespeneGeyserShakuras();
	}
}
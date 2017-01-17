package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyser;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
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

public class BlockRichVespeneGeyser extends BlockContainer implements ITileEntityProvider {

	public BlockRichVespeneGeyser(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_RICH_VESPENE_GEYSER.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_RICH_VESPENE_GEYSER.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2, int par3) {
		return ModItems.vespene;
	}
	
	public int damageDropped(int meta) {
		return 3;
	}

	public int quantityDropped(Random par1) {
		return 7 + par1.nextInt(2);
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

	protected static final AxisAlignedBB THIS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return THIS_AABB;
    }
	
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockRichVespeneGeyser();
	}

}

package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichMineralField;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRichMineralField extends BlockContainer {

	public BlockRichMineralField(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_RICH_MINERAL_FIELD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_RICH_MINERAL_FIELD.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
//		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.85F, 1.0F); FIXME: this
		setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}

	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.richMineralShard;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(2);
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	@Override
	public boolean isSideSolid(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing side) {
		return false;
	}
	
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess access, BlockPos pos) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityBlockRichMineralField();
	}
}

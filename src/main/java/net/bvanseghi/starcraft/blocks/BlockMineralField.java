package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Reference;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockMineralField;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

//TODO: keep an eye on this; expect changes
public class BlockMineralField extends BlockContainer {
	public BlockMineralField(Material material) {
		super(material);
		setRegistryName(new ResourceLocation(Reference.RL_BASE + "mineral_field"));
		setUnlocalizedName(Reference.UN_BASE + "mineralField");
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
//		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.85F, 1.0F); //FIXME: frickin' this
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.mineralShard;
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
	public boolean isBlockSolid(IBlockAccess access, BlockPos pos, EnumFacing side) {
		return false;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess access, BlockPos pos) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityBlockMineralField();
	}
}

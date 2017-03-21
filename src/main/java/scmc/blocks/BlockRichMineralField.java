package scmc.blocks;

import java.util.Random;

import javax.annotation.Nullable;

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
import scmc.CreativeTab;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.tileentity.TileEntityBlockRichMineralField;

/**
 * Rich Mineral Field block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
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

	/**
	 * Gets the item dropped
	 * @param state the state of the block
	 * @param rand an object of the Random class
	 * @param fortune the magnitude of the effect of the fortune enchantment on this block
	 */
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.richMineralShard;
	}

	/**
	 * Gets how many items should be dropped
	 * @param rand an object of the Random class
	 */
	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(2);
	}

	/**
	 * Returns whether or not this block can be silk harvested
	 * @param world the world
	 * @param pos the position of the block
	 * @param state the state of the block
	 * @param player an object of the EntityPlayer class
	 */
	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	/**
	 * Checks whether or not this block is completely solid
	 * @param access allows you to grab the state of the block via its position
	 * @param pos the position of the block
	 * @param side gets a side of the block if needed
	 */
	@Override
	public boolean isSideSolid(IBlockState state, IBlockAccess access, BlockPos pos, EnumFacing side) {
		return false;
	}
	
	/**
	 * Returns whether or not this block is a normal cube
	 * @param state the state of the block
	 * @param access allows you to grab the state of the block via its position
	 * @param pos the position of the block
	 */
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess access, BlockPos pos) {
		return false;
	}

	/**
	 * Creates a new tile entity instance that is specific to this block
	 * @param world the world
	 * @param meta a metadata value. In this case, it could be used to apply the tile entity to a 
	 * specific sub block, were this block a meta based block
	 */
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityBlockRichMineralField();
	}
}

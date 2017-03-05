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

/**
 * Vespene Geyser block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author bvanseghi
 */
public class BlockRichVespeneGeyser extends BlockContainer implements ITileEntityProvider {

	public BlockRichVespeneGeyser(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_RICH_VESPENE_GEYSER.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_RICH_VESPENE_GEYSER.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);
	}

	/**
	 * Gets the item dropped
	 * @param state the state of the block
	 * @param rand an object of the Random class
	 * @param fortune the magnitude of the effect of the fortune enchantment on this block
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random par2, int par3) {
		return ModItems.vespene;
	}
	
	/**
	 * Returns the metadata of the item being dropped from the block
	 * @param meta the metadata of the item that is being dropped
	 */
	public int damageDropped(int meta) {
		return 3;
	}

	/**
	 * Gets how many items should be dropped
	 * @param rand an object of the Random class
	 */
	public int quantityDropped(Random par1) {
		return 7 + par1.nextInt(2);
	}

	/**
	 * Returns whether or not this block can be silk harvested
	 * @param world the world
	 * @param pos the position of the block
	 * @param state the state of the block
	 * @param player an object of the EntityPlayer class
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
	public boolean isBlockSolid(IBlockAccess access, BlockPos pos, EnumFacing side) {
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

	protected static final AxisAlignedBB THIS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	/**
	 * Returns the bounding box of this block
	 * @param state the state of the block
	 * @param source allows you to grab the state of the block via its position
	 * @param pos the position of the block
	 */
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return THIS_AABB;
    }
	
	/**
	 * Returns the render type of the block
	 * @param state the state of the block
	 */
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

	/**
	 * Returns whether or not the block is an opaque cube
	 * @param state the state of the block
	 */
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	/**
	 * Creates a new tile entity instance that is specific to this block
	 * @param world the world
	 * @param meta a metadata value. In this case, it could be used to apply the tile entity to a 
	 * specific sub block, were this block a meta based block
	 */
	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockRichVespeneGeyser();
	}

}

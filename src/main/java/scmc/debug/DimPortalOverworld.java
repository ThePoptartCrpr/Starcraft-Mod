package scmc.debug;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scmc.CreativeTab;
import scmc.blocks.ModBlocks;
import scmc.lib.ModTeleporter;
import scmc.lib.Reference;

public class DimPortalOverworld extends ModBlocks {
	private int dim = 0;

	public DimPortalOverworld() {
		super(Material.ROCK);
		this.setLightLevel(1.0F);
		this.setHardness(5.0F);
		this.setResistance(0.0F);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_DIM_PORTAL_OW.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_DIM_PORTAL_OW.getRegistryRL());
		this.setCreativeTab(CreativeTab.tabStarcraftBuildingBlocks);

	}
	
	@Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn)
    {
		
    }

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return false;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the
	 * block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (!entity.isRiding() && !entity.isBeingRidden() && !world.isRemote) {

			try {
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if (player.dimension != this.dim) {
					player.getServer().getPlayerList().transferPlayerToDimension(player, this.dim, new ModTeleporter(player.mcServer.worldServerForDimension(this.dim), 0, 0, 0));
				}
			} catch (ClassCastException e) {
				return; // not a player
			}
		}
	}

	public MapColor getMapColor(int par1) {
		return MapColor.OBSIDIAN;
	}
}
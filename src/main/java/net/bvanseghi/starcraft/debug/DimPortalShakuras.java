package net.bvanseghi.starcraft.debug;

import java.util.List;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

public class DimPortalShakuras extends ModBlocks {
	public static boolean field_149948_a;
	
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000236";
	
	private int dim = StarcraftConfig.dimShakuras;
	public static final String name = "dimPortalShakuras";

	public DimPortalShakuras() {
		super(name, name, Material.ROCK);
		this.setLightLevel(1.0F);
		this.setHardness(5.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		
	}

	/**
	 * Adds all intersecting collision boxes to a list. (Be sure to only add
	 * boxes to the list if they intersect the mask.) Parameters: World, X, Y,
	 * Z, mask, list, colliding entity
	 */
	@SuppressWarnings("rawtypes")
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB mask, List list,
			Entity entity) {
	}

	//TODO: et cetera, et cetera
//	@Override
//	public boolean isNormalCube() {
//		return false;
//	}
//
//	@Override
//	public Item getItemDropped(int par1, Random par2Random, int par3) {
//		return null;
//	}
//
//	@Override
//	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
//		return false;
//	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the
	 * block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (!entity.isRiding() && !entity.isBeingRidden() && !world.isRemote) {

			try {
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if (player.dimension != this.dim) {
					
					//TODO: same
//					player.mcServer.getConfigurationManager().transferPlayerToDimension(player, this.dim, new ModTeleporter(player.mcServer.worldServerForDimension(this.dim)));
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
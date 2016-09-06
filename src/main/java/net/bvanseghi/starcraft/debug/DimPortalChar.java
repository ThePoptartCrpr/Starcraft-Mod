package net.bvanseghi.starcraft.debug;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.ModTeleporter;
import net.bvanseghi.starcraft.worldgen.provider.WorldProviderChar;
<<<<<<< HEAD
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
=======
>>>>>>> 10d39cd1103b9952221478be548366f8dc0b53a0
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class DimPortalChar extends ModBlocks {
	public static boolean field_149948_a;
	private static final String __OBFID = "CL_00000236";
<<<<<<< HEAD
	public int dim = 2;
=======
	private int dim = WorldProviderChar.getDimensionID();
>>>>>>> 10d39cd1103b9952221478be548366f8dc0b53a0
	public static final String name = "dimPortalChar";

	public DimPortalChar() {
		super(name, name, Material.rock);
		this.setLightLevel(1.0F);
		this.setHardness(5.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(null);
		
	}

	/**
	 * Adds all intersecting collision boxes to a list. (Be sure to only add
	 * boxes to the list if they intersect the mask.) Parameters: World, X, Y,
	 * Z, mask, list, colliding entity
	 */
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB mask, List list,
			Entity entity) {
	}

	@Override
	public boolean isNormalCube() {
		return false;
	}

	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return null;
	}

	@Override
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
		return false;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the
	 * block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity.ridingEntity == null && entity.riddenByEntity == null && !world.isRemote) {

			try {
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if (player.dimension != this.dim) {
					player.mcServer.getConfigurationManager().transferPlayerToDimension(player, this.dim,
							new ModTeleporter(player.mcServer.worldServerForDimension(this.dim)));
				}
			} catch (ClassCastException e) {
				return; // not a player
			}
		}
	}

	public MapColor getMapColor(int par1) {
		return MapColor.obsidianColor;
	}
}
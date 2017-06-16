package scmc.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import scmc.lib.Reference;

/**
 * Dark Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockProtossShield extends ModBlocks {

	public BlockProtossShield() {
		super(Material.AIR);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_SHIELD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_SHIELD.getRegistryRL());
	}

	public boolean canCollideCheck(IBlockState state, boolean hitIfLiquid)
    {
        return false;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return FULL_BLOCK_AABB;
    }
    
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
    
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if(entityIn instanceof EntityArrow) {
			entityIn.motionX = entityIn.motionZ = 0;
		}else if(entityIn instanceof EntityFireball || entityIn instanceof EntitySmallFireball) {
			System.out.print("test");
		}
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
	}
}

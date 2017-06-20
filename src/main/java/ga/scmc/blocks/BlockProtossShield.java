package ga.scmc.blocks;

import javax.annotation.Nullable;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Dark Protoss Energy Stabilizer block.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author He of a Former Time
 */
public class BlockProtossShield extends ModBlocks {

	public static final AxisAlignedBB SHIELD_BLOCK_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	
	public BlockProtossShield() {
		super(Material.AIR);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_PROTOSS_SHIELD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_PROTOSS_SHIELD.getRegistryRL());
	}

	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SHIELD_BLOCK_AABB;
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
	
    //TODO: fix this, arrows can sometimes whiz by shields
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if(entityIn instanceof EntityArrow) {
			entityIn.worldObj.playSound(null, entityIn.getPosition().getX(), entityIn.getPosition().getY(), entityIn.getPosition().getZ(), StarcraftSoundEvents.FX_SHIELD_HURT, null, 0.6F, 0.1F);
			entityIn.setDead();
		}else if(entityIn instanceof EntityFireball || entityIn instanceof EntitySmallFireball) {
			entityIn.setDead();
		}
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

        if (this == ModBlocks.PROTOSS_SHIELD)
        {
            if (blockState != iblockstate)
            {
                return true;
            }
            if (block == this)
            {
                return false;
            }
        }

        return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
}

package net.bvanseghi.starcraft.entity;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ReportedException;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityLarvaCocoon extends EntityZergPassive {

	private int nextStepDistance;
	private int fire;
	Random random = new Random();

	public EntityLarvaCocoon(World world) {
		super(world);
		this.setSize(0.7F, 0.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.larvaCocoonHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	protected boolean canDespawn()
    {
        return false;
    }
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SCSoundEvent getLivingSound() {
		return SCSoundEvents.ENTITY_ZERGCOCOON_LIVE1;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_ZERGCOCOON_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_ZERGCOCOON_DEATH;
	}

	@Override
	public void moveEntity(double x, double y, double z)
    {
       
    }
	
	public boolean isPushedByWater() {
		return false;
	}

	protected void setRotation(float par1, float par2) {
		this.rotationYaw = 0;
		this.rotationPitch = 0;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
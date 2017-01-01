package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityDarkProbe extends EntityProtossPassive {

	Random random = new Random();

	public EntityDarkProbe(World world) {
		super(world);
		this.setSize(0.5F, 1.3F);
		/*
		 * TODO: remake entity ai.
		 */
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.dProbeHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SCSoundEvent getLivingSound() {
		return SCSoundEvents.ENTITY_PROBE_LIVE1;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_PROBE_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_PROBE_DEATH;
	}

	/*
	@SuppressWarnings({"rawtypes", "unused"})
	public void moveEntity(double p_70091_1_, double p_70091_3_, double p_70091_5_) {
		if (this.noClip) {
			this.boundingBox.offset(p_70091_1_, p_70091_3_, p_70091_5_);
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double) this.yOffset - (double) this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;
		} else {
			this.worldObj.theProfiler.startSection("move");
			this.ySize *= 0.4F;
			double d3 = this.posX;
			double d4 = this.posY;
			double d5 = this.posZ;

			if (this.isInWeb) {
				this.isInWeb = false;
				p_70091_1_ *= 0.25D;
				p_70091_3_ *= 0.05000000074505806D;
				p_70091_5_ *= 0.25D;
				this.motionX = 0.0D;
				this.motionY = 0.0D;
				this.motionZ = 0.0D;
			}

			double d6 = p_70091_1_;
			double d7 = p_70091_3_;
			double d8 = p_70091_5_;
			AxisAlignedBB axisalignedbb = this.boundingBox.copy();

			List list = this.worldObj.getCollidingBoundingBoxes(this,
					this.boundingBox.addCoord(p_70091_1_, p_70091_3_, p_70091_5_));

			for (int i = 0; i < list.size(); ++i) {
				p_70091_3_ = ((AxisAlignedBB) list.get(i)).calculateYOffset(this.boundingBox, p_70091_3_);
			}

			if (p_70091_3_ > 0) {
				p_70091_3_ = 0.0D;
			}

			this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);

			if (!this.field_70135_K && d7 != p_70091_3_) {
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			for (int j = 0; j < list.size(); ++j) {
				p_70091_1_ = ((AxisAlignedBB) list.get(j)).calculateXOffset(this.boundingBox, p_70091_1_);
			}

			this.boundingBox.offset(p_70091_1_, 0.0D, 0.0D);

			if (!this.field_70135_K && d6 != p_70091_1_) {
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			for (int j = 0; j < list.size(); ++j) {
				p_70091_5_ = ((AxisAlignedBB) list.get(j)).calculateZOffset(this.boundingBox, p_70091_5_);
			}

			this.boundingBox.offset(0.0D, 0.0D, p_70091_5_);

			if (!this.field_70135_K && d8 != p_70091_5_) {
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			double d10;
			double d11;
			int k;
			double d12;

			this.worldObj.theProfiler.endSection();
			this.worldObj.theProfiler.startSection("rest");
			this.posX = (this.boundingBox.minX + this.boundingBox.maxX) / 2.0D;
			this.posY = this.boundingBox.minY + (double) this.yOffset - (double) this.ySize;
			this.posZ = (this.boundingBox.minZ + this.boundingBox.maxZ) / 2.0D;
			this.isCollidedHorizontally = d6 != p_70091_1_ || d8 != p_70091_5_;
			this.isCollidedVertically = d7 != p_70091_3_;
			this.onGround = d7 != p_70091_3_ && d7 < 0.0D;
			this.isCollided = this.isCollidedHorizontally || this.isCollidedVertically;
			this.updateFallState(p_70091_3_, this.onGround);

			if (d6 != p_70091_1_) {
				this.motionX = 0.0D;
			}

			if (d7 != p_70091_3_) {
				this.motionY = 0.0D;
			}

			if (d8 != p_70091_5_) {
				this.motionZ = 0.0D;
			}

			try {
				this.func_145775_I();
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
				CrashReportCategory crashreportcategory = crashreport
						.makeCategory("Entity being checked for collision");
				this.addEntityCrashInfo(crashreportcategory);
				throw new ReportedException(crashreport);
			}

			this.worldObj.theProfiler.endSection();
		}
	}
	*/
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
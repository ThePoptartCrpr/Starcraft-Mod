package scmc.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.passive.EntityProtossPassive;
import scmc.lib.StarcraftConfig;

//TODO: remake entity AI
public class EntityProbe extends EntityProtossPassive {
	public EntityProbe(World world) {
		super(world);
		setSize(0.5F, 1.3F);
	}
	
	//FIXME: make this
//	public boolean isAIEnabled() {
//		return true;
//	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.probeHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.43000000417232513);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}
	
	@Override
	public int getTalkInterval() {
        return 160;
    }
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_LIVE1;
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_DEATH;
	}

	/*
	@SuppressWarnings({"rawtypes", "unused"})
	public void moveEntity(double p_70091_1_, double p_70091_3_, double p_70091_5_) {
		if (noClip) {
			boundingBox.offset(p_70091_1_, p_70091_3_, p_70091_5_);
			posX = (boundingBox.minX + boundingBox.maxX) / 2;
			posY = boundingBox.minY + (double) yOffset - (double) ySize;
			posZ = (boundingBox.minZ + boundingBox.maxZ) / 2;
		} else {
			worldObj.theProfiler.startSection("move");
			ySize *= 0.4F;
			double d3 = posX;
			double d4 = posY;
			double d5 = posZ;

			if (isInWeb) {
				isInWeb = false;
				p_70091_1_ *= 0.25D;
				p_70091_3_ *= 0.05000000074505806D;
				p_70091_5_ *= 0.25D;
				motionX = 0;
				motionY = 0;
				motionZ = 0;
			}

			double d6 = p_70091_1_;
			double d7 = p_70091_3_;
			double d8 = p_70091_5_;
			AxisAlignedBB axisalignedbb = boundingBox.copy();

			List list = worldObj.getCollidingBoundingBoxes(this,
					boundingBox.addCoord(p_70091_1_, p_70091_3_, p_70091_5_));

			for (int i = 0; i < list.size(); ++i) {
				p_70091_3_ = ((AxisAlignedBB) list.get(i)).calculateYOffset(boundingBox, p_70091_3_);
			}

			if (p_70091_3_ > 0) {
				p_70091_3_ = 0;
			}

			boundingBox.offset(0, p_70091_3_, 0);

			if (!field_70135_K && d7 != p_70091_3_) {
				p_70091_5_ = 0;
				p_70091_3_ = 0;
				p_70091_1_ = 0;
			}

			for (int j = 0; j < list.size(); ++j) {
				p_70091_1_ = ((AxisAlignedBB) list.get(j)).calculateXOffset(boundingBox, p_70091_1_);
			}

			boundingBox.offset(p_70091_1_, 0, 0);

			if (!field_70135_K && d6 != p_70091_1_) {
				p_70091_5_ = 0;
				p_70091_3_ = 0;
				p_70091_1_ = 0;
			}

			for (int j = 0; j < list.size(); ++j) {
				p_70091_5_ = ((AxisAlignedBB) list.get(j)).calculateZOffset(boundingBox, p_70091_5_);
			}

			boundingBox.offset(0, 0, p_70091_5_);

			if (!field_70135_K && d8 != p_70091_5_) {
				p_70091_5_ = 0;
				p_70091_3_ = 0;
				p_70091_1_ = 0;
			}

			double d10;
			double d11;
			int k;
			double d12;

			worldObj.theProfiler.endSection();
			worldObj.theProfiler.startSection("rest");
			posX = (boundingBox.minX + boundingBox.maxX) / 2;
			posY = boundingBox.minY + (double) yOffset - (double) ySize;
			posZ = (boundingBox.minZ + boundingBox.maxZ) / 2;
			isCollidedHorizontally = d6 != p_70091_1_ || d8 != p_70091_5_;
			isCollidedVertically = d7 != p_70091_3_;
			onGround = d7 != p_70091_3_ && d7 < 0;
			isCollided = isCollidedHorizontally || isCollidedVertically;
			updateFallState(p_70091_3_, onGround);

			if (d6 != p_70091_1_) {
				motionX = 0;
			}

			if (d7 != p_70091_3_) {
				motionY = 0;
			}

			if (d8 != p_70091_5_) {
				motionZ = 0;
			}

			try {
				func_145775_I();
			} catch (Throwable throwable) {
				CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
				CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
				addEntityCrashInfo(crashreportcategory);
				throw new ReportedException(crashreport);
			}

			worldObj.theProfiler.endSection();
		}
	}
	*/

}
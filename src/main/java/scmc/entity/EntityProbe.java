package scmc.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.lib.StarcraftConfig;

public class EntityProbe extends EntityProtossPassive {

	// TODO: Recreate movement
	Random random = new Random();

	public EntityProbe(World world) {
		super(world);
		setSize(0.5F, 1.3F);
		/*
		 * TODO: recreate entity ai.
		 */
	}

	protected void applyEntityAI() {
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.probeHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000298023224D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	/*
	 * @SuppressWarnings({"rawtypes", "unused"}) public void moveEntity(double
	 * p_70091_1_, double p_70091_3_, double p_70091_5_) { if (noClip) {
	 * boundingBox.offset(p_70091_1_, p_70091_3_, p_70091_5_); posX =
	 * (boundingBox.minX + boundingBox.maxX) / 2.0D; posY = boundingBox.minY +
	 * (double) yOffset - (double) ySize; posZ = (boundingBox.minZ +
	 * boundingBox.maxZ) / 2.0D; } else {
	 * worldObj.theProfiler.startSection("move"); ySize *= 0.4F; double d3 =
	 * posX; double d4 = posY; double d5 = posZ; if (isInWeb) { isInWeb = false;
	 * p_70091_1_ *= 0.25D; p_70091_3_ *= 0.05000000074505806D; p_70091_5_ *=
	 * 0.25D; motionX = 0.0D; motionY = 0.0D; motionZ = 0.0D; } double d6 =
	 * p_70091_1_; double d7 = p_70091_3_; double d8 = p_70091_5_; AxisAlignedBB
	 * axisalignedbb = boundingBox.copy(); List list =
	 * worldObj.getCollidingBoundingBoxes(this, boundingBox.addCoord(p_70091_1_,
	 * p_70091_3_, p_70091_5_)); for (int i = 0; i < list.size(); ++i) {
	 * p_70091_3_ = ((AxisAlignedBB) list.get(i)).calculateYOffset(boundingBox,
	 * p_70091_3_); } if (p_70091_3_ > 0) { p_70091_3_ = 0.0D; }
	 * boundingBox.offset(0.0D, p_70091_3_, 0.0D); if (!field_70135_K && d7 !=
	 * p_70091_3_) { p_70091_5_ = 0.0D; p_70091_3_ = 0.0D; p_70091_1_ = 0.0D; }
	 * for (int j = 0; j < list.size(); ++j) { p_70091_1_ = ((AxisAlignedBB)
	 * list.get(j)).calculateXOffset(boundingBox, p_70091_1_); }
	 * boundingBox.offset(p_70091_1_, 0.0D, 0.0D); if (!field_70135_K && d6 !=
	 * p_70091_1_) { p_70091_5_ = 0.0D; p_70091_3_ = 0.0D; p_70091_1_ = 0.0D; }
	 * for (int j = 0; j < list.size(); ++j) { p_70091_5_ = ((AxisAlignedBB)
	 * list.get(j)).calculateZOffset(boundingBox, p_70091_5_); }
	 * boundingBox.offset(0.0D, 0.0D, p_70091_5_); if (!field_70135_K && d8 !=
	 * p_70091_5_) { p_70091_5_ = 0.0D; p_70091_3_ = 0.0D; p_70091_1_ = 0.0D; }
	 * double d10; double d11; int k; double d12;
	 * worldObj.theProfiler.endSection();
	 * worldObj.theProfiler.startSection("rest"); posX = (boundingBox.minX +
	 * boundingBox.maxX) / 2.0D; posY = boundingBox.minY + (double) yOffset -
	 * (double) ySize; posZ = (boundingBox.minZ + boundingBox.maxZ) / 2.0D;
	 * isCollidedHorizontally = d6 != p_70091_1_ || d8 != p_70091_5_;
	 * isCollidedVertically = d7 != p_70091_3_; onGround = d7 != p_70091_3_ &&
	 * d7 < 0.0D; isCollided = isCollidedHorizontally || isCollidedVertically;
	 * updateFallState(p_70091_3_, onGround); if (d6 != p_70091_1_) { motionX =
	 * 0.0D; } if (d7 != p_70091_3_) { motionY = 0.0D; } if (d8 != p_70091_5_) {
	 * motionZ = 0.0D; } try { func_145775_I(); } catch (Throwable throwable) {
	 * CrashReport crashreport = CrashReport.makeCrashReport(throwable,
	 * "Checking entity block collision"); CrashReportCategory
	 * crashreportcategory = crashreport
	 * .makeCategory("Entity being checked for collision");
	 * addEntityCrashInfo(crashreportcategory); throw new
	 * ReportedException(crashreport); } worldObj.theProfiler.endSection(); } }
	 */
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_DEATH;
	}

	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_PROBE_HURT;
	}

	@Override
	public int getTalkInterval() {
		return 160;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(4, new EntityAIAvoidEntity(this, EntityZergMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(7, new EntityAIWander(this, 1));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(8, new EntityAILookIdle(this));
		applyEntityAI();
	}

	public boolean isAIEnabled() {
		return true;
	}

}
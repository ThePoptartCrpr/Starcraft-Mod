package net.bvanseghi.starcraft.entity;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;

public class EntityProbe extends EntityProtossPassive {

	Random random = new Random();

	public EntityProbe(World world) {
		super(world);
		this.setSize(0.5F, 1.3F);
		this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWander(this, 0.4D));
        this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntitySkeleton.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityCreeper.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(5, new EntityAIAvoidEntity(this, EntityEnderman.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(6, new EntityAIAvoidEntity(this, EntitySpider.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(7, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(8, new EntityAIAvoidEntity(this, EntityCaveSpider.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(9, new EntityAIAvoidEntity(this, EntityBlaze.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(10, new EntityAIAvoidEntity(this, EntitySilverfish.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(11, new EntityAIAvoidEntity(this, EntitySlime.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(12, new EntityAIAvoidEntity(this, EntityWitch.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(13, new EntityAIAvoidEntity(this, EntityPigZombie.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(14, new EntityAIAvoidEntity(this, EntityZergPassive.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(15, new EntityAIAvoidEntity(this, EntityZergMob.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(16, new EntityAIAvoidEntity(this, EntityTerranPassive.class, 8.0F, 0.4D, 0.4D));
        this.tasks.addTask(17, new EntityAIAvoidEntity(this, EntityTerranMob.class, 8.0F, 0.4D, 0.4D));
        
        this.tasks.addTask(17, new EntityAIMoveTowardsRestriction(this, 0.4D));
        this.tasks.addTask(18, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(19, new EntityAIWatchClosest2(this, EntityVillager.class, 5.0F, 0.02F));
        this.tasks.addTask(20, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
	}
	
	 public boolean isAIEnabled()
	    {
	        return true;
	    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.43000000417232513D);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }

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

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}

}
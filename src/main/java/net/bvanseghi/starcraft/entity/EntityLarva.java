package net.bvanseghi.starcraft.entity;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ReportedException;
import net.minecraft.world.World;

public class EntityLarva extends EntityZergPassive {

	private int nextStepDistance;
	public boolean enoughMinerals = false;
	public boolean enoughVespene = false;
	public boolean playerRequestMob = false;
	private int fire;
	Random random = new Random();

	public EntityLarva(World world) {
		super(world);
		this.setSize(0.8F, 0.4F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.15D);
	}
	
	protected boolean canDespawn()
    {
        return false;
    }

	protected void dropFewItems(boolean par1, int par2) {
		int dropChanceCarapace = random.nextInt(9);

		if (dropChanceCarapace == 1) {
			this.entityDropItem(new ItemStack(ModItems.zergCarapace, 1, 0), 1);
		}
	}
	
	@SuppressWarnings("rawtypes")
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

			this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);

			if (!this.field_70135_K && d7 != p_70091_3_) {
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			boolean flag1 = this.onGround || d7 != p_70091_3_ && d7 < 0.0D;
			int j;

			for (j = 0; j < list.size(); ++j) {
				p_70091_1_ = ((AxisAlignedBB) list.get(j)).calculateXOffset(this.boundingBox, p_70091_1_);
			}

			this.boundingBox.offset(p_70091_1_, 0.0D, 0.0D);

			if (!this.field_70135_K && d6 != p_70091_1_) {
				p_70091_5_ = 0.0D;
				p_70091_3_ = 0.0D;
				p_70091_1_ = 0.0D;
			}

			for (j = 0; j < list.size(); ++j) {
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

			if (this.stepHeight > 0.0F && flag1 && (this.ySize < 0.05F) && (d6 != p_70091_1_ || d8 != p_70091_5_)) {
				d12 = p_70091_1_;
				d10 = p_70091_3_;
				d11 = p_70091_5_;
				p_70091_1_ = d6;
				p_70091_3_ = (double) this.stepHeight;
				p_70091_5_ = d8;
				AxisAlignedBB axisalignedbb1 = this.boundingBox.copy();
				this.boundingBox.setBB(axisalignedbb);
				list = this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox.addCoord(d6, p_70091_3_, d8));

				for (k = 0; k < list.size(); ++k) {
					p_70091_3_ = ((AxisAlignedBB) list.get(k)).calculateYOffset(this.boundingBox, p_70091_3_);
				}

				this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);

				if (!this.field_70135_K && d7 != p_70091_3_) {
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				for (k = 0; k < list.size(); ++k) {
					p_70091_1_ = ((AxisAlignedBB) list.get(k)).calculateXOffset(this.boundingBox, p_70091_1_);
				}

				this.boundingBox.offset(p_70091_1_, 0.0D, 0.0D);

				if (!this.field_70135_K && d6 != p_70091_1_) {
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				for (k = 0; k < list.size(); ++k) {
					p_70091_5_ = ((AxisAlignedBB) list.get(k)).calculateZOffset(this.boundingBox, p_70091_5_);
				}

				this.boundingBox.offset(0.0D, 0.0D, p_70091_5_);

				if (!this.field_70135_K && d8 != p_70091_5_) {
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				}

				if (!this.field_70135_K && d7 != p_70091_3_) {
					p_70091_5_ = 0.0D;
					p_70091_3_ = 0.0D;
					p_70091_1_ = 0.0D;
				} else {
					p_70091_3_ = (double) (-this.stepHeight);

					for (k = 0; k < list.size(); ++k) {
						p_70091_3_ = ((AxisAlignedBB) list.get(k)).calculateYOffset(this.boundingBox, p_70091_3_);
					}

					this.boundingBox.offset(0.0D, p_70091_3_, 0.0D);
				}

				if (d12 * d12 + d11 * d11 >= p_70091_1_ * p_70091_1_ + p_70091_5_ * p_70091_5_) {
					p_70091_1_ = d12;
					p_70091_3_ = d10;
					p_70091_5_ = d11;
					this.boundingBox.setBB(axisalignedbb1);
				}
			}

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

			d12 = this.posX - d3;
			d10 = this.posY - d4;
			d11 = this.posZ - d5;

			if (this.canTriggerWalking() && this.ridingEntity == null) {
				int j1 = MathHelper.floor_double(this.posX);
				k = MathHelper.floor_double(this.posY - 0.20000000298023224D - (double) this.yOffset);
				int l = MathHelper.floor_double(this.posZ);
				Block block = this.worldObj.getBlock(j1, k, l);
				int i1 = this.worldObj.getBlock(j1, k - 1, l).getRenderType();

				if (i1 == 11 || i1 == 32 || i1 == 21) {
					block = this.worldObj.getBlock(j1, k - 1, l);
				}

				if (block != Blocks.ladder) {
					d10 = 0.0D;
				}

				this.distanceWalkedModified = (float) ((double) this.distanceWalkedModified
						+ (double) MathHelper.sqrt_double(d12 * d12 + d11 * d11) * 0.6D);
				this.distanceWalkedOnStepModified = (float) ((double) this.distanceWalkedOnStepModified
						+ (double) MathHelper.sqrt_double(d12 * d12 + d10 * d10 + d11 * d11) * 0.6D);

				if (this.distanceWalkedOnStepModified > (float) this.nextStepDistance
						&& block.getMaterial() != Material.air) {
					this.nextStepDistance = (int) this.distanceWalkedOnStepModified + 1;

					if (this.isInWater()) {
						float f = MathHelper.sqrt_double(this.motionX * this.motionX * 0.20000000298023224D
								+ this.motionY * this.motionY + this.motionZ * this.motionZ * 0.20000000298023224D)
								* 0.35F;

						if (f > 1.0F) {
							f = 1.0F;
						}

						this.playSound(this.getSwimSound(), f,
								1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
					}

					this.func_145780_a(j1, k, l, block);
					block.onEntityWalking(this.worldObj, j1, k, l, this);
				}
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

			boolean flag2 = this.isWet();

			if (this.worldObj.func_147470_e(this.boundingBox.contract(0.001D, 0.001D, 0.001D))) {
				this.dealFireDamage(1);

				if (!flag2) {
					++this.fire;

					if (this.fire == 0) {
						this.setFire(8);
					}
				}
			} else if (this.fire <= 0) {
				this.fire = -this.fireResistance;
			}

			if (flag2 && this.fire > 0) {
				this.playSound("random.fizz", 0.7F, 1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
				this.fire = -this.fireResistance;
			}

			this.worldObj.theProfiler.endSection();

			int j1 = MathHelper.floor_double(this.posX);
			k = MathHelper.floor_double(this.posY - 0.20000000298023224D - (double) this.yOffset);
			int l = MathHelper.floor_double(this.posZ);
			Block block = this.worldObj.getBlock(j1, k, l);
			int i1 = this.worldObj.getBlock(j1, k - 1, l).getRenderType();

			if (i1 == 11 || i1 == 32 || i1 == 21) {
				block = this.worldObj.getBlock(j1, k - 1, l);
			}

			if (block == ModBlocks.zergCreep || block == Blocks.air || block == ModBlocks.keratinChunk
					|| block == ModBlocks.zergStrucCarapace || block == ModBlocks.zergStrucFlesh) {

			} else {
				this.kill();
			}

			canMorph();
		}
	}

	public void canMorph() {

		double posX = this.posX;
		double posY = this.posY;
		double posZ = this.posZ;
		this.setWorld(worldObj);

		if (playerRequestMob) {
			if (enoughMinerals) {
				if (enoughVespene) {
					this.setDead();
					EntityLarvaCocoon entity = new EntityLarvaCocoon(worldObj);
					entity.setPositionAndRotation(posX, posY, posZ, 0, 0);
					worldObj.spawnEntityInWorld(entity);

				}
			}
		}
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
}

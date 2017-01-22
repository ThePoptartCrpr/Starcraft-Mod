package net.bvanseghi.starcraft.entity;

import java.util.List;
import java.util.Random;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.blocks.metablocks.ModMetaBlocks;
import net.bvanseghi.starcraft.entity.ai.EntityAIAttackHydralisk;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.Library;
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
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ReportedException;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityLarva extends EntityZergPassive {

	private int nextStepDistance;
	public boolean enoughMinerals = false;
	public boolean enoughVespene = false;
	public boolean playerRequestMob = false;
	private int fire;
	Random random = new Random();
	BlockPos pos;

	public EntityLarva(World world) {
		super(world);
		this.setSize(0.8F, 0.4F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.larvaHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.19241212312D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
    }
	
	protected boolean canDespawn()
    {
        return false;
    }

	public int getTalkInterval()
    {
        return 160;
    }
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		if(!this.worldObj.isRemote){
			if((this.ticksExisted + rand.nextInt(1000) > 4000)) {
				Library.larvaMorph(this.worldObj, this, random, this.posX, this.posY, this.posZ);
			}else{
				
			}
		}
	}
	
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_LIVE1;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_DEATH;
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int dropChanceCarapace = random.nextInt(9);

		if (dropChanceCarapace == 1) {
			this.entityDropItem(new ItemStack(ModItems.zergCarapace, 1, 0), 1);
		}
	}
	
	public void moveEntity(double x, double y, double z)
    {
        if (this.noClip)
        {
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(x, y, z));
            this.resetPositionToBB();
        }
        else
        {
            this.worldObj.theProfiler.startSection("move");
            double d0 = this.posX;
            double d1 = this.posY;
            double d2 = this.posZ;

            if (this.isInWeb)
            {
                this.isInWeb = false;
                x *= 0.25D;
                y *= 0.05000000074505806D;
                z *= 0.25D;
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }

            double d3 = x;
            double d4 = y;
            double d5 = z;
            boolean flag = this.onGround && this.isSneaking();

            if (flag)
            {
                for (; x != 0.0D && this.worldObj.getCollisionBoxes(this, this.getEntityBoundingBox().offset(x, -1.0D, 0.0D)).isEmpty(); d3 = x)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0.0D;
                    }
                    else if (x > 0.0D)
                    {
                        x -= 0.05D;
                    }
                    else
                    {
                        x += 0.05D;
                    }
                }

                for (; z != 0.0D && this.worldObj.getCollisionBoxes(this, this.getEntityBoundingBox().offset(0.0D, -1.0D, z)).isEmpty(); d5 = z)
                {
                    if (z < 0.05D && z >= -0.05D)
                    {
                        z = 0.0D;
                    }
                    else if (z > 0.0D)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }

                for (; x != 0.0D && z != 0.0D && this.worldObj.getCollisionBoxes(this, this.getEntityBoundingBox().offset(x, -1.0D, z)).isEmpty(); d5 = z)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0.0D;
                    }
                    else if (x > 0.0D)
                    {
                        x -= 0.05D;
                    }
                    else
                    {
                        x += 0.05D;
                    }

                    d3 = x;

                    if (z < 0.05D && z >= -0.05D)
                    {
                        z = 0.0D;
                    }
                    else if (z > 0.0D)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }
            }

            List<AxisAlignedBB> list1 = this.worldObj.getCollisionBoxes(this, this.getEntityBoundingBox().addCoord(x, y, z));
            AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();
            int i = 0;

            for (int j = list1.size(); i < j; ++i)
            {
                y = ((AxisAlignedBB)list1.get(i)).calculateYOffset(this.getEntityBoundingBox(), y);
            }

            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, y, 0.0D));
            boolean i_ = this.onGround || d4 != y && d4 < 0.0D;
            int j4 = 0;

            for (int k = list1.size(); j4 < k; ++j4)
            {
                x = ((AxisAlignedBB)list1.get(j4)).calculateXOffset(this.getEntityBoundingBox(), x);
            }

            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(x, 0.0D, 0.0D));
            j4 = 0;

            for (int k4 = list1.size(); j4 < k4; ++j4)
            {
                z = ((AxisAlignedBB)list1.get(j4)).calculateZOffset(this.getEntityBoundingBox(), z);
            }

            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, 0.0D, z));

            if (this.stepHeight > 0.0F && i_ && (d3 != x || d5 != z))
            {
                double d11 = x;
                double d7 = y;
                double d8 = z;
                AxisAlignedBB axisalignedbb1 = this.getEntityBoundingBox();
                this.setEntityBoundingBox(axisalignedbb);
                y = (double)this.stepHeight;
                List<AxisAlignedBB> list = this.worldObj.getCollisionBoxes(this, this.getEntityBoundingBox().addCoord(d3, y, d5));
                AxisAlignedBB axisalignedbb2 = this.getEntityBoundingBox();
                AxisAlignedBB axisalignedbb3 = axisalignedbb2.addCoord(d3, 0.0D, d5);
                double d9 = y;
                int l = 0;

                for (int i1 = list.size(); l < i1; ++l)
                {
                    d9 = ((AxisAlignedBB)list.get(l)).calculateYOffset(axisalignedbb3, d9);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, d9, 0.0D);
                double d15 = d3;
                int j1 = 0;

                for (int k1 = list.size(); j1 < k1; ++j1)
                {
                    d15 = ((AxisAlignedBB)list.get(j1)).calculateXOffset(axisalignedbb2, d15);
                }

                axisalignedbb2 = axisalignedbb2.offset(d15, 0.0D, 0.0D);
                double d16 = d5;
                int l1 = 0;

                for (int i2 = list.size(); l1 < i2; ++l1)
                {
                    d16 = ((AxisAlignedBB)list.get(l1)).calculateZOffset(axisalignedbb2, d16);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, 0.0D, d16);
                AxisAlignedBB axisalignedbb4 = this.getEntityBoundingBox();
                double d17 = y;
                int j2 = 0;

                for (int k2 = list.size(); j2 < k2; ++j2)
                {
                    d17 = ((AxisAlignedBB)list.get(j2)).calculateYOffset(axisalignedbb4, d17);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, d17, 0.0D);
                double d18 = d3;
                int l2 = 0;

                for (int i3 = list.size(); l2 < i3; ++l2)
                {
                    d18 = ((AxisAlignedBB)list.get(l2)).calculateXOffset(axisalignedbb4, d18);
                }

                axisalignedbb4 = axisalignedbb4.offset(d18, 0.0D, 0.0D);
                double d19 = d5;
                int j3 = 0;

                for (int k3 = list.size(); j3 < k3; ++j3)
                {
                    d19 = ((AxisAlignedBB)list.get(j3)).calculateZOffset(axisalignedbb4, d19);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, 0.0D, d19);
                double d20 = d15 * d15 + d16 * d16;
                double d10 = d18 * d18 + d19 * d19;

                if (d20 > d10)
                {
                    x = d15;
                    z = d16;
                    y = -d9;
                    this.setEntityBoundingBox(axisalignedbb2);
                }
                else
                {
                    x = d18;
                    z = d19;
                    y = -d17;
                    this.setEntityBoundingBox(axisalignedbb4);
                }

                int l3 = 0;

                for (int i4 = list.size(); l3 < i4; ++l3)
                {
                    y = ((AxisAlignedBB)list.get(l3)).calculateYOffset(this.getEntityBoundingBox(), y);
                }

                this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, y, 0.0D));

                if (d11 * d11 + d8 * d8 >= x * x + z * z)
                {
                    x = d11;
                    y = d7;
                    z = d8;
                    this.setEntityBoundingBox(axisalignedbb1);
                }
            }

            this.worldObj.theProfiler.endSection();
            this.worldObj.theProfiler.startSection("rest");
            this.resetPositionToBB();
            this.isCollidedHorizontally = d3 != x || d5 != z;
            this.isCollidedVertically = d4 != y;
            this.onGround = this.isCollidedVertically && d4 < 0.0D;
            this.isCollided = this.isCollidedHorizontally || this.isCollidedVertically;
            j4 = MathHelper.floor_double(this.posX);
            int l4 = MathHelper.floor_double(this.posY - 0.20000000298023224D);
            int i5 = MathHelper.floor_double(this.posZ);
            BlockPos blockpos = new BlockPos(j4, l4, i5);
            IBlockState iblockstate = this.worldObj.getBlockState(blockpos);

            if (iblockstate.getMaterial() == Material.AIR)
            {
                BlockPos blockpos1 = blockpos.down();
                IBlockState iblockstate1 = this.worldObj.getBlockState(blockpos1);
                Block block1 = iblockstate1.getBlock();

                if (block1 instanceof BlockFence || block1 instanceof BlockWall || block1 instanceof BlockFenceGate)
                {
                    iblockstate = iblockstate1;
                    blockpos = blockpos1;
                }
            }

            this.updateFallState(y, this.onGround, iblockstate, blockpos);

            if (d3 != x)
            {
                this.motionX = 0.0D;
            }

            if (d5 != z)
            {
                this.motionZ = 0.0D;
            }

            Block block = iblockstate.getBlock();

            if (d4 != y)
            {
                block.onLanded(this.worldObj, this);
            }

            if (this.canTriggerWalking() && !flag && !this.isRiding())
            {
                double d12 = this.posX - d0;
                double d13 = this.posY - d1;
                double d14 = this.posZ - d2;

                if (block != Blocks.LADDER)
                {
                    d13 = 0.0D;
                }
                
                if (block == ModBlocks.ZERG_CREEP || block == Blocks.AIR || block == ModBlocks.KERATIN_CHUNK
            			|| block == ModMetaBlocks.ZERG_CARAPACE || block == ModMetaBlocks.ZERG_FLESH) {

            	} else {
            		//this.kill();
            	}

                if (block != null && this.onGround)
                {
                    block.onEntityWalk(this.worldObj, blockpos, this);
                }

                this.distanceWalkedModified = (float)((double)this.distanceWalkedModified + (double)MathHelper.sqrt_double(d12 * d12 + d14 * d14) * 0.6D);
                this.distanceWalkedOnStepModified = (float)((double)this.distanceWalkedOnStepModified + (double)MathHelper.sqrt_double(d12 * d12 + d13 * d13 + d14 * d14) * 0.6D);

                if (this.distanceWalkedOnStepModified > (float)this.nextStepDistance && iblockstate.getMaterial() != Material.AIR)
                {
                    this.nextStepDistance = (int)this.distanceWalkedOnStepModified + 1;

                    if (this.isInWater())
                    {
                        float f = MathHelper.sqrt_double(this.motionX * this.motionX * 0.20000000298023224D + this.motionY * this.motionY + this.motionZ * this.motionZ * 0.20000000298023224D) * 0.35F;

                        if (f > 1.0F)
                        {
                            f = 1.0F;
                        }

                        this.playSound(this.getSwimSound(), f, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                    }

                    this.playStepSound(blockpos, block);
                }
            }

            try
            {
                this.doBlockCollisions();
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
                this.addEntityCrashInfo(crashreportcategory);
                throw new ReportedException(crashreport);
            }

            boolean flag1 = this.isWet();

            if (this.worldObj.isFlammableWithin(this.getEntityBoundingBox().contract(0.001D)))
            {
                this.dealFireDamage(1);

                if (!flag1)
                {
                    ++this.fire;

                    if (this.fire == 0)
                    {
                        this.setFire(8);
                    }
                }
            }
            else if (this.fire <= 0)
            {
                this.fire = -this.fireResistance;
            }

            if (flag1 && this.fire > 0)
            {
                this.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 0.7F, 1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                this.fire = -this.fireResistance;
            }

            this.worldObj.theProfiler.endSection();
        }
    }
	
	

	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
}

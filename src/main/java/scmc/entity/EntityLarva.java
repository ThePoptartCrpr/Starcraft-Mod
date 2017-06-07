package scmc.entity;

import java.util.List;
import java.util.Random;

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
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ReportedException;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.ModMetaBlocks;
import scmc.entity.passive.EntityZergPassive;
import scmc.items.ModItems;
import scmc.lib.Library;
import scmc.lib.StarcraftConfig;

public class EntityLarva extends EntityZergPassive {
	private int nextStepDistance;
	private int fire;
	private Random random = new Random();

	public EntityLarva(World world) {
		super(world);
		setSize(.8F, .4F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.larvaHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.19241212312);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
	}
	
	@Override
	protected void initEntityAI() {
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
        tasks.addTask(7, new EntityAIWander(this, 1));
        tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
        tasks.addTask(8, new EntityAILookIdle(this));
        applyEntityAI();
    }

    protected void applyEntityAI() {
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }

    @Override
	public int getTalkInterval() {
        return 160;
    }
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if(!worldObj.isRemote){
			if((ticksExisted + rand.nextInt(1000) > 4000)) {
				Library.replaceEntity(false, this, new EntityLarvaCocoon(worldObj));
			}else{
				//...?
			}
		}
	}
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_LIVE1;
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_LARVA_DEATH;
	}
	
	@Override
	protected void dropFewItems(boolean par1, int par2) {
		int dropChanceCarapace = random.nextInt(9);

		if (dropChanceCarapace == 1) {
			entityDropItem(new ItemStack(ModItems.zergCarapace, 1, 0), 1);
		}
	}
	
	@Override
	public void moveEntity(double x, double y, double z) {
        if (noClip)
        {
            setEntityBoundingBox(getEntityBoundingBox().offset(x, y, z));
            resetPositionToBB();
        }
        else
        {
            worldObj.theProfiler.startSection("move");
            double d0 = posX;
            double d1 = posY;
            double d2 = posZ;

            if (isInWeb)
            {
                isInWeb = false;
                x *= 0.25D;
                y *= 0.05000000074505806D;
                z *= 0.25D;
                motionX = 0;
                motionY = 0;
                motionZ = 0;
            }

            double d3 = x;
            double d4 = y;
            double d5 = z;
            boolean flag = onGround && isSneaking();

            if (flag)
            {
                for (; x != 0 && worldObj.getCollisionBoxes(this, getEntityBoundingBox().offset(x, -1, 0)).isEmpty(); d3 = x)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0;
                    }
                    else if (x > 0)
                    {
                        x -= 0.05D;
                    }
                    else
                    {
                        x += 0.05D;
                    }
                }

                for (; z != 0 && worldObj.getCollisionBoxes(this, getEntityBoundingBox().offset(0, -1, z)).isEmpty(); d5 = z)
                {
                    if (z < 0.05D && z >= -0.05D)
                    {
                        z = 0;
                    }
                    else if (z > 0)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }

                for (; x != 0 && z != 0 && worldObj.getCollisionBoxes(this, getEntityBoundingBox().offset(x, -1, z)).isEmpty(); d5 = z)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0;
                    }
                    else if (x > 0)
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
                        z = 0;
                    }
                    else if (z > 0)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }
            }

            List<AxisAlignedBB> list1 = worldObj.getCollisionBoxes(this, getEntityBoundingBox().addCoord(x, y, z));
            AxisAlignedBB axisalignedbb = getEntityBoundingBox();
            int i = 0;

            for (int j = list1.size(); i < j; ++i)
            {
                y = ((AxisAlignedBB)list1.get(i)).calculateYOffset(getEntityBoundingBox(), y);
            }

            setEntityBoundingBox(getEntityBoundingBox().offset(0, y, 0));
            boolean i_ = onGround || d4 != y && d4 < 0;
            int j4 = 0;

            for (int k = list1.size(); j4 < k; ++j4)
            {
                x = ((AxisAlignedBB)list1.get(j4)).calculateXOffset(getEntityBoundingBox(), x);
            }

            setEntityBoundingBox(getEntityBoundingBox().offset(x, 0, 0));
            j4 = 0;

            for (int k4 = list1.size(); j4 < k4; ++j4)
            {
                z = ((AxisAlignedBB)list1.get(j4)).calculateZOffset(getEntityBoundingBox(), z);
            }

            setEntityBoundingBox(getEntityBoundingBox().offset(0, 0, z));

            if (stepHeight > 0 && i_ && (d3 != x || d5 != z))
            {
                double d11 = x;
                double d7 = y;
                double d8 = z;
                AxisAlignedBB axisalignedbb1 = getEntityBoundingBox();
                setEntityBoundingBox(axisalignedbb);
                y = (double)stepHeight;
                List<AxisAlignedBB> list = worldObj.getCollisionBoxes(this, getEntityBoundingBox().addCoord(d3, y, d5));
                AxisAlignedBB axisalignedbb2 = getEntityBoundingBox();
                AxisAlignedBB axisalignedbb3 = axisalignedbb2.addCoord(d3, 0, d5);
                double d9 = y;
                int l = 0;

                for (int i1 = list.size(); l < i1; ++l)
                {
                    d9 = ((AxisAlignedBB)list.get(l)).calculateYOffset(axisalignedbb3, d9);
                }

                axisalignedbb2 = axisalignedbb2.offset(0, d9, 0);
                double d15 = d3;
                int j1 = 0;

                for (int k1 = list.size(); j1 < k1; ++j1)
                {
                    d15 = ((AxisAlignedBB)list.get(j1)).calculateXOffset(axisalignedbb2, d15);
                }

                axisalignedbb2 = axisalignedbb2.offset(d15, 0, 0);
                double d16 = d5;
                int l1 = 0;

                for (int i2 = list.size(); l1 < i2; ++l1)
                {
                    d16 = ((AxisAlignedBB)list.get(l1)).calculateZOffset(axisalignedbb2, d16);
                }

                axisalignedbb2 = axisalignedbb2.offset(0, 0, d16);
                AxisAlignedBB axisalignedbb4 = getEntityBoundingBox();
                double d17 = y;
                int j2 = 0;

                for (int k2 = list.size(); j2 < k2; ++j2)
                {
                    d17 = ((AxisAlignedBB)list.get(j2)).calculateYOffset(axisalignedbb4, d17);
                }

                axisalignedbb4 = axisalignedbb4.offset(0, d17, 0);
                double d18 = d3;
                int l2 = 0;

                for (int i3 = list.size(); l2 < i3; ++l2)
                {
                    d18 = ((AxisAlignedBB)list.get(l2)).calculateXOffset(axisalignedbb4, d18);
                }

                axisalignedbb4 = axisalignedbb4.offset(d18, 0, 0);
                double d19 = d5;
                int j3 = 0;

                for (int k3 = list.size(); j3 < k3; ++j3)
                {
                    d19 = ((AxisAlignedBB)list.get(j3)).calculateZOffset(axisalignedbb4, d19);
                }

                axisalignedbb4 = axisalignedbb4.offset(0, 0, d19);
                double d20 = d15 * d15 + d16 * d16;
                double d10 = d18 * d18 + d19 * d19;

                if (d20 > d10)
                {
                    x = d15;
                    z = d16;
                    y = -d9;
                    setEntityBoundingBox(axisalignedbb2);
                }
                else
                {
                    x = d18;
                    z = d19;
                    y = -d17;
                    setEntityBoundingBox(axisalignedbb4);
                }

                int l3 = 0;

                for (int i4 = list.size(); l3 < i4; ++l3)
                {
                    y = ((AxisAlignedBB)list.get(l3)).calculateYOffset(getEntityBoundingBox(), y);
                }

                setEntityBoundingBox(getEntityBoundingBox().offset(0, y, 0));

                if (d11 * d11 + d8 * d8 >= x * x + z * z)
                {
                    x = d11;
                    y = d7;
                    z = d8;
                    setEntityBoundingBox(axisalignedbb1);
                }
            }

            worldObj.theProfiler.endSection();
            worldObj.theProfiler.startSection("rest");
            resetPositionToBB();
            isCollidedHorizontally = d3 != x || d5 != z;
            isCollidedVertically = d4 != y;
            onGround = isCollidedVertically && d4 < 0;
            isCollided = isCollidedHorizontally || isCollidedVertically;
            j4 = MathHelper.floor_double(posX);
            int l4 = MathHelper.floor_double(posY - 0.20000000298023224D);
            int i5 = MathHelper.floor_double(posZ);
            BlockPos blockpos = new BlockPos(j4, l4, i5);
            IBlockState iblockstate = worldObj.getBlockState(blockpos);

            if (iblockstate.getMaterial() == Material.AIR)
            {
                BlockPos blockpos1 = blockpos.down();
                IBlockState iblockstate1 = worldObj.getBlockState(blockpos1);
                Block block1 = iblockstate1.getBlock();

                if (block1 instanceof BlockFence || block1 instanceof BlockWall || block1 instanceof BlockFenceGate)
                {
                    iblockstate = iblockstate1;
                    blockpos = blockpos1;
                }
            }

            updateFallState(y, onGround, iblockstate, blockpos);

            if (d3 != x)
            {
                motionX = 0;
            }

            if (d5 != z)
            {
                motionZ = 0;
            }

            Block block = iblockstate.getBlock();

            if (d4 != y)
            {
                block.onLanded(worldObj, this);
            }

            if (canTriggerWalking() && !flag && !isRiding())
            {
                double d12 = posX - d0;
                double d13 = posY - d1;
                double d14 = posZ - d2;

                if (block != Blocks.LADDER)
                {
                    d13 = 0;
                }
                
                if (block == ModBlocks.ZERG_CREEP || block == Blocks.AIR || block == ModBlocks.KERATIN_CHUNK
            			|| block == ModMetaBlocks.ZERG_CARAPACE || block == ModMetaBlocks.ZERG_FLESH) {

            	} else {
            		//kill();
            	}

                if (block != null && onGround)
                {
                    block.onEntityWalk(worldObj, blockpos, this);
                }

                distanceWalkedModified = (float)((double)distanceWalkedModified + (double)MathHelper.sqrt_double(d12 * d12 + d14 * d14) * 0.6D);
                distanceWalkedOnStepModified = (float)((double)distanceWalkedOnStepModified + (double)MathHelper.sqrt_double(d12 * d12 + d13 * d13 + d14 * d14) * 0.6D);

                if (distanceWalkedOnStepModified > (float)nextStepDistance && iblockstate.getMaterial() != Material.AIR)
                {
                    nextStepDistance = (int)distanceWalkedOnStepModified + 1;

                    if (isInWater())
                    {
                        float f = MathHelper.sqrt_double(motionX * motionX * 0.20000000298023224D + motionY * motionY + motionZ * motionZ * 0.20000000298023224D) * 0.35F;

                        if (f > 1)
                        {
                            f = 1;
                        }

                        playSound(getSwimSound(), f, 1 + (rand.nextFloat() - rand.nextFloat()) * 0.4F);
                    }

                    playStepSound(blockpos, block);
                }
            }

            try
            {
                doBlockCollisions();
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
                addEntityCrashInfo(crashreportcategory);
                throw new ReportedException(crashreport);
            }

            boolean flag1 = isWet();

            if (worldObj.isFlammableWithin(getEntityBoundingBox().contract(0.001D)))
            {
                dealFireDamage(1);

                if (!flag1)
                {
                    ++fire;

                    if (fire == 0)
                    {
                        setFire(8);
                    }
                }
            }
            else if (fire <= 0)
            {
                fire = -fireResistance;
            }

            if (flag1 && fire > 0)
            {
                playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 0.7F, 1.6F + (rand.nextFloat() - rand.nextFloat()) * 0.4F);
                fire = -fireResistance;
            }

            worldObj.theProfiler.endSection();
        }
    }
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		if(rand.nextInt(100) < 21) {
			Library.replaceEntity(false, this, new EntityLarvaCocoon(worldObj));
		}
		return super.attackEntityFrom(source, damageDealt);
	}
	
	

	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return null;
	}
}
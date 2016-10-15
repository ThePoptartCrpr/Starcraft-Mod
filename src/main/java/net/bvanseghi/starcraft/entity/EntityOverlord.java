package net.bvanseghi.starcraft.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityOverlord extends EntityFlying {

	public int courseChangeCooldown;
    public double waypointX;
    public double waypointY;
    public double waypointZ;
    private Entity targetedEntity;
    /** Cooldown time between target loss and new target aquirement. */
    private int aggroCooldown;
    public int prevAttackCounter;
    public int attackCounter;
//    /** The explosion radius of spawned fireballs. */
//    private int explosionStrength = 1;
    
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00001689";

	public EntityOverlord(World world) {
		super(world);
		this.setSize(4.0F, 4.0F);

	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.015D);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public String getLivingSound() {
		return "Starcraft:overlord-live1";
	}
	
	public String getHurtSound() {
		return "Starcraft:overlord-hurt";
	}
	
	public String getDeathSound() {
		return "Starcraft:overlord-death";
	}

	 @SideOnly(Side.CLIENT)
	    public boolean func_110182_bF()
	    {
	        return this.dataWatcher.getWatchableObjectByte(16) != 0;
	    }

	    /**
	     * Called when the entity is attacked.
	     */
	    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
	    {
	        if (this.isEntityInvulnerable())
	        {
	            return false;
	        }
	        else
	        {
	            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
	        }
	    }

	    protected void entityInit()
	    {
	        super.entityInit();
	        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
	    }

	    @SuppressWarnings("unused")
		protected void updateEntityActionState()
	    {
	        if (!this.worldObj.isRemote && this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
	        {
	            this.setDead();
	        }

	        this.despawnEntity();
	        this.prevAttackCounter = this.attackCounter;
	        double d0 = this.waypointX - this.posX;
	        double d1 = this.waypointY - this.posY;
	        double d2 = this.waypointZ - this.posZ;
	        double d3 = d0 * d0 + d1 * d1 + d2 * d2;

	        if (d3 < 1.0D || d3 > 3600.0D)
	        {
	            this.waypointX = this.posX + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
	            this.waypointY = this.posY + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
	            this.waypointZ = this.posZ + (double)((this.rand.nextFloat() * 2.0F - 1.0F) * 16.0F);
	        }

	        if (this.courseChangeCooldown-- <= 0)
	        {
	            this.courseChangeCooldown += this.rand.nextInt(5) + 2;
	            d3 = (double)MathHelper.sqrt_double(d3);

	            if (this.isCourseTraversable(this.waypointX, this.waypointY, this.waypointZ, d3))
	            {
	                this.motionX += d0 / d3 * 0.1D;
	                this.motionY += d1 / d3 * 0.1D;
	                this.motionZ += d2 / d3 * 0.1D;
	            }
	            else
	            {
	                this.waypointX = this.posX;
	                this.waypointY = this.posY;
	                this.waypointZ = this.posZ;
	            }
	        }

	        if (this.targetedEntity != null && this.targetedEntity.isDead)
	        {
	            this.targetedEntity = null;
	        }

	        if (this.targetedEntity == null || this.aggroCooldown-- <= 0)
	        {
	            this.targetedEntity = this.worldObj.getClosestVulnerablePlayerToEntity(this, 100.0D);

	            if (this.targetedEntity != null)
	            {
	                this.aggroCooldown = 20;
	            }
	        }

	        double d4 = 64.0D;

	        if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity(this) < d4 * d4)
	        {
	            double d5 = this.targetedEntity.posX - this.posX;
	            double d6 = this.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
	            double d7 = this.targetedEntity.posZ - this.posZ;
	            this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / (float)Math.PI;
	        }
	        else
	        {
	            this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI;

	            if (this.attackCounter > 0)
	            {
	                --this.attackCounter;
	            }
	        }

	        if (!this.worldObj.isRemote)
	        {
	            byte b1 = this.dataWatcher.getWatchableObjectByte(16);
	            byte b0 = (byte)(this.attackCounter > 10 ? 1 : 0);

	            if (b1 != b0)
	            {
	                this.dataWatcher.updateObject(16, Byte.valueOf(b0));
	            }
	        }
	    }

	    /**
	     * True if the ghast has an unobstructed line of travel to the waypoint.
	     */
	    private boolean isCourseTraversable(double p_70790_1_, double p_70790_3_, double p_70790_5_, double p_70790_7_)
	    {
	        double d4 = (this.waypointX - this.posX) / p_70790_7_;
	        double d5 = (this.waypointY - this.posY) / p_70790_7_;
	        double d6 = (this.waypointZ - this.posZ) / p_70790_7_;
	        AxisAlignedBB axisalignedbb = this.boundingBox.copy();

	        for (int i = 1; (double)i < p_70790_7_; ++i)
	        {
	            axisalignedbb.offset(d4, d5, d6);

	            if (!this.worldObj.getCollidingBoundingBoxes(this, axisalignedbb).isEmpty())
	            {
	                return false;
	            }
	        }

	        return true;
	    }

	    protected Item getDropItem()
	    {
	        return Items.gunpowder;
	    }

	    /**
	     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
	     * par2 - Level of Looting used to kill this mob.
	     */
	    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
	        int j = this.rand.nextInt(2) + this.rand.nextInt(1 + p_70628_2_);
	        int k;

	        for (k = 0; k < j; ++k)
	        {
	            this.dropItem(Items.ghast_tear, 1);
	        }

	        j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);

	        for (k = 0; k < j; ++k)
	        {
	            this.dropItem(Items.gunpowder, 1);
	        }
	    }

	    /**
	     * Returns the volume for the sounds this mob makes.
	     */
	    protected float getSoundVolume()
	    {
	        return 10.0F;
	    }
	    
	    /**
	     * Will return how many at most can spawn in a chunk at once.
	     */
	    public int getMaxSpawnedInChunk()
	    {
	        return 1;
	    }

	}
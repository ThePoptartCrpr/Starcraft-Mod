package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.ai.EntityAIAttackHydralisk;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.SkeletonType;
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
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

/**
 * Work in progress
 * @author bvanseghi
 */
public class EntityHydralisk extends EntityZergMob implements IRangedAttackMob{
	public EntityHydralisk(World world) {
		super(world);
        this.setSize(1.0F, 1.75F);
        this.setCombatTask();
	}
	
	 private static final DataParameter<Integer> SKELETON_VARIANT = EntityDataManager.<Integer>createKey(EntitySkeleton.class, DataSerializers.VARINT);
	    private static final DataParameter<Boolean> SWINGING_ARMS = EntityDataManager.<Boolean>createKey(EntitySkeleton.class, DataSerializers.BOOLEAN);
	    private final EntityAIAttackHydralisk aiArrowAttack = new EntityAIAttackHydralisk(this, 1.0D, 20, 15.0F);
	    private final EntityAIAttackMelee aiAttackOnCollide = new EntityAIAttackMelee(this, 1.2D, false)
	    {
	        /**
	         * Resets the task
	         */
	        public void resetTask()
	        {
	            super.resetTask();
	        }
	        /**
	         * Execute a one shot task or start executing a continuous task
	         */
	        public void startExecuting()
	        {
	            super.startExecuting();
	        }
	    };
	    
	 public void setCombatTask()
	    {
	        if (this.worldObj != null && !this.worldObj.isRemote)
	        {
	            this.tasks.removeTask(this.aiAttackOnCollide);
	            this.tasks.removeTask(this.aiArrowAttack);
	            ItemStack itemstack = this.getHeldItemMainhand();

	            if (itemstack != null && itemstack.getItem() == Items.BOW)
	            {
	                int i = 20;

	                if (this.worldObj.getDifficulty() != EnumDifficulty.HARD)
	                {
	                    i = 40;
	                }

	                this.aiArrowAttack.setAttackCooldown(i);
	                this.tasks.addTask(4, this.aiArrowAttack);
	            }
	            else
	            {
	                this.tasks.addTask(4, this.aiAttackOnCollide);
	            }
	        }
	    }
	 
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.hydraliskHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zerglingDmg);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackHydralisk(this, 1.0D, 20, 15.0F));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityProtossMob.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, true));
        
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityProtossPassive.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, true));
        
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySlime.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySpider.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityEnderman.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityBlaze.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityEndermite.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityGolem.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySnowman.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityWitch.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityShulker.class, true));
        
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityWolf.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityCow.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityChicken.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntitySheep.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPolarBear.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityMooshroom.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPig.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityOcelot.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityHorse.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityBat.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityRabbit.class, true));
    }
    
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		if(rand.nextInt(3) == 0) {
			return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE3;
		}
		return StarcraftSoundEvents.ENTITY_ZERGLING_LIVE4;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZERGLING_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_ZERGLING_DEATH;
	}
	
	
	/**
	 * Drop up to 2 items when killed
	 * @param damagedByPlayer true if the most recent
	 * damage was dealt by a player
	 * @param lootingLevel level of Looting on kill
	 * weapon
	 */
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel) {
		//TODO: make this
	}
	
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_) {
		EntityTippedArrow entitytippedarrow = new EntityTippedArrow(this.worldObj, this);
        double d0 = target.posX - this.posX;
        double d1 = target.getEntityBoundingBox().minY + (double)(target.height / 3.0F) - entitytippedarrow.posY;
        double d2 = target.posZ - this.posZ;
        double d3 = (double)MathHelper.sqrt_double(d0 * d0 + d2 * d2);
        entitytippedarrow.setThrowableHeading(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.worldObj.getDifficulty().getDifficultyId() * 4));
        int i = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.POWER, this);
        int j = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.PUNCH, this);
        DifficultyInstance difficultyinstance = this.worldObj.getDifficultyForLocation(new BlockPos(this));
        entitytippedarrow.setDamage((double)(p_82196_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.getDifficulty().getDifficultyId() * 0.11F));

        if (i > 0)
        {
            entitytippedarrow.setDamage(entitytippedarrow.getDamage() + (double)i * 0.5D + 0.5D);
        }

        if (j > 0)
        {
            entitytippedarrow.setKnockbackStrength(j);
        }

        boolean flag = this.isBurning() && difficultyinstance.func_190083_c() && this.rand.nextBoolean() || this.func_189771_df() == SkeletonType.WITHER;
        flag = flag || EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.FLAME, this) > 0;

        if (flag)
        {
            entitytippedarrow.setFire(100);
        }

        ItemStack itemstack = this.getHeldItem(EnumHand.OFF_HAND);

        if (itemstack != null && itemstack.getItem() == Items.TIPPED_ARROW)
        {
            entitytippedarrow.setPotionEffect(itemstack);
        }
        else if (this.func_189771_df() == SkeletonType.STRAY)
        {
            entitytippedarrow.addEffect(new PotionEffect(MobEffects.SLOWNESS, 600));
        }

        this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entitytippedarrow);
	}
	
	public SkeletonType func_189771_df()
    {
        return SkeletonType.func_190134_a(((Integer)this.dataManager.get(SKELETON_VARIANT)).intValue());
    }

    public void func_189768_a(SkeletonType p_189768_1_)
    {
        this.dataManager.set(SKELETON_VARIANT, Integer.valueOf(p_189768_1_.func_190135_a()));
        this.isImmuneToFire = p_189768_1_ == SkeletonType.WITHER;
        this.func_189769_b(p_189768_1_);
    }

    private void func_189769_b(SkeletonType p_189769_1_)
    {
        if (p_189769_1_ == SkeletonType.WITHER)
        {
            this.setSize(0.7F, 2.4F);
        }
        else
        {
            this.setSize(0.6F, 1.99F);
        }
    }

    public static void func_189772_b(DataFixer p_189772_0_)
    {
        EntityLiving.func_189752_a(p_189772_0_, "Skeleton");
    }
}

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
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
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
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * Work in progress
 * @author bvanseghi
 */
public class EntityHydralisk extends EntityZergMob implements IRangedAttackMob{
	public EntityHydralisk(World world) {
		super(world);
        this.setSize(1.0F, 1.75F);
	}
	   
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zerglingHP);
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
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityProtossMob>(this, EntityProtossMob.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
        
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityProtossPassive>(this, EntityProtossPassive.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
        
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityVillager>(this, EntityVillager.class, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityIronGolem>(this, EntityIronGolem.class, true));
        
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityWolf>(this, EntityWolf.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityCow>(this, EntityCow.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityChicken>(this, EntityChicken.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntitySheep>(this, EntitySheep.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityPolarBear>(this, EntityPolarBear.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityMooshroom>(this, EntityMooshroom.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityPig>(this, EntityPig.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityOcelot>(this, EntityOcelot.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityHorse>(this, EntityHorse.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityBat>(this, EntityBat.class, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityRabbit>(this, EntityRabbit.class, true));
    }
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		if(rand.nextInt(3) == 0) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE3;
		}
		return StarcraftSoundEvents.ENTITY_HYDRALISK_LIVE4;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_HYDRALISK_DEATH;
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
		dropItem(Items.STICK, Integer.MAX_VALUE);
	}
	
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}

	public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_)
   	{
		EntityTippedArrow entitytippedarrow = new EntityTippedArrow(this.worldObj, this);
		this.worldObj.spawnEntityInWorld(entitytippedarrow);
	}  
}

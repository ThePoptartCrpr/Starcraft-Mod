package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
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
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

/**
 * May or may not have been totally stolen from {@link EntityZealot}
 * @author wundrweapon
 */
public class EntityZergling extends EntityZergMob {
	public EntityZergling(World world) {
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
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI()
    {
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
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
        
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityWolf.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityCow.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityChicken.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntitySheep.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPolarBear.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityMooshroom.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityPig.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityOcelot.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityHorse.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityBat.class, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityRabbit.class, true));
    }
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	/*
	public SCSoundEvent getLivingSound() {
		Random rand = new Random();
		if(rand.nextInt(2) == 0) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE1;
		}else if(rand.nextInt(2) == 1) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE2;
		}else if(rand.nextInt(2) == 2) {
			return SCSoundEvents.ENTITY_ZERGLING_LIVE3;
		}
		return SCSoundEvents.ENTITY_ZERGLING_LIVE4;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_ZERGLING_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_ZERGLING_DEATH;
	}
	*/
	
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
}

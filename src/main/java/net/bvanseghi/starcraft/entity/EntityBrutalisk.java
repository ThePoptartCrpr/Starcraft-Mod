package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.block.Block;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author bvanseghi
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class EntityBrutalisk extends EntityZergMob {
	public EntityBrutalisk(World world) {
		super(world);
        this.setSize(10.0F, 10.0F);
	}
	
	public boolean canBeCollidedWith() {
		return false;
	}
	
	public boolean canBePushed() {
		return false;
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
    	tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityProtossMob.class, true));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, true));
        
        targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        
        targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityProtossPassive.class, true));
        targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, true));
        
    }
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		//To be modified by bvanseghi
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.brutaliskHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2700000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.brutaliskDmg);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getLivingSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_LIVE1;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_BRUTALISK_DEATH;
	}
	
	protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(StarcraftSoundEvents.ENTITY_BRUTALISK_STEP, 0.15F, 1.0F);
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
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}
}

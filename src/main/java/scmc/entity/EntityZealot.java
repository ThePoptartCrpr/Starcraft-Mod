package scmc.entity;

import java.util.Random;

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
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityTerranPassive;
import scmc.entity.passive.EntityZergPassive;
import scmc.items.ModItems;
import scmc.items.weapons.ModWeapons;
import scmc.lib.StarcraftConfig;

public class EntityZealot extends EntityProtossMob {
	public EntityZealot(World world) {
		super(world);
	    setSize(1.5F, 2.5F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zealotHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zealotDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	protected void initEntityAI() {
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(2, new EntityAIAttackMelee(this, 1, false));
        tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
        tasks.addTask(7, new EntityAIWander(this, 1));
        tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
        tasks.addTask(8, new EntityAILookIdle(this));
        applyEntityAI();
    }

    protected void applyEntityAI() {
    	tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityZergMob>(this, EntityZergMob.class, true));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
        targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        targetTasks.addTask(5, new EntityAINearestAttackableTarget<EntityZergPassive>(this, EntityZergPassive.class, true));
        targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
    }
	
    @Override
	public SoundEvent getAmbientSound() {
		Random rand = new Random();
		if(rand.nextInt(4) == 0) {
			return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE1;
		}else if(rand.nextInt(4) == 1) {
			return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE2;
		}else if(rand.nextInt(4) == 2) {
			return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE3;
		} else {
			return StarcraftSoundEvents.ENTITY_ZEALOT_LIVE4;
		}
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZEALOT_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_ZEALOT_DEATH;
	}
    
	@Override
	public int getTalkInterval() {
        return 160;
    }
	
    /**
     * Drop 0-2 items of this living's type.
     * @param recentlyHit - Whether this entity has recently been hit by a player.
     * @param looting - Level of Looting used to kill this mob.
     */
    @Override
	protected void dropFewItems(boolean recentlyHit, int looting) {
        int j = rand.nextInt(50);
        
        if(j == 49) {
            dropItem(ModWeapons.PSI_BLADE, 1);
        }else if(j < 5) {
        	dropItem(ModItems.energy, 1);
        }
    }
}
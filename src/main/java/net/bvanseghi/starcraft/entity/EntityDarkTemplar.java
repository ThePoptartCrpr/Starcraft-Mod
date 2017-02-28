package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.weapons.ModWeapons;
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
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

@SuppressWarnings({"rawtypes", "unchecked"})
public class EntityDarkTemplar extends EntityProtossMob {
	World world;
	public EntityDarkTemplar(World world) {
		super(world);
	    this.setSize(1.5F, 2.5F);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.dTempHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.dTempDmg);
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
    	tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergMob.class, true));
        targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, true));
        
        targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        
        targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZergPassive.class, true));
        targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, true));
    }
    
	@Override
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		if(rand.nextInt(2) == 0) {
			return StarcraftSoundEvents.ENTITY_DARKTEMPLAR_LIVE1;
		}
		return StarcraftSoundEvents.ENTITY_DARKTEMPLAR_LIVE2;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_DARKTEMPLAR_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_DARKTEMPLAR_DEATH;
	}
	
	/**
	 * Drop 0-2 items on death
	 * @param recentPlayerDmg {@code true} if a player
	 * recently dealt damage to this entity
	 * @param lootingLvl level of Looting enchant
	 * used to deliver killing blow of entity
	 */
	protected void dropFewItems(boolean recentPlayerDmg, int lootingLvl) {
		int j = rand.nextInt(50);
        
		if(j == 50) {
			dropItem(ModWeapons.DARK_WARP_BLADE, 1);
        } else if(j < 5) {
        	entityDropItem(new ItemStack(ModItems.energy, 1, 1), 1);
        }
	}
	
	@Override
	public void onUpdate() {
		for (int i = 0; i < 2; ++i)
        {
			this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D, null);
        }
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}
}

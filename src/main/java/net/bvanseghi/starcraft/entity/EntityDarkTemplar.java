package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.*;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDarkTemplar extends EntityProtossMob {
	World world;
	public EntityDarkTemplar(World world) {
		super(world);
		clearAITasks();
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranMob.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergMob.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranPassive.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergPassive.class, 1.0D, true));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergPassive.class, 0, false));
	    this.setSize(1.5F, 2.5F);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(24.5);
	}
	
	protected void clearAITasks() {
		tasks.taskEntries.clear();
		targetTasks.taskEntries.clear();
	}
	
	@Override
	public boolean isAIEnabled() {
		return true;
	}
	
	/**
     * Get number of ticks, at least during which the living entity will be silent.
     */
	@Override
	public int getTalkInterval()
    {
        return 160;
    }
	
	public String getLivingSound() {
		return "Starcraft:darkTemplar-live1";
	}
	
	public String getHurtSound() {
		return "Starcraft:darkTemplar-hurt";
	}
	
	public String getDeathSound() {
		return "Starcraft:darkTemplar-death";
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
			dropItem(ModWeapons.darkWarpBlade, 1);
        } else if(j < 5) {
        	entityDropItem(new ItemStack(ModItems.energy, 1, 1), 1);
        }
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityAsMob(Entity target) {
		float attackDamage = (float) getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
		int knockbackModifier = 0;

		if(target instanceof EntityLivingBase) {
		    attackDamage += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLivingBase) target);
		    knockbackModifier  += EnchantmentHelper.getKnockbackModifier(this, (EntityLivingBase) target);
		}

		boolean isTargetHurt = target.attackEntityFrom(DamageSource.causeMobDamage(this), attackDamage);

		if(isTargetHurt) {
			if(knockbackModifier  > 0) {
				target.addVelocity((double) (-MathHelper.sin(rotationYaw * (float) Math.PI / 180) * (float) knockbackModifier  * .5f), .1, (double) (MathHelper.cos(rotationYaw * (float) Math.PI / 180) * (float) knockbackModifier  * .5f));
				motionX *= .6;
				motionZ *= .6;
			}

			int fireModifier = EnchantmentHelper.getFireAspectModifier(this);

			if(fireModifier > 0) {
				target.setFire(fireModifier * 4);
			}

			//Stolen from EntityMob. What does it do? Who knows, but it works
			if(target instanceof EntityLivingBase) {
				EnchantmentHelper.func_151384_a((EntityLivingBase) target, this);
			}

			EnchantmentHelper.func_151385_b(this, target);
		}

		return isTargetHurt;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt) {
		return super.attackEntityFrom(source, damageDealt);
	}
}

package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityDarkTemplar extends EntityProtossMob {
	World world;
	public EntityDarkTemplar(World world) {
		super(world);
		clearAITasks();
	    this.setSize(1.5F, 2.5F);
	    /*
	     * TODO: recreate entity ai.
	     */
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.dTempHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.dTempDmg);
	}
	
	protected void clearAITasks() {
		tasks.taskEntries.clear();
		targetTasks.taskEntries.clear();
	}
	
	/**
     * Get number of ticks, at least during which the living entity will be silent.
     */
	@Override
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SCSoundEvent getLivingSound() {
		if(rand.nextInt(2) == 0) {
			return SCSoundEvents.ENTITY_DARKTEMPLAR_LIVE1;
		}
		return SCSoundEvents.ENTITY_DARKTEMPLAR_LIVE2;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_DARKTEMPLAR_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_DARKTEMPLAR_DEATH;
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
		for (int i = 0; i < 2; ++i)
        {
            this.worldObj.spawnParticle("smoke", this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D);
        }
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityAsMob(Entity target) {
		float attackDamage = (float) getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
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

package net.bvanseghi.starcraft.entity;

import java.util.Random;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityZealot extends EntityProtossMob {

//	private boolean field_146076_bu = false;
//	private float field_146074_bv = -1.0F;
//	private float field_146073_bw;
    
	public EntityZealot(World world) {
		   
		super(world);
		clearAITasks();
	    this.setSize(1.5F, 2.5F);
	    /*
	     * TODO: recreate entity ai.
	     */
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.zealotHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.zealotDmg);
	}
	
	protected void clearAITasks()
	{
	   tasks.taskEntries.clear();
	   targetTasks.taskEntries.clear();
	}

	public boolean isAIEnabled()
    {
        return true;
    }
	
	public String getLivingSound() {
		Random rand = new Random();
		if(rand.nextInt(2) == 0) {
			return "Starcraft:zealot-live1";
		}else if(rand.nextInt(2) == 1) {
			return "Starcraft:zealot-live2";
		}else if(rand.nextInt(2) == 2) {
			return "Starcraft:zealot-live3";
		}
		return "Starcraft:zealot-live4";
	}
	
	public String getHurtSound() {
		return "Starcraft:zealot-hurt";
	}
	
	public String getDeathSound() {
		return "Starcraft:zealot-death";
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(50);
        if(j == 50) {
            this.dropItem(ModWeapons.psiBlade, 1);
        }else if(j < 5) {
        	this.dropItem(ModItems.energy, 1);
        }
    }
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entityTarget)
	{
	    float attackDamage = (float)getEntityAttribute(SharedMonsterAttributes
	          .ATTACK_DAMAGE).getAttributeValue();
	    int knockbackModifier = 0;

	    if (entityTarget instanceof EntityLivingBase)
	    {
	        attackDamage += EnchantmentHelper.getEnchantmentModifierLiving(this, 
	              (EntityLivingBase)entityTarget);
	        knockbackModifier  += EnchantmentHelper.getKnockbackModifier(this, 
	              (EntityLivingBase)entityTarget);
	    }

	    boolean isTargetHurt = entityTarget.attackEntityFrom(DamageSource
	          .causeMobDamage(this), attackDamage);

	    if (isTargetHurt)
	    {
	        if (knockbackModifier  > 0)
	        {
	            entityTarget.addVelocity((double)(-MathHelper.sin(rotationYaw * 
	                  (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F), 
	                   0.1D, (double)(MathHelper.cos(rotationYaw * 
	                  (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F));
	            motionX *= 0.6D;
	            motionZ *= 0.6D;
	        }

	        int fireModifier = EnchantmentHelper.getFireAspectModifier(this);

	        if (fireModifier > 0)
	        {
	            entityTarget.setFire(fireModifier * 4);
	        }

	        // I copied these enchantments from EntityMob, not sure what they do
	        if (entityTarget instanceof EntityLivingBase)
	        {
	            EnchantmentHelper.func_151384_a((EntityLivingBase)entityTarget, this);
	        }

	        EnchantmentHelper.func_151385_b(this, entityTarget);
	    }

	    return isTargetHurt ;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        return super.attackEntityFrom(p_70097_1_, p_70097_2_);
    }
}




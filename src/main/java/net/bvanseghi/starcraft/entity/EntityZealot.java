package net.bvanseghi.starcraft.entity;

import cpw.mods.fml.common.eventhandler.Event.Result;
import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.bvanseghi.starcraft.entity.passive.EntityZergPassive;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.ZombieEvent.SummonAidEvent;

public class EntityZealot extends EntityProtossMob {

	private boolean field_146076_bu = false;
    private float field_146074_bv = -1.0F;
    private float field_146073_bw;
    
	public EntityZealot(World world) {
		   
		super(world);
		clearAITasks();
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranPassive.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergPassive.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityTerranMob.class, 1.0D, true));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZergMob.class, 1.0D, true));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranPassive.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergPassive.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTerranMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZergMob.class, 0, false));
	        this.setSize(1.5F, 2.5F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
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
	          .attackDamage).getAttributeValue();
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




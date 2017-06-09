package scmc.entity;

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
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

public class EntityBroodling extends EntityZergMob
{

	public EntityBroodling(World world)
	{
		super(world);
		setSize(1.0F, 0.5F);
	}

	@Override
	protected void initEntityAI()
	{
		super.initEntityAI();

		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		tasks.addTask(7, new EntityAIWander(this, 1.0D));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(8, new EntityAILookIdle(this));

		applyEntityAI();
	}

	protected void applyEntityAI()
	{
		tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityProtossMob>(this, EntityProtossMob.class, true));
		targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
		targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
		targetTasks.addTask(5, new EntityAINearestAttackableTarget<EntityProtossPassive>(this, EntityProtossPassive.class, true));
		targetTasks.addTask(6, new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.broodlingHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.broodlingDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2)
	{

	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	// TODO: Figure out why getAmbientSound isnt working for the Broodling
	@Override
	public SoundEvent getAmbientSound()
	{
		return StarcraftSoundEvents.ENTITY_BROODLING_LIVE1;
	}

	@Override
	public SoundEvent getHurtSound()
	{
		return StarcraftSoundEvents.ENTITY_BROODLING_HURT;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return StarcraftSoundEvents.ENTITY_BROODLING_DEATH;
	}
}

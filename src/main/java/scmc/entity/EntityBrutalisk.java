package scmc.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
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
import scmc.StarcraftSoundEvents;
import scmc.entity.monster.EntityProtossMob;
import scmc.entity.monster.EntityTerranMob;
import scmc.entity.monster.EntityZergMob;
import scmc.entity.passive.EntityProtossPassive;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

/**
 * @author He of a Former Time
 */
public class EntityBrutalisk extends EntityZergMob
{
	public EntityBrutalisk(World world)
	{
		super(world);
		setSize(7.0F, 9.0F);
	}

	@Override
	protected void initEntityAI()
	{
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
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2,
				new EntityAINearestAttackableTarget<EntityProtossMob>(this, EntityProtossMob.class, true));
		targetTasks.addTask(3, new EntityAINearestAttackableTarget<EntityTerranMob>(this, EntityTerranMob.class, true));
		targetTasks.addTask(4, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
		targetTasks.addTask(5,
				new EntityAINearestAttackableTarget<EntityProtossPassive>(this, EntityProtossPassive.class, true));
		targetTasks.addTask(6,
				new EntityAINearestAttackableTarget<EntityTerranPassive>(this, EntityTerranPassive.class, true));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		// TODO apparently this needs modified
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.brutaliskHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2700000417232513D);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.brutaliskDmg);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.0D);
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	//fix dis
	public SoundEvent getLivingSound()
	{
		return StarcraftSoundEvents.ENTITY_BRUTALISK_LIVE1;
	}

	@Override
	public SoundEvent getHurtSound()
	{
		return StarcraftSoundEvents.ENTITY_BRUTALISK_HURT;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return StarcraftSoundEvents.ENTITY_BRUTALISK_DEATH;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn)
	{
		playSound(StarcraftSoundEvents.ENTITY_BRUTALISK_STEP, 0.15F, 1.0F);
	}

	/**
	 * Drop up to 2 items when killed
	 * 
	 * @param damagedByPlayer
	 *            true if the most recent damage was dealt by a player
	 * @param lootingLevel
	 *            level of Looting on kill weapon
	 */
	@Override
	protected void dropFewItems(boolean damagedByPlayer, int lootingLevel)
	{
		// TODO: make this
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float damageDealt)
	{
		return super.attackEntityFrom(source, damageDealt);
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}
}

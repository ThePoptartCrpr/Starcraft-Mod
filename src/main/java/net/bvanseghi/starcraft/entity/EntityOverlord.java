package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.StarcraftSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityOverlord extends EntityFlying {

	public int courseChangeCooldown;
    public double waypointX;
    public double waypointY;
    public double waypointZ;
    private Entity targetedEntity;
    /** Cooldown time between target loss and new target aquirement. */
    private int aggroCooldown;
    public int prevAttackCounter;
    public int attackCounter;
//    /** The explosion radius of spawned fireballs. */
//    private int explosionStrength = 1;
    
	private static final String __OBFID = "CL_00001689";

	public EntityOverlord(World world) {
		super(world);
		this.setSize(4.0F, 4.0F);

	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.overlordHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.015D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999.0D);
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_LIVE1;
	}
	
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_HURT;
	}
	
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_OVERLORD_DEATH;
	}

	}
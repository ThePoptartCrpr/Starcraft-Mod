package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.events.SCSoundEvent;
import net.bvanseghi.starcraft.events.SCSoundEvents;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
	}
	
	public int getTalkInterval()
    {
        return 160;
    }
	
	public SCSoundEvent getLivingSound() {
		return SCSoundEvents.ENTITY_OVERLORD_LIVE1;
	}
	
	public SCSoundEvent getHurtSound() {
		return SCSoundEvents.ENTITY_OVERLORD_HURT;
	}
	
	public SCSoundEvent getDeathSound() {
		return SCSoundEvents.ENTITY_OVERLORD_DEATH;
	}

	}
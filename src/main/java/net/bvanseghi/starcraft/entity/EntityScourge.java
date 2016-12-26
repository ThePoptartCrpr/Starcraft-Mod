package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityProtossMob;
import net.bvanseghi.starcraft.entity.monster.EntityTerranMob;
import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.entity.passive.EntityProtossPassive;
import net.bvanseghi.starcraft.entity.passive.EntityTerranPassive;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityScourge extends EntityZergMob {

	public EntityScourge(World world) {
		super(world);
		this.setSize(0.3F, 0.3F);
		/*
		 * TODO: recreate entity ai.
		 */
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
	}

	public boolean isAIEnabled()
    {
        return true;
    }
	
	protected void dropFewItems(boolean par1, int par2) {

	}
}




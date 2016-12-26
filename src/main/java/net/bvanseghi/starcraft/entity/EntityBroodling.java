package net.bvanseghi.starcraft.entity;

import net.bvanseghi.starcraft.entity.monster.EntityZergMob;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBroodling extends EntityZergMob {

	public EntityBroodling(World world) {
		super(world);
		this.setSize(0.3F, 0.3F);
		
		/*
		 * TODO: remake entity ai
		 */
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.broodlingHP);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(StarcraftConfig.broodlingDmg);
	}

	public boolean isAIEnabled()
    {
        return true;
    }
	
	protected void dropFewItems(boolean par1, int par2) {

	}
}




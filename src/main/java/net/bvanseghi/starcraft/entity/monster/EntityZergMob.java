package net.bvanseghi.starcraft.entity.monster;

import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.minecraft.entity.ai.EntityAIFindEntityNearest;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityZergMob extends EntityMob {
	public EntityZergMob(World world) {
		super(world);
	}
	
	@Override
	protected void initEntityAI() {
		targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityAnimal>(this, EntityAnimal.class, false));
		targetTasks.addTask(2, new EntityAIFindEntityNearest(this, EntityLarva.class));
		targetTasks.addTask(3, new EntityAIFindEntityNearest(this, EntityLarvaCocoon.class));
	}
}

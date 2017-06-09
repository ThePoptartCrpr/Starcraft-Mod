package scmc.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import scmc.entity.monster.EntityZergMob;

//TODO: remake entity AI
public class EntityScourge extends EntityZergMob
{
	public EntityScourge(World world)
	{
		super(world);
		setSize(.3F, .3F);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.43000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	// FIXME: this
	// public boolean isAIEnabled() {
	// return true;
	// }

	@Override
	protected void dropFewItems(boolean par1, int par2)
	{}
}
package ga.scmc.entity.living;

import ga.scmc.entity.EntityZergMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

// TODO: remake entity completely
public class EntityScourge extends EntityZergMob {

	public EntityScourge(World world) {
		super(world);
		setSize(.3F, .3F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.43000000417232513);
		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}

	@Override
	protected void dropFewItems(boolean par1, int par2) {}
	
	@Override
	public boolean getCanSpawnHere() {
		return this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}
}
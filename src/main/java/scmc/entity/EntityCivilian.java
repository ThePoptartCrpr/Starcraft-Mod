package scmc.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.entity.passive.EntityTerranPassive;
import scmc.lib.StarcraftConfig;

//TODO: Remake entity ai
public class EntityCivilian extends EntityTerranPassive {
	public EntityCivilian(World world) {
		super(world);
		setSize(1, 2);
	}
	
	public boolean isAIEnabled() {
		return true;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.civHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.43000000417232513);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(999999);
	}

	//FIXME: make this
//	protected String getLivingSound() {
//		return null;
//	}

	@Override
	protected SoundEvent getHurtSound() {
		return null;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return null;
	}

	@Override
	protected boolean canDespawn() {
        return false;
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}

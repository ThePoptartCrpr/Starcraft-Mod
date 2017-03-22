package scmc.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import scmc.entity.EntityScarab;

public class EntityAIScarabExplode extends EntityAIBase {
	
	/** The scarab that is swelling */
	private EntityScarab swellingScarab;
	
	/** The scarab's attack target. This is used for the changing of the creeper's state */
	private EntityLivingBase scarabAttackTarget;

	public EntityAIScarabExplode(EntityScarab entitycreeperIn) {
        swellingScarab = entitycreeperIn;
        setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        EntityLivingBase entitylivingbase = swellingScarab.getAttackTarget();
        return entitylivingbase != null && swellingScarab.getDistanceSqToEntity(entitylivingbase) < 9;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        swellingScarab.getNavigator().clearPathEntity();
        scarabAttackTarget = swellingScarab.getAttackTarget();
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        scarabAttackTarget = null;
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        if (scarabAttackTarget == null)
        {
            swellingScarab.setCreeperState(-1);
        }
        else if (swellingScarab.getDistanceSqToEntity(scarabAttackTarget) > 49)
        {
            swellingScarab.setCreeperState(-1);
        }
        else if (!swellingScarab.getEntitySenses().canSee(scarabAttackTarget))
        {
            swellingScarab.setCreeperState(-1);
        }
        else
        {
            swellingScarab.setCreeperState(1);
        }
    }
}

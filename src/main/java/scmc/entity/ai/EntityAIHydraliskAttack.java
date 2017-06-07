package scmc.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.projectile.EntitySmallFireball;
import scmc.entity.EntityHydralisk;

public class EntityAIHydraliskAttack extends EntityAIBase {
	private final EntityHydralisk hydra;
    private int attackStep;
    private int attackTime;

    public EntityAIHydraliskAttack(EntityHydralisk blazeIn)
    {
        this.hydra = blazeIn;
        this.setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        EntityLivingBase entitylivingbase = this.hydra.getAttackTarget();
        return entitylivingbase != null && entitylivingbase.isEntityAlive();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.attackStep = 0;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        --this.attackTime;
        EntityLivingBase entitylivingbase = this.hydra.getAttackTarget();
        double d0 = this.hydra.getDistanceSqToEntity(entitylivingbase);

        if (d0 < 4.0D)
        {
            if (this.attackTime <= 0)
            {
                this.attackTime = 5;
                this.hydra.attackEntityAsMob(entitylivingbase);
            }

            this.hydra.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }
        else if (d0 < 256.0D)
        {
            double d1 = entitylivingbase.posX - this.hydra.posX;
            double d2 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (this.hydra.posY + (double)(this.hydra.height / 2.0F));
            double d3 = entitylivingbase.posZ - this.hydra.posZ;

            if (this.attackTime <= 0)
            {
                ++this.attackStep;

                if (this.attackStep == 1)
                {
                    this.attackTime = 5;
                }
                else if (this.attackStep <= 2)
                {
                    this.attackTime = 5;
                }
                else
                {
                    this.attackTime = 5;
                    this.attackStep = 0;
                }

                if (this.attackStep > 1)
                {
                    //this.hydra.worldObj.playEvent((EntityPlayer)null, 1018, new BlockPos((int)this.hydra.posX, (int)this.hydra.posY, (int)this.hydra.posZ), 0);

                    for (int i = 0; i < 1; ++i)
                    {
                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.hydra.worldObj, this.hydra, d1, d2, d3);
                        entitysmallfireball.posY = this.hydra.posY + (double)(this.hydra.height / 2.0F) + 0.5D;
                        this.hydra.worldObj.spawnEntityInWorld(entitysmallfireball);
                    }
                }
            }

            this.hydra.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
        }
        else
        {
            this.hydra.getNavigator().clearPathEntity();
            this.hydra.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }
        super.updateTask();
    }
}

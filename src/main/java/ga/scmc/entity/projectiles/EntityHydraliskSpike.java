package ga.scmc.entity.projectiles;

import ga.scmc.StarcraftDamageSources;
import ga.scmc.entity.living.EntityHydralisk;
import ga.scmc.lib.StarcraftConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityHydraliskSpike extends EntityThrowable
{
    public EntityHydraliskSpike(World worldIn)
    {
        super(worldIn);
    }

    public EntityHydraliskSpike(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityHydraliskSpike(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
        	float i = (float)StarcraftConfig.HYDRALISK_DAMAGE;
        	
        	 if (result.entityHit instanceof EntityHydralisk)
             {
                 i = 0;
             }
        	 
            result.entityHit.attackEntityFrom(StarcraftDamageSources.causeHydraliskNeedleDamage(this, this.getThrower()), i);
        }

        for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
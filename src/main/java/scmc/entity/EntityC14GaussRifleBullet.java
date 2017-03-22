package scmc.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityC14GaussRifleBullet extends EntityThrowable {
	private double speed = 5.0;
	private EntityLivingBase shootingEntity;

	public EntityC14GaussRifleBullet(World par1World) {
		super(par1World);
		setSize(0.05F, 0.05F);
	}

	public EntityC14GaussRifleBullet(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		motionX *= speed;
		motionY *= speed;
		motionZ *= speed;
	}

	public EntityC14GaussRifleBullet(World par1World, double par2, double par4, double par6) {
		super(par1World, par2, par4, par6);
	}

	@Override
	protected float getGravityVelocity() {
		return 0;
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if (!worldObj.isRemote) {
			if (result.entityHit != null) {
				if (!result.entityHit.isImmuneToFire() && result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, shootingEntity), 6)) {
					//...?
				}
			} else {
				//...?
			}
			
			setDead();
		}
	}

}
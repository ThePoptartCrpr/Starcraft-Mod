package net.bvanseghi.starcraft.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityC14GaussRifleBullet extends EntityThrowable {
	private double speed = 5.0;
	public EntityLivingBase shootingEntity;
	float explosionRadius = 0;

	public EntityC14GaussRifleBullet(World par1World) {
		super(par1World);
		this.setSize(0.05F, 0.05F);
	}

	public EntityC14GaussRifleBullet(World par1World, EntityLivingBase par2EntityLivingBase) {
		super(par1World, par2EntityLivingBase);
		this.motionX *= speed;
		this.motionY *= speed;
		this.motionZ *= speed;
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
		if (!this.worldObj.isRemote) {
			if (result.entityHit != null) {
				if (!result.entityHit.isImmuneToFire() && result.entityHit
						.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 6.0F)) {

				}
			} else {

			}
			this.setDead();
		}
	}

}
package net.bvanseghi.starcraft.entity;

import cpw.mods.fml.common.registry.IThrowableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
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
	protected void onImpact(MovingObjectPosition p_70227_1_) {
		if (!this.worldObj.isRemote) {
			if (p_70227_1_.entityHit != null) {
				if (!p_70227_1_.entityHit.isImmuneToFire() && p_70227_1_.entityHit
						.attackEntityFrom(DamageSource.causeThrownDamage(this, this.shootingEntity), 6.0F)) {

				}
			} else {

			}
			this.setDead();
		}
	}

	@Override
	protected float getGravityVelocity() {
		return 0;
	}

}
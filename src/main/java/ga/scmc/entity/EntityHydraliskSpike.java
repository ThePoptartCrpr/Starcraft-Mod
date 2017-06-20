package ga.scmc.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityHydraliskSpike extends Entity {
	public EntityHydraliskSpike(World par1World) {
		super(par1World);
		setSize(0.05F, 0.05F);
	}

	public EntityHydraliskSpike(World world, Object source, Entity targetEntity, float velocity, double damage) {
		super(world);
		setSize(0.5F, 0.5F);
		posX -= MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
		posY -= 0.10000000149011612D;
		posZ -= MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
		setPosition(posX, posY, posZ);
		motionX = -MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI);
		motionZ = MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI);
		motionY = (-MathHelper.sin(rotationPitch / 180.0F * (float) Math.PI));

		double srcX = 0;
		double srcZ = 0;

		if(source instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) source;

			setLocationAndAngles(living.posX, living.posY + living.getEyeHeight(), living.posZ, living.rotationYaw, living.rotationPitch);
			srcX = living.posX;
			srcZ = living.posZ;
		}

		double x = targetEntity.posX - srcX;
		double y = targetEntity.getEntityBoundingBox().maxY - posY;
		double z = targetEntity.posZ - srcZ;
		double v = MathHelper.sqrt_double(x * x + z * z);

		if(v >= 1.0E-7D) {
			float yaw = (float) (Math.atan2(z, x) * 180.0D / Math.PI) - 90.0F;
			float pitch = (float) (-(Math.atan2(y, v) * 180.0D / Math.PI));
			double xOffset = x / v;
			double zOffset = z / v;
			setLocationAndAngles(srcX + xOffset, posY, srcZ + zOffset, yaw, pitch);
			setThrowableHeading(x, y, z, velocity, damage);
		}
	}

	@Override
	protected void entityInit() {}

	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {}

	public void setThrowableHeading(double posX, double posY, double posZ, float velocity, double damage) {
		float v = MathHelper.sqrt_double(posX * posX + posY * posY + posZ * posZ);
		posX /= v;
		posY /= v;
		posZ /= v;
		posX += rand.nextGaussian() * (rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * damage;
		posY += rand.nextGaussian() * (rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * damage;
		posZ += rand.nextGaussian() * (rand.nextBoolean() ? -1 : 1) * 0.007499999832361937D * damage;
		posX *= velocity;
		posY *= velocity;
		posZ *= velocity;
		motionX = posX;
		motionY = posY;
		motionZ = posZ;
		float v2 = MathHelper.sqrt_double(posX * posX + posZ * posZ);
		prevRotationYaw = rotationYaw = (float) (Math.atan2(posX, posZ) * 180.0D / Math.PI);
		prevRotationPitch = rotationPitch = (float) (Math.atan2(posY, v2) * 180.0D / Math.PI);
	}

	//We don't use this, I suppose :P
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {}
}

package scmc.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import scmc.StarcraftSoundEvents;
import scmc.entity.passive.EntityZergPassive;
import scmc.lib.Library;
import scmc.lib.StarcraftConfig;

public class EntityLarvaCocoon extends EntityZergPassive {
	public EntityLarvaCocoon(World world) {
		super(world);
		this.setSize(1.0F, 1.1F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(StarcraftConfig.larvaCocoonHP);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(Double.MAX_VALUE);
	}
	
	@Override
	protected boolean canDespawn() {
        return false;
    }
	
	@Override
	public int getTalkInterval() {
        return 160;
    }
	
	@Override
	public SoundEvent getAmbientSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_LIVE1;
	}
	
	@Override
	public SoundEvent getHurtSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_HURT;
	}
	
	@Override
	public SoundEvent getDeathSound() {
		return StarcraftSoundEvents.ENTITY_ZERGCOCOON_DEATH;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if(!worldObj.isRemote) {
			if((ticksExisted > 740)) {
				int i;
				i = rand.nextInt(100);
				if(i <= 10) {
					Library.replaceEntity(false, this, new EntityZergling(worldObj), new EntityZergling(worldObj));
				}else if(i > 10 && i <= 20) {
					Library.replaceEntity(false, this, new EntityZerglingSwarmling(worldObj), new EntityZerglingSwarmling(worldObj), new EntityZerglingSwarmling(worldObj));
				}else if(i > 20 && i <= 30) {
					Library.replaceEntity(false, this, new EntityZerglingRaptor(worldObj), new EntityZerglingRaptor(worldObj));
				}else if(i > 30 && i <= 40) {
					Library.replaceEntity(false, this, new EntityZerglingSC2(worldObj), new EntityZerglingSC2(worldObj));
				}else if(i > 40 && i <= 50) {
					Library.replaceEntity(false, this, new EntityZerglingBoost(worldObj), new EntityZerglingBoost(worldObj));
				}else {
					Library.replaceEntity(false, this, new EntityHydralisk(worldObj));
				}
			}
		}
	}
	
	@Override
	public void moveEntity(double x, double y, double z) {
    }
	
	@Override
	public boolean isPushedByWater() {
		return false;
	}
	
	@Override
	protected void setRotation(float par1, float par2) {
		rotationYaw = 0;
		rotationPitch = 0;
	}
	
	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}
}
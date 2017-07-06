package ga.scmc.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityZergMob extends EntityMob {

	public EntityZergMob(World world) {
		super(world);
	}
	// TODO: fix and adjust these
	/*
	 * @Override public boolean getCanSpawnHere() { int i =
	 * MathHelper.floor_double(posX); int j =
	 * MathHelper.floor_double(posY); int k =
	 * MathHelper.floor_double(posZ); BlockPos pos = new BlockPos(;
	 * return worldObj.getLight(pos.add(i, j, k)) > 0 &&
	 * worldObj.getDifficulty() != EnumDifficulty.PEACEFUL; }
	 * @Override protected boolean isValidLightLevel() { BlockPos blockpos = new
	 * BlockPos(posX, getEntityBoundingBox().minY, posZ); if
	 * (worldObj.getLightFor(EnumSkyBlock.SKY, blockpos) >
	 * rand.nextInt(32)) { return false; } else { int i =
	 * worldObj.getLightFromNeighbors(blockpos); if
	 * (worldObj.isThundering()) { int j =
	 * worldObj.getSkylightSubtracted();
	 * worldObj.setSkylightSubtracted(10); i =
	 * worldObj.getLightFromNeighbors(blockpos);
	 * worldObj.setSkylightSubtracted(j); } return i <=
	 * rand.nextInt(16); } }
	 */
}

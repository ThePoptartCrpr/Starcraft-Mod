package scmc.entity.monster;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityZergMob extends EntityMob {
	public EntityZergMob(World world) {
		super(world);
	}
	//TODO: fix and adjust these
	/*
	@Override
	public boolean getCanSpawnHere() {
		int i = MathHelper.floor_double(this.posX);
		 int j = MathHelper.floor_double(this.posY);
		 int k = MathHelper.floor_double(this.posZ);
		 BlockPos pos = new BlockPos(this);
		 return this.worldObj.getLight(pos.add(i, j, k)) > 0 && this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL;
	}
	
	@Override
	protected boolean isValidLightLevel()
    {
        BlockPos blockpos = new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ);

        if (this.worldObj.getLightFor(EnumSkyBlock.SKY, blockpos) > this.rand.nextInt(32))
        {
            return false;
        }
        else
        {
            int i = this.worldObj.getLightFromNeighbors(blockpos);

            if (this.worldObj.isThundering())
            {
                int j = this.worldObj.getSkylightSubtracted();
                this.worldObj.setSkylightSubtracted(10);
                i = this.worldObj.getLightFromNeighbors(blockpos);
                this.worldObj.setSkylightSubtracted(j);
            }

            return i <= this.rand.nextInt(16);
        }
    }*/
}

package net.bvanseghi.starcraft.worldgen.provider;

import net.bvanseghi.starcraft.worldgen.chunk.ChunkProviderShakuras;
import net.bvanseghi.starcraft.worldgen.manager.WorldChunkManagerShakuras;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderShakuras extends WorldProvider {
	
	World world;
	
	@Override
	public String getDimensionName() {
		return "Shakuras";
	}

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerShakuras(this.getSeed(), terrainType);
		this.dimensionId = DimensionManager.getNextFreeDimId();
		this.hasNoSky = true;

	}

	/**
	 * Returns a new chunk provider which generates chunks for this world
	 */
	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderShakuras(this.worldObj, this.worldObj.getSeed(), true);
	}

	@Override
	public boolean canRespawnHere() {
		return true; // I'm assuming you should be able to respawn on Shakuras
	}
	
	 public void setSpawnPointShakuras(int x, int y, int z)
	    {
		 
		 if(world.getBlock(x-1, y, z) == Blocks.lava) {
	        
		 }else {
			 worldObj.getWorldInfo().setSpawnPosition(x, y, z);
		 }
	    }
	 
	/**
	 * Returns 'true' if in the "main surface world", but 'false' if in the
	 * Nether or End dimensions.
	 */
	@Override
	public boolean isSurfaceWorld() {
		return true; // Needed to make sun/sky work
	}

	@Override
	public boolean doesXZShowFog(int par1, int par2) {
		return false;
	}

	@Override
	public boolean isSkyColored() {
		return true;
	}

	@Override
	public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
		return Vec3.createVectorHelper(0, 0, 0);
	}
	
	public void setWorldTime(long time)
    {
        worldObj.getWorldInfo().setWorldTime(20000);
    }

}

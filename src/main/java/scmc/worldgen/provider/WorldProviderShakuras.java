package scmc.worldgen.provider;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import scmc.lib.StarcraftConfig;
import scmc.worldgen.DimensionRegistry;
import scmc.worldgen.biomeprovider.ShakurasBiomeProvider;
import scmc.worldgen.chunk.ChunkProviderShakuras;

public class WorldProviderShakuras extends WorldProvider {

	@Override
	protected void createBiomeProvider() {
		biomeProvider = new ShakurasBiomeProvider(worldObj.getWorldInfo());
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkProviderShakuras(worldObj);
	}

	/**
	 * A Message to display to the user when they transfer out of this
	 * dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getDepartMessage() {
		if(this instanceof WorldProviderShakuras) {
			return "Leaving Shakuras";
		}
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.SHAKURAS_DT;
	}

	/**
	 * Determines the dimension the player will be respawned in, typically this
	 * brings them back to the overworld.
	 * @param player The player that is respawning
	 * @return The dimension to respawn the player in
	 */
	@Override
	public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player) {
		return StarcraftConfig.dimShakuras;
	}

	/**
	 * A message to display to the user when they transfer to this dimension.
	 * @return The message to be displayed
	 */
	@Override
	public String getWelcomeMessage() {
		if(this instanceof WorldProviderShakuras) {
			return "Entering Shakuras";
		}
		return null;
	}

	@Override
	public void setWorldTime(long time) {
		worldObj.getWorldInfo().setWorldTime(15000);
	}
	
	public boolean isDaytime()
    {
        return false;
    }
	
	public float getSunBrightnessFactor(float par1)
    {
        return 0.0F;
    }
}
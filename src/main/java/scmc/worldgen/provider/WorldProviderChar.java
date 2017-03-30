package scmc.worldgen.provider;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import scmc.lib.StarcraftConfig;
import scmc.worldgen.DimensionRegistry;
import scmc.worldgen.biomeprovider.CharBiomeProvider;
import scmc.worldgen.chunk.ChunkProviderChar;

public class WorldProviderChar extends WorldProvider {
	    
    /**
     * A message to display to the user when they transfer to this dimension.
     *
     * @return The message to be displayed
     */
    @Override
    public String getWelcomeMessage() {
        if (this instanceof WorldProviderChar) {
            return "Entering Char";
        }
        return null;
    }

    /**
     * A Message to display to the user when they transfer out of this dismension.
     *
     * @return The message to be displayed
     */
    @Override
    public String getDepartMessage() {
        if (this instanceof WorldProviderChar) {
            return "Leaving Char";
        }
        return null;
    }
    
    /**
     * Determines the dimension the player will be respawned in, typically this brings them back to the overworld.
     *
     * @param player The player that is respawning
     * @return The dimension to respawn the player in
     */
    @Override
    public int getRespawnDimension(EntityPlayerMP player) {
        return StarcraftConfig.dimChar;
    }
    
    @Override
    protected void createBiomeProvider() {
    	this.biomeProvider = new CharBiomeProvider(worldObj.getWorldInfo());
    }
    
    @Override
    public IChunkGenerator createChunkGenerator() {
    	return new ChunkProviderChar(worldObj);
    }

	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.CHAR_DT;
	}
}
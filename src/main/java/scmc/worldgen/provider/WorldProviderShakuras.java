package scmc.worldgen.provider;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import scmc.lib.StarcraftConfig;
import scmc.worldgen.DimensionRegistry;

public class WorldProviderShakuras extends WorldProvider {
    
    /**
     * A message to display to the user when they transfer to this dimension.
     *
     * @return The message to be displayed
     */
    @Override
    public String getWelcomeMessage() {
        if (this instanceof WorldProviderShakuras) {
            return "Entering Shakuras";
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
        if (this instanceof WorldProviderShakuras) {
            return "Leaving Shakuras";
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
    public int getRespawnDimension(net.minecraft.entity.player.EntityPlayerMP player)
    {
        return StarcraftConfig.dimShakuras;
    }

	@Override
	public DimensionType getDimensionType() {
		return DimensionRegistry.SHAKURAS_DT;
	}
}
package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockProtossWarpProjectorS extends ModBlocks {

	public static final String name = "protossWarpProjectorS";
	public BlockProtossWarpProjectorS() {
		super(name, name, Material.rock);
		
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		world.setBlock(x, y + 3, z, ModBlocks.warpGateWormholeShakuras);
        return true;
    }

}

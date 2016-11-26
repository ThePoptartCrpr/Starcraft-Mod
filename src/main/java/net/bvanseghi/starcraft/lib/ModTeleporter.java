package net.bvanseghi.starcraft.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

@SuppressWarnings("unused")
public class ModTeleporter extends Teleporter {
    private final WorldServer worldServerInstance;
    
    /** A private Random() function in Teleporter */
    private final Random random;
    
    /**
     * A list of valid keys for the destinationCoordainteCache. These are based on the X & Z of the player's initial
     * location.
     */
    @SuppressWarnings("rawtypes")
	private final List destinationCoordinateKeys = new ArrayList();
    
    private static final String __OBFID = "CL_00000153";

    public ModTeleporter(WorldServer worldSrv) {
    	super(worldSrv);
        worldServerInstance = worldSrv;
        random = new Random(worldSrv.getSeed());
    }

    /**
     * Place an entity in a nearby portal, creating one if necessary.
     */
    public void placeInPortal(Entity entity, double x, double y, double z, float par5float) {
        int entityX = MathHelper.floor_double(entity.posX);
        int entityY = MathHelper.floor_double(entity.posZ);
        int entityZ = MathHelper.floor_double(this.worldServerInstance.getTopSolidOrLiquidBlock(new BlockPos(entityX, y, entityY)).getY());
        byte b0 = 1;
        byte b1 = 0;

        for (int l = -2; l <= 2; ++l) {
            for (int i1 = -2; i1 <= 2; ++i1) {
                for (int j1 = -1; j1 < 3; ++j1) {
                    int k1 = entityX + i1 * b0 + l * b1;
                    int l1 = entityZ + j1;
                    int i2 = entityY + i1 * b1 - l * b0;
                    boolean flag = j1 < 0;
                    this.worldServerInstance.setBlockState(new BlockPos(k1, l1, i2), Blocks.AIR.getDefaultState());
                }
            }
        }
        entity.setLocationAndAngles((double) entityX, (double) entityZ, (double) entityY, entity.rotationYaw, 0.0F);
        entity.motionX = entity.motionY = entity.motionZ = 0;
    }
}

package net.bvanseghi.starcraft.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

@SuppressWarnings("unused")
public class ModTeleporter extends Teleporter
{
    private final WorldServer worldServerInstance;
    /** A private Random() function in Teleporter */
    private final Random random;
    /** Stores successful portal placement locations for rapid lookup. */
    private final LongHashMap destinationCoordinateCache = new LongHashMap();
    /**
     * A list of valid keys for the destinationCoordainteCache. These are based on the X & Z of the players initial
     * location.
     */
    @SuppressWarnings("rawtypes")
	private final List destinationCoordinateKeys = new ArrayList();
    private static final String __OBFID = "CL_00000153";

    public ModTeleporter(WorldServer p_i1963_1_)
    {
    	super(p_i1963_1_);
        this.worldServerInstance = p_i1963_1_;
        this.random = new Random(p_i1963_1_.getSeed());
    }

    /**
     * Place an entity in a nearby portal, creating one if necessary.
     */
    public void placeInPortal(Entity p_77185_1_, double p_77185_2_, double p_77185_4_, double p_77185_6_, float p_77185_8_)
    {
            int i = MathHelper.floor_double(p_77185_1_.posX);
            int k = MathHelper.floor_double(p_77185_1_.posZ);
            int j = MathHelper.floor_double(this.worldServerInstance.getTopSolidOrLiquidBlock(i, k));
            byte b0 = 1;
            byte b1 = 0;

            /*for (int l = -2; l <= 2; ++l)
            {
                for (int i1 = -2; i1 <= 2; ++i1)
                {
                    for (int j1 = -1; j1 < 3; ++j1)
                    {
                        int k1 = i + i1 * b0 + l * b1;
                        int l1 = j + j1;
                        int i2 = k + i1 * b1 - l * b0;
                        boolean flag = j1 < 0;
                        this.worldServerInstance.setBlock(k1, l1, i2, Blocks.air);
                    }
                }
            }*/

            p_77185_1_.setLocationAndAngles((double)i, (double)j, (double)k, p_77185_1_.rotationYaw, 0.0F);
            p_77185_1_.motionX = p_77185_1_.motionY = p_77185_1_.motionZ = 0.0D;
    }
}
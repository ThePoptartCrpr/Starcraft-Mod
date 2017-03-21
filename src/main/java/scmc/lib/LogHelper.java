package net.bvanseghi.starcraft.lib;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.Side;

public class LogHelper {


    public static Logger logger = FMLLog.getLogger();

    static Side side;

    private LogHelper()
    {
    }

    public static void init() {
    }
}
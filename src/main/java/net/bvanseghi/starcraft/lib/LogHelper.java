package net.bvanseghi.starcraft.lib;

import java.io.File;
import java.util.Locale;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.TracingPrintStream;
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
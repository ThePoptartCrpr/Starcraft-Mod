package ga.scmc;

import ga.scmc.lib.Reference;
import ga.scmc.proxy.IProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The main Starcraft mod class<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team</b></em>
 * @author He of a Former Time
 * @author wundrweapon
 */
@Mod(modid = Reference.MODID, acceptedMinecraftVersions = "[1.10.2]", useMetadata = true)
public class Starcraft {

	@Instance(Reference.MODID)
	public static Starcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY)
	public static IProxy proxy;

	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerTileEntities();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		proxy.registerItemVariants();
		MinecraftForge.EVENT_BUS.register(this); //I'm like 102% sure this is unnecessary
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}

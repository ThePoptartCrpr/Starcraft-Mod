package ga.scmc;

import ga.scmc.lib.Reference;
import ga.scmc.proxy.ServerProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version="1.5", acceptedMinecraftVersions = "[1.10.2]", useMetadata = true)
public class Starcraft {

	@Instance(Reference.MODID)
	public static Starcraft instance;

	// Testing the C14 Gauss Rifle
	// public static ItemC14GaussRifle itemTest = (ItemC14GaussRifle) new ItemC14GaussRifle().setFull3D().setUnlocalizedName("c14gaussrifle").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("c14gaussrifle");

	@SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
	public static ServerProxy proxy;

	static {
		FluidRegistry.enableUniversalBucket();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		proxy.registerModelBakeryStuff();
		MinecraftForge.EVENT_BUS.register(this);
		// GameRegistry.register(itemTest);
		// Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemTest, 0, new ModelResourceLocation("starcraft:c14gaussrifle", "inventory"));
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerTileEntities();
	}

	// Probably more C14 Gauss Rifle testing
	// @SideOnly(Side.CLIENT)
	// @SubscribeEvent
	// public void onModelBake(ModelBakeEvent event) {
	// 		event.getModelRegistry().putObject(new ModelResourceLocation("starcraft:c14gaussrifle", "inventory"), new RenderItemC14GaussRifle());
	// }
}

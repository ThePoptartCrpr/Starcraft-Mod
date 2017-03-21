package scmc;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.events.CommandDimensionTp;
import scmc.items.ItemC14GaussRifle;
import scmc.lib.Reference;
import scmc.proxy.ServerProxy;
import scmc.renderer.RenderItemC14GaussRifle;
import scmc.worldgen.DimensionRegistry;

@Mod(modid = Reference.MODID, acceptedMinecraftVersions = "[1.10.2]", useMetadata = true)
public class Starcraft {
	static {
		FluidRegistry.enableUniversalBucket();
	}

	//Testing the C14 Gauss Rifle
	public static ItemC14GaussRifle itemTest = (ItemC14GaussRifle) new ItemC14GaussRifle().setFull3D().setUnlocalizedName("c14gaussrifle").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("starcraft:weapon_rifle_c14_gauss");

	@Instance(Reference.MODID)
	public static Starcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerTileEntities();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		proxy.registerModelBakeryStuff();
		
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.register(itemTest);
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemTest, 0, new ModelResourceLocation("starcraft:weapon_rifle_c14_gauss", "inventory"));
	    DimensionRegistry.mainRegistry();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimensionTp());
	}

	//Probably more C14 Gauss Rifle testing
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onModelBake(ModelBakeEvent event) {
	    event.getModelRegistry().putObject(new ModelResourceLocation("starcraft:weapon_rifle_c14_gauss", "inventory"), new RenderItemC14GaussRifle());
	}
}

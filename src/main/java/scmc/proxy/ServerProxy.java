package scmc.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unused")
public abstract class ServerProxy {

	public void init(FMLInitializationEvent event) {}

	public void postInit(FMLPostInitializationEvent event) {}

	public void preInit(FMLPreInitializationEvent event) {}

	public void registerModelBakeryStuff() {}

	public void registerModelBakeryVariants() {}

	public void registerTileEntities() {}
	
	public abstract ModelBiped getArmorModel(int id);
}
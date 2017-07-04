package ga.scmc.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//I'm willing to bet we don't need this entire class
public class CommonProxy implements IProxy {
	public ModelBiped getArmorModel(int id) {
		return null; //That's all it did anyways
	}
	public ModelBiped getZergArmorT1Model(int id) {
		return null; //That's all it did anyways
	}
	
	public void preInit(FMLPreInitializationEvent event) {}
	public void init(FMLInitializationEvent event) {}
	public void postInit(FMLPostInitializationEvent event) {}
	public void registerItemVariants() {}
	public void registerTileEntities() {}
}

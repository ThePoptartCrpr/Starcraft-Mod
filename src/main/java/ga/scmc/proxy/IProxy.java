package ga.scmc.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {
	
	ModelBiped getArmorModel(int id);
	ModelBiped getZergArmorT1Model(int id);
	void preInit(FMLPreInitializationEvent event);
	void init(FMLInitializationEvent event);
	void postInit(FMLPostInitializationEvent event);
	void registerItemVariants();
}

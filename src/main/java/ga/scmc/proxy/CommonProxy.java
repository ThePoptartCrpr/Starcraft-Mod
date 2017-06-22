package ga.scmc.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	ModelBiped biped = null;
	
	public ModelBiped getArmorModel(int id){
		return biped;
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}

	public void preInit(FMLPreInitializationEvent event) {
		
	}

	public void registerModelBakeryStuff() {
		
	}

	public void registerModelBakeryVariants() {
		
	}
	
	public void registerTileEntities() {
		
	}
}
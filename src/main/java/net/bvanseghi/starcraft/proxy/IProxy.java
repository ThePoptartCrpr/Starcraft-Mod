package net.bvanseghi.starcraft.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {
	public void setModels();
	public void registerEntityRenders();
	public void preInit(FMLPreInitializationEvent event);
}

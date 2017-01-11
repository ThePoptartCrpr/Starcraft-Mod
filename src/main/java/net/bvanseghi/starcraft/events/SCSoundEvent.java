package net.bvanseghi.starcraft.events;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SCSoundEvent extends SoundEvent {
	
    private static int soundEventId;
    
	public SCSoundEvent(ResourceLocation soundNameIn) {
		super(soundNameIn);
	}

	public static void registerSounds() {
		registerSound("starcraft.larva.larva-live1");
		registerSound("starcraft.larva.larva-hurt");
		registerSound("starcraft.larva.larva-death");
		
		registerSound("starcraft.overlord.overlord-live1");
		registerSound("starcraft.overlord.overlord-hurt");
		registerSound("starcraft.overlord.overlord-death");
		
		registerSound("starcraft.zergCocoon.zergCocoon-live1");
		registerSound("starcraft.zergCocoon.zergCocoon-hurt");
		registerSound("starcraft.zergCocoon.zergCocoon-death");
		
		registerSound("starcraft.zergling.zergling-live1");
		registerSound("starcraft.zergling.zergling-live2");
		registerSound("starcraft.zergling.zergling-live3");
		registerSound("starcraft.zergling.zergling-live4");
		registerSound("starcraft.zergling.zergling-hurt");
		registerSound("starcraft.zergling.zergling-death");
		
		registerSound("starcraft.probe.probe-live1");
		registerSound("starcraft.probe.probe-hurt");
		registerSound("starcraft.probe.probe-death");
		
		registerSound("starcraft.zealot.zealot-live1");
		registerSound("starcraft.zealot.zealot-live2");
		registerSound("starcraft.zealot.zealot-live3");
		registerSound("starcraft.zealot.zealot-live4");
		registerSound("starcraft.zealot.zealot-hurt");
		registerSound("starcraft.zealot.zealot-death");
		
		registerSound("starcraft.darkTemplar.darkTemplar-live1");
		registerSound("starcraft.darkTemplar.darkTemplar-live2");
		registerSound("starcraft.darkTemplar.darkTemplar-hurt");
		registerSound("starcraft.darkTemplar.darkTemplar-death");
		
		registerSound("starcraft.c14GaussRifle.c14GaussRifle-firing");
		registerSound("starcraft.c14GaussRifle.c14GaussRifle-out");
	}
	
	 private static void registerSound(String soundNameIn)
	    {
	        ResourceLocation resourcelocation = new ResourceLocation(soundNameIn);
	        REGISTRY.register(soundEventId++, resourcelocation, new SoundEvent(resourcelocation));
	    }
}

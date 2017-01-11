package net.bvanseghi.starcraft.events;

import net.minecraft.init.Bootstrap;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;

public class SCSoundEvents extends SoundEvents {

	public static final SCSoundEvent ENTITY_LARVA_LIVE1;
	public static final SCSoundEvent ENTITY_LARVA_HURT;
	public static final SCSoundEvent ENTITY_LARVA_DEATH;
	public static final SCSoundEvent ENTITY_OVERLORD_LIVE1;
	public static final SCSoundEvent ENTITY_OVERLORD_HURT;
	public static final SCSoundEvent ENTITY_OVERLORD_DEATH;
	public static final SCSoundEvent ENTITY_ZERGCOCOON_LIVE1;
	public static final SCSoundEvent ENTITY_ZERGCOCOON_HURT;
	public static final SCSoundEvent ENTITY_ZERGCOCOON_DEATH;
	public static final SCSoundEvent ENTITY_ZERGLING_LIVE1;
	public static final SCSoundEvent ENTITY_ZERGLING_LIVE2;
	public static final SCSoundEvent ENTITY_ZERGLING_LIVE3;
	public static final SCSoundEvent ENTITY_ZERGLING_LIVE4;
	public static final SCSoundEvent ENTITY_ZERGLING_HURT;
	public static final SCSoundEvent ENTITY_ZERGLING_DEATH;
	public static final SCSoundEvent ENTITY_PROBE_LIVE1;
	public static final SCSoundEvent ENTITY_PROBE_HURT;
	public static final SCSoundEvent ENTITY_PROBE_DEATH;
	public static final SCSoundEvent ENTITY_ZEALOT_LIVE1;
	public static final SCSoundEvent ENTITY_ZEALOT_LIVE2;
	public static final SCSoundEvent ENTITY_ZEALOT_LIVE3;
	public static final SCSoundEvent ENTITY_ZEALOT_LIVE4;
	public static final SCSoundEvent ENTITY_ZEALOT_HURT;
	public static final SCSoundEvent ENTITY_ZEALOT_DEATH;
	public static final SCSoundEvent ENTITY_DARKTEMPLAR_LIVE1;
	public static final SCSoundEvent ENTITY_DARKTEMPLAR_LIVE2;
	public static final SCSoundEvent ENTITY_DARKTEMPLAR_HURT;
	public static final SCSoundEvent ENTITY_DARKTEMPLAR_DEATH;
	
	
	
	private static SCSoundEvent getRegisteredSoundEvent(String id)
    {
        SCSoundEvent soundevent = (SCSoundEvent)SCSoundEvent.REGISTRY.getObject(new ResourceLocation(id));

        if (soundevent == null)
        {
            throw new IllegalStateException("Invalid Sound requested: " + id);
        }
        else
        {
            return soundevent;
        }
    }

    static
    {
        if (!Bootstrap.isRegistered())
        {
            throw new RuntimeException("Accessed Sounds before Bootstrap!");
        }
        else
        {
        	ENTITY_LARVA_LIVE1 = getRegisteredSoundEvent("starcraft.larva.larva-live1");
        	ENTITY_LARVA_HURT = getRegisteredSoundEvent("starcraft.larva.larva-hurt");
        	ENTITY_LARVA_DEATH = getRegisteredSoundEvent("starcraft.larva.larva-death");
        	//any sounds beyond this point are not registering the correct sounds. Will fix later.
        	ENTITY_OVERLORD_LIVE1 = getRegisteredSoundEvent("starcraft.overlord.overlord-live1");
        	ENTITY_OVERLORD_HURT = getRegisteredSoundEvent("starcraft.overlord.overlord-hurt");
        	ENTITY_OVERLORD_DEATH = getRegisteredSoundEvent("starcraft.overlord.overlord-death");
        	
        	ENTITY_ZERGCOCOON_LIVE1 = getRegisteredSoundEvent("starcraft.zergCocoon.zergCocoon-live1");
        	ENTITY_ZERGCOCOON_HURT = getRegisteredSoundEvent("starcraft.zergCocoon.zergCocoon-hurt");
        	ENTITY_ZERGCOCOON_DEATH = getRegisteredSoundEvent("starcraft.zergCocoon.zergCocoon-death");
        	
        	ENTITY_ZERGLING_LIVE1 = getRegisteredSoundEvent("starcraft.zergling.zergling-live1");
        	ENTITY_ZERGLING_LIVE2 = getRegisteredSoundEvent("starcraft.zergling.zergling-live2");
        	ENTITY_ZERGLING_LIVE3 = getRegisteredSoundEvent("starcraft.zergling.zergling-live3");
        	ENTITY_ZERGLING_LIVE4 = getRegisteredSoundEvent("starcraft.zergling.zergling-live4");
        	ENTITY_ZERGLING_HURT = getRegisteredSoundEvent("starcraft.zergling.zergling-hurt");
        	ENTITY_ZERGLING_DEATH = getRegisteredSoundEvent("starcraft.zergling.zergling-death");
        	
        	ENTITY_PROBE_LIVE1 = getRegisteredSoundEvent("starcraft.probe.probe-live1");
        	ENTITY_PROBE_HURT = getRegisteredSoundEvent("starcraft.probe.probe-hurt");
        	ENTITY_PROBE_DEATH = getRegisteredSoundEvent("starcraft.probe.probe-death");
        	
        	ENTITY_ZEALOT_LIVE1 = getRegisteredSoundEvent("starcraft.zealot.zealot-live1");
        	ENTITY_ZEALOT_LIVE2 = getRegisteredSoundEvent("starcraft.zealot.zealot-live2");
        	ENTITY_ZEALOT_LIVE3 = getRegisteredSoundEvent("starcraft.zealot.zealot-live3");
        	ENTITY_ZEALOT_LIVE4 = getRegisteredSoundEvent("starcraft.zealot.zealot-live4");
        	ENTITY_ZEALOT_HURT = getRegisteredSoundEvent("starcraft.zealot.zealot-hurt");
        	ENTITY_ZEALOT_DEATH = getRegisteredSoundEvent("starcraft.zealot.zealot-death");
        	
        	ENTITY_DARKTEMPLAR_LIVE1 = getRegisteredSoundEvent("starcraft.darkTemplar.darkTemplar-live1");
        	ENTITY_DARKTEMPLAR_LIVE2 = getRegisteredSoundEvent("starcraft.darkTemplar.darkTemplar-live2");
        	ENTITY_DARKTEMPLAR_HURT = getRegisteredSoundEvent("starcraft.darkTemplar.darkTemplar-hurt");
        	ENTITY_DARKTEMPLAR_DEATH = getRegisteredSoundEvent("starcraft.darkTemplar.darkTemplar-death");
        }
    }
}


package net.bvanseghi.starcraft.events;

import net.minecraft.init.Bootstrap;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

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
        	ENTITY_OVERLORD_LIVE1 = getRegisteredSoundEvent("starcraft.larva.larva-live1");
        	ENTITY_OVERLORD_HURT = getRegisteredSoundEvent("starcraft.larva.larva-hurt");
        	ENTITY_OVERLORD_DEATH = getRegisteredSoundEvent("starcraft.larva.larva-death");
        	ENTITY_ZERGCOCOON_LIVE1 = getRegisteredSoundEvent("starcraft.larva.larva-live1");
        	ENTITY_ZERGCOCOON_HURT = getRegisteredSoundEvent("starcraft.larva.larva-hurt");
        	ENTITY_ZERGCOCOON_DEATH = getRegisteredSoundEvent("starcraft.larva.larva-death");
        }
    }
}


package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StarcraftSoundEvents 
{
	public static SoundEvent ENTITY_ZERGLING_LIVE1;
	public static SoundEvent ENTITY_ZERGLING_LIVE2;
	public static SoundEvent ENTITY_ZERGLING_LIVE3;
	public static SoundEvent ENTITY_ZERGLING_LIVE4;
	public static SoundEvent ENTITY_ZERGLING_HURT;
	public static SoundEvent ENTITY_ZERGLING_DEATH;
	
	public static SoundEvent ENTITY_HYDRALISK_LIVE1;
	public static SoundEvent ENTITY_HYDRALISK_LIVE2;
	public static SoundEvent ENTITY_HYDRALISK_LIVE3;
	public static SoundEvent ENTITY_HYDRALISK_LIVE4;
	public static SoundEvent ENTITY_HYDRALISK_HURT;
	public static SoundEvent ENTITY_HYDRALISK_DEATH;
	
	public static SoundEvent ENTITY_LARVA_LIVE1;
	public static SoundEvent ENTITY_LARVA_HURT;
	public static SoundEvent ENTITY_LARVA_DEATH;
	
	public static SoundEvent ENTITY_OVERLORD_LIVE1;
	public static SoundEvent ENTITY_OVERLORD_HURT;
	public static SoundEvent ENTITY_OVERLORD_DEATH;
	
	public static SoundEvent ENTITY_ZERGCOCOON_LIVE1;
	public static SoundEvent ENTITY_ZERGCOCOON_HURT;
	public static SoundEvent ENTITY_ZERGCOCOON_DEATH;
	
	public static SoundEvent ENTITY_ZEALOT_LIVE1;
	public static SoundEvent ENTITY_ZEALOT_LIVE2;
	public static SoundEvent ENTITY_ZEALOT_LIVE3;
	public static SoundEvent ENTITY_ZEALOT_LIVE4;
	public static SoundEvent ENTITY_ZEALOT_HURT;
	public static SoundEvent ENTITY_ZEALOT_DEATH;
	
	public static SoundEvent ENTITY_DARKTEMPLAR_LIVE1;
	public static SoundEvent ENTITY_DARKTEMPLAR_LIVE2;
	public static SoundEvent ENTITY_DARKTEMPLAR_HURT;
	public static SoundEvent ENTITY_DARKTEMPLAR_DEATH;
	
	public static SoundEvent ENTITY_PROBE_LIVE1;
	public static SoundEvent ENTITY_PROBE_HURT;
	public static SoundEvent ENTITY_PROBE_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_ZERGLING_LIVE1 = registerSound("mob.zergling.live1");
		ENTITY_ZERGLING_LIVE2 = registerSound("mob.zergling.live2");
		ENTITY_ZERGLING_LIVE3 = registerSound("mob.zergling.live3");
		ENTITY_ZERGLING_LIVE4 = registerSound("mob.zergling.live4");
		ENTITY_ZERGLING_HURT = registerSound("mob.zergling.hurt");
		ENTITY_ZERGLING_DEATH = registerSound("mob.zergling.death");
		
		ENTITY_HYDRALISK_LIVE1 = registerSound("mob.hydralisk.live1");
		ENTITY_HYDRALISK_LIVE2 = registerSound("mob.hydralisk.live2");
		ENTITY_HYDRALISK_LIVE3 = registerSound("mob.hydralisk.live3");
		ENTITY_HYDRALISK_LIVE4 = registerSound("mob.hydralisk.live4");
		ENTITY_HYDRALISK_HURT = registerSound("mob.hydralisk.hurt");
		ENTITY_HYDRALISK_DEATH = registerSound("mob.hydralisk.death");
		
		ENTITY_LARVA_LIVE1 = registerSound("mob.larva.live1");
		ENTITY_LARVA_HURT = registerSound("mob.larva.hurt");
		ENTITY_LARVA_DEATH = registerSound("mob.larva.death");
		
		ENTITY_OVERLORD_LIVE1 = registerSound("mob.overlord.live1");
		ENTITY_OVERLORD_HURT = registerSound("mob.overlord.hurt");
		ENTITY_OVERLORD_DEATH = registerSound("mob.overlord.death");
		
		ENTITY_ZERGCOCOON_LIVE1 = registerSound("mob.zergcocoon.live1");
		ENTITY_ZERGCOCOON_HURT = registerSound("mob.zergcocoon.hurt");
		ENTITY_ZERGCOCOON_DEATH = registerSound("mob.zergcocoon.death");
		
		ENTITY_ZEALOT_LIVE1 = registerSound("mob.zealot.live1");
		ENTITY_ZEALOT_LIVE2 = registerSound("mob.zealot.live2");
		ENTITY_ZEALOT_LIVE3 = registerSound("mob.zealot.live3");
		ENTITY_ZEALOT_LIVE4 = registerSound("mob.zealot.live4");
		ENTITY_ZEALOT_HURT = registerSound("mob.zealot.hurt");
		ENTITY_ZEALOT_DEATH = registerSound("mob.zealot.death");
		
		ENTITY_DARKTEMPLAR_LIVE1 = registerSound("mob.darktemplar.live1");
		ENTITY_DARKTEMPLAR_LIVE2 = registerSound("mob.darktemplar.live2");
		ENTITY_DARKTEMPLAR_HURT = registerSound("mob.darktemplar.hurt");
		ENTITY_DARKTEMPLAR_DEATH = registerSound("mob.darktemplar.death");
		
		ENTITY_PROBE_LIVE1 = registerSound("mob.probe.live1");
		ENTITY_PROBE_HURT = registerSound("mob.probe.hurt");
		ENTITY_PROBE_DEATH = registerSound("mob.probe.death");
	}
	
	private static SoundEvent registerSound(String soundName)
	{
		final ResourceLocation soundID = new ResourceLocation(Reference.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}
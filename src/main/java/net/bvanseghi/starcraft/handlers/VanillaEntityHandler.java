package net.bvanseghi.starcraft.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.bvanseghi.starcraft.lib.StarcraftConfig;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class VanillaEntityHandler {
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event) {
		
		if(StarcraftConfig.vanillaSpawn == true) {
			if (event.entity instanceof EntityCaveSpider || event.entity instanceof EntitySilverfish
					|| event.entity instanceof EntityWitch || event.entity instanceof EntitySlime
					|| event.entity instanceof EntityEnderman || event.entity instanceof EntityCreeper
					|| event.entity instanceof EntitySkeleton || event.entity instanceof EntityZombie
					|| event.entity instanceof EntitySpider) {
				event.setCanceled(true);
			}
		}
	}
}
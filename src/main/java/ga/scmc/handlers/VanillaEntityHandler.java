package ga.scmc.handlers;

import ga.scmc.lib.StarcraftConfig;
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
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class VanillaEntityHandler {

	@SubscribeEvent
	public static void onEntitySpawn(EntityJoinWorldEvent event) {
		if(StarcraftConfig.BOOL_VANILLA_MOBS_CAN_SPAWN == true) {
			if(event.getEntity() instanceof EntityCaveSpider || event.getEntity() instanceof EntitySilverfish || event.getEntity() instanceof EntityWitch
					|| event.getEntity() instanceof EntitySlime || event.getEntity() instanceof EntityEnderman || event.getEntity() instanceof EntityCreeper
					|| event.getEntity() instanceof EntitySkeleton || event.getEntity() instanceof EntityZombie || event.getEntity() instanceof EntitySpider) {
				event.setCanceled(false);
			}
		}
	}
}
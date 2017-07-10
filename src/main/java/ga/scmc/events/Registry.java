package ga.scmc.events;

import ga.scmc.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Registers all the stuff<br>
 * Well, it will eventually. Right now, just stuff in {@link ModBlocks}<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * @author wundrweapon
 */
@EventBusSubscriber
public class Registry {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> reg) {
		ModBlocks.init();
		reg.getRegistry().registerAll(ModBlocks.blocks.toArray(new Block[] {}));
	}

	@SubscribeEvent
	public static void registerItemBlocks(Register<Item> reg) {
		reg.getRegistry().registerAll(ModBlocks.itemBlocks.toArray(new Item[] {}));
	}
}

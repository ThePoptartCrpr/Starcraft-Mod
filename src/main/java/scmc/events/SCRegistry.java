package scmc.events;
//package scmc.events;
//
//import net.minecraft.item.Item;
//import net.minecraftforge.event.RegistryEvent.Register;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//
//@EventBusSubscriber
//public class SCRegistry {
//	private static Item[] items = {BucketHandler.acidBucket,
//	BucketHandler.bloodBucket, ModItems.acidBucket, ModItems.bloodBucket,
//	ModItems.C14GaussRifle, ModItems.C14GaussRifleBullet, ModItems.c14Parts,
//	ModItems.coord, ModItems.creepResin,
//	ModItems.darkPsiBladeFocuserUncharged, ModItems.dust, ModItems.energy,
//	ModItems.essence, ModItems.ingot, ModItems.mineralShard,
//	ModItems.organicTissue, ModItems.protossArtifact, ModItems.protossModule,
//	ModItems.psiBladeFocuserUncharged, ModItems.richMineralShard,
//	ModItems.uraj, ModItems.vespene, ModItems.zergCarapace}; //TODO: add the other items
//
//	@SubscribeEvent
//	public static void register(Register<Item> registry) {
//		registry.getRegistry().registerAll(items); //Register items
//		registry.getRegistry().registerAll(ModTools.TOOLS); //Register tools
//		registry.getRegistry().registerAll(ModArmour.ARMOURS); //Register armour
//		registry.getRegistry().registerAll(ModWeapons.WEAPONS); //Register weapons
//	}
//}
//
//ALL OF THIS WILL COME LATER
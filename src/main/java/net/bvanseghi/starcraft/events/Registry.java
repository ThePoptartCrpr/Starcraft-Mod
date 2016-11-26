package net.bvanseghi.starcraft.events;

import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class Registry {
	private static Item[] items = {BucketHandler.acidBucket, BucketHandler.bloodBucket, ModItems.acidBucket, ModItems.bloodBucket, ModItems.C14GaussRifle, ModItems.C14GaussRifleBullet, ModItems.c14Parts, ModItems.coord, ModItems.creepResin, ModItems.darkPsiBladeFocuserUncharged, ModItems.dust, ModItems.energy, ModItems.essence, ModItems.ingot, ModItems.mineralShard, ModItems.organicTissue, ModItems.protossArtifact, ModItems.protossModule, ModItems.psiBladeFocuserUncharged, ModItems.richMineralShard, ModItems.uraj, ModItems.vespene, ModItems.zergCarapace}; //TODO: add the other items
	private static Item[] tools = {ModTools.copperAxe, ModTools.copperHoe, ModTools.copperPickaxe, ModTools.copperShovel, ModTools.steelAxe, ModTools.steelHoe, ModTools.steelPickaxe, ModTools.steelShovel, ModTools.titaniumAxe, ModTools.titaniumHoe, ModTools.titaniumPickaxe, ModTools.titaniumShovel};
	private static Item[] armours = {ModArmour.copperHelmet, ModArmour.copperChestplate, ModArmour.copperLeggings, ModArmour.copperBoots, ModArmour.steelHelmet, ModArmour.steelChestplate, ModArmour.steelLeggings, ModArmour.steelBoots, ModArmour.titaniumHelmet, ModArmour.titaniumChestplate, ModArmour.titaniumLeggings, ModArmour.titaniumBoots, ModArmour.ghostHelmet, ModArmour.ghostChestplate, ModArmour.ghostLeggings, ModArmour.ghostBoots};
	private static Item[] weapons = {ModWeapons.copperSword, ModWeapons.darkPsiBlade, ModWeapons.darkWarpBlade, ModWeapons.masterPsiBlade, ModWeapons.psiBlade, ModWeapons.steelSword, ModWeapons.titaniumSword, ModWeapons.warpBlade};
	
	@SubscribeEvent
	public static void register(Register<Item> registry) {
		registry.getRegistry().registerAll(items); //Register items
		registry.getRegistry().registerAll(tools); //Register tools
		registry.getRegistry().registerAll(armours); //Register Armour
		registry.getRegistry().registerAll(weapons);
	}
}

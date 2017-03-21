package scmc.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scmc.CreativeTab;
import scmc.StarcraftSoundEvents;
import scmc.achievement.Achievements;
import scmc.armour.ArmourCopperBoots;
import scmc.armour.ArmourCopperChestplate;
import scmc.armour.ArmourCopperHelmet;
import scmc.armour.ArmourCopperLeggings;
import scmc.armour.ArmourGhostBoots;
import scmc.armour.ArmourGhostChestplate;
import scmc.armour.ArmourGhostHelmet;
import scmc.armour.ArmourGhostLeggings;
import scmc.armour.ArmourSteelBoots;
import scmc.armour.ArmourSteelChestplate;
import scmc.armour.ArmourSteelHelmet;
import scmc.armour.ArmourSteelLeggings;
import scmc.armour.ArmourTitaniumBoots;
import scmc.armour.ArmourTitaniumChestplate;
import scmc.armour.ArmourTitaniumHelmet;
import scmc.armour.ArmourTitaniumLeggings;
import scmc.armour.ModArmour;
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.ModMetaBlocks;
import scmc.entity.EntityBroodling;
import scmc.entity.EntityBrutalisk;
import scmc.entity.EntityCivilian;
import scmc.entity.EntityDarkProbe;
import scmc.entity.EntityDarkTemplar;
import scmc.entity.EntityHydralisk;
import scmc.entity.EntityLarva;
import scmc.entity.EntityLarvaCocoon;
import scmc.entity.EntityProbe;
import scmc.entity.EntitySpiderMine;
import scmc.entity.EntityZealot;
import scmc.entity.EntityZergling;
import scmc.entity.ModEntities;
import scmc.fluids.ModFluids;
import scmc.handlers.FuelHandler;
import scmc.items.ModItems;
import scmc.lib.Reference;
import scmc.lib.StarcraftConfig;
import scmc.material.ModMaterials;
import scmc.model.ModelBroodling;
import scmc.model.ModelBrutalisk;
import scmc.model.ModelCivilian;
import scmc.model.ModelDarkProbe;
import scmc.model.ModelDarkTemplar;
import scmc.model.ModelHydralisk;
import scmc.model.ModelLarva;
import scmc.model.ModelLarvaCocoon;
import scmc.model.ModelProbe;
import scmc.model.ModelSpiderMine;
import scmc.model.ModelZealot;
import scmc.model.ModelZergling;
import scmc.renderer.RenderBroodling;
import scmc.renderer.RenderBrutalisk;
import scmc.renderer.RenderCivilian;
import scmc.renderer.RenderDarkProbe;
import scmc.renderer.RenderDarkTemplar;
import scmc.renderer.RenderHydralisk;
import scmc.renderer.RenderLarva;
import scmc.renderer.RenderLarvaCocoon;
import scmc.renderer.RenderProbe;
import scmc.renderer.RenderSpiderMine;
import scmc.renderer.RenderZealot;
import scmc.renderer.RenderZergling;
import scmc.tileentity.ModTileEntities;
import scmc.tools.ModTools;
import scmc.weapons.ModWeapons;
import scmc.worldgen.SCWorldGen;

@SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
public class ClientProxy extends ServerProxy {
	public void setModels() {

		///
		/// TO USE: ModelLoader.setCustomModelResourceLocation(item instance,
		/// metadata, new ModelResourceLocation(item class.REGISTRY_RL,
		/// "inventory"));
		/// IF NO "REGISTRY_RL" IS DEFINED MAKE ONE USING THE CONVENTIONS FOUND
		/// IN THE ARMOURS
		///

		// Copper armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperBoots, 0,
				new ModelResourceLocation(ArmourCopperBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperChestplate, 0,
				new ModelResourceLocation(ArmourCopperChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperHelmet, 0,
				new ModelResourceLocation(ArmourCopperHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperLeggings, 0,
				new ModelResourceLocation(ArmourCopperLeggings.REGISTRY_RL, "inventory"));

		// Ghost armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostBoots, 0,
				new ModelResourceLocation(ArmourGhostBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostChestplate, 0,
				new ModelResourceLocation(ArmourGhostChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostHelmet, 0,
				new ModelResourceLocation(ArmourGhostHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostLeggings, 0,
				new ModelResourceLocation(ArmourGhostLeggings.REGISTRY_RL, "inventory"));

		// Steel armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelBoots, 0,
				new ModelResourceLocation(ArmourSteelBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelChestplate, 0,
				new ModelResourceLocation(ArmourSteelChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelHelmet, 0,
				new ModelResourceLocation(ArmourSteelHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelLeggings, 0,
				new ModelResourceLocation(ArmourSteelLeggings.REGISTRY_RL, "inventory"));

		// Titanium armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumBoots, 0,
				new ModelResourceLocation(ArmourTitaniumBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumChestplate, 0,
				new ModelResourceLocation(ArmourTitaniumChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumHelmet, 0,
				new ModelResourceLocation(ArmourTitaniumHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumLeggings, 0,
				new ModelResourceLocation(ArmourTitaniumLeggings.REGISTRY_RL, "inventory"));
	}

	// TODO: get all of this into registry
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class,
				new RenderZealot(Minecraft.getMinecraft().getRenderManager(), new ModelZealot(), 0.4f)); // use
																											// deprecated
																											// method
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class,
				new RenderProbe(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f)); // use
																										// deprecated
																										// method
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class,
				new RenderDarkTemplar(Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f)); // use
																													// deprecated
																													// method
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class,
				new RenderDarkProbe(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f)); // use
																												// deprecated
																												// method

		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class,
				new RenderBrutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 0.4f)); // use
																												// deprecated
																												// method
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class,
				new RenderHydralisk(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f)); // use
																												// deprecated
																												// method
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class,
				new RenderZergling(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f)); // use
																												// deprecated
																												// method
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class,
				new RenderLarva(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f)); // use
																										// deprecated
																										// method
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class,
				new RenderLarvaCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f)); // use
																													// deprecated
																													// method
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class,
				new RenderBroodling(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f)); // use
																												// deprecated
																												// method

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class,
				new RenderCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f)); // use
																												// deprecated
																												// method
		RenderingRegistry.registerEntityRenderingHandler(EntitySpiderMine.class,
				new RenderSpiderMine(Minecraft.getMinecraft().getRenderManager(), new ModelSpiderMine(), 0.4f)); // use
																													// deprecated
																													// method

	}

	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();
		ModBlocks.init();
		ModItems.init();
		ModItems.register(); //Does stuff, including bucket-y stuff
		CreativeTab.setMisc(); //Add the misc tab after doing bucket-y stuff
		UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.acid).getItem().setCreativeTab(CreativeTab.tabStarcraftMisc); //Put the acid bucket into the misc tab
		UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.blood).getItem().setCreativeTab(CreativeTab.tabStarcraftMisc); //Put the blood bucket into the misc tab
		ModItems.registerRenders();
		ModMaterials.preInit();
		ModWeapons.init();
		ModWeapons.register();
		ModWeapons.registerRenders();
		ModTileEntities.preInit();
		ModArmour.init();
		ModArmour.register();
		ModArmour.registerRenders();
		ModTools.init();
		ModTools.register();
		ModTools.registerRenders();
		FuelHandler.preInit();
		ModBlocks.registerModels();
		ModMetaBlocks.init();
		ModMetaBlocks.register();
		ModMetaBlocks.registerRenders();
		SCWorldGen.setupWorldgen();
		SCWorldGen.preInit();
		ModEntities.registerEntities();
		StarcraftSoundEvents.registerSounds();
	}

	public void init(FMLInitializationEvent event) {
		ModEntities.setEntityToSpawn();
		ModEntities.generateSpawnEgg();
		registerEntityRenders();
		setModels();
		Achievements.init();
		setModels();
	}

	public void postInit(FMLPostInitializationEvent event) {

		// GameRegistry.registerWorldGenerator(new SCWorldGen(), 0);
	}

	@Override
	public void registerModelBakeryStuff() {
		ModelBakery.registerItemVariants(ModItems.mineralShard, 
				new ResourceLocation(Reference.MODID, "shard_blue"),
				new ResourceLocation(Reference.MODID, "shard_rich"));
		
		ModelBakery.registerItemVariants(ModItems.vespene, 
				new ResourceLocation(Reference.MODID, "vespene_raw"),
				new ResourceLocation(Reference.MODID, "vespene_protoss"),
				new ResourceLocation(Reference.MODID, "vespene_terran"),
				new ResourceLocation(Reference.MODID, "vespene_zerg"));

		ModelBakery.registerItemVariants(ModItems.energy, 
				new ResourceLocation(Reference.MODID, "energy_pure"),
				new ResourceLocation(Reference.MODID, "energy_corrupted"),
				new ResourceLocation(Reference.MODID, "energy_void"));
		
		ModelBakery.registerItemVariants(ModItems.dust, 
				new ResourceLocation(Reference.MODID, "dust_iron"),
				new ResourceLocation(Reference.MODID, "dust_steel"),
				new ResourceLocation(Reference.MODID, "dust_carbon"));
		
		ModelBakery.registerItemVariants(ModItems.essence, 
				new ResourceLocation(Reference.MODID, "essence_protoss"),
				new ResourceLocation(Reference.MODID, "essence_terran"),
				new ResourceLocation(Reference.MODID, "essence_zerg"));
		
		ModelBakery.registerItemVariants(ModItems.ingot, 
				new ResourceLocation(Reference.MODID, "ingot_copper"),
				new ResourceLocation(Reference.MODID, "ingot_alien"),
				new ResourceLocation(Reference.MODID, "ingot_aliendark"),
				new ResourceLocation(Reference.MODID, "ingot_titanium"),
				new ResourceLocation(Reference.MODID, "ingot_steel"));
		
		ModelBakery.registerItemVariants(ModItems.coord, 
				new ResourceLocation(Reference.MODID, "coordinate_char"),
				new ResourceLocation(Reference.MODID, "coordinate_shakuras"));
		
		ModelBakery.registerItemVariants(ModItems.psiBladeFocuserUncharged, 
				new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_dark"));
		
		ModelBakery.registerItemVariants(ModItems.crystal, 
				new ResourceLocation(Reference.MODID, "crystal_khaydarin"),
				new ResourceLocation(Reference.MODID, "crystal_bloodshard"),
				new ResourceLocation(Reference.MODID, "crystal_uraj"));
		
		ModelBakery.registerItemVariants(ModItems.c14Parts, 
				new ResourceLocation(Reference.MODID, "part_c14_gauss_body"),
				new ResourceLocation(Reference.MODID, "part_c14_gauss_barrel"),
				new ResourceLocation(Reference.MODID, "part_c14_gauss_grip"));
		
		ModelBakery.registerItemVariants(ModItems.bullet, 
				new ResourceLocation(Reference.MODID, "bullet_rifle_c14_gauss"));
		
		ModelBakery.registerItemVariants(ModItems.zergCarapace, 
				new ResourceLocation(Reference.MODID, "zerg_icarapace_t1"),
				new ResourceLocation(Reference.MODID, "zerg_icarapace_t2"),
				new ResourceLocation(Reference.MODID, "zerg_icarapace_t3"));
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL),
				new ResourceLocation(Reference.MODID, "protoss_metal_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_metal_dark"),
				new ResourceLocation(Reference.MODID, "protoss_metal_green"),
				new ResourceLocation(Reference.MODID, "protoss_metal_blue"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PYLON_CRYSTAL),
				new ResourceLocation(Reference.MODID, "crystal_pure"),
				new ResourceLocation(Reference.MODID, "crystal_dark"),
				new ResourceLocation(Reference.MODID, "crystal_void"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_CARAPACE),
				new ResourceLocation(Reference.MODID, "zerg_carapace_t1"),
				new ResourceLocation(Reference.MODID, "zerg_carapace_t2"),
				new ResourceLocation(Reference.MODID, "zerg_carapace_t3"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_FLESH),
				new ResourceLocation(Reference.MODID, "zerg_flesh_purple"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_brown"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_pink"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_blue"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_cyan"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_gray"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_green"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_lightblue"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_lime"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_magenta"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_orange"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_red"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_silver"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_white"),
				new ResourceLocation(Reference.MODID, "zerg_flesh_yellow"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.DYED_IRON),
				new ResourceLocation(Reference.MODID, "dyed_iron_purple"),
				new ResourceLocation(Reference.MODID, "dyed_iron_brown"),
				new ResourceLocation(Reference.MODID, "dyed_iron_pink"),
				new ResourceLocation(Reference.MODID, "dyed_iron_blue"),
				new ResourceLocation(Reference.MODID, "dyed_iron_cyan"),
				new ResourceLocation(Reference.MODID, "dyed_iron_gray"),
				new ResourceLocation(Reference.MODID, "dyed_iron_green"),
				new ResourceLocation(Reference.MODID, "dyed_iron_lightblue"),
				new ResourceLocation(Reference.MODID, "dyed_iron_lime"),
				new ResourceLocation(Reference.MODID, "dyed_iron_magenta"),
				new ResourceLocation(Reference.MODID, "dyed_iron_orange"),
				new ResourceLocation(Reference.MODID, "dyed_iron_red"),
				new ResourceLocation(Reference.MODID, "dyed_iron_silver"),
				new ResourceLocation(Reference.MODID, "dyed_iron_yellow"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_METAL),
				new ResourceLocation(Reference.MODID, "compressed_metal_copper"),
				new ResourceLocation(Reference.MODID, "compressed_metal_steel"),
				new ResourceLocation(Reference.MODID, "compressed_metal_titanium"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_MINERAL),
				new ResourceLocation(Reference.MODID, "compressed_mineral_blue"),
				new ResourceLocation(Reference.MODID, "compressed_mineral_rich"));

	}
}

package scmc.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scmc.StarcraftCreativeTabs;
import scmc.StarcraftSoundEvents;
import scmc.achievement.Achievements;
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
import scmc.entity.EntityProtossReaver;
import scmc.entity.EntityScarab;
import scmc.entity.EntitySpiderMine;
import scmc.entity.EntityZealot;
import scmc.entity.EntityZergling;
import scmc.entity.EntityZerglingRaptor;
import scmc.entity.EntityZerglingSC2;
import scmc.entity.EntityZerglingSwarmling;
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
import scmc.model.ModelProtossReaver;
import scmc.model.ModelScarab;
import scmc.model.ModelSpiderMine;
import scmc.model.ModelZealot;
import scmc.model.ModelZergling;
import scmc.model.ModelZerglingRaptor;
import scmc.model.ModelZerglingSC2;
import scmc.model.ModelZerglingSwarmling;
import scmc.renderer.RenderBroodling;
import scmc.renderer.RenderBrutalisk;
import scmc.renderer.RenderCivilian;
import scmc.renderer.RenderDarkProbe;
import scmc.renderer.RenderDarkTemplar;
import scmc.renderer.RenderHydralisk;
import scmc.renderer.RenderLarva;
import scmc.renderer.RenderLarvaCocoon;
import scmc.renderer.RenderProbe;
import scmc.renderer.RenderProtossReaver;
import scmc.renderer.RenderScarab;
import scmc.renderer.RenderSpiderMine;
import scmc.renderer.RenderZealot;
import scmc.renderer.RenderZergling;
import scmc.renderer.RenderZerglingRaptor;
import scmc.renderer.RenderZerglingSC2;
import scmc.renderer.RenderZerglingSwarmling;
import scmc.tileentity.ModTileEntities;
import scmc.worldgen.DimensionRegistry;
import scmc.worldgen.SCWorldGen;
import scmc.worldgen.biome.BiomesSC;

@SuppressWarnings({ "deprecation" })
public class ClientProxy extends ServerProxy {

	// TODO: get all of this into registry
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class,
				new RenderZealot<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZealot(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class,
				new RenderProbe<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProtossReaver.class, new RenderProtossReaver<Object>(
				Minecraft.getMinecraft().getRenderManager(), new ModelProtossReaver(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class,
				new RenderScarab<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar<Object>(
				Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class,
				new RenderDarkProbe<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class,
				new RenderBrutalisk<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 3.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class,
				new RenderHydralisk<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class,
				new RenderZergling<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSC2.class, new RenderZerglingSC2<Object>(
				Minecraft.getMinecraft().getRenderManager(), new ModelZerglingSC2(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingRaptor.class, new RenderZerglingRaptor<Object>(
				Minecraft.getMinecraft().getRenderManager(), new ModelZerglingRaptor(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSwarmling.class,
				new RenderZerglingSwarmling<Object>(Minecraft.getMinecraft().getRenderManager(),
						new ModelZerglingSwarmling(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class,
				new RenderLarva<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, new RenderLarvaCocoon<Object>(
				Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class,
				new RenderBroodling<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f));

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class,
				new RenderCivilian<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpiderMine.class,
				new RenderSpiderMine<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelSpiderMine(), 0.4f));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();
		ModFluids.register();
		ModBlocks.init();
		ModItems.init();
		ModItems.register(); // Does stuff, including bucket-y stuff
		StarcraftCreativeTabs.setMisc(); // Add the misc tab after doing
											// bucket-y stuff
		UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.acid).getItem()
				.setCreativeTab(StarcraftCreativeTabs.MISCELLANEOUS);

		UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, ModFluids.blood).getItem()
				.setCreativeTab(StarcraftCreativeTabs.MISCELLANEOUS);

		ModItems.registerRenders();
		ModMaterials.preInit();
		ModTileEntities.preInit();
		FuelHandler.preInit();
		ModBlocks.registerModels();
		SCWorldGen.preInit();
		ModEntities.registerEntities();
		StarcraftSoundEvents.registerSounds();
		BiomesSC.init();
		DimensionRegistry.mainRegistry();
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ModEntities.setEntityToSpawn();
		ModEntities.generateSpawnEgg();
		registerEntityRenders();
		Achievements.init();
	}

	@Override
	public void registerModelBakeryStuff() {
		ModelBakery.registerItemVariants(ModItems.mineralShard, new ResourceLocation(Reference.MODID, "shard_blue"),
				new ResourceLocation(Reference.MODID, "shard_rich"));

		ModelBakery.registerItemVariants(ModItems.vespene, new ResourceLocation(Reference.MODID, "vespene_raw"),
				new ResourceLocation(Reference.MODID, "vespene_protoss"),
				new ResourceLocation(Reference.MODID, "vespene_terran"),
				new ResourceLocation(Reference.MODID, "vespene_zerg"));

		ModelBakery.registerItemVariants(ModItems.energy, new ResourceLocation(Reference.MODID, "energy_pure"),
				new ResourceLocation(Reference.MODID, "energy_corrupted"),
				new ResourceLocation(Reference.MODID, "energy_void"));

		ModelBakery.registerItemVariants(ModItems.dust, new ResourceLocation(Reference.MODID, "dust_iron"),
				new ResourceLocation(Reference.MODID, "dust_steel"),
				new ResourceLocation(Reference.MODID, "dust_carbon"));

		ModelBakery.registerItemVariants(ModItems.essence, new ResourceLocation(Reference.MODID, "essence_protoss"),
				new ResourceLocation(Reference.MODID, "essence_terran"),
				new ResourceLocation(Reference.MODID, "essence_zerg"));

		ModelBakery.registerItemVariants(ModItems.ingot1, new ResourceLocation(Reference.MODID, "ingot1_copper"),
				new ResourceLocation(Reference.MODID, "ingot1_alien"),
				new ResourceLocation(Reference.MODID, "ingot1_aliendark"),
				new ResourceLocation(Reference.MODID, "ingot1_titanium"),
				new ResourceLocation(Reference.MODID, "ingot1_steel"));

		ModelBakery.registerItemVariants(ModItems.ingot2, new ResourceLocation(Reference.MODID, "ingot2_copper"),
				new ResourceLocation(Reference.MODID, "ingot2_alien"),
				new ResourceLocation(Reference.MODID, "ingot2_aliendark"),
				new ResourceLocation(Reference.MODID, "ingot2_titanium"),
				new ResourceLocation(Reference.MODID, "ingot2_steel"));

		ModelBakery.registerItemVariants(ModItems.ingot3, new ResourceLocation(Reference.MODID, "ingot3_copper"),
				new ResourceLocation(Reference.MODID, "ingot3_alien"),
				new ResourceLocation(Reference.MODID, "ingot3_aliendark"),
				new ResourceLocation(Reference.MODID, "ingot3_titanium"),
				new ResourceLocation(Reference.MODID, "ingot3_steel"));

		ModelBakery.registerItemVariants(ModItems.coord, new ResourceLocation(Reference.MODID, "coordinate_char"),
				new ResourceLocation(Reference.MODID, "coordinate_shakuras"));

		ModelBakery.registerItemVariants(ModItems.psiBladeFocuserUncharged,
				new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_dark"));

		ModelBakery.registerItemVariants(ModItems.crystal, new ResourceLocation(Reference.MODID, "crystal_khaydarin"),
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

		ModelBakery.registerItemVariants(ModItems.MUTALISK_WING,
				new ResourceLocation(Reference.MODID, "mutalisk_wing_purple"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_brown"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_pink"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_blue"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_cyan"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_gray"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_green"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_lightblue"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_lime"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_magenta"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_orange"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_red"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_silver"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_white"),
				new ResourceLocation(Reference.MODID, "mutalisk_wing_yellow"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T1),
				new ResourceLocation(Reference.MODID, "protoss_metal_t1_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t1_dark"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t1_green"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t1_blue"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T2),
				new ResourceLocation(Reference.MODID, "protoss_metal_t2_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t2_dark"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t2_green"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t2_blue"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T3),
				new ResourceLocation(Reference.MODID, "protoss_metal_t3_aiur"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t3_dark"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t3_green"),
				new ResourceLocation(Reference.MODID, "protoss_metal_t3_blue"));

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

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_FLESH),
				new ResourceLocation(Reference.MODID, "paristeel_purple"),
				new ResourceLocation(Reference.MODID, "paristeel_brown"),
				new ResourceLocation(Reference.MODID, "paristeel_pink"),
				new ResourceLocation(Reference.MODID, "paristeel_blue"),
				new ResourceLocation(Reference.MODID, "paristeel_cyan"),
				new ResourceLocation(Reference.MODID, "paristeel_gray"),
				new ResourceLocation(Reference.MODID, "paristeel_green"),
				new ResourceLocation(Reference.MODID, "paristeel_lightblue"),
				new ResourceLocation(Reference.MODID, "paristeel_lime"),
				new ResourceLocation(Reference.MODID, "paristeel_magenta"),
				new ResourceLocation(Reference.MODID, "paristeel_orange"),
				new ResourceLocation(Reference.MODID, "paristeel_red"),
				new ResourceLocation(Reference.MODID, "paristeel_silver"),
				new ResourceLocation(Reference.MODID, "paristeel_white"),
				new ResourceLocation(Reference.MODID, "paristeel_yellow"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_METAL_T1),
				new ResourceLocation(Reference.MODID, "comp_metal_copper"),
				new ResourceLocation(Reference.MODID, "comp_metal_steel"),
				new ResourceLocation(Reference.MODID, "comp_metal_titanium"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.NEOSTEEL_METAL),
				new ResourceLocation(Reference.MODID, "neosteel_base"),
				new ResourceLocation(Reference.MODID, "neosteel_frame"));

		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_MINERAL),
				new ResourceLocation(Reference.MODID, "comp_mineral_blue"),
				new ResourceLocation(Reference.MODID, "comp_mineral_rich"));

		ModelBakery.registerItemVariants((ModItems.SPAWNER), new ResourceLocation(Reference.MODID, "spawner_pylon"),
				new ResourceLocation(Reference.MODID, "spawner_nexus"),
				new ResourceLocation(Reference.MODID, "spawner_assimilator"),
				new ResourceLocation(Reference.MODID, "spawner_cyberneticscore"),
				new ResourceLocation(Reference.MODID, "spawner_forge"));

	}
}
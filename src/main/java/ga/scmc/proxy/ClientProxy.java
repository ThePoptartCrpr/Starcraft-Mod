package ga.scmc.proxy;

import ga.scmc.StarcraftSoundEvents;
import ga.scmc.achievement.Achievements;
import ga.scmc.blocks.ModBlocks;
import ga.scmc.blocks.metablocks.ModMetaBlocks;
import ga.scmc.entity.ModEntities;
import ga.scmc.entity.living.EntityBroodling;
import ga.scmc.entity.living.EntityBrutalisk;
import ga.scmc.entity.living.EntityCivilian;
import ga.scmc.entity.living.EntityDarkProbe;
import ga.scmc.entity.living.EntityDarkTemplar;
import ga.scmc.entity.living.EntityHydralisk;
import ga.scmc.entity.living.EntityInfestedCivilian;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.entity.living.EntityLarvaCocoon;
import ga.scmc.entity.living.EntityOverlord;
import ga.scmc.entity.living.EntityProbe;
import ga.scmc.entity.living.EntityProtossReaver;
import ga.scmc.entity.living.EntityScarab;
import ga.scmc.entity.living.EntitySpiderMine;
import ga.scmc.entity.living.EntityZealot;
import ga.scmc.entity.living.EntityZergling;
import ga.scmc.entity.living.EntityZerglingBoost;
import ga.scmc.entity.living.EntityZerglingRaptor;
import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.entity.living.EntityZerglingSwarmling;
import ga.scmc.fluids.ModFluids;
import ga.scmc.handlers.FuelHandler;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
import ga.scmc.lib.StarcraftConfig;
import ga.scmc.material.ModMaterials;
import ga.scmc.model.ModelBroodling;
import ga.scmc.model.ModelBrutalisk;
import ga.scmc.model.ModelCivilian;
import ga.scmc.model.ModelDarkProbe;
import ga.scmc.model.ModelDarkTemplar;
import ga.scmc.model.ModelHydralisk;
import ga.scmc.model.ModelInfestedCivilian;
import ga.scmc.model.ModelKhaydarinAmulet;
import ga.scmc.model.ModelLarva;
import ga.scmc.model.ModelLarvaCocoon;
import ga.scmc.model.ModelOverlord;
import ga.scmc.model.ModelProbe;
import ga.scmc.model.ModelProtossReaver;
import ga.scmc.model.ModelScarab;
import ga.scmc.model.ModelSpiderMine;
import ga.scmc.model.ModelZealot;
import ga.scmc.model.ModelZergling;
import ga.scmc.model.ModelZerglingBoost;
import ga.scmc.model.ModelZerglingRaptor;
import ga.scmc.model.ModelZerglingSC2;
import ga.scmc.model.ModelZerglingSwarmling;
import ga.scmc.recipes.ShapelessRecipes;
import ga.scmc.recipes.SimpleRecipes;
import ga.scmc.recipes.SmeltingRecipes;
import ga.scmc.renderer.entity.RenderBroodling;
import ga.scmc.renderer.entity.RenderBrutalisk;
import ga.scmc.renderer.entity.RenderCivilian;
import ga.scmc.renderer.entity.RenderDarkProbe;
import ga.scmc.renderer.entity.RenderDarkTemplar;
import ga.scmc.renderer.entity.RenderHydralisk;
import ga.scmc.renderer.entity.RenderInfestedCivilian;
import ga.scmc.renderer.entity.RenderLarva;
import ga.scmc.renderer.entity.RenderLarvaCocoon;
import ga.scmc.renderer.entity.RenderOverlord;
import ga.scmc.renderer.entity.RenderProbe;
import ga.scmc.renderer.entity.RenderProtossReaver;
import ga.scmc.renderer.entity.RenderScarab;
import ga.scmc.renderer.entity.RenderSpiderMine;
import ga.scmc.renderer.entity.RenderZealot;
import ga.scmc.renderer.entity.RenderZergling;
import ga.scmc.renderer.entity.RenderZerglingBoost;
import ga.scmc.renderer.entity.RenderZerglingRaptor;
import ga.scmc.renderer.entity.RenderZerglingSC2;
import ga.scmc.renderer.entity.RenderZerglingSwarmling;
import ga.scmc.worldgen.BiomesSC;
import ga.scmc.worldgen.DimensionRegistry;
import ga.scmc.worldgen.SCWorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("deprecation") // And whatever the nullarg
									// suppression is
public class ClientProxy implements IProxy {
	private void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, new RenderZealot<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZealot(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityProtossReaver.class, new RenderProtossReaver(Minecraft.getMinecraft().getRenderManager(), new ModelProtossReaver(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityScarab.class, new RenderScarab(Minecraft.getMinecraft().getRenderManager(), new ModelScarab(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class, new RenderDarkProbe(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f));
		// RenderingRegistry.registerEntityRenderingHandler(EntitySentry.class,
		// new RenderSentry(Minecraft.getMinecraft().getRenderManager(), new
		// ModelSentry(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class, new RenderBrutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 3.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHydralisk.class, new RenderHydralisk<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelHydralisk(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class, new RenderZergling(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSC2.class, new RenderZerglingSC2<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingSC2(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingRaptor.class, new RenderZerglingRaptor<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingRaptor(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingSwarmling.class, new RenderZerglingSwarmling<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingSwarmling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZerglingBoost.class, new RenderZerglingBoost<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelZerglingBoost(), 0.4f));
		// RenderingRegistry.registerEntityRenderingHandler(EntityQueen.class,
		// new RenderQueen(Minecraft.getMinecraft().getRenderManager(), new
		// ModelQueen(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityOverlord.class, new RenderOverlord(Minecraft.getMinecraft().getRenderManager(), new ModelOverlord(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva<Object>(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, new RenderLarvaCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class, new RenderBroodling(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityInfestedCivilian.class, new RenderInfestedCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelInfestedCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class, new RenderCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpiderMine.class, new RenderSpiderMine(Minecraft.getMinecraft().getRenderManager(), new ModelSpiderMine(), 0.4f));
	}

	// Is this necessary?
	@Override
	public ModelBiped getArmorModel(int id) {
		ModelKhaydarinAmulet armorASAChest = new ModelKhaydarinAmulet(1.0f);
		ModelKhaydarinAmulet armorASA = new ModelKhaydarinAmulet(0.5f);

		// And switch on the ID in your getArmorModel!
		switch (id) {
		case 0:
			return armorASAChest;
		case 1:
			return armorASA;
		default:
			return null;
		}
	}

	// public ModelBiped getZergArmorT1Model(int id) {
	// ModelZergArmorT1 armorZerg = new ModelZergArmorT1(1.0f);
	// //And switch on the ID in your getArmorModel!
	// switch(id) {
	// case 0: return armorZerg;
	// case 1: return armorZerg;
	// case 2: return armorZerg;
	// case 3: return armorZerg;
	// default: return null;
	// }
	// }

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		StarcraftConfig.preInit();
		ModFluids.register();
		ModBlocks.init();
		ModItems.init();
		ModItems.register(); // Does stuff, including bucket-y stuff
		ModItems.registerRenders();
		ModMaterials.preInit();
		FuelHandler.preInit();
		ModBlocks.registerModels();
		SCWorldGen.preInit();
		ModEntities.registerEntities();
		StarcraftSoundEvents.registerSounds();
		BiomesSC.init();
		DimensionRegistry.registerDimensions();
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ModEntities.setEntityToSpawn();
		ModEntities.generateSpawnEgg();
		registerEntityRenders();
		Achievements.init();
		SimpleRecipes.init();
		ShapelessRecipes.init();
		SmeltingRecipes.init();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
	} // Necessary for ClientProxy?

	@Override
	public void registerItemVariants() {
		ModelBakery.registerItemVariants(ModItems.MINERAL_SHARD, new ResourceLocation(Reference.MODID, "shard_blue"), new ResourceLocation(Reference.MODID, "shard_rich"));
		ModelBakery.registerItemVariants(ModItems.VESPENE, new ResourceLocation(Reference.MODID, "vespene_raw"), new ResourceLocation(Reference.MODID, "vespene_protoss"), new ResourceLocation(Reference.MODID, "vespene_terran"), new ResourceLocation(Reference.MODID, "vespene_zerg"));
		ModelBakery.registerItemVariants(ModItems.ENERGY, new ResourceLocation(Reference.MODID, "energy_pure"), new ResourceLocation(Reference.MODID, "energy_corrupted"), new ResourceLocation(Reference.MODID, "energy_void"));
		ModelBakery.registerItemVariants(ModItems.DUST, new ResourceLocation(Reference.MODID, "dust_iron"), new ResourceLocation(Reference.MODID, "dust_steel"), new ResourceLocation(Reference.MODID, "dust_carbon"));
		ModelBakery.registerItemVariants(ModItems.ESSENCE, new ResourceLocation(Reference.MODID, "essence_protoss"), new ResourceLocation(Reference.MODID, "essence_terran"), new ResourceLocation(Reference.MODID, "essence_zerg"));
		ModelBakery.registerItemVariants(ModItems.INGOT, new ResourceLocation(Reference.MODID, "ingot_copper"), new ResourceLocation(Reference.MODID, "ingot_titanium"), new ResourceLocation(Reference.MODID, "ingot_steel"));
		ModelBakery.registerItemVariants(ModItems.PROTOSS_INGOT, new ResourceLocation(Reference.MODID, "pingot_khalai"), new ResourceLocation(Reference.MODID, "pingot_dark"));
		ModelBakery.registerItemVariants(ModItems.COORDINATES, new ResourceLocation(Reference.MODID, "coordinate_char"), new ResourceLocation(Reference.MODID, "coordinate_shakuras"));
		ModelBakery.registerItemVariants(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_aiur"), new ResourceLocation(Reference.MODID, "protoss_psiblade_focuser_uncharged_dark"));
		ModelBakery.registerItemVariants(ModItems.PROTOSS_CRYSTAL, new ResourceLocation(Reference.MODID, "crystal_khaydarin"), new ResourceLocation(Reference.MODID, "crystal_bloodshard"), new ResourceLocation(Reference.MODID, "crystal_uraj"));
		ModelBakery.registerItemVariants(ModItems.C14_PARTS, new ResourceLocation(Reference.MODID, "part_c14_gauss_body"), new ResourceLocation(Reference.MODID, "part_c14_gauss_barrel"), new ResourceLocation(Reference.MODID, "part_c14_gauss_grip"));
		ModelBakery.registerItemVariants(ModItems.BULLET, new ResourceLocation(Reference.MODID, "bullet_rifle_c14_gauss"));
		ModelBakery.registerItemVariants(ModItems.ZERG_CARAPACE, new ResourceLocation(Reference.MODID, "zerg_icarapace_t1"), new ResourceLocation(Reference.MODID, "zerg_icarapace_t2"), new ResourceLocation(Reference.MODID, "zerg_icarapace_t3"));
		// ModelBakery.registerItemVariants(ModItems.MUTALISK_WING, new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_purple"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_brown"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_pink"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_blue"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_cyan"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_gray"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_green"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_lightblue"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_lime"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_magenta"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_orange"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_red"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_silver"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_white"), new
		// ResourceLocation(Reference.MODID, "mutalisk_wing_yellow"));
		ModelBakery.registerItemVariants(ModItems.PROTOSS_ARMOR_PIECES, new ResourceLocation(Reference.MODID, "ppieces_knodes"), new ResourceLocation(Reference.MODID, "ppieces_wmounts"), new ResourceLocation(Reference.MODID, "ppieces_arch"), new ResourceLocation(Reference.MODID, "ppieces_guard"), new ResourceLocation(Reference.MODID, "ppieces_dark_knodes"), new ResourceLocation(Reference.MODID, "ppieces_dark_wmounts"), new ResourceLocation(Reference.MODID, "ppieces_dark_arch"), new ResourceLocation(Reference.MODID, "ppieces_dark_guard"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T1), new ResourceLocation(Reference.MODID, "protoss_metal_t1_aiur"), new ResourceLocation(Reference.MODID, "protoss_metal_t1_dark"), new ResourceLocation(Reference.MODID, "protoss_metal_t1_green"), new ResourceLocation(Reference.MODID, "protoss_metal_t1_blue"), new ResourceLocation(Reference.MODID, "protoss_metal_t1_red"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T2), new ResourceLocation(Reference.MODID, "protoss_metal_t2_aiur"), new ResourceLocation(Reference.MODID, "protoss_metal_t2_dark"), new ResourceLocation(Reference.MODID, "protoss_metal_t2_green"), new ResourceLocation(Reference.MODID, "protoss_metal_t2_blue"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PROTOSS_METAL_T3), new ResourceLocation(Reference.MODID, "protoss_metal_t3_aiur"), new ResourceLocation(Reference.MODID, "protoss_metal_t3_dark"), new ResourceLocation(Reference.MODID, "protoss_metal_t3_green"), new ResourceLocation(Reference.MODID, "protoss_metal_t3_blue"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.PYLON_CRYSTAL), new ResourceLocation(Reference.MODID, "crystal_pure"), new ResourceLocation(Reference.MODID, "crystal_dark"), new ResourceLocation(Reference.MODID, "crystal_void"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_CARAPACE), new ResourceLocation(Reference.MODID, "zerg_carapace_t1"), new ResourceLocation(Reference.MODID, "zerg_carapace_t2"), new ResourceLocation(Reference.MODID, "zerg_carapace_t3"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_FLESH), new ResourceLocation(Reference.MODID, "zerg_flesh_purple"), new ResourceLocation(Reference.MODID, "zerg_flesh_brown"), new ResourceLocation(Reference.MODID, "zerg_flesh_pink"), new ResourceLocation(Reference.MODID, "zerg_flesh_blue"), new ResourceLocation(Reference.MODID, "zerg_flesh_cyan"), new ResourceLocation(Reference.MODID, "zerg_flesh_gray"), new ResourceLocation(Reference.MODID, "zerg_flesh_green"), new ResourceLocation(Reference.MODID, "zerg_flesh_lightblue"), new ResourceLocation(Reference.MODID, "zerg_flesh_lime"), new ResourceLocation(Reference.MODID, "zerg_flesh_magenta"), new ResourceLocation(Reference.MODID, "zerg_flesh_orange"), new ResourceLocation(Reference.MODID, "zerg_flesh_red"), new ResourceLocation(Reference.MODID, "zerg_flesh_silver"), new ResourceLocation(Reference.MODID, "zerg_flesh_white"), new ResourceLocation(Reference.MODID, "zerg_flesh_yellow"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.DYED_IRON), new ResourceLocation(Reference.MODID, "dyed_iron_purple"), new ResourceLocation(Reference.MODID, "dyed_iron_brown"), new ResourceLocation(Reference.MODID, "dyed_iron_pink"), new ResourceLocation(Reference.MODID, "dyed_iron_blue"), new ResourceLocation(Reference.MODID, "dyed_iron_cyan"), new ResourceLocation(Reference.MODID, "dyed_iron_gray"), new ResourceLocation(Reference.MODID, "dyed_iron_green"), new ResourceLocation(Reference.MODID, "dyed_iron_lightblue"), new ResourceLocation(Reference.MODID, "dyed_iron_lime"), new ResourceLocation(Reference.MODID, "dyed_iron_magenta"), new ResourceLocation(Reference.MODID, "dyed_iron_orange"), new ResourceLocation(Reference.MODID, "dyed_iron_red"), new ResourceLocation(Reference.MODID, "dyed_iron_silver"), new ResourceLocation(Reference.MODID, "dyed_iron_yellow"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.ZERG_FLESH), new ResourceLocation(Reference.MODID, "paristeel_purple"), new ResourceLocation(Reference.MODID, "paristeel_brown"), new ResourceLocation(Reference.MODID, "paristeel_pink"), new ResourceLocation(Reference.MODID, "paristeel_blue"), new ResourceLocation(Reference.MODID, "paristeel_cyan"), new ResourceLocation(Reference.MODID, "paristeel_gray"), new ResourceLocation(Reference.MODID, "paristeel_green"), new ResourceLocation(Reference.MODID, "paristeel_lightblue"), new ResourceLocation(Reference.MODID, "paristeel_lime"), new ResourceLocation(Reference.MODID, "paristeel_magenta"), new ResourceLocation(Reference.MODID, "paristeel_orange"), new ResourceLocation(Reference.MODID, "paristeel_red"), new ResourceLocation(Reference.MODID, "paristeel_silver"), new ResourceLocation(Reference.MODID, "paristeel_white"), new ResourceLocation(Reference.MODID, "paristeel_yellow"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_METAL_T1), new ResourceLocation(Reference.MODID, "comp_metal_copper"), new ResourceLocation(Reference.MODID, "comp_metal_steel"), new ResourceLocation(Reference.MODID, "comp_metal_titanium"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.NEOSTEEL_METAL), new ResourceLocation(Reference.MODID, "neosteel_base"), new ResourceLocation(Reference.MODID, "neosteel_frame"));
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModMetaBlocks.COMP_MINERAL), new ResourceLocation(Reference.MODID, "comp_mineral_blue"), new ResourceLocation(Reference.MODID, "comp_mineral_rich"));
	}

	@Override
	public void registerTileEntities() {

	}
}

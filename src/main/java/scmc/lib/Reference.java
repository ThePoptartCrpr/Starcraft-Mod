package scmc.lib;

import net.minecraft.util.ResourceLocation;

public class Reference {
	public static final String MODID = "starcraft";
	public static final String CLIENT_SIDE_PROXY = "scmc.proxy.ClientProxy";
	public static final String SERVER_SIDE_PROXY = "scmc.proxy.ServerProxy";
	public static final String RL_BASE = MODID + ":";
	public static final String UN_BASE = MODID + "_";
	
	public static enum ModItems {
		ITEM_MINERAL_SHARD("mineralShard", "mineral_shard"),
		ITEM_RICHMINERAL_SHARD("mineralRichShard", "mineral_rich_shard"),
		ITEM_VESPENE("vespene"),
		ITEM_PSIBLADEFOCUSER_UNCHARGED("protossPsiBladeFocuserUncharged", "protoss_psiblade_focuser_uncharged"),
		ITEM_DARK_PSIBLADEFOCUSER_UNCHARGED("focuserDarkUnchargedPsiBlade", "focuser_dark_uncharged_psi_blade"),
		ITEM_ENERGY("energy"),
		ITEM_PROTOSS_ARTIFACT("protossArtifact", "protoss_artifact"),
		ITEM_URAJ("uraj"),
		ITEM_ESSENCE("essence"),
		ITEM_PART_C14_GAUSS("partC14Gauss", "part_c14_gauss"),
		ITEM_INGOT("ingot"),
		ITEM_DUST("dust"),
		ITEM_COORDINATE("coordinate"),
		WEAPON_RIFLE_C14_GAUSS("rifleC14Gauss", "weapon_rifle_c14_gauss"),
		BULLET_RIFLE_C14_GAUSS("bulletRifleC14Gauss", "bullet_rifle_c14_gauss"),
		ITEM_ZERG_CARAPACE("zergCarapace", "zerg_carapace"),
		ITEM_ZERG_CREEP_RESIN("zergCreepResin", "zerg_creep_resin"),
		ITEM_ZERG_ORGANIC_TISSUE("zergOrganicTissue", "zerg_organic_tissue"),
		ITEM_BUCKET_ACID("bucketAcid", "bucket_acid"),
		ITEM_BUCKET_BLOOD("bucketBlood", "bucket_blood"),
		ITEM_PROTOSS_MODULE("protossModule", "protoss_module"),
		ITEM_KEYSTONE("keystone", "keystone"),
		
		ARMOR_COPPER_HELMET("helmetCopper", "helmet_copper"),
		ARMOR_COPPER_CHESTPLATE("chestplateCopper", "chestplate_copper"),
		ARMOR_COPPER_LEGGINGS("LeggingsCopper", "leggings_copper"),
		ARMOR_COPPER_BOOTS("bootsCopper", "boots_copper");
		
		private String unlocalizedName;
		private String registryName;
		private ResourceLocation registryRL;
		
		private ModItems(String names) {
			this(names, names);
		}
		
		private ModItems(String unlocalizedName, String registryName) {
	        this.unlocalizedName = unlocalizedName;
	        this.registryName = registryName;
	        registryRL = new ResourceLocation(RL_BASE + registryName);
	    }
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public ResourceLocation getRegistryRL() {
            return registryRL;
        }
	}
	
	public static enum ModBlocks {
		ORE_COPPER_OW("overworldOreCopper", "overworld_ore_copper"),
		ORE_TITANIUM_OW("overworldOreTitanium", "overworld_ore_titanium"),
		ORE_URANIUM_OW("overworldOreUranium", "overworld_ore_uranium"),
		
		ORE_ALIEN_C("charOreAlien", "char_ore_alien"),
		ORE_COAL_C("charOreCoal", "char_ore_coal"),
		ORE_COPPER_C("charOreCopper", "char_ore_copper"),
		ORE_DIAMOND_C("charOreDiamond", "char_ore_diamond"),
		ORE_GOLD_C("charOreGold", "char_ore_gold"),
		ORE_IRON_C("charOreIron", "char_ore_iron"),
		ORE_LAPIS_C("charOreLapis", "char_ore_lapis"),
		ORE_MINERAL_C("charOreMineral", "char_ore_mineral"),
		ORE_REDSTONE_C("charOreRedstone", "char_ore_redstone"),
		ORE_RICHMINERAL_C("charOreMineralRich", "char_ore_mineral_rich"),
		ORE_TITANIUM_C("charOreTitanium", "char_ore_titanium"),
		ORE_URANIUM_C("charOreUranium", "char_ore_uranium"),
		
		ORE_ALIEN_S("shakurasOreAlien", "shakuras_ore_alien"),
		ORE_COAL_S("shakurasOreCoal", "shakuras_ore_coal"),
		ORE_COPPER_S("shakurasOreCopper", "shakuras_ore_copper"),
		ORE_DIAMOND_S("shakurasOreDiamond", "shakuras_ore_diamond"),
		ORE_GOLD_S("shakurasOreGold", "shakuras_ore_gold"),
		ORE_IRON_S("shakurasOreIron", "shakuras_ore_iron"),
		ORE_LAPIS_S("shakurasOreLapis", "shakuras_ore_lapis"),
		ORE_MINERAL_S("shakurasOreMineral", "shakuras_ore_mineral"),
		ORE_REDSTONE_S("shakurasOreRedstone", "shakuras_ore_redstone"),
		ORE_RICHMINERAL_S("shakurasOreMineralRich", "shakuras_ore_mineral_rich"),
		ORE_TITANIUM_S("shakurasOreTitanium", "shakuras_ore_titanium"),
		ORE_URANIUM_S("shakurasOreUranium", "shakuras_ore_uranium"),
		
		//TODO: all the unlocalized names need to be made to lowerCamelCase
		//Zerg Objects
		BLOCK_ZERG_CARAPACE("zergCarapace", "zerg_carapace"),
		BLOCK_ZERG_FLESH("zergFlesh", "zerg_flesh"),
		BLOCK_ZERG_CREEP("zergCreep", "zerg_creep"),
		BLOCK_KERATIN_CHUNK("zergKeratinChunk", "zerg_keratin_chunk"),
		
		//Protoss Objects
		BLOCK_COMP_METAL("block_comp_metal", "block_comp_metal"),
		BLOCK_PROTOSS_METAL("protossMetal", "protoss_metal"),
		BLOCK_PROTOSS_METAL_AIUR("protossMetalAiur", "protoss_metal_aiur"),
		BLOCK_PROTOSS_METAL_DARK("protossMetalDark", "protoss_metal_dark"),
		BLOCK_PROTOSS_METAL_BLUE("protossMetalBlue", "protoss_metal_blue"),
		BLOCK_PROTOSS_METAL_GREEN("protossMetalGreen", "protoss_metal_green"),
		BLOCK_PROTOSS_ENERGY_STABILIZER("block_protoss_energy_stabilizer", "block_protoss_energy_stabilizer"),
		BLOCK_PROTOSS_ENERGY_CHANNEL("block_protoss_energy_channel", "block_protoss_energy_channel"),
		BLOCK_PROTOSS_DARK_ENERGY_CHANNEL("protossEnergyChannel", "protoss_energy_channel"),
		BLOCK_PROTOSS_DARK_ENERGY_STABILIZER("block_protoss_dark_energy_stabilizer", "block_protoss_dark_energy_stabilizer"),
		BLOCK_ENERGY("block_energy", "block_energy"),
		BLOCK_VOID_ENERGY("block_void_energy", "block_void_energy"),
		BLOCK_CRYSTAL("block_crystal", "block_crystal"),
		BLOCK_WARP_GATE_WORMHOLE_C("charWarpGateWormhole", "char_warp_gate_wormhole"),
		BLOCK_WARP_GATE_WORMHOLE_OW("overworldWarpGateWormhole", "overworld_warp_gate_wormhole"),
		BLOCK_WARP_GATE_WORMHOLE_S("shakurasWarpGateWormhole", "shakuras_warp_gate_wormhole"),
		BLOCK_PROTOSS_WARP_PROJECTOR_C("charWarpGateProjector", "char_warp_projector"),
		BLOCK_PROTOSS_WARP_PROJECTOR_OW("overworldWarpGateProjector", "overworld_warp_projector"),
		BLOCK_PROTOSS_WARP_PROJECTOR_S("shakurasWarpGateProjector", "shakuras_warp_projector"),
		
		//Terran Objects
		BLOCK_DYED_IRON("block_dyed_iron", "block_dyed_iron"),
		
		//Neutral Objects
		BLOCK_COMP_MINERAL("block_comp_mineral", "block_comp_mineral"),
		BLOCK_MINERAL_FIELD("block_mineral_field", "block_mineral_field"),
		BLOCK_RICH_MINERAL_FIELD("block_rich_mineral_field", "block_rich_mineral_field"),
		
		BLOCK_VESPENE_GEYSER("geyserVespene", "geyser_vespene"),
		BLOCK_RICH_VESPENE_GEYSER("block_rich_vespene_geyser", "block_rich_vespene_geyser"),
		BLOCK_VESPENE_GEYSER_BASE("geyserVespeneBase", "geyser_vespene_base"),
		FLUID_ACID("fluid_acid", "fluid_acid"),
		FLUID_BLOOD("fluid_blood", "fluid_blood"),
		
		//Char Objects
		BLOCK_DIRT_C("charDirt", "char_dirt"),
		BLOCK_STONE_C("charStone", "char_stone"),
		BLOCK_COBBLESTONE_C("charCobblestone", "char_cobblestone"),
		BLOCK_ASH_C("charAsh", "char_ash"),
		BLOCK_MAGMA_C("charMagma", "char_magma"),
		BLOCK_VESPENE_GEYSER_C("block_vespene_geyser_c", "block_vespene_geyser_c"),
		BLOCK_RICH_VESPENE_GEYSER_C("block_rich_vespene_geyser_c", "block_rich_vespene_geyser_c"),
		BLOCK_VESPENE_GEYSER_BASE_C("charGeyserVespeneBase", "char_geyser_vespene_base"),
		
		//Shakuras Objects
		BLOCK_DIRT_S("shakurasDirt", "shakuras_dirt"),
		BLOCK_SAND_S("shakurasSand", "shakuras_sand"),
		BLOCK_STONE_S("shakurasStone", "shakuras_stone"),
		BLOCK_COBBLESTONE_S("shakurasStone", "shakuras_cobblestone"),
		BLOCK_VESPENE_GEYSER_S("block_vespene_geyser_s", "block_vespene_geyser_s"),
		BLOCK_RICH_VESPENE_GEYSER_S("block_rich_vespene_geyser_s", "block_rich_vespene_geyser_s"),
		BLOCK_VESPENE_GEYSER_BASE_S("shakurasGeyserVespeneBase", "shakuras_geyser_vespene_base"),
		
		
		//Dimension Objects
		BLOCK_DIM_PORTAL_C("charDimPortal", "char_dim_portal"),
		BLOCK_DIM_PORTAL_OW("overworldDimPortal", "overworld_dim_portal"),
		BLOCK_DIM_PORTAL_S("shakurasDimPortal", "shakuras_dim_portal"),
		
		//Core Blocks
		BLOCK_CORE_PYLON_VOID("corePylonVoid", "core_pylon_void"),
		BLOCK_CORE_PYLON_KHALAI("corePylonKhalai", "core_pylon_khalai"),
		BLOCK_CORE_PYLON_DARK("corePylonDark", "core_pylon_dark"),
		
		BLOCK_CORE_WARPGATE_DARK("coreWarpGateDark", "core_warpgate_dark"),
		BLOCK_CORE_WARPGATE_KHALAI("coreWarpGateKhalai", "core_warpgate_khalai"),
		BLOCK_CORE_WARPGATE_VOID("coreWarpGateVoid", "core_warpgate_void"),
		
		BLOCK_CORE_NEXUS_DARK("coreNexusDark", "core_nexus_dark"),
		BLOCK_CORE_NEXUS_KHALAI("coreNexusKhalai", "core_nexus_khalai"),
		BLOCK_CORE_NEXUS_VOID("coreNexusVoid", "core_nexus_void"),
		
		
		BLOCK_MOVING_LIGHT_SOURCE("movingLightSource", "moving_light_source");
		
		private String unlocalizedName;
		private String registryName;
		private ResourceLocation registryRL;
		
		ModBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
            registryRL = new ResourceLocation(RL_BASE + registryName);
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public ResourceLocation getRegistryRL() {
            return registryRL;
        }
	}
}

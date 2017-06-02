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
		ITEM_CRYSTAL("crystal"),
		ITEM_PROTOSS_ARTIFACT("protossArtifact", "protoss_artifact"),
		ITEM_URAJ("uraj"),
		ITEM_ESSENCE("essence"),
		ITEM_PART_C14_GAUSS("partC14", "part_c14"),
		ITEM_INGOT1("ingot1"),
		ITEM_INGOT2("ingot2"),
		ITEM_INGOT3("ingot3"),
		ITEM_DUST("dust"),
		ITEM_CREDIT("credit"),
		ITEM_COORDINATE("coordinate"),
		ITEM_HYDRALISK_NEEDLE("hydraliskNeedle", "hydralisk_needle"),
		ITEM_MUTALISK_WING("mutaliskWing", "mutalisk_wing"),
		ITEM_MUTALISK_TOOTH("mutaliskTooth", "mutalisk_tooth"),
		ITEM_ZERG_CARAPACE("zergICarapace", "zerg_icarapace"),
		ITEM_ZERG_CREEP_RESIN("zergCreepResin", "zerg_creep_resin"),
		ITEM_ZERG_ORGANIC_TISSUE("zergOrganicTissue", "zerg_organic_tissue"),
		ITEM_BUCKET_ACID("bucketAcid", "bucket_acid"),
		ITEM_BUCKET_BLOOD("bucketBlood", "bucket_blood"),
		ITEM_PROTOSS_MODULE("protossModule", "protoss_module"),
		ITEM_KEYSTONE("keystone", "keystone"),
		
		ITEM_SPAWNER("spawner"),
		
		TOOL_COPPER_PICKAXE("copperPickaxe", "copper_pickaxe"),
		TOOL_COPPER_AXE("copperAxe", "copper_axe"),
		TOOL_COPPER_SHOVEL("copperShovel", "copper_shovel"),
		TOOL_COPPER_HOE("copperHoe", "copper_hoe"),
		TOOL_STEEL_PICKAXE("steelPickaxe", "steel_pickaxe"),
		TOOL_STEEL_AXE("steelAxe", "steel_axe"),
		TOOL_STEEL_SHOVEL("steelShovel", "steel_shovel"),
		TOOL_STEEL_HOE("steelHoe", "steel_hoe"),
		TOOL_TITANIUM_PICKAXE("titaniumPickaxe", "titanium_pickaxe"),
		TOOL_TITANIUM_AXE("titaniumAxe", "titanium_axe"),
		TOOL_TITANIUM_SHOVEL("titaniumShovel", "titanium_shovel"),
		TOOL_TITANIUM_HOE("titaniumHoe", "titanium_hoe"),
		
		WEAPON_COPPER_SWORD("copperSword", "copper_sword"),
		WEAPON_TITANIUM_SWORD("titaniumSword", "titanium_sword"),
		WEAPON_STEEL_SWORD("steelSword", "steel_sword"),
		WEAPON_BALISONG("balisong"),
		WEAPON_MILITARY_KNIFE("militaryKnife", "military_knife"),
		WEAPON_MONOMOLECULAR_BLADE("monomolecularBlade", "monomolecular_blade"),
		WEAPON_PSIBLADE("psiBlade", "psi_blade"),
		WEAPON_DARK_PSIBLADE("darkPsiBlade","dark_psi_blade"),
		WEAPON_WARP_BLADE("warpBlade", "warp_blade"),
		WEAPON_DARK_WARP_BLADE("darkWarpBlade", "dark_warp_blade"),
		WEAPON_MASTER_PSI_BLADE("masterPsiBlade", "master_psi_blade"),
		WEAPON_RIFLE_C14_GAUSS("rifleC14", "rifle_c14"),
		BULLET_RIFLE_C14_GAUSS("bulletC14", "bullet_c14"),
		
		ARMOR_COPPER_HELMET("copperHelmet", "copper_helmet"),
		ARMOR_COPPER_CHESTPLATE("copperChestplate", "copper_chestplate"),
		ARMOR_COPPER_LEGGINGS("copperLeggings", "copper_leggings"),
		ARMOR_COPPER_BOOTS("copperBoots", "copper_boots"),
		ARMOR_STEEL_HELMET("steelHelmet", "steel_helmet"),
		ARMOR_STEEL_CHESTPLATE("steelChestplate", "steel_chestplate"),
		ARMOR_STEEL_LEGGINGS("steelLeggings", "steel_leggings"),
		ARMOR_STEEL_BOOTS("steelBoots", "steel_boots"),
		ARMOR_TITANIUM_HELMET("titaniumHelmet", "titanium_helmet"),
		ARMOR_TITANIUM_CHESTPLATE("titaniumChestplate", "titanium_chestplate"),
		ARMOR_TITANIUM_LEGGINGS("titaniumLeggings", "titanium_leggings"),
		ARMOR_TITANIUM_BOOTS("titaniumBoots", "titanium_boots"),
		ARMOR_GHOST_HELMET("ghostHelmet", "ghost_helmet"),
		ARMOR_GHOST_CHESTPLATE("ghostChestplate", "ghost_chestplate"),
		ARMOR_GHOST_LEGGINGS("ghostLeggings", "ghost_leggings"),
		ARMOR_GHOST_BOOTS("ghostBoots", "ghost_boots"),
		
		ARMOR_ADEPT_HELMET_T1("adeptHelmetT1", "adept_helmet_t1"),
		ARMOR_ADEPT_CHESTPLATE_T1("adeptChestplateT1", "adept_chestplate_t1"),
		ARMOR_ADEPT_LEGGINGS_T1("adeptLeggingsT1", "adept_leggings_t1"),
		ARMOR_ADEPT_BOOTS_T1("adeptBootsT1", "adept_boots_t1"),
		ARMOR_ADEPT_HELMET_T2("adeptHelmetT2", "adept_helmet_t2"),
		ARMOR_ADEPT_CHESTPLATE_T2("adeptChestplateT2", "adept_chestplate_t2"),
		ARMOR_ADEPT_LEGGINGS_T2("adeptLeggingsT2", "adept_leggings_t2"),
		ARMOR_ADEPT_BOOTS_T2("adeptBootsT2", "adept_boots_t2"),
		ARMOR_ADEPT_HELMET_T3("adeptHelmetT3", "adept_helmet_t3"),
		ARMOR_ADEPT_CHESTPLATE_T3("adeptChestplateT3", "adept_chestplate_t3"),
		ARMOR_ADEPT_LEGGINGS_T3("adeptLeggingsT3", "adept_leggings_t3"),
		ARMOR_ADEPT_BOOTS_T3("adeptBootsT3", "adept_boots_t3"),
		
		ARMOR_ZEALOT_HELMET_T1("zealotHelmetT1", "zealot_helmet_t1"),
		ARMOR_ZEALOT_CHESTPLATE_T1("zealotChestplateT1", "zealot_chestplate_t1"),
		ARMOR_ZEALOT_LEGGINGS_T1("zealotLeggingsT1", "zealot_leggings_t1"),
		ARMOR_ZEALOT_BOOTS_T1("zealotBootsT1", "zealot_boots_t1"),
		ARMOR_ZEALOT_HELMET_T2("zealotHelmetT2", "zealot_helmet_t2"),
		ARMOR_ZEALOT_CHESTPLATE_T2("zealotChestplateT2", "zealot_chestplate_t2"),
		ARMOR_ZEALOT_LEGGINGS_T2("zealotLeggingsT2", "zealot_leggings_t2"),
		ARMOR_ZEALOT_BOOTS_T2("zealotBootsT2", "zealot_boots_t2"),
		ARMOR_ZEALOT_HELMET_T3("zealotHelmetT3", "zealot_helmet_t3"),
		ARMOR_ZEALOT_CHESTPLATE_T3("zealotChestplateT3", "zealot_chestplate_t3"),
		ARMOR_ZEALOT_LEGGINGS_T3("zealotLeggingsT3", "zealot_leggings_t3"),
		ARMOR_ZEALOT_BOOTS_T3("zealotBootsT3", "zealot_boots_t3"),
		
		ARMOR_PURIFIER_ADEPT_HELMET_T1("purifierAdeptHelmetT1", "purifier_adept_helmet_t1"),
		ARMOR_PURIFIER_ADEPT_CHESTPLATE_T1("purifierAdeptChestplateT1", "purifier_adept_chestplate_t1"),
		ARMOR_PURIFIER_ADEPT_LEGGINGS_T1("purifierAdeptLeggingsT1", "purifier_adept_leggings_t1"),
		ARMOR_PURIFIER_ADEPT_BOOTS_T1("purifierAdeptBootsT1", "purifier_adept_boots_t1"),
		ARMOR_PURIFIER_ADEPT_HELMET_T2("purifierAdeptHelmetT2", "purifier_adept_helmet_t2"),
		ARMOR_PURIFIER_ADEPT_CHESTPLATE_T2("purifierAdeptChestplateT2", "purifier_adept_chestplate_t2"),
		ARMOR_PURIFIER_ADEPT_LEGGINGS_T2("purifierAdeptLeggingsT2", "purifier_adept_leggings_t2"),
		ARMOR_PURIFIER_ADEPT_BOOTS_T2("purifierAdeptBootsT2", "purifier_adept_boots_t2"),
		ARMOR_PURIFIER_ADEPT_HELMET_T3("purifierAdeptHelmetT3", "purifier_adept_helmet_t3"),
		ARMOR_PURIFIER_ADEPT_CHESTPLATE_T3("purifierAdeptChestplateT3", "purifier_adept_chestplate_t3"),
		ARMOR_PURIFIER_ADEPT_LEGGINGS_T3("purifierAdeptLeggingsT3", "purifier_adept_leggings_t3"),
		ARMOR_PURIFIER_ADEPT_BOOTS_T3("purifierAdeptBootsT3", "purifier_adept_boots_t3"),
		
		ARMOR_DARK_ZEALOT_HELMET_T1("darkZealotHelmetT1", "dark_zealot_helmet_t1"),
		ARMOR_DARK_ZEALOT_CHESTPLATE_T1("darkZealotChestplateT1", "dark_zealot_chestplate_t1"),
		ARMOR_DARK_ZEALOT_LEGGINGS_T1("darkZealotLeggingsT1", "dark_zealot_leggings_t1"),
		ARMOR_DARK_ZEALOT_BOOTS_T1("darkZealotBootsT1", "dark_zealot_boots_t1"),
		ARMOR_DARK_ZEALOT_HELMET_T2("darkZealotHelmetT2", "dark_zealot_helmet_t2"),
		ARMOR_DARK_ZEALOT_CHESTPLATE_T2("darkZealotChestplateT2", "dark_zealot_chestplate_t2"),
		ARMOR_DARK_ZEALOT_LEGGINGS_T2("darkZealotLeggingsT2", "dark_zealot_leggings_t2"),
		ARMOR_DARK_ZEALOT_BOOTS_T2("darkZealotBootsT2", "dark_zealot_boots_t2"),
		ARMOR_DARK_ZEALOT_HELMET_T3("darkZealotHelmetT3", "dark_zealot_helmet_t3"),
		ARMOR_DARK_ZEALOT_CHESTPLATE_T3("darkZealotChestplateT3", "dark_zealot_chestplate_t3"),
		ARMOR_DARK_ZEALOT_LEGGINGS_T3("darkZealotLeggingsT3", "dark_zealot_leggings_t3"),
		ARMOR_DARK_ZEALOT_BOOTS_T3("darkZealotBootsT3", "dark_zealot_boots_t3"),
		
		ARMOR_KHAYDARIN_AMULET("khaydarinAmulet", "khaydarin_amulet"),
		ARMOR_DARK_KHAYDARIN_AMULET("darkKhaydarinAmulet", "dark_khaydarin_amulet");
		
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
		BLOCK_PROTOSS_METALT1("protossMetalT1", "protoss_metal_t1"),
		BLOCK_PROTOSS_METALT2("protossMetalT2", "protoss_metal_t2"),
		BLOCK_PROTOSS_METALT3("protossMetalT3", "protoss_metal_t3"),
		BLOCK_PROTOSS_ENERGY_CHANNEL("ProtossEnergyChannel", "protoss_energy_channel"),
		BLOCK_PROTOSS_ENERGY_STABILIZER("ProtossEnergyStabilizer", "protoss_energy_stabilizer"),
		BLOCK_PROTOSS_DARK_ENERGY_CHANNEL("protossDarkEnergyChannel", "protoss_dark_energy_channel"),
		BLOCK_PROTOSS_DARK_ENERGY_STABILIZER("ProtossDarkEnergyStabilizer", "protoss_dark_energy_stabilizer"),
		BLOCK_ENERGY("energy", "energy"),
		BLOCK_VOID_ENERGY("voidEnergy", "void_energy"),
		BLOCK_CRYSTAL("crystal", "crystal"),
		BLOCK_WARP_GATE_WORMHOLE_C("charWarpGateWormhole", "char_warp_gate_wormhole"),
		BLOCK_WARP_GATE_WORMHOLE_OW("overworldWarpGateWormhole", "overworld_warp_gate_wormhole"),
		BLOCK_WARP_GATE_WORMHOLE_S("shakurasWarpGateWormhole", "shakuras_warp_gate_wormhole"),
		BLOCK_PROTOSS_WARP_PROJECTOR_C("charWarpGateProjector", "char_warp_projector"),
		BLOCK_PROTOSS_WARP_PROJECTOR_OW("overworldWarpGateProjector", "overworld_warp_projector"),
		BLOCK_PROTOSS_WARP_PROJECTOR_S("shakurasWarpGateProjector", "shakuras_warp_projector"),
		BLOCK_PYLON_CRYSTAL("pylonCrystal", "pylon_crystal"),
		
		//Terran Objects
		BLOCK_DYED_IRON("dyedIron", "dyed_iron"),
		BLOCK_COMP_METALT1("compMetalT1", "comp_metal_t1"),
		BLOCK_PARISTEEL("paristeel", "paristeel"),
		BLOCK_NEOSTEEL("neosteel", "neosteel"),
		
		//Neutral Objects
		BLOCK_COMP_MINERAL("compMineral", "comp_mineral"),
		BLOCK_MINERAL_FIELD("mineralField", "mineral_field"),
		BLOCK_RICH_MINERAL_FIELD("richMineralField", "rich_mineral_field"),
		
		BLOCK_VESPENE_GEYSER("geyserVespene", "geyser_vespene"),
		BLOCK_RICH_VESPENE_GEYSER("geyserVespeneRich", "block_rich_vespene_geyser"),
		BLOCK_VESPENE_GEYSER_BASE("geyserVespeneBase", "geyser_vespene_base"),
		FLUID_ACID("fluidAcid", "fluid_acid"),
		FLUID_BLOOD("fluidBlood", "fluid_blood"),
		
		//Char Objects
		BLOCK_DIRT_CHAR("charDirt", "char_dirt"),
		BLOCK_GRAVEL_CHAR("charGravel", "char_gravel"),
		BLOCK_STONE_CHAR("charStone", "char_stone"),
		BLOCK_COBBLESTONE_CHAR("charCobblestone", "char_cobblestone"),
		BLOCK_ASH_CHAR("charAsh", "char_ash"),
		BLOCK_MAGMA_CHAR("charMagma", "char_magma"),
		BLOCK_VESPENE_GEYSER_C("geyserVespeneChar", "geyser_vespene_char"),
		BLOCK_RICH_VESPENE_GEYSER_C("geyserVespeneRichChar", "geyser_vespene_rich_char"),
		BLOCK_VESPENE_GEYSER_BASE_C("geyserVespeneBaseChar", "geyser_vespene_base_char"),
		
		//Shakuras Objects
		BLOCK_DIRT_S("shakurasDirt", "shakuras_dirt"),
		BLOCK_SAND_S("shakurasSand", "shakuras_sand"),
		BLOCK_STONE_S("shakurasStone", "shakuras_stone"),
		BLOCK_COBBLESTONE_S("shakurasStone", "shakuras_cobblestone"),
		BLOCK_VESPENE_GEYSER_S("geyserVespeneShakuras", "geyser_vespene_shakuras"),
		BLOCK_RICH_VESPENE_GEYSER_S("geyserVespeneRichShakuras", "geyser_vespene_rich_shakuras"),
		BLOCK_VESPENE_GEYSER_BASE_S("geyserVespeneBaseShakuras", "geyser_vespene_base_shakuras"),
		
		
		//Dimension Objects
		BLOCK_DIM_PORTAL_C("charDimPortal", "char_dim_portal"),
		BLOCK_DIM_PORTAL_OW("overworldDimPortal", "overworld_dim_portal"),
		BLOCK_DIM_PORTAL_S("shakurasDimPortal", "shakuras_dim_portal"),
		BLOCK_DIM_PORTAL_AI("aiurDimPortal", "aiur_dim_portal"),
		
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
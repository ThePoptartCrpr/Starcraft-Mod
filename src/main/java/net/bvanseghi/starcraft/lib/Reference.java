package net.bvanseghi.starcraft.lib;

public class Reference {
	public static final String MODID = "starcraft";
	public static final String NAME = "Starcraft";
	public static final String VERSION = "1.5-port";

	public static final String RL_BASE = MODID + ":";
	public static final String UN_BASE = MODID + "_";
	
	public static enum ModItems {
		ITEM_MINERAL_SHARD("MineralShard", "mineral_shard"),
		ITEM_RICHMINERAL_SHARD("MineralRichShard", "mineral_rich_shard"),
		ITEM_VESPENE("Vespene", "vespene"),
		ITEM_PSIBLADEFOCUSER_UNCHARGED("FocuserUnchargedPsiBlade", "focuser_uncharged_psi_blade"),
		ITEM_DARK_PSIBLADEFOCUSER_UNCHARGED("FocuserDarkUnchargedPsiBlade", "focuser_dark_uncharged_psi_blade"),
		ITEM_ENERGY("Energy", "energy"),
		ITEM_PROTOSS_ARTIFACT("ProtossArtifact", "protoss_artifact"),
		ITEM_URAJ("Uraj", "uraj"),
		ITEM_ESSENCE("Essence", "essence"),
		ITEM_PART_C14_GAUSS("PartC14Gauss", "part_c14_gauss"),
		ITEM_INGOT("Ingot", "ingot"),
		ITEM_DUST("Dust", "dust"),
		ITEM_COORDINATE("Coordinate", "coordinate"),
		WEAPON_RIFLE_C14_GAUSS("RifleC14Gauss", "weapon_rifle_c14_gauss"),
		BULLET_RIFLE_C14_GAUSS("BulletRifleC14Gauss", "bullet_rifle_c14_gauss"),
		ITEM_ZERG_CARAPACE("ZergCarapace", "zerg_carapace"),
		ITEM_ZERG_CREEP_RESIN("ZergCreepResin", "zerg_creep_resin"),
		ITEM_ZERG_ORGANIC_TISSUE("ZergOrganicTissue", "zerg_organic_tissue"),
		ITEM_BUCKET_ACID("BucketAcid", "bucket_acid"),
		ITEM_BUCKET_BLOOD("BucketBlood", "bucket_blood"),
		ITEM_PROTOSS_MODULE("ProtossModule", "protoss_module"),
		ITEM_KEYSTONE("Keystone", "keystone"),
		;
		
		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum ModBlocks {
		ORE_COPPER_OW("oreCopperOW", "oreCopperOW"),
		ORE_TITANIUM_OW("oreTitaniumOW", "oreTitaniumOW"),
		ORE_URANIUM_OW("oreUraniumOW", "oreUraniumOW"),
		
		ORE_ALIEN_C("oreAlienC", "oreAlienC"),
		ORE_COAL_C("oreCoalC", "OreCoalC"),
		ORE_COPPER_C("oreCopperC", "oreCopperC"),
		ORE_DIAMOND_C("oreDiamondC", "oreDiamondC"),
		ORE_GOLD_C("oreGoldC", "oreGoldC"),
		ORE_IRON_C("oreIronC", "oreIronC"),
		ORE_LAPIS_C("oreLapisC", "oreLapisC"),
		ORE_MINERAL_C("oreMineralC", "oreMineralC"),
		ORE_REDSTONE_C("oreRedstoneC", "oreRedstoneC"),
		ORE_RICHMINERAL_C("oreRichMineralC", "oreRichMineralC"),
		ORE_TITANIUM_C("oreTitaniumC", "oreTitaniumC"),
		ORE_URANIUM_C("oreUraniumC", "oreUraniumC"),
		
		ORE_ALIEN_S("oreAlienS", "oreAlienS"),
		ORE_COAL_S("oreCoalS", "OreCoalS"),
		ORE_COPPER_S("oreCopperS", "oreCopperS"),
		ORE_DIAMOND_S("oreDiamondS", "oreDiamondS"),
		ORE_GOLD_S("oreGoldS", "oreGoldS"),
		ORE_IRON_S("oreIronS", "oreIronS"),
		ORE_LAPIS_S("oreLapisS", "oreLapisS"),
		ORE_MINERAL_S("oreMineralS", "oreMineralS"),
		ORE_REDSTONE_S("oreRedstoneS", "oreRedstoneS"),
		ORE_RICHMINERAL_S("oreRichMineralS", "oreRichMineralS"),
		ORE_TITANIUM_S("oreTitaniumS", "oreTitaniumS"),
		ORE_URANIUM_S("oreUraniumS", "oreUraniumS"),
		
		//Zerg Objects
		BLOCK_ZERG_CARAPACE("block_zerg_carapace", "block_zerg_carapace"),
		BLOCK_ZERG_FLESH("block_zerg_flesh", "block_zerg_flesh"),
		BLOCK_ZERG_CREEP("block_zerg_creep", "block_zerg_creep"),
		BLOCK_KERATIN_CHUNK("block_keratin_chunk", "block_keratin_chunk"),
		
		//Protoss Objects
		BLOCK_COMP_METAL("block_comp_metal", "block_comp_metal"),
		BLOCK_PROTOSS_ENERGY_STABILIZER("block_protoss_energy_stabilizer", "block_protoss_energy_stabilizer"),
		BLOCK_PROTOSS_ENERGY_CHANNEL("block_protoss_energy_channel", "block_protoss_energy_channel"),
		BLOCK_PROTOSS_DARK_ENERGY_STABILIZER("block_protoss_dark_energy_stabilizer", "block_protoss_dark_energy_stabilizer"),
		BLOCK_ENERGY("block_energy", "block_energy"),
		BLOCK_VOID_ENERGY("block_void_energy", "block_void_energy"),
		BLOCK_CRYSTAL("block_crystal", "block_crystal"),
		BLOCK_WARP_GATE_WORMHOLE_C("block_warp_gate_wormhole_c", "block_warp_gate_wormhole_c"),
		BLOCK_WARP_GATE_WORMHOLE_OW("block_warp_gate_wormhole_ow", "block_warp_gate_wormhole_ow"),
		BLOCK_WARP_GATE_WORMHOLE_S("block_warp_gate_wormhole_s", "block_warp_gate_wormhole_s"),
		BLOCK_PROTOSS_WARP_PROJECTOR_C("block_warp_gate_wormhole_c", "block_warp_gate_wormhole_c"),
		BLOCK_PROTOSS_WARP_PROJECTOR_OW("block_warp_gate_wormhole_ow", "block_warp_gate_wormhole_ow"),
		BLOCK_PROTOSS_WARP_PROJECTOR_S("block_warp_gate_wormhole_s", "block_warp_gate_wormhole_s"),
		
		//Terran Objects
		BLOCK_DYED_IRON("block_dyed_iron", "block_dyed_iron"),
		
		//Neutral Objects
		BLOCK_COMP_MINERAL("block_comp_mineral", "block_comp_mineral"),
		BLOCK_MINERAL_FIELD("block_mineral_field", "block_mineral_field"),
		BLOCK_RICH_MINERAL_FIELD("block_rich_mineral_field", "block_rich_mineral_field"),
		
		BLOCK_VESPENE_GEYSER("block_vespene_geyser", "block_vespene_geyser"),
		BLOCK_RICH_VESPENE_GEYSER("block_rich_vespene_geyser", "block_rich_vespene_geyser"),
		BLOCK_VESPENE_GEYSER_BASE("block_vespene_geyser_base", "block_vespene_geyser_base"),
		FLUID_ACID("fluid_acid", "fluid_acid"),
		FLUID_BLOOD("fluid_blood", "fluid_blood"),
		
		//Char Objects
		BLOCK_DIRT_C("block_dirt_c", "block_dirt_c"),
		BLOCK_STONE_C("block_stone_c", "block_stone_c"),
		BLOCK_COBBLESTONE_C("block_cobblestone_c", "block_cobblestone_c"),
		BLOCK_ASH_C("block_ash_c", "block_ash_c"),
		BLOCK_MAGMA_C("block_magma_c", "block_magma_c"),
		BLOCK_VESPENE_GEYSER_C("block_vespene_geyser_c", "block_vespene_geyser_c"),
		BLOCK_RICH_VESPENE_GEYSER_C("block_rich_vespene_geyser_c", "block_rich_vespene_geyser_c"),
		BLOCK_VESPENE_GEYSER_BASE_C("block_vespene_geyser_base_c", "block_vespene_geyser_base_c"),
		
		//Shakuras Objects
		BLOCK_DIRT_S("block_dirt_s", "block_dirt_s"),
		BLOCK_STONE_S("block_stone_s", "block_stone_s"),
		BLOCK_COBBLESTONE_S("block_cobblestone_s", "block_cobblestone_s"),
		BLOCK_VESPENE_GEYSER_S("block_vespene_geyser_s", "block_vespene_geyser_s"),
		BLOCK_RICH_VESPENE_GEYSER_S("block_rich_vespene_geyser_s", "block_rich_vespene_geyser_s"),
		BLOCK_VESPENE_GEYSER_BASE_S("block_vespene_geyser_base_s", "block_vespene_geyser_base_s"),
		
		
		//Dimension Objects
		BLOCK_DIM_PORTAL_C("block_dim_portal_c", "block_dim_portal_c"),
		BLOCK_DIM_PORTAL_OW("block_dim_portal_ow", "block_dim_portal_ow"),
		BLOCK_DIM_PORTAL_S("block_dim_portal_s", "block_dim_portal_s"),
		;
		
		private String unlocalizedName;
		private String registryName;
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

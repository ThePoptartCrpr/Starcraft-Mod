package ga.scmc.recipes;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.blocks.metablocks.ModMetaBlocks;
import ga.scmc.items.ModItems;
import ga.scmc.items.armor.ModArmor;
import ga.scmc.items.tools.ModTools;
import ga.scmc.items.weapons.ModWeapons;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleRecipes {

	public static void init() {

		// Steel Dust from Carbon and Iron Grains
		// GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust, 1, 0),
		// new Object[] {new ItemStack(ModItems.dust, 1, 1), new
		// ItemStack(ModItems.dust, 1, 1), new ItemStack(ModItems.dust, 1, 2),
		// new ItemStack(ModItems.dust, 1, 2)});

		// Charcoal from Carbon Grain x9
		GameRegistry.addRecipe(new ItemStack(Items.COAL, 1, 1), "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.DUST, 1, 2));

		//Protoss Metal
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), "AAA", "AAA", "AAA", 'A', new ItemStack(ModItems.INGOT, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T2, 1, 0), "AAA", "AZA", "AAA", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'Z',
				new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T3, 1, 0), "AAA", "AZA", "AAA", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'Z',
				new ItemStack(ModMetaBlocks.PROTOSS_METAL_T2, 1, 0));

		//Dark Protoss Metal
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 1), "DDD", "DDD", "DDD", 'D', new ItemStack(ModItems.INGOT, 1, 2));
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T2, 1, 1), "DDD", "DZD", "DDD", 'D', new ItemStack(ModItems.INGOT, 1, 2), 'Z',
				new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T3, 1, 1), "DDD", "AZA", "DDD", 'D', new ItemStack(ModItems.INGOT, 1, 2), 'Z',
				new ItemStack(ModMetaBlocks.PROTOSS_METAL_T2, 1, 0));

		//Block of Pure Energy
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ENERGY), "EEE", "EEE", "EEE", 'E', new ItemStack(ModItems.ENERGY, 1, 0));

		//Block of Void Energy
		GameRegistry.addRecipe(new ItemStack(ModBlocks.VOID_ENERGY), "VVV", "VVV", "VVV", 'V', new ItemStack(ModItems.ENERGY, 1, 2));

		//Block of Titanium
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 1), "TTT", "TTT", "TTT", 'T', new ItemStack(ModItems.INGOT, 1, 3));

		//Block of Copper
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.INGOT, 1, 0));

		//Block of Steel
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 2), "SSS", "SSS", "SSS", 'S', new ItemStack(ModItems.INGOT, 1, 4));

		//Block of Minerals
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 0), "MMM", "MMM", "MMM", 'M', new ItemStack(ModItems.MINERAL_SHARD));

		//Block of Rich Minerals
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 1), "RRR", "RRR", "RRR", 'R', new ItemStack(ModItems.RICH_MINERAL_SHARD));

		//Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 0), "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.ZERG_CARAPACE, 1, 0));

		//Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 1), "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.ZERG_CARAPACE, 1, 1));

		//Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 2), "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.ZERG_CARAPACE, 1, 2));

		//Protoss Warp Projector (Char)
		GameRegistry.addRecipe(new ItemStack(ModBlocks.PROTOSS_WARPPROJECTOR_CHAR), "AEA", "ACA", "AMA", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), 'E',
				new ItemStack(ModBlocks.ENERGY), 'M', new ItemStack(ModItems.PROTOSS_MODULE), 'C', new ItemStack(ModItems.COORDINATES, 1, 0));

		//Protoss Warp Projector (Shakuras)
		GameRegistry.addRecipe(new ItemStack(ModBlocks.PROTOSS_WARPPROJECTOR_SHAKURAS), "AEA", "ASA", "AMA", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), 'E',
				new ItemStack(ModBlocks.ENERGY), 'M', new ItemStack(ModItems.PROTOSS_MODULE), 'S', new ItemStack(ModItems.COORDINATES, 1, 1));

		//Protoss Module
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_MODULE), "AEA", "ADA", "AEA", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'E',
				new ItemStack(ModItems.ENERGY, 1, 0), 'D', new ItemStack(Items.DIAMOND));

		//9 Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ModItems.MINERAL_SHARD, 9), "M", 'M', new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 0));

		//9 Rich Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ModItems.RICH_MINERAL_SHARD, 9), "M", 'M', new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 1));

		//9 Dark Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 9, 2), "D", 'D', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 1));

		//9 Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 9, 1), "A", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0));

		//9 Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(ModItems.ZERG_CARAPACE, 9, 0), "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 0));

		//9 Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(ModItems.ZERG_CARAPACE, 9, 1), "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 1));

		//9 Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(ModItems.ZERG_CARAPACE, 9, 2), "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 2));

		//Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 0), " A ", "A A", " AA", 'A', new ItemStack(ModItems.INGOT, 1, 1));

		//Dark Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1), " D ", "D D", " DD", 'D', new ItemStack(ModItems.INGOT, 1, 2));

		//9 Titanium Ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 9, 3), "T", 'T', new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 1));

		//9 Copper Ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 9, 0), "C", 'C', new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 0));

		//9 Steel Ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 9, 4), "S", 'S', new ItemStack(ModMetaBlocks.COMP_METAL_T1, 1, 2));

		//Zerg Creep
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ZERG_CREEP), "CC", "CC", 'C', ModItems.CREEP_RESIN);

		//Furnace
		GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "CCC", "C C", "CCC", 'C', ModBlocks.COBBLESTONE_SHAKURAS);

		//Furnace
		GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), "CCC", "C C", "CCC", 'C', ModBlocks.COBBLESTONE_CHAR);

		//Psi Blade
		GameRegistry.addRecipe(new ItemStack(ModWeapons.PSI_BLADE), " A ", "AEA", " AA", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'E', new ItemStack(ModItems.ENERGY, 1, 0));

		//Warp Blade
		GameRegistry.addRecipe(new ItemStack(ModWeapons.WARP_BLADE), " A ", "ACA", " AA", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'C', new ItemStack(ModItems.ENERGY, 1, 1));

		//Dark Psi Blade
		GameRegistry.addRecipe(new ItemStack(ModWeapons.BANE_BLADE), " D ", "DVD", " DD", 'D', new ItemStack(ModItems.INGOT, 1, 2), 'V', new ItemStack(ModItems.ENERGY, 1, 2));

		//Dark Warp Blade
		GameRegistry.addRecipe(new ItemStack(ModWeapons.DARK_WARP_BLADE), " D ", "DCD", " DD", 'D', new ItemStack(ModItems.INGOT, 1, 2), 'C',
				new ItemStack(ModItems.ENERGY, 1, 1));

		//Copper toolset
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_SHOVEL), " C ", " S ", " S ", 'C', new ItemStack(ModItems.INGOT, 1, 0), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_AXE), " CC", " SC", " S ", 'C', new ItemStack(ModItems.INGOT, 1, 0), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_PICKAXE), "CCC", " S ", " S ", 'C', new ItemStack(ModItems.INGOT, 1, 0), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_HOE), " CC", " S ", " S ", 'C', new ItemStack(ModItems.INGOT, 1, 0), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModWeapons.COPPER_SWORD), " C ", " C ", " S ", 'C', new ItemStack(ModItems.INGOT, 1, 0), 'S', Items.STICK);

		//Copper armorset
		GameRegistry.addRecipe(new ItemStack(ModArmor.COPPER_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ModItems.INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.COPPER_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ModItems.INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.COPPER_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ModItems.INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.COPPER_BOOTS), "   ", "C C", "C C", 'C', new ItemStack(ModItems.INGOT, 1, 0));

		//Steel toolset
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_SHOVEL), " S ", " I ", " I ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_AXE), " SS", " IS", " I ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_PICKAXE), "SSS", " I ", " I ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_HOE), " SS", " I ", " I ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModWeapons.STEEL_SWORD), " S ", " S ", " I ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'I', Items.STICK);

		//Steel armorset
		GameRegistry.addRecipe(new ItemStack(ModArmor.STEEL_HELMET), "SSS", "S S", "   ", 'S', new ItemStack(ModItems.INGOT, 1, 4));
		GameRegistry.addRecipe(new ItemStack(ModArmor.STEEL_CHESTPLATE), "S S", "SSS", "SSS", 'S', new ItemStack(ModItems.INGOT, 1, 4));
		GameRegistry.addRecipe(new ItemStack(ModArmor.STEEL_LEGGINGS), "SSS", "S S", "S S", 'S', new ItemStack(ModItems.INGOT, 1, 4));
		GameRegistry.addRecipe(new ItemStack(ModArmor.STEEL_BOOTS), "   ", "S S", "S S", 'S', new ItemStack(ModItems.INGOT, 1, 4));

		//Titanium toolset
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_SHOVEL), " T ", " S ", " S ", 'T', new ItemStack(ModItems.INGOT, 1, 3), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_AXE), " TT", " ST", " S ", 'T', new ItemStack(ModItems.INGOT, 1, 3), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_PICKAXE), "TTT", " S ", " S ", 'T', new ItemStack(ModItems.INGOT, 1, 3), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_HOE), " TT", " S ", " S ", 'T', new ItemStack(ModItems.INGOT, 1, 3), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ModWeapons.TITANIUM_SWORD), " T ", " T ", " S ", 'T', new ItemStack(ModItems.INGOT, 1, 3), 'S', Items.STICK);

		//Titanium armorset
		GameRegistry.addRecipe(new ItemStack(ModArmor.TITANIUM_HELMET), "TTT", "T T", "   ", 'T', new ItemStack(ModItems.INGOT, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModArmor.TITANIUM_CHESTPLATE), "T T", "TTT", "TTT", 'T', new ItemStack(ModItems.INGOT, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModArmor.TITANIUM_LEGGINGS), "TTT", "T T", "T T", 'T', new ItemStack(ModItems.INGOT, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModArmor.TITANIUM_BOOTS), "   ", "T T", "T T", 'T', new ItemStack(ModItems.INGOT, 1, 3));

		//Protoss ZealotMK1 khalai armorset
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_HELMET_T1), "ZZZ", "Z Z", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_HELMET_T2), " Z ", "ZHZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'H',
				new ItemStack(ModArmor.ZEALOT_HELMET_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_HELMET_T3), " Z ", "ZHZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'H',
				new ItemStack(ModArmor.ZEALOT_HELMET_T2, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_CHESTPLATE_T1), "AZA", "ZNZ", " Z ", 'A', new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 2), 'N',
				new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 0), 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_CHESTPLATE_T2), " Z ", "ZCZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'C',
				new ItemStack(ModArmor.ZEALOT_CHESTPLATE_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_CHESTPLATE_T3), " Z ", "ZCZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'C',
				new ItemStack(ModArmor.ZEALOT_CHESTPLATE_T2, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_LEGGINGS_T1), "Z Z", "Z Z", "Z Z", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_LEGGINGS_T2), " Z ", "ZLZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'L',
				new ItemStack(ModArmor.ZEALOT_LEGGINGS_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_LEGGINGS_T3), " Z ", "ZLZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'L',
				new ItemStack(ModArmor.ZEALOT_LEGGINGS_T2, 1, 0));

		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_BOOTS_T1), "   ", "Z Z", "Z Z", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_BOOTS_T2), " Z ", "ZBZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'B',
				new ItemStack(ModArmor.ZEALOT_BOOTS_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.ZEALOT_BOOTS_T3), " Z ", "ZBZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'B',
				new ItemStack(ModArmor.ZEALOT_BOOTS_T2, 1, 0));

		//Protoss ZealotMK1 Dark armorset
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_HELMET_T1), "ZZZ", "Z Z", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_HELMET_T2), " Z ", "ZHZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'H',
				new ItemStack(ModArmor.DARK_ZEALOT_HELMET_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_HELMET_T3), " Z ", "ZHZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'H',
				new ItemStack(ModArmor.DARK_ZEALOT_HELMET_T2, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_CHESTPLATE_T1), "AZA", "ZNZ", " Z ", 'A', new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 6), 'N',
				new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 4), 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_CHESTPLATE_T2), " Z ", "ZCZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'C',
				new ItemStack(ModArmor.DARK_ZEALOT_CHESTPLATE_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_CHESTPLATE_T3), " Z ", "ZCZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'C',
				new ItemStack(ModArmor.DARK_ZEALOT_CHESTPLATE_T2, 1, 0));
		
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_LEGGINGS_T1), "Z Z", "Z Z", "Z Z", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_LEGGINGS_T2), " Z ", "ZLZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'L',
				new ItemStack(ModArmor.DARK_ZEALOT_LEGGINGS_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_LEGGINGS_T3), " Z ", "ZLZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'L',
				new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T2, 1, 0));

		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T1), "   ", "Z Z", "Z Z", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T2), " Z ", "ZBZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'B',
				new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T1, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T3), " Z ", "ZBZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'B',
				new ItemStack(ModArmor.DARK_ZEALOT_BOOTS_T2, 1, 0));

		//Khaydarin nodes
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 0), " Z ", "ZKZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'K',
				new ItemStack(ModItems.KHAYDARIN_SHARD, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 4), " Z ", "ZKZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'K',
				new ItemStack(ModItems.KHAYDARIN_SHARD, 1, 0));

		//Protoss armor arches
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 2), " Z ", "Z Z", "   ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 6), " Z ", "Z Z", "   ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));

		//Protoss wrist mounts
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 1), "ZZZ", "ZNZ", "ZZZ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0), 'N',
				new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 5), "ZZZ", "ZNZ", "ZZZ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1), 'N',
				new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 4));

		//Protoss guards
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 3), " Z ", "ZZZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModItems.PROTOSS_ARMOR_PIECES, 1, 7), " Z ", "ZZZ", " Z ", 'Z', new ItemStack(ModItems.PROTOSS_INGOT, 1, 1));

		//Bullets for the Gauss Rifle
		GameRegistry.addRecipe(new ItemStack(ModItems.BULLET, 6), " S ", " P ", " S ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'P', Items.GUNPOWDER);

		//Gauss Rifle parts
		GameRegistry.addRecipe(new ItemStack(ModItems.C14_PARTS, 1, 0), "SSS", "STT", "S  ", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'T',
				new ItemStack(ModItems.INGOT, 1, 3));

		GameRegistry.addRecipe(new ItemStack(ModItems.C14_PARTS, 1, 1), "SSS", "TTT", "  T", 'S', new ItemStack(ModItems.INGOT, 1, 4), 'T',
				new ItemStack(ModItems.INGOT, 1, 3));

		GameRegistry.addRecipe(new ItemStack(ModItems.C14_PARTS, 1, 2), "SS ", "S S", "SSS", 'S', new ItemStack(ModItems.INGOT, 1, 4));

		//Recipe for the actual Gauss Rifle
		GameRegistry.addRecipe(new ItemStack(ModItems.C14_GAUSS_RIFLE), "X  ", " Y ", "  Z", 'X', new ItemStack(ModItems.C14_PARTS, 1, 0), 'Y',
				new ItemStack(ModItems.C14_PARTS, 1, 1), 'Z', new ItemStack(ModItems.C14_PARTS, 1, 2));

		//Terran Vespene
		GameRegistry.addRecipe(new ItemStack(ModItems.VESPENE, 1, 1), "WWW", "WVW", "WWW", 'W', new ItemStack(Blocks.PLANKS), 'V', new ItemStack(ModItems.VESPENE, 1, 3));

		//Protoss Vespene
		GameRegistry.addRecipe(new ItemStack(ModItems.VESPENE, 1, 0), " A ", "AVA", " A ", 'A', new ItemStack(ModItems.INGOT, 1, 1), 'V',
				new ItemStack(ModItems.VESPENE, 1, 3));

		//Zerg Vespene
		GameRegistry.addRecipe(new ItemStack(ModItems.VESPENE, 1, 2), " O ", "OVO", " O ", 'O', new ItemStack(ModItems.ORGANIC_TISSUE), 'V',
				new ItemStack(ModItems.VESPENE, 1, 3));

	}
}
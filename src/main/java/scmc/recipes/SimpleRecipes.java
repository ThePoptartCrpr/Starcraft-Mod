package scmc.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.blocks.ModBlocks;
import scmc.blocks.metablocks.ModMetaBlocks;
import scmc.items.ModItems;
import scmc.items.armor.ModArmor;
import scmc.items.tools.ModTools;
import scmc.items.weapons.ModWeapons;

public class SimpleRecipes {

	public static void init() {

		// Steel Dust from Carbon and Iron Grains
		// GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust, 1, 0),
		// new Object[] {new ItemStack(ModItems.dust, 1, 1), new
		// ItemStack(ModItems.dust, 1, 1), new ItemStack(ModItems.dust, 1, 2),
		// new ItemStack(ModItems.dust, 1, 2)});

		// Iron Grain x2 from Iron Ores
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust, 2, 1), new Object[] { Blocks.IRON_ORE });

		// Iron Ore from Iron Grain x2 + Stone
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_ORE),
				new Object[] { new ItemStack(ModItems.dust, 1, 1), new ItemStack(ModItems.dust, 1, 1), new ItemStack(Blocks.STONE) });

		// Carbon Grain x9 from Coal (not Charcoal as Coal is natural, and iirc
		// has more carbon)
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust, 9, 2), new Object[] { new ItemStack(Items.COAL, 0, 1) });

		// Charcoal from Carbon Grain x9
		GameRegistry.addRecipe(new ItemStack(Items.COAL, 1, 1), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.dust, 1, 2) });

		// Steel Dust from Carbon and Iron Grains
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust, 1, 0), new Object[] { new ItemStack(ModItems.dust, 3, 1), new ItemStack(ModItems.dust, 3, 1),
				new ItemStack(ModItems.dust, 3, 2), new ItemStack(ModItems.dust, 3, 2) });

		// Steel Ingot from Steel Dust
		GameRegistry.addSmelting(new ItemStack(ModItems.dust, 1, 0), new ItemStack(ModItems.ingot1, 1, 4), 0);

		////////////////////////////////////////////////////////
		// The rest is not my doing, so there aren't any notes!//
		////////////////////////////////////////////////////////

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), new Object[] { "AAA", "AAA", "AAA", 'A', new ItemStack(ModItems.ingot1, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 1), new Object[] { "DDD", "DDD", "DDD", 'D', new ItemStack(ModItems.ingot1, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.ENERGY_BLOCK), new Object[] { "EEE", "EEE", "EEE", 'E', new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.VOID_ENERGY_BLOCK), new Object[] { "VVV", "VVV", "VVV", 'V', new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.COMP_METAL, 1, 1), new Object[] { "TTT", "TTT", "TTT", 'T', new ItemStack(ModItems.ingot1, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.COMP_METAL, 1, 0), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.ingot1, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.COMP_METAL, 1, 2), new Object[] { "SSS", "SSS", "SSS", 'S', new ItemStack(ModItems.ingot1, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 0), new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(ModItems.mineralShard) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 1), new Object[] { "RRR", "RRR", "RRR", 'R', new ItemStack(ModItems.richMineralShard) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 0), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 1), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 2), new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 2) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.PROTOSS_WARPPROJECTOR_CHAR),
				new Object[] { "AEA", "ACA", "AMA", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), 'E', new ItemStack(ModBlocks.ENERGY_BLOCK), 'M',
						new ItemStack(ModItems.protossModule), 'C', new ItemStack(ModItems.coord, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.PROTOSS_WARPPROJECTOR_SHAKURAS),
				new Object[] { "AEA", "ASA", "AMA", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0), 'E', new ItemStack(ModBlocks.ENERGY_BLOCK), 'M',
						new ItemStack(ModItems.protossModule), 'S', new ItemStack(ModItems.coord, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.protossModule),
				new Object[] { "AEA", "ADA", "AEA", 'A', new ItemStack(ModItems.ingot1, 1, 1), 'E', new ItemStack(ModItems.energy, 1, 0), 'D', new ItemStack(Items.DIAMOND) });

		GameRegistry.addRecipe(new ItemStack(ModItems.mineralShard, 9), new Object[] { "M", 'M', new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModItems.richMineralShard, 9), new Object[] { "M", 'M', new ItemStack(ModMetaBlocks.COMP_MINERAL, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot1, 9, 2), new Object[] { "D", 'D', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot1, 9, 1), new Object[] { "A", 'A', new ItemStack(ModMetaBlocks.PROTOSS_METAL_T1, 1, 0) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 0), new Object[] { ModBlocks.ENERGY_BLOCK });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 2), new Object[] { ModBlocks.VOID_ENERGY_BLOCK });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 0), new Object[] { "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 1), new Object[] { "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 2), new Object[] { "C", 'C', new ItemStack(ModMetaBlocks.ZERG_CARAPACE, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot1, 1, 2), new Object[] { new ItemStack(Items.DYE, 0, 0), new ItemStack(ModItems.ingot1, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.psiBladeFocuserUncharged), new Object[] { " A ", "A A", " AA", 'A', new ItemStack(ModItems.ingot1, 0, 1) });
		GameRegistry.addRecipe(new ItemStack(ModItems.darkPsiBladeFocuserUncharged), new Object[] { " D ", "D D", " DD", 'D', new ItemStack(ModItems.ingot1, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot1, 9, 3), new Object[] { "T", 'T', new ItemStack(ModBlocks.COMP_METAL, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot1, 9, 0), new Object[] { "C", 'C', new ItemStack(ModBlocks.COMP_METAL, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot1, 9, 4), new Object[] { "S", 'S', new ItemStack(ModBlocks.COMP_METAL, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.creepResin, 4), new Object[] { ModBlocks.ZERG_CREEP });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.ZERG_CREEP), new Object[] { "##", "##", '#', ModItems.creepResin });

		GameRegistry.addSmelting(new ItemStack(ModBlocks.SAND_SHAKURAS), new ItemStack(Blocks.STAINED_GLASS, 1, 11), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.COBBLESTONE_SHAKURAS), new ItemStack(ModBlocks.STONE_SHAKURAS), 0);
		GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[] { "###", "# #", "###", '#', ModBlocks.COBBLESTONE_SHAKURAS });

		GameRegistry.addSmelting(new ItemStack(ModBlocks.COBBLESTONE_CHAR), new ItemStack(ModBlocks.STONE_CHAR), 0);
		GameRegistry.addRecipe(new ItemStack(Blocks.FURNACE), new Object[] { "###", "# #", "###", '#', ModBlocks.COBBLESTONE_CHAR });

		/*
		 * GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 1, 2), new
		 * ItemStack(ModItems.ingot, 1, 1), 0); GameRegistry.addSmelting(new
		 * ItemStack(ModBlocks.ores, 1, 3), new ItemStack(ModItems.ingot, 1, 3),
		 * 0); GameRegistry.addSmelting(new ItemStack(ModBlocks.copp), new
		 * ItemStack(ModItems.ingot, 1, 0), 0);
		 */

		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_OW), new ItemStack(ModItems.ingot1, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_OW), new ItemStack(ModItems.ingot1, 1, 0), 0);

		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COAL_CHAR), new ItemStack(Items.COAL), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_IRON_CHAR), new ItemStack(Items.IRON_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_GOLD_CHAR), new ItemStack(Items.GOLD_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_REDSTONE_CHAR), new ItemStack(Items.REDSTONE), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_LAPIS_CHAR), new ItemStack(Items.DYE, 0, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_DIAMOND_CHAR), new ItemStack(Items.DIAMOND), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_ALIEN_CHAR), new ItemStack(ModItems.ingot1, 0, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_CHAR), new ItemStack(ModItems.ingot1, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_CHAR), new ItemStack(ModItems.ingot1, 1, 0), 0);

		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COAL_SHAKURAS), new ItemStack(Items.COAL), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_IRON_SHAKURAS), new ItemStack(Items.IRON_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_GOLD_SHAKURAS), new ItemStack(Items.GOLD_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_REDSTONE_SHAKURAS), new ItemStack(Items.REDSTONE), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_LAPIS_SHAKURAS), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_DIAMOND_SHAKURAS), new ItemStack(Items.DIAMOND), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_ALIEN_SHAKURAS), new ItemStack(ModItems.ingot1, 1, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_SHAKURAS), new ItemStack(ModItems.ingot1, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_SHAKURAS), new ItemStack(ModItems.ingot1, 1, 0), 0);

		GameRegistry.addRecipe(new ItemStack(ModWeapons.PSI_BLADE),
				new Object[] { " A ", "AEA", " AA", 'A', new ItemStack(ModItems.ingot1, 0, 1), 'E', new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.PSI_BLADE), new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.WARP_BLADE),
				new Object[] { " A ", "ACA", " AA", 'A', new ItemStack(ModItems.ingot1, 0, 1), 'C', new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.WARP_BLADE), new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.DARK_PSI_BLADE),
				new Object[] { " D ", "DVD", " DD", 'D', new ItemStack(ModItems.ingot1, 0, 2), 'V', new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.DARK_PSI_BLADE),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.DARK_WARP_BLADE),
				new Object[] { " D ", "DCD", " DD", 'D', new ItemStack(ModItems.ingot1, 0, 2), 'C', new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.DARK_WARP_BLADE),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 1, 1), new Object[] { new ItemStack(ModItems.energy, 0, 0), new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_SHOVEL), new Object[] { " C ", " S ", " S ", 'C', new ItemStack(ModItems.ingot1, 0, 0), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_AXE), new Object[] { " CC", " SC", " S ", 'C', new ItemStack(ModItems.ingot1, 0, 0), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_PICKAXE), new Object[] { "CCC", " S ", " S ", 'C', new ItemStack(ModItems.ingot1, 0, 0), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.COPPER_HOE), new Object[] { " CC", " S ", " S ", 'C', new ItemStack(ModItems.ingot1, 0, 0), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.COPPER_SWORD), new Object[] { " C ", " C ", " S ", 'C', new ItemStack(ModItems.ingot1, 0, 0), 'S', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(ModArmor.copperHelmet), new Object[] { "CCC", "C C", "   ", 'C', new ItemStack(ModItems.ingot1, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.copperChestplate), new Object[] { "C C", "CCC", "CCC", 'C', new ItemStack(ModItems.ingot1, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.copperLeggings), new Object[] { "CCC", "C C", "C C", 'C', new ItemStack(ModItems.ingot1, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.copperBoots), new Object[] { "   ", "C C", "C C", 'C', new ItemStack(ModItems.ingot1, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_SHOVEL), new Object[] { " S ", " I ", " I ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'I', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_AXE), new Object[] { " SS", " IS", " I ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'I', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_PICKAXE), new Object[] { "SSS", " I ", " I ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'I', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.STEEL_HOE), new Object[] { " SS", " I ", " I ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'I', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.STEEL_SWORD), new Object[] { " S ", " S ", " I ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'I', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(ModArmor.steelHelmet), new Object[] { "SSS", "S S", "   ", 'S', new ItemStack(ModItems.ingot1, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.steelChestplate), new Object[] { "S S", "SSS", "SSS", 'S', new ItemStack(ModItems.ingot1, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.steelLeggings), new Object[] { "SSS", "S S", "S S", 'S', new ItemStack(ModItems.ingot1, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.steelBoots), new Object[] { "   ", "S S", "S S", 'S', new ItemStack(ModItems.ingot1, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_SHOVEL), new Object[] { " T ", " S ", " S ", 'T', new ItemStack(ModItems.ingot1, 0, 3), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_AXE), new Object[] { " TT", " ST", " S ", 'T', new ItemStack(ModItems.ingot1, 0, 3), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_PICKAXE), new Object[] { "TTT", " S ", " S ", 'T', new ItemStack(ModItems.ingot1, 0, 3), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModTools.TITANIUM_HOE), new Object[] { " TT", " S ", " S ", 'T', new ItemStack(ModItems.ingot1, 0, 3), 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.TITANIUM_SWORD), new Object[] { " T ", " T ", " S ", 'T', new ItemStack(ModItems.ingot1, 0, 3), 'S', Items.STICK });

		GameRegistry.addRecipe(new ItemStack(ModArmor.titaniumHelmet), new Object[] { "TTT", "T T", "   ", 'T', new ItemStack(ModItems.ingot1, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.titaniumChestplate), new Object[] { "T T", "TTT", "TTT", 'T', new ItemStack(ModItems.ingot1, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.titaniumLeggings), new Object[] { "TTT", "T T", "T T", 'T', new ItemStack(ModItems.ingot1, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmor.titaniumBoots), new Object[] { "   ", "T T", "T T", 'T', new ItemStack(ModItems.ingot1, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.bullet, 6), new Object[] { " S ", " P ", " S ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'P', Items.GUNPOWDER });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 0),
				new Object[] { "SSS", "STT", "S  ", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'T', new ItemStack(ModItems.ingot1, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 1),
				new Object[] { "SSS", "TTT", "  T", 'S', new ItemStack(ModItems.ingot1, 0, 4), 'T', new ItemStack(ModItems.ingot1, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 2), new Object[] { "SS ", "S S", "SSS", 'S', new ItemStack(ModItems.ingot1, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModItems.C14GaussRifle), new Object[] { "X  ", " Y ", "  Z", 'X', new ItemStack(ModItems.c14Parts, 0, 0), 'Y',
				new ItemStack(ModItems.c14Parts, 0, 1), 'Z', new ItemStack(ModItems.c14Parts, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 1),
				new Object[] { "WWW", "WVW", "WWW", 'W', new ItemStack(Blocks.PLANKS), 'V', new ItemStack(ModItems.vespene, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 0),
				new Object[] { " A ", "AVA", " A ", 'A', new ItemStack(ModItems.ingot1, 0, 1), 'V', new ItemStack(ModItems.vespene, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 2),
				new Object[] { " O ", "OVO", " O ", 'O', new ItemStack(ModItems.organicTissue), 'V', new ItemStack(ModItems.vespene, 0, 3) });
	}
}
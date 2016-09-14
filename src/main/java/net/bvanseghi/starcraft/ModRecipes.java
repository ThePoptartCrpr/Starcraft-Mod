package net.bvanseghi.starcraft;

import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.tools.ModTools;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.protossMetal, 1, 0),
				new Object[] { "AAA", "AAA", "AAA", 'A', new ItemStack(ModItems.ingot, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.protossMetal, 1, 1),
				new Object[] { "DDD", "DDD", "DDD", 'D', new ItemStack(ModItems.ingot, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.energyBlock),
				new Object[] { "EEE", "EEE", "EEE", 'E', new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.voidEnergyBlock),
				new Object[] { "VVV", "VVV", "VVV", 'V', new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.compMetal, 1, 1),
				new Object[] { "TTT", "TTT", "TTT", 'T', new ItemStack(ModItems.ingot, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.compMetal, 1, 0),
				new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.ingot, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.compMetal, 1, 2),
				new Object[] { "SSS", "SSS", "SSS", 'S', new ItemStack(ModItems.ingot, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.compMineral, 1, 0),
				new Object[] { "MMM", "MMM", "MMM", 'M', new ItemStack(ModItems.mineralShard) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.compMineral, 1, 1),
				new Object[] { "RRR", "RRR", "RRR", 'R', new ItemStack(ModItems.richMineralShard) });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.zergStrucCarapace, 1, 0),
				new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 0) });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.zergStrucCarapace, 1, 1),
				new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 1) });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.zergStrucCarapace, 1, 2),
				new Object[] { "CCC", "CCC", "CCC", 'C', new ItemStack(ModItems.zergCarapace, 1, 2) });
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.protossWarpProjectorC),
				new Object[] { "AEA", "ACA", "AMA", 'A', new ItemStack(ModBlocks.protossMetal, 1, 0), 'E',
						new ItemStack(ModBlocks.energyBlock), 'M', new ItemStack(ModItems.protossModule), 'C',
						new ItemStack(ModItems.coord, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.protossWarpProjectorS),
				new Object[] { "AEA", "ASA", "AMA", 'A', new ItemStack(ModBlocks.protossMetal, 1, 0), 'E',
						new ItemStack(ModBlocks.energyBlock), 'M', new ItemStack(ModItems.protossModule), 'S',
						new ItemStack(ModItems.coord, 1, 1) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.protossModule),
				new Object[] { "AEA", "ADA", "AEA", 'A', new ItemStack(ModItems.ingot, 1, 1), 'E',
						new ItemStack(ModItems.energy, 1, 0), 'D', new ItemStack(Items.diamond)});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.mineralShard, 9),
				new Object[] { "M", 'M', new ItemStack(ModBlocks.compMineral, 1, 0) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.richMineralShard, 9),
				new Object[] { "M", 'M', new ItemStack(ModBlocks.compMineral, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 2),
				new Object[] { "D", 'D', new ItemStack(ModBlocks.protossMetal, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 1),
				new Object[] { "A", 'A', new ItemStack(ModBlocks.protossMetal, 1, 0) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 0), new Object[] { ModBlocks.energyBlock });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 2),
				new Object[] { ModBlocks.voidEnergyBlock });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 0),
				new Object[] { "C", 'C', new ItemStack(ModBlocks.zergStrucCarapace, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 1),
				new Object[] { "C", 'C', new ItemStack(ModBlocks.zergStrucCarapace, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.zergCarapace, 9, 2),
				new Object[] { "C", 'C', new ItemStack(ModBlocks.zergStrucCarapace, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot, 1, 2),
				new Object[] { new ItemStack(Items.dye, 0, 0), new ItemStack(ModItems.ingot, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.psiBladeFocuserUncharged),
				new Object[] { " A ", "A A", " AA", 'A', new ItemStack(ModItems.ingot, 0, 1) });
		GameRegistry.addRecipe(new ItemStack(ModItems.darkPsiBladeFocuserUncharged),
				new Object[] { " D ", "D D", " DD", 'D', new ItemStack(ModItems.ingot, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 3),
				new Object[] { "T", 'T', new ItemStack(ModBlocks.compMetal, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 0),
				new Object[] { "C", 'C', new ItemStack(ModBlocks.compMetal, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 4),
				new Object[] { "S", 'S', new ItemStack(ModBlocks.compMetal, 1, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.creepResin, 4), new Object[] { ModBlocks.zergCreep });

		GameRegistry.addSmelting(new ItemStack(ModBlocks.sandShakuras), new ItemStack(Blocks.stained_glass, 1, 11), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cobblestoneShakuras), new ItemStack(ModBlocks.stoneShakuras),
				0);
		GameRegistry.addRecipe(new ItemStack(Blocks.furnace),
				new Object[] { "###", "# #", "###", '#', ModBlocks.cobblestoneShakuras });

		GameRegistry.addSmelting(new ItemStack(ModBlocks.cobblestoneChar), new ItemStack(ModBlocks.stoneChar), 0);
		GameRegistry.addRecipe(new ItemStack(Blocks.furnace),
				new Object[] { "###", "# #", "###", '#', ModBlocks.cobblestoneChar });

		/*
		 * GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 1, 2), new
		 * ItemStack(ModItems.ingot, 1, 1), 0); GameRegistry.addSmelting(new
		 * ItemStack(ModBlocks.ores, 1, 3), new ItemStack(ModItems.ingot, 1, 3),
		 * 0); GameRegistry.addSmelting(new ItemStack(ModBlocks.copp), new
		 * ItemStack(ModItems.ingot, 1, 0), 0);
		 * 
		 */

		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTitaniumOW), new ItemStack(ModItems.ingot, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCopperOW), new ItemStack(ModItems.ingot, 1, 0), 0);
		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCoalC), new ItemStack(Items.coal), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreIronC), new ItemStack(Items.iron_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreGoldC), new ItemStack(Items.gold_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreRedstoneC), new ItemStack(Items.redstone), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreLapisC), new ItemStack(Items.dye, 0, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDiamondC), new ItemStack(Items.diamond), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreAlienC), new ItemStack(ModItems.ingot, 0, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTitaniumC), new ItemStack(ModItems.ingot, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCopperC), new ItemStack(ModItems.ingot, 1, 0), 0);

		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCoalS), new ItemStack(Items.coal), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreIronS), new ItemStack(Items.iron_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreGoldS), new ItemStack(Items.gold_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreRedstoneS), new ItemStack(Items.redstone), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreLapisS), new ItemStack(Items.dye, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreDiamondS), new ItemStack(Items.diamond), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreAlienS), new ItemStack(ModItems.ingot, 1, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreTitaniumS), new ItemStack(ModItems.ingot, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.oreCopperS), new ItemStack(ModItems.ingot, 1, 0), 0);

		GameRegistry.addRecipe(new ItemStack(ModWeapons.psiBlade), new Object[] { " A ", "AEA", " AA", 'A',
				new ItemStack(ModItems.ingot, 0, 1), 'E', new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.psiBlade),
				new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.warpBlade), new Object[] { " A ", "ACA", " AA", 'A',
				new ItemStack(ModItems.ingot, 0, 1), 'C', new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.warpBlade),
				new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.darkPsiBlade), new Object[] { " D ", "DVD", " DD", 'D',
				new ItemStack(ModItems.ingot, 0, 2), 'V', new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.darkPsiBlade),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.darkWarpBlade), new Object[] { " D ", "DCD", " DD", 'D',
				new ItemStack(ModItems.ingot, 0, 2), 'C', new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.darkWarpBlade),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 1, 1),
				new Object[] { new ItemStack(ModItems.energy, 0, 0), new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModTools.copperShovel),
				new Object[] { " C ", " S ", " S ", 'C', new ItemStack(ModItems.ingot, 0, 0), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.copperAxe),
				new Object[] { " CC", " SC", " S ", 'C', new ItemStack(ModItems.ingot, 0, 0), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.copperPickaxe),
				new Object[] { "CCC", " S ", " S ", 'C', new ItemStack(ModItems.ingot, 0, 0), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.copperHoe),
				new Object[] { " CC", " S ", " S ", 'C', new ItemStack(ModItems.ingot, 0, 0), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.copperSword),
				new Object[] { " C ", " C ", " S ", 'C', new ItemStack(ModItems.ingot, 0, 0), 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModArmour.copperHelmet),
				new Object[] { "CCC", "C C", "   ", 'C', new ItemStack(ModItems.ingot, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.copperChestplate),
				new Object[] { "C C", "CCC", "CCC", 'C', new ItemStack(ModItems.ingot, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.copperLeggings),
				new Object[] { "CCC", "C C", "C C", 'C', new ItemStack(ModItems.ingot, 0, 0) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.copperBoots),
				new Object[] { "   ", "C C", "C C", 'C', new ItemStack(ModItems.ingot, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModTools.steelShovel),
				new Object[] { " S ", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelAxe),
				new Object[] { " SS", " IS", " I ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelPickaxe),
				new Object[] { "SSS", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelHoe),
				new Object[] { " SS", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.steelSword),
				new Object[] { " S ", " S ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'I', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModArmour.steelHelmet),
				new Object[] { "SSS", "S S", "   ", 'S', new ItemStack(ModItems.ingot, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelChestplate),
				new Object[] { "S S", "SSS", "SSS", 'S', new ItemStack(ModItems.ingot, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelLeggings),
				new Object[] { "SSS", "S S", "S S", 'S', new ItemStack(ModItems.ingot, 0, 4) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelBoots),
				new Object[] { "   ", "S S", "S S", 'S', new ItemStack(ModItems.ingot, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumShovel),
				new Object[] { " T ", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 3), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumAxe),
				new Object[] { " TT", " ST", " S ", 'T', new ItemStack(ModItems.ingot, 0, 3), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumPickaxe),
				new Object[] { "TTT", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 3), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumHoe),
				new Object[] { " TT", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 3), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.titaniumSword),
				new Object[] { " T ", " T ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 3), 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumHelmet),
				new Object[] { "TTT", "T T", "   ", 'T', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumChestplate),
				new Object[] { "T T", "TTT", "TTT", 'T', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumLeggings),
				new Object[] { "TTT", "T T", "T T", 'T', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumBoots),
				new Object[] { "   ", "T T", "T T", 'T', new ItemStack(ModItems.ingot, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.C14GaussRifleBullet, 6),
				new Object[] { " S ", " P ", " S ", 'S', new ItemStack(ModItems.ingot, 0, 4), 'P', Items.gunpowder });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 0), new Object[] { "SSS", "STT", "S  ", 'S',
				new ItemStack(ModItems.ingot, 0, 4), 'T', new ItemStack(ModItems.ingot, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 1), new Object[] { "SSS", "TTT", "  T", 'S',
				new ItemStack(ModItems.ingot, 0, 4), 'T', new ItemStack(ModItems.ingot, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 1, 2),
				new Object[] { "SS ", "S S", "SSS", 'S', new ItemStack(ModItems.ingot, 0, 4) });

		GameRegistry.addRecipe(new ItemStack(ModItems.C14GaussRifle),
				new Object[] { "X  ", " Y ", "  Z", 'X', new ItemStack(ModItems.c14Parts, 0, 0), 'Y',
						new ItemStack(ModItems.c14Parts, 0, 1), 'Z', new ItemStack(ModItems.c14Parts, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 1), new Object[] { "WWW", "WVW", "WWW", 'W',
				new ItemStack(Blocks.planks), 'V', new ItemStack(ModItems.vespene, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 0), new Object[] { " A ", "AVA", " A ", 'A',
				new ItemStack(ModItems.ingot, 0, 1), 'V', new ItemStack(ModItems.vespene, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModItems.vespene, 1, 2), new Object[] { " O ", "OVO", " O ", 'O',
				new ItemStack(ModItems.organicTissue), 'V', new ItemStack(ModItems.vespene, 0, 3) });
	}
}

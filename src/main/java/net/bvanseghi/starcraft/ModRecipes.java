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
		
	
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 2), new Object[] {"D", 'D', new ItemStack(ModBlocks.protossMetal, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 1), new Object[] {"A", 'A', new ItemStack(ModBlocks.protossMetal, 1, 0)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 0), new Object[] { ModBlocks.energyBlock });
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 9, 2),
				new Object[] { ModBlocks.voidEnergyBlock });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot, 0, 2),
				new Object[] { Items.dye, new ItemStack(ModItems.ingot, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModItems.psiBladeFocuserUncharged),
				new Object[] { " A ", "A A", " AA", 'A', new ItemStack(ModItems.ingot, 0, 1) });
		GameRegistry.addRecipe(new ItemStack(ModItems.darkPsiBladeFocuserUncharged),
				new Object[] { " D ", "D D", " DD", 'D', new ItemStack(ModItems.ingot, 0, 2) });

		
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot, 9, 2),new Object[] { ModBlocks.titaniumBlock });
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 3), new Object[] {"T", 'T', new ItemStack(ModBlocks.compMetal, 1, 1)});
		
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot, 9, 0), new Object[] { ModBlocks.copperBlock });
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 0), new Object[] {"C", 'C', new ItemStack(ModBlocks.compMetal, 1, 0)});
		
		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingot, 9, 3), new Object[] { ModBlocks.steelBlock });
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 9, 4), new Object[] {"S", 'S', new ItemStack(ModBlocks.compMetal, 1, 2)});
		
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.creepResin, 4), new Object[] { ModBlocks.zergCreep });

		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 2), new ItemStack(ModItems.ingot, 0, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 3), new ItemStack(ModItems.ingot, 0, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 4), new ItemStack(ModItems.ingot, 0, 0), 0);
		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 5), new ItemStack(Items.coal), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 6), new ItemStack(Items.iron_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 7), new ItemStack(Items.gold_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 8), new ItemStack(Items.redstone), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 9), new ItemStack(Items.dye, 0, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 10), new ItemStack(Items.diamond), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 13), new ItemStack(ModItems.ingot, 0, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 14), new ItemStack(ModItems.ingot, 0, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores, 0, 15), new ItemStack(ModItems.ingot, 0, 0), 0);
		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 0), new ItemStack(Items.coal), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 1), new ItemStack(Items.iron_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 2), new ItemStack(Items.gold_ingot), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 3), new ItemStack(Items.redstone), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 4), new ItemStack(Items.dye, 0, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 5), new ItemStack(Items.diamond), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 8), new ItemStack(ModItems.ingot, 0, 1), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 9), new ItemStack(ModItems.ingot, 0, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ores2, 0, 10), new ItemStack(ModItems.ingot, 0, 0), 0);
		

		GameRegistry.addRecipe(new ItemStack(ModWeapons.psiBlade),
				new Object[] { " A ", "AEA", " AA", 'A', new ItemStack(ModItems.ingot, 0, 1), 'E', new ItemStack(ModItems.energy, 0, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.psiBlade),
				new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 0) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.warpBlade),
				new Object[] { " A ", "ACA", " AA", 'A', new ItemStack(ModItems.ingot, 0, 1), 'C', new ItemStack(ModItems.energy, 0, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.warpBlade),
				new Object[] { ModItems.psiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.darkPsiBlade),
				new Object[] { " D ", "DVD", " DD", 'D', new ItemStack(ModItems.ingot, 0, 2), 'V', new ItemStack(ModItems.energy, 0, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.darkPsiBlade),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 2) });

		GameRegistry.addRecipe(new ItemStack(ModWeapons.darkWarpBlade),
				new Object[] { " D ", "DCD", " DD", 'D', new ItemStack(ModItems.ingot, 0, 2), 'C', new ItemStack(ModItems.energy, 0, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.darkWarpBlade),
				new Object[] { ModItems.darkPsiBladeFocuserUncharged, new ItemStack(ModItems.energy, 0, 1) });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.energy, 0, 1),
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
				new Object[] { " S ", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelAxe),
				new Object[] { " SS", " IS", " I ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelPickaxe),
				new Object[] { "SSS", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.steelHoe),
				new Object[] { " SS", " I ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'I', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.steelSword),
				new Object[] { " S ", " S ", " I ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'I', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModArmour.steelHelmet),
				new Object[] { "SSS", "S S", "   ", 'S', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelChestplate),
				new Object[] { "S S", "SSS", "SSS", 'S', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelLeggings),
				new Object[] { "SSS", "S S", "S S", 'S', new ItemStack(ModItems.ingot, 0, 3) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.steelBoots),
				new Object[] { "   ", "S S", "S S", 'S', new ItemStack(ModItems.ingot, 0, 3) });

		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumShovel),
				new Object[] { " T ", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 2), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumAxe),
				new Object[] { " TT", " ST", " S ", 'T', new ItemStack(ModItems.ingot, 0, 2), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumPickaxe),
				new Object[] { "TTT", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 2), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModTools.titaniumHoe),
				new Object[] { " TT", " S ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 2), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModWeapons.titaniumSword),
				new Object[] { " T ", " T ", " S ", 'T', new ItemStack(ModItems.ingot, 0, 2), 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumHelmet),
				new Object[] { "TTT", "T T", "   ", 'T', new ItemStack(ModItems.ingot, 0, 2) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumChestplate),
				new Object[] { "T T", "TTT", "TTT", 'T', new ItemStack(ModItems.ingot, 0, 2) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumLeggings),
				new Object[] { "TTT", "T T", "T T", 'T', new ItemStack(ModItems.ingot, 0, 2) });
		GameRegistry.addRecipe(new ItemStack(ModArmour.titaniumBoots),
				new Object[] { "   ", "T T", "T T", 'T', new ItemStack(ModItems.ingot, 0, 2) });

		
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.C14GaussRifleBullet, 6),
				new Object[] { " S ", " P ", " S ", 'S', new ItemStack(ModItems.ingot, 0, 3), 'P', Items.gunpowder });
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot, 0, 2),
				new Object[] { " T ", "TVT", " T ", 'T', ModItems.organicTissue, 'V', new ItemStack(ModItems.ingot, 0, 3) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 0, 0), new Object[] { "SSS", "STT", "S  ", 'S',
				new ItemStack(ModItems.ingot, 0, 3), 'T', new ItemStack(ModItems.ingot, 0, 2) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 0, 1), new Object[] { "SSS", "TTT", "  T", 'S',
				new ItemStack(ModItems.ingot, 0, 3), 'T', new ItemStack(ModItems.ingot, 0, 2) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.c14Parts, 0, 2), new Object[] { "SS ", "S S", "SSS", 'S',
				new ItemStack(ModItems.ingot, 0, 3) });
		
		GameRegistry.addRecipe(new ItemStack(ModItems.C14GaussRifle), new Object[] { "X  ", " Y ", "  Z", 'X',
				new ItemStack(ModItems.c14Parts, 0, 0), 'Y', new ItemStack(ModItems.c14Parts, 0, 1), 'Z', new ItemStack(ModItems.c14Parts, 0, 2) });
	}
}

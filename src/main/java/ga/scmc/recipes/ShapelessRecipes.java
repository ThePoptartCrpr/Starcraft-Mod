package ga.scmc.recipes;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.items.ModItems;
import ga.scmc.items.weapons.ModWeapons;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ShapelessRecipes {

	public static void init() {
		// Iron Grain x2 from Iron Ores
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DUST, 2, 1), Blocks.IRON_ORE);

		// Iron Ore from Iron Grain x2 + Stone
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(ModItems.DUST, 1, 1), new ItemStack(ModItems.DUST, 1, 1), new ItemStack(Blocks.STONE));

		// Carbon Grain x9 from Coal (not Charcoal as Coal is natural, and iirc has more carbon)
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DUST, 9, 2), new ItemStack(Items.COAL, 1, 1));

		// Steel Dust from Carbon and Iron Grains
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DUST, 1, 0), new ItemStack(ModItems.DUST, 3, 1), new ItemStack(ModItems.DUST, 3, 1),
				new ItemStack(ModItems.DUST, 3, 2), new ItemStack(ModItems.DUST, 3, 2));

		//1 Dark Protoss Ingot (using Dye on a normal Protoss Ingot)
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 1, 2), new ItemStack(Items.DYE, 1, 0), new ItemStack(ModItems.INGOT, 1, 1));

		//4 Creep Resin
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CREEP_RESIN, 4), ModBlocks.ZERG_CREEP);

		//Psi Blade
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.PSI_BLADE), new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 0), new ItemStack(ModItems.ENERGY, 1, 0));

		//Warp Blade
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.WARP_BLADE), new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 0), new ItemStack(ModItems.ENERGY, 1, 1));
		
		//Dark Warp Blade
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.DARK_WARP_BLADE), new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1), new ItemStack(ModItems.ENERGY, 1, 1));

		//Dark Psi Blade
		GameRegistry.addShapelessRecipe(new ItemStack(ModWeapons.BANE_BLADE), new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1), new ItemStack(ModItems.ENERGY, 1, 2));

		//Corrupted Energy, made from combining Pure Energy and Void Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ENERGY, 1, 1), new ItemStack(ModItems.ENERGY, 1, 0), new ItemStack(ModItems.ENERGY, 1, 2));
		
		//9 Pure Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ENERGY, 9, 0), ModBlocks.ENERGY);
		
		//9 Void Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ENERGY, 9, 2), ModBlocks.VOID_ENERGY);
	}
}

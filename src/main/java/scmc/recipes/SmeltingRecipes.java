package scmc.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scmc.blocks.ModBlocks;
import scmc.items.ModItems;

public class SmeltingRecipes {

	public static void init() {
		// Steel Ingot from Steel Dust
		GameRegistry.addSmelting(new ItemStack(ModItems.DUST, 1, 0), new ItemStack(ModItems.INGOT, 1, 4), 0);
				
		//Blue Stained Glass
		GameRegistry.addSmelting(new ItemStack(ModBlocks.SAND_SHAKURAS), new ItemStack(Blocks.STAINED_GLASS, 1, 11), 0);

		//Shakuras Stone
		GameRegistry.addSmelting(new ItemStack(ModBlocks.COBBLESTONE_SHAKURAS), new ItemStack(ModBlocks.STONE_SHAKURAS), 0);

		//Char Stone
		GameRegistry.addSmelting(new ItemStack(ModBlocks.COBBLESTONE_CHAR), new ItemStack(ModBlocks.STONE_CHAR), 0);

		//These are all of the various smelting recipes for the various ores. Self explanatory
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_OW), new ItemStack(ModItems.INGOT, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_OW), new ItemStack(ModItems.INGOT, 1, 0), 0);
		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COAL_CHAR), new ItemStack(Items.COAL), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_IRON_CHAR), new ItemStack(Items.IRON_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_GOLD_CHAR), new ItemStack(Items.GOLD_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_REDSTONE_CHAR), new ItemStack(Items.REDSTONE), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_LAPIS_CHAR), new ItemStack(Items.DYE, 0, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_DIAMOND_CHAR), new ItemStack(Items.DIAMOND), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_CHAR), new ItemStack(ModItems.INGOT, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_CHAR), new ItemStack(ModItems.INGOT, 1, 0), 0);
		
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COAL_SHAKURAS), new ItemStack(Items.COAL), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_IRON_SHAKURAS), new ItemStack(Items.IRON_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_GOLD_SHAKURAS), new ItemStack(Items.GOLD_INGOT), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_REDSTONE_SHAKURAS), new ItemStack(Items.REDSTONE), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_LAPIS_SHAKURAS), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_DIAMOND_SHAKURAS), new ItemStack(Items.DIAMOND), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_TITANIUM_SHAKURAS), new ItemStack(ModItems.INGOT, 1, 3), 0);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ORE_COPPER_SHAKURAS), new ItemStack(ModItems.INGOT, 1, 0), 0);
	}
}

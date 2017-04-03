package scmc.recipes;

import javax.annotation.Nullable;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import scmc.items.ModItems;
import scmc.items.metaitems.ItemDust;

public class SteelDust implements IRecipe {
	
	/**
	 * Checks to see if the current recipe is a valid recipe for Steel Dust
	 * @param grid the crafting grid
	 * @param world the world in which the crafting is being done
	 * @return {@code true} if the grid's current state satisfies for steel dust
	 * @see net.minecraft.item.crafting.IRecipe#matches(InventoryCrafting, World)
	 */
	@Override
	public boolean matches(InventoryCrafting grid, World world) {
		ItemStack ironDust = null; //Tracks the Iron Dust stack
		ItemStack carbonDust = null; //Tracks the Carbon Dust stack
		
		
		for(int i = 0; i < grid.getSizeInventory(); i++) {
			try {
				ItemStack currentStack = grid.getStackInSlot(i); //For analysis of the stack in slot i
				
				if(currentStack.getItem() instanceof ItemDust) {
					if(currentStack.getMetadata() == 1) {
						if(ironDust == null) {
							ironDust = currentStack; //Only sets the current stack as the Iron Dust if it definitely is Iron Dust AND there's no Iron Dust yet
						} else {
							return false; //Already an Iron Dust? That means we have too many in the grid
						}
					} else if(currentStack.getMetadata() == 2) {
						if(carbonDust == null) {
							carbonDust = currentStack; //Only sets the current stack as the Carbon Dust if it definitely is Carbon Dust AND there's no Carbon Dust yet
						} else {
							return false; //Already a Carbon Dust? That means we have too many in the grid
						}
					}
				} else if(currentStack != null) {
					return false; //If there's anything other than the Dusts, it's not valid
				}
			} catch(@SuppressWarnings("unused") NullPointerException e) {} //Preventing errors with as little effort as possible :P
		}
		
		if(ironDust == null || carbonDust == null) {
			return false; //Did we not receive an ingredient?
		}
		
		return ironDust.stackSize >= 2; //We don't check the stack size of the Carbon Dust as we only need one
	}
	
	/**
	 * Gets the output when crafting is completed - a single piece of Steel Dust
	 * @param grid the crafting grid
	 * @return A single piece of Steel Dust
	 * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(InventoryCrafting)
	 */
	@Override
	@Nullable
	public ItemStack getCraftingResult(InventoryCrafting grid) {
		return new ItemStack(ModItems.dust, 1, 0);
	}
	
	/**
	 * @return the number of items in the recipe
	 * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
	 */
	@Override
	public int getRecipeSize() {
		return 3; //There are three items
	}
	
	/**
	 * <i>I typically null this method because I've never seen any reason to use it. It's supposed to be used
	 * as a "general form" for crafting output. Typically it isn't necessary, and usually I only use IRecipe
	 * for complex recipes, so I rarely get to use this regardless. Here I can use it as our output is always
	 * "general" in a sense</i><br>
	 * <br>
	 * Gives out a single piece of Steel Dust
	 */
	@Override
	@Nullable
	public ItemStack getRecipeOutput() {
		return new ItemStack(ModItems.dust, 1, 0);
	}
	
	/**
	 * Keeps certain items in the grid afterwords
	 * @param grid
	 * @return
	 * @see net.minecraft.item.crafting.IRecipe#getRemainingItems(InventoryCrafting)
	 */
	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting grid) {
		ItemStack ironDust = null;
		ItemStack carbonDust = null;
		
		for(int i = 0; i < grid.getSizeInventory(); i++) {
			try {
				ItemStack currentStack = grid.getStackInSlot(i);
				
				if(currentStack.getMetadata() == 1) {
					ironDust = currentStack.copy();
				} else if(currentStack.getMetadata() == 2) {
					carbonDust = currentStack.copy();
				}
			} catch(@SuppressWarnings("unused") NullPointerException e) {} //Same bs as before
		}
		
		grid.clear(); //Makes sure we get rid of the used ingredients... by getting rid of everything then adding more :P
		
		ironDust.stackSize -= 2;
		carbonDust.stackSize--;
		
		return new ItemStack[] {ironDust, carbonDust}; //If Mojang had made stack size editing with setters as they usually do, this'd be a much cooler-looking line
	}
}

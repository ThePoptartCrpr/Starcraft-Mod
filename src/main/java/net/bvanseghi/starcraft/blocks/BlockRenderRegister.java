package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockRenderRegister {
	public static void reg(Block block, int meta, String fullName) {
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.RL_BASE + fullName, "inventory"));
	}
	
	public static void registerBlockRenderer() {
	    reg(ModBlocks.PROTOSS_METAL, 0, "protoss_metal_aiur");
	    reg(ModBlocks.PROTOSS_METAL, 1, "protoss_metal_dark");
	    reg(ModBlocks.PROTOSS_METAL, 2, "protoss_metal_blue");
	    reg(ModBlocks.PROTOSS_METAL, 3, "protoss_metal_green");
	}
}

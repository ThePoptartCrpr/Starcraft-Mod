package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class BlockRenderRegister {

	public static void preInit() {
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.PROTOSS_METAL),
				new ResourceLocation("starcraft:protoss_metal_aiur"),
				new ResourceLocation("starcraft:protoss_metal_dark"),
				new ResourceLocation("starcraft:protoss_metal_blue"),
				new ResourceLocation("starcraft:protoss_metal_green"));
	}
	
	public static void reg(Block block, int meta, String file) {
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MODID + ":" + file, "inventory"));
	}
	
	public static void registerBlockRenderer() {
	    reg(ModBlocks.PROTOSS_METAL, 0, "protoss_metal_aiur");
	    reg(ModBlocks.PROTOSS_METAL, 1, "protoss_metal_dark");
	    reg(ModBlocks.PROTOSS_METAL, 2, "protoss_metal_blue");
	    reg(ModBlocks.PROTOSS_METAL, 3, "protoss_metal_green");
	}
}

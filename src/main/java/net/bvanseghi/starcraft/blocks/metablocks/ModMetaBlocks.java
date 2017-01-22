package net.bvanseghi.starcraft.blocks.metablocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.LogHelper;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModMetaBlocks {

	/**
	 * State our blocks
	 */
	public static Block PROTOSS_METAL;
	public static Block PYLON_CRYSTAL;
	public static Block ZERG_CARAPACE;
	public static Block COMP_METAL;
	public static Block DYED_IRON;
	public static Block ZERG_FLESH;
	
	public static Block COMP_MINERAL;
	
	
	/**
	 * Initialize the blocks
	 */
	public static void init() {
		PROTOSS_METAL = new BlockProtossMetal("protoss_metal", "protoss_metal");
		PYLON_CRYSTAL = new BlockPylonCrystal("pcrystal", "pcrystal");
		ZERG_CARAPACE = new BlockZergStructureCarapace("zerg_carapace", "zerg_carapace");
		ZERG_FLESH = new BlockZergStructureFlesh("zerg_flesh", "zerg_flesh");
		DYED_IRON = new BlockDyedIronBlocks("dyed_iron", "dyed_iron");
		COMP_METAL = new BlockCompressedMetals("compressed_metal", "compressed_metal");
		COMP_MINERAL = new BlockCompressedMinerals("compressed_mineral", "compressed_mineral");
	}
	
	/**
	 * Register the blocks
	 */
	public static void register() {
		registerBlock(PROTOSS_METAL, new ItemBlockMeta(PROTOSS_METAL)); //Says that the block uses the ItemBlockMeta as the item block
		registerBlock(PYLON_CRYSTAL, new ItemBlockMeta(PYLON_CRYSTAL));
		registerBlock(ZERG_CARAPACE, new ItemBlockMeta(ZERG_CARAPACE));
		registerBlock(ZERG_FLESH, new ItemBlockMeta(ZERG_FLESH));
		registerBlock(DYED_IRON, new ItemBlockMeta(DYED_IRON));
		registerBlock(COMP_METAL, new ItemBlockMeta(COMP_METAL));
		registerBlock(COMP_MINERAL, new ItemBlockMeta(COMP_MINERAL));
	}
	
	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {
		for(int i = 0; i < EnumHandler.ProtossMetalType.values().length; i++) {
			registerRender(PROTOSS_METAL, i, "protoss_metal_" + EnumHandler.ProtossMetalType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.PylonCrystalType.values().length; i++) {
			registerRender(PYLON_CRYSTAL, i, "pcrystal_" + EnumHandler.PylonCrystalType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.ZergStructureCarapaceType.values().length; i++) {
			registerRender(ZERG_CARAPACE, i, "zerg_carapace_" + EnumHandler.ZergStructureCarapaceType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.ZergFleshType.values().length; i++) {
			registerRender(ZERG_FLESH, i, "zerg_flesh_" + EnumHandler.ZergFleshType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.DyedIronType.values().length; i++) {
			registerRender(DYED_IRON, i, "dyed_iron_" + EnumHandler.DyedIronType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.CompressedMetalType.values().length; i++) {
			registerRender(COMP_METAL, i, "compressed_metal_" + EnumHandler.CompressedMetalType.values()[i].getName());
		}
		for(int i = 0; i < EnumHandler.CompressedMineralType.values().length; i++) {
			registerRender(COMP_MINERAL, i, "compressed_mineral_" + EnumHandler.CompressedMineralType.values()[i].getName());
		}
	}
	
	/**
	 * Registers the block
	 * @param block The block to register
	 */
	public static void registerBlock(Block block) {
		block.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		LogHelper.logger.info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the block with a custom {@link ItemBlock}
	 * @param block The block
	 * @param itemBlock The {@link ItemBlock}
	 */
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		block.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		LogHelper.logger.info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the blocks renders
	 * @param block The block
	 */
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		LogHelper.logger.info("Registered render for " + block.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Registers the blocks renders even if it has meta data
	 * @param block The block
	 * @param meta The blocks meta data
	 * @param fileName The file name
	 */
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		LogHelper.logger.info("Register render for " + block.getUnlocalizedName().substring(5));
	}
	
}
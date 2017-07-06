package ga.scmc.blocks.metablocks;

import ga.scmc.handlers.BlockEnumHandler;
import ga.scmc.lib.LogHelper;
import ga.scmc.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

//I don't like this class. I'm gonna dust over it for 1.6
public class ModMetaBlocks {

	public static BlockCompressedMetalsT1 COMP_METAL_T1;
	public static Block COMP_MINERAL;
	public static BlockDyedIronBlocks DYED_IRON;
	public static BlockNeosteelMetal NEOSTEEL_METAL;
	public static BlockParisteelMetal PARISTEEL_METAL;
	public static BlockProtossMetalT1 PROTOSS_METAL_T1;
	public static BlockProtossMetalT2 PROTOSS_METAL_T2;
	public static BlockProtossMetalT3 PROTOSS_METAL_T3;
	public static BlockPylonCrystal PYLON_CRYSTAL;
	public static BlockZergStructureCarapace ZERG_CARAPACE;
	public static BlockZergStructureFlesh ZERG_FLESH;

	public static void init() {
		instantiate();
		register();
	}

	private static void instantiate() {
		PROTOSS_METAL_T1 = new BlockProtossMetalT1();
		PROTOSS_METAL_T2 = new BlockProtossMetalT2();
		PROTOSS_METAL_T3 = new BlockProtossMetalT3();
		PYLON_CRYSTAL = new BlockPylonCrystal();
		ZERG_CARAPACE = new BlockZergStructureCarapace();
		ZERG_FLESH = new BlockZergStructureFlesh();
		DYED_IRON = new BlockDyedIronBlocks();
		COMP_METAL_T1 = new BlockCompressedMetalsT1();
		NEOSTEEL_METAL = new BlockNeosteelMetal();
		PARISTEEL_METAL = new BlockParisteelMetal();
		COMP_MINERAL = new BlockCompressedMinerals();
	}

	/**
	 * Register the blocks
	 */
	private static void register() {
		registerBlock(PROTOSS_METAL_T1, new ItemBlockMeta(PROTOSS_METAL_T1)); // Says that the block uses the ItemBlockMeta as the item block
		registerBlock(PROTOSS_METAL_T2, new ItemBlockMeta(PROTOSS_METAL_T2));
		registerBlock(PROTOSS_METAL_T3, new ItemBlockMeta(PROTOSS_METAL_T3));
		registerBlock(PYLON_CRYSTAL, new ItemBlockMeta(PYLON_CRYSTAL));
		registerBlock(ZERG_CARAPACE, new ItemBlockMeta(ZERG_CARAPACE));
		registerBlock(ZERG_FLESH, new ItemBlockMeta(ZERG_FLESH));
		registerBlock(DYED_IRON, new ItemBlockMeta(DYED_IRON));
		registerBlock(COMP_METAL_T1, new ItemBlockMeta(COMP_METAL_T1));
		registerBlock(NEOSTEEL_METAL, new ItemBlockMeta(NEOSTEEL_METAL));
		registerBlock(PARISTEEL_METAL, new ItemBlockMeta(PARISTEEL_METAL));
		registerBlock(COMP_MINERAL, new ItemBlockMeta(COMP_MINERAL));
	}

	/**
	 * Registers the block
	 * @param block The block to register
	 */
	public static void registerBlock(Block block) {
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
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		// LogHelper.logger.info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the blocks renders
	 * @param block The block
	 */
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		// LogHelper.logger.info("Registered render for " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Registers the blocks renders even if it has meta data
	 * @param block The block
	 * @param meta The blocks meta data
	 * @param fileName The file name
	 */
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		// LogHelper.logger.info("Register render for " + block.getUnlocalizedName().substring(5));
	}

	/**
	 * Register the renders for the block
	 */
	public static void registerRenders() {
		for(int i = 0; i < BlockEnumHandler.ProtossMetalType.values().length; i++) {
			registerRender(PROTOSS_METAL_T1, i, "protoss_metal_t1_" + BlockEnumHandler.ProtossMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.ProtossMetalType.values().length; i++) {
			registerRender(PROTOSS_METAL_T2, i, "protoss_metal_t2_" + BlockEnumHandler.ProtossMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.ProtossMetalType.values().length; i++) {
			registerRender(PROTOSS_METAL_T3, i, "protoss_metal_t3_" + BlockEnumHandler.ProtossMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.PylonCrystalType.values().length; i++) {
			registerRender(PYLON_CRYSTAL, i, "pcrystal_" + BlockEnumHandler.PylonCrystalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.ZergStructureCarapaceType.values().length; i++) {
			registerRender(ZERG_CARAPACE, i, "zerg_carapace_" + BlockEnumHandler.ZergStructureCarapaceType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.ZergFleshType.values().length; i++) {
			registerRender(ZERG_FLESH, i, "zerg_flesh_" + BlockEnumHandler.ZergFleshType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.DyedIronType.values().length; i++) {
			registerRender(DYED_IRON, i, "dyed_iron_" + BlockEnumHandler.DyedIronType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.CompressedMetalType.values().length; i++) {
			registerRender(COMP_METAL_T1, i, "comp_metal_" + BlockEnumHandler.CompressedMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.NeosteelMetalType.values().length; i++) {
			registerRender(NEOSTEEL_METAL, i, "neosteel_" + BlockEnumHandler.NeosteelMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.ParisteelMetalType.values().length; i++) {
			registerRender(PARISTEEL_METAL, i, "paristeel_" + BlockEnumHandler.ParisteelMetalType.values()[i].getName());
		}
		for(int i = 0; i < BlockEnumHandler.CompressedMineralType.values().length; i++) {
			registerRender(COMP_MINERAL, i, "comp_mineral_" + BlockEnumHandler.CompressedMineralType.values()[i].getName());
		}
	}
}
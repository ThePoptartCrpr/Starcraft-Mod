package net.bvanseghi.starcraft.items;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * When wundr marks {@link Blockz} as done, then scrap this class!!!<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 */
public class ModItems extends Item {

	public ModItems() {
		super();
	}

	public static Item mineralShard;
	public static Item richMineralShard;

	public static Item vespene;

	public static Item psiBladeFocuserUncharged;
	public static Item darkPsiBladeFocuserUncharged;
	public static Item energy;
	public static Item protossArtifact;
	public static Item uraj;
	
	public static Item essence;
	public static Item c14Parts;

	public static Item ingot;
	public static Item dust;
	public static Item coord;

	public static Item C14GaussRifle;
	public static Item C14GaussRifleBullet;
	
	public static Item zergCarapace;
	public static Item creepResin;
	public static Item organicTissue;

	public static Item acidBucket;
	public static Item bloodBucket;
	
	public static Item protossModule;
	
	public static Item keystone;
	

	public static void init() {
		instantiate();
		register();
	}
	
	public static void instantiate() {
		mineralShard = new ItemMineralShard();
		richMineralShard = new ItemRichMineralShard();

		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged();
		darkPsiBladeFocuserUncharged = new ItemDarkPsiBladeFocuserUncharged();
		protossArtifact = new ItemProtossArtifact();
		uraj = new ItemUraj();
		protossModule = new ItemProtossModule();

		C14GaussRifle = new ItemC14GaussRifle().setFull3D();
		C14GaussRifleBullet = new ItemC14GaussRifleBullet();

		creepResin = new ItemCreepResin();
		organicTissue = new ItemOrganicTissue();
		
		keystone = new ItemKeystone();

		acidBucket = new ItemAcidBucket(ModBlocks.FLUID_ACID);
		bloodBucket = new ItemBloodBucket(ModBlocks.FLUID_BLOOD);
		ingot = new ItemIngot();
		dust = new ItemDust();
		coord = new ItemProtossCoordinates();
		essence = new ItemEssence();
		c14Parts = new ItemC14GaussRifleParts();
		vespene = new ItemVespene();
		zergCarapace = new ItemZergCarapace();
		energy = new ItemEnergy();
	}
	
	public static void register() {
		registerItem(mineralShard);
	}
	
	public static void registerRenders() {
		registerRender(mineralShard);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
	}
}
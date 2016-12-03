package net.bvanseghi.starcraft.proxy;

import net.bvanseghi.starcraft.armour.*;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.entity.EntityC14GaussRifleBullet;
import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.entity.EntityOverlord;
import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.entity.EntityScourge;
import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.entity.EntityZergling;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.model.ModelBroodling;
import net.bvanseghi.starcraft.model.ModelCivilian;
import net.bvanseghi.starcraft.model.ModelDarkProbe;
import net.bvanseghi.starcraft.model.ModelDarkTemplar;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.bvanseghi.starcraft.model.ModelLarvaCocoon;
import net.bvanseghi.starcraft.model.ModelOverlord;
import net.bvanseghi.starcraft.model.ModelProbe;
import net.bvanseghi.starcraft.model.ModelScourge;
import net.bvanseghi.starcraft.model.ModelZealot;
import net.bvanseghi.starcraft.model.ModelZergling;
import net.bvanseghi.starcraft.renderer.ItemRenderC14GaussRifle;
import net.bvanseghi.starcraft.renderer.ItemRenderMineralField;
import net.bvanseghi.starcraft.renderer.ItemRenderRichMineralField;
import net.bvanseghi.starcraft.renderer.ItemRenderRichVespeneGeyser;
import net.bvanseghi.starcraft.renderer.ItemRenderRichVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.ItemRenderRichVespeneGeyserShakuras;
import net.bvanseghi.starcraft.renderer.ItemRenderVespeneGeyser;
import net.bvanseghi.starcraft.renderer.ItemRenderVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.ItemRenderVespeneGeyserShakuras;
import net.bvanseghi.starcraft.renderer.ItemRenderWarpGateWormholeChar;
import net.bvanseghi.starcraft.renderer.ItemRenderWarpGateWormholeOverworld;
import net.bvanseghi.starcraft.renderer.ItemRenderWarpGateWormholeShakuras;
import net.bvanseghi.starcraft.renderer.RenderBroodling;
import net.bvanseghi.starcraft.renderer.RenderC14GaussRifleBullet;
import net.bvanseghi.starcraft.renderer.RenderCivilian;
import net.bvanseghi.starcraft.renderer.RenderDarkProbe;
import net.bvanseghi.starcraft.renderer.RenderDarkTemplar;
import net.bvanseghi.starcraft.renderer.RenderLarva;
import net.bvanseghi.starcraft.renderer.RenderLarvaCocoon;
import net.bvanseghi.starcraft.renderer.RenderMineralField;
import net.bvanseghi.starcraft.renderer.RenderOverlord;
import net.bvanseghi.starcraft.renderer.RenderProbe;
import net.bvanseghi.starcraft.renderer.RenderRichMineralField;
import net.bvanseghi.starcraft.renderer.RenderRichVespeneGeyser;
import net.bvanseghi.starcraft.renderer.RenderRichVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.RenderRichVespeneGeyserShakuras;
import net.bvanseghi.starcraft.renderer.RenderScourge;
import net.bvanseghi.starcraft.renderer.RenderVespeneGeyser;
import net.bvanseghi.starcraft.renderer.RenderVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.RenderVespeneGeyserShakuras;
import net.bvanseghi.starcraft.renderer.RenderWarpGateWormholeChar;
import net.bvanseghi.starcraft.renderer.RenderWarpGateWormholeOverworld;
import net.bvanseghi.starcraft.renderer.RenderWarpGateWormholeShakuras;
import net.bvanseghi.starcraft.renderer.RenderZealot;
import net.bvanseghi.starcraft.renderer.RenderZergling;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockMineralField;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichMineralField;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyser;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyserChar;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyserShakuras;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyser;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyserChar;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyserShakuras;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeChar;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeOverworld;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeShakuras;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ClientProxy implements IProxy {

	public void registerRenderObjects() {

		// Blocks
		
		TileEntitySpecialRenderer renderMineralField = new RenderMineralField();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockMineralField.class, renderMineralField);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.mineralField),
				new ItemRenderMineralField(renderMineralField, new TileEntityBlockMineralField()));

		TileEntitySpecialRenderer renderRichMineralField = new RenderRichMineralField();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockRichMineralField.class, renderRichMineralField);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.richMineralField),
				new ItemRenderRichMineralField(renderRichMineralField, new TileEntityBlockRichMineralField()));

		TileEntitySpecialRenderer renderVespeneGeyser = new RenderVespeneGeyser();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockVespeneGeyser.class, renderVespeneGeyser);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.vespeneGeyser),
				new ItemRenderVespeneGeyser(renderVespeneGeyser, new TileEntityBlockVespeneGeyser()));

		TileEntitySpecialRenderer renderRichVespeneGeyser = new RenderRichVespeneGeyser();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockRichVespeneGeyser.class, renderRichVespeneGeyser);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.richVespeneGeyser),
				new ItemRenderRichVespeneGeyser(renderRichVespeneGeyser, new TileEntityBlockRichVespeneGeyser()));

		TileEntitySpecialRenderer renderVespeneGeyserChar = new RenderVespeneGeyserChar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockVespeneGeyserChar.class, renderVespeneGeyserChar);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.vespeneGeyserChar),
				new ItemRenderVespeneGeyserChar(renderVespeneGeyserChar, new TileEntityBlockVespeneGeyserChar()));

		TileEntitySpecialRenderer renderRichVespeneGeyserChar = new RenderRichVespeneGeyserChar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockRichVespeneGeyserChar.class,
				renderRichVespeneGeyserChar);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.richVespeneGeyserChar),
				new ItemRenderRichVespeneGeyserChar(renderRichVespeneGeyserChar,
						new TileEntityBlockRichVespeneGeyserChar()));

		TileEntitySpecialRenderer renderVespeneGeyserShakuras = new RenderVespeneGeyserShakuras();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockVespeneGeyserShakuras.class, renderVespeneGeyserShakuras);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.vespeneGeyserShakuras),
				new ItemRenderVespeneGeyserShakuras(renderVespeneGeyserShakuras, new TileEntityBlockVespeneGeyserShakuras()));

		TileEntitySpecialRenderer renderRichVespeneGeyserShakuras = new RenderRichVespeneGeyserShakuras();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockRichVespeneGeyserShakuras.class,
				renderRichVespeneGeyserShakuras);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.richVespeneGeyserShakuras),
				new ItemRenderRichVespeneGeyserShakuras(renderRichVespeneGeyserShakuras,
						new TileEntityBlockRichVespeneGeyserShakuras()));
		
		TileEntitySpecialRenderer renderWarpGateWormholeChar = new RenderWarpGateWormholeChar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockWarpGateWormholeChar.class,
				renderWarpGateWormholeChar);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.warpGateWormholeChar),
				new ItemRenderWarpGateWormholeChar(renderWarpGateWormholeChar, new TileEntityBlockWarpGateWormholeChar())); // FIX
																															// ME
		
		TileEntitySpecialRenderer renderWarpGateWormholeOverworld = new RenderWarpGateWormholeOverworld();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockWarpGateWormholeOverworld.class,
				renderWarpGateWormholeOverworld);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.warpGateWormholeOverworld),
				new ItemRenderWarpGateWormholeOverworld(renderWarpGateWormholeOverworld, new TileEntityBlockWarpGateWormholeOverworld()));
		
		TileEntitySpecialRenderer renderWarpGateWormholeShakuras = new RenderWarpGateWormholeShakuras();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockWarpGateWormholeShakuras.class,
				renderWarpGateWormholeShakuras);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.warpGateWormholeShakuras),
				new ItemRenderWarpGateWormholeShakuras(renderWarpGateWormholeShakuras, new TileEntityBlockWarpGateWormholeShakuras()));

		// Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva(new ModelLarva(), 0.3F));

		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class,
				new RenderLarvaCocoon(new ModelLarvaCocoon(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class,
				new RenderBroodling(new ModelBroodling(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class,
				new RenderZergling(new ModelZergling(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityScourge.class,
				new RenderScourge(new ModelScourge(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityOverlord.class,
				new RenderOverlord(new ModelOverlord(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class,
				new RenderCivilian(new ModelCivilian(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(new ModelProbe(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, new RenderZealot(new ModelZealot(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar(new ModelDarkTemplar(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class,
				new RenderDarkProbe(new ModelDarkProbe(), 0.0F));

		// Item entities

		RenderingRegistry.registerEntityRenderingHandler(EntityC14GaussRifleBullet.class,
				new RenderC14GaussRifleBullet());

		MinecraftForgeClient.registerItemRenderer(ModItems.C14GaussRifle,
				(IItemRenderer) new ItemRenderC14GaussRifle());
	}
	
	@Override
	public void setModels() {
		
		///
		/// TO USE: ModelLoader.setCustomModelResourceLocation(item instance, metadata, new ModelResourceLocation(item class.REGISTRY_RL, "inventory"));
		/// IF NO "REGISTRY_RL" IS DEFINED MAKE ONE USING THE CONVENTIONS FOUND IN THE ARMOURS
		///
		
		//Copper armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperBoots, 0, new ModelResourceLocation(ArmourCopperBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperChestplate, 0, new ModelResourceLocation(ArmourCopperChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperHelmet, 0, new ModelResourceLocation(ArmourCopperHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.copperLeggings, 0, new ModelResourceLocation(ArmourCopperLeggings.REGISTRY_RL, "inventory"));
		
		//Ghost armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostBoots, 0, new ModelResourceLocation(ArmourGhostBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostChestplate, 0, new ModelResourceLocation(ArmourGhostChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostHelmet, 0, new ModelResourceLocation(ArmourGhostHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.ghostLeggings, 0, new ModelResourceLocation(ArmourGhostLeggings.REGISTRY_RL, "inventory"));
		
		//Steel armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelBoots, 0, new ModelResourceLocation(ArmourSteelBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelChestplate, 0, new ModelResourceLocation(ArmourSteelChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelHelmet, 0, new ModelResourceLocation(ArmourSteelHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.steelLeggings, 0, new ModelResourceLocation(ArmourSteelLeggings.REGISTRY_RL, "inventory"));
		
		//Titanium armour
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumBoots, 0, new ModelResourceLocation(ArmourTitaniumBoots.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumChestplate, 0, new ModelResourceLocation(ArmourTitaniumChestplate.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumHelmet, 0, new ModelResourceLocation(ArmourTitaniumHelmet.REGISTRY_RL, "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModArmour.titaniumLeggings, 0, new ModelResourceLocation(ArmourTitaniumLeggings.REGISTRY_RL, "inventory"));
	}
}

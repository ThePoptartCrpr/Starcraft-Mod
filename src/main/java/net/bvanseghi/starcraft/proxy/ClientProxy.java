package net.bvanseghi.starcraft.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.entity.EntityC14GaussRifleBullet;
import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.entity.EntityOverlord;
import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.entity.EntityScourge;
import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.model.ModelBroodling;
import net.bvanseghi.starcraft.model.ModelCivilian;
import net.bvanseghi.starcraft.model.ModelDarkProbe;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.bvanseghi.starcraft.model.ModelLarvaCocoon;
import net.bvanseghi.starcraft.model.ModelOverlord;
import net.bvanseghi.starcraft.model.ModelProbe;
import net.bvanseghi.starcraft.model.ModelScourge;
import net.bvanseghi.starcraft.model.ModelZealot;
import net.bvanseghi.starcraft.renderer.ItemRenderC14GaussRifle;
import net.bvanseghi.starcraft.renderer.ItemRenderMineralField;
import net.bvanseghi.starcraft.renderer.ItemRenderRichMineralField;
import net.bvanseghi.starcraft.renderer.ItemRenderRichVespeneGeyser;
import net.bvanseghi.starcraft.renderer.ItemRenderRichVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.ItemRenderVespeneGeyser;
import net.bvanseghi.starcraft.renderer.ItemRenderVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.RenderBroodling;
import net.bvanseghi.starcraft.renderer.RenderC14GaussRifleBullet;
import net.bvanseghi.starcraft.renderer.RenderCivilian;
import net.bvanseghi.starcraft.renderer.RenderDarkProbe;
import net.bvanseghi.starcraft.renderer.RenderLarva;
import net.bvanseghi.starcraft.renderer.RenderLarvaCocoon;
import net.bvanseghi.starcraft.renderer.RenderMineralField;
import net.bvanseghi.starcraft.renderer.RenderOverlord;
import net.bvanseghi.starcraft.renderer.RenderProbe;
import net.bvanseghi.starcraft.renderer.RenderRichMineralField;
import net.bvanseghi.starcraft.renderer.RenderRichVespeneGeyser;
import net.bvanseghi.starcraft.renderer.RenderRichVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.RenderScourge;
import net.bvanseghi.starcraft.renderer.RenderVespeneGeyser;
import net.bvanseghi.starcraft.renderer.RenderVespeneGeyserChar;
import net.bvanseghi.starcraft.renderer.RenderWarpGateWormholeChar;
import net.bvanseghi.starcraft.renderer.RenderZealot;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockMineralField;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichMineralField;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyser;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyserChar;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyser;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockVespeneGeyserChar;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeChar;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

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

		TileEntitySpecialRenderer renderWarpGateWormholeChar = new RenderWarpGateWormholeChar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockWarpGateWormholeChar.class,
				renderWarpGateWormholeChar);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.warpGateWormholeChar),
				new ItemRenderRichVespeneGeyser(renderWarpGateWormholeChar, new TileEntityBlockWarpGateWormholeChar())); // FIX
																															// ME

		// Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva(new ModelLarva(), 0.3F));

		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class,
				new RenderLarvaCocoon(new ModelLarvaCocoon(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class,
				new RenderBroodling(new ModelBroodling(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityScourge.class,
				new RenderScourge(new ModelScourge(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityOverlord.class,
				new RenderOverlord(new ModelOverlord(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class,
				new RenderCivilian(new ModelCivilian(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(new ModelProbe(), 0.0F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, new RenderZealot(new ModelZealot(), 0.0F));

		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class,
				new RenderDarkProbe(new ModelDarkProbe(), 0.0F));

		// Item entities

		RenderingRegistry.registerEntityRenderingHandler(EntityC14GaussRifleBullet.class,
				new RenderC14GaussRifleBullet());

		MinecraftForgeClient.registerItemRenderer(ModItems.C14GaussRifle,
				(IItemRenderer) new ItemRenderC14GaussRifle());
	}

	public void registerTileEntitySpecialRenderer() {

	}

}

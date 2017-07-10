package ga.scmc.events;

import ga.scmc.lib.Reference.ModItems;
import ga.scmc.renderer.ItemRenderC14GaussRifle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Puts the C14 rendery whatsit into the whatever thing<br>
 * Copyright (c) 2017 the Starcraft Minecraft (SCMC) mod team
 * @author wundrweapon
 */
@EventBusSubscriber
public class MadelBakeEventHandler {
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onModelBake(ModelBakeEvent event) {
		event.getModelRegistry().putObject(new ModelResourceLocation(ModItems.WEAPON_RIFLE_C14_GAUSS.getRegistryRL(), "inventory"), new ItemRenderC14GaussRifle());
	}
}

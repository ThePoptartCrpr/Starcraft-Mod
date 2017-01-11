package net.bvanseghi.starcraft.proxy;

import net.bvanseghi.starcraft.armour.ArmourCopperBoots;
import net.bvanseghi.starcraft.armour.ArmourCopperChestplate;
import net.bvanseghi.starcraft.armour.ArmourCopperHelmet;
import net.bvanseghi.starcraft.armour.ArmourCopperLeggings;
import net.bvanseghi.starcraft.armour.ArmourGhostBoots;
import net.bvanseghi.starcraft.armour.ArmourGhostChestplate;
import net.bvanseghi.starcraft.armour.ArmourGhostHelmet;
import net.bvanseghi.starcraft.armour.ArmourGhostLeggings;
import net.bvanseghi.starcraft.armour.ArmourSteelBoots;
import net.bvanseghi.starcraft.armour.ArmourSteelChestplate;
import net.bvanseghi.starcraft.armour.ArmourSteelHelmet;
import net.bvanseghi.starcraft.armour.ArmourSteelLeggings;
import net.bvanseghi.starcraft.armour.ArmourTitaniumBoots;
import net.bvanseghi.starcraft.armour.ArmourTitaniumChestplate;
import net.bvanseghi.starcraft.armour.ArmourTitaniumHelmet;
import net.bvanseghi.starcraft.armour.ArmourTitaniumLeggings;
import net.bvanseghi.starcraft.armour.ModArmour;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.entity.EntityBroodling;
import net.bvanseghi.starcraft.entity.EntityBrutalisk;
import net.bvanseghi.starcraft.entity.EntityCivilian;
import net.bvanseghi.starcraft.entity.EntityDarkProbe;
import net.bvanseghi.starcraft.entity.EntityDarkTemplar;
import net.bvanseghi.starcraft.entity.EntityLarva;
import net.bvanseghi.starcraft.entity.EntityLarvaCocoon;
import net.bvanseghi.starcraft.entity.EntityProbe;
import net.bvanseghi.starcraft.entity.EntityZealot;
import net.bvanseghi.starcraft.entity.EntityZergling;
import net.bvanseghi.starcraft.model.ModelBroodling;
import net.bvanseghi.starcraft.model.ModelBrutalisk;
import net.bvanseghi.starcraft.model.ModelCivilian;
import net.bvanseghi.starcraft.model.ModelDarkProbe;
import net.bvanseghi.starcraft.model.ModelDarkTemplar;
import net.bvanseghi.starcraft.model.ModelLarva;
import net.bvanseghi.starcraft.model.ModelLarvaCocoon;
import net.bvanseghi.starcraft.model.ModelProbe;
import net.bvanseghi.starcraft.model.ModelZealot;
import net.bvanseghi.starcraft.model.ModelZergling;
import net.bvanseghi.starcraft.renderer.RenderBroodling;
import net.bvanseghi.starcraft.renderer.RenderBrutalisk;
import net.bvanseghi.starcraft.renderer.RenderCivilian;
import net.bvanseghi.starcraft.renderer.RenderDarkProbe;
import net.bvanseghi.starcraft.renderer.RenderDarkTemplar;
import net.bvanseghi.starcraft.renderer.RenderLarva;
import net.bvanseghi.starcraft.renderer.RenderLarvaCocoon;
import net.bvanseghi.starcraft.renderer.RenderProbe;
import net.bvanseghi.starcraft.renderer.RenderZealot;
import net.bvanseghi.starcraft.renderer.RenderZergling;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ClientProxy extends ServerProxy {

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
	
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZealot.class, new RenderZealot(Minecraft.getMinecraft().getRenderManager(), new ModelZealot(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityProbe.class, new RenderProbe(Minecraft.getMinecraft().getRenderManager(), new ModelProbe(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkTemplar.class, new RenderDarkTemplar(Minecraft.getMinecraft().getRenderManager(), new ModelDarkTemplar(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkProbe.class, new RenderDarkProbe(Minecraft.getMinecraft().getRenderManager(), new ModelDarkProbe(), 0.4f)); //use depricated method
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBrutalisk.class, new RenderBrutalisk(Minecraft.getMinecraft().getRenderManager(), new ModelBrutalisk(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityZergling.class, new RenderZergling(Minecraft.getMinecraft().getRenderManager(), new ModelZergling(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityLarva.class, new RenderLarva(Minecraft.getMinecraft().getRenderManager(), new ModelLarva(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityLarvaCocoon.class, new RenderLarvaCocoon(Minecraft.getMinecraft().getRenderManager(), new ModelLarvaCocoon(), 0.4f)); //use depricated method
		RenderingRegistry.registerEntityRenderingHandler(EntityBroodling.class, new RenderBroodling(Minecraft.getMinecraft().getRenderManager(), new ModelBroodling(), 0.4f)); //use depricated method
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCivilian.class, new RenderCivilian(Minecraft.getMinecraft().getRenderManager(), new ModelCivilian(), 0.4f)); //use depricated method
		
	}
	
	
	
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.registerModels();
		//GameRegistry.registerWorldGenerator(new SCWorldGen(), 0);
	}
}

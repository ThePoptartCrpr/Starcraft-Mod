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
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.worldgen.SCWorldGen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ClientProxy extends CommonProxy {

	public void registerRenders() {
		ModBlocks.registerRenders();
	}
	
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
	
	
	
	public void init() {
		ModBlocks.registerRenders();
		//GameRegistry.registerWorldGenerator(new SCWorldGen(), 0);
	}
}

package net.bvanseghi.starcraft.items;

//import com.mojang.authlib.GameProfile;

import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ModItems extends Item {

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

	public static Item C14GaussRifle;
	public static Item C14GaussRifleBullet;
	
	public static Item zergCarapace;
	public static Item creepResin;
	public static Item organicTissue;

	public static Item acidBucket;
	public static Item bloodBucket;

	
	public static void preInit() {
		// Initialize items here.
		mineralShard = new ItemMineralShard();
		richMineralShard = new ItemRichMineralShard();

		psiBladeFocuserUncharged = new ItemPsiBladeFocuserUncharged();
		darkPsiBladeFocuserUncharged = new ItemDarkPsiBladeFocuserUncharged();
		protossArtifact = new ItemProtossArtifact();
		uraj = new ItemUraj();

		C14GaussRifle = new ItemC14GaussRifle().setFull3D();
		C14GaussRifleBullet = new ItemC14GaussRifleBullet();

		creepResin = new ItemCreepResin();
		organicTissue = new ItemOrganicTissue();

		acidBucket = new ItemAcidBucket(ModBlocks.fluidAcid);
		bloodBucket = new ItemBloodBucket(ModBlocks.fluidAcid);
		
		for(int i = 0; i < ItemIngot.names.length; i++){
			ingot = new ItemIngot().setUnlocalizedName("ingot");
		}
		
		for(int i = 0; i < ItemEssence.names.length; i++){
			essence = new ItemEssence().setUnlocalizedName("essence");
		}
		
		for(int i = 0; i < ItemC14GaussRifleParts.names.length; i++){
			c14Parts = new ItemC14GaussRifleParts().setUnlocalizedName("c14Parts");
		}
		
		for(int i = 0; i < ItemVespene.names.length; i++){
			vespene = new ItemVespene().setUnlocalizedName("vespene");
		}
		
		for(int i = 0; i < ItemZergCarapace.names.length; i++){
			zergCarapace = new ItemZergCarapace().setUnlocalizedName("zergCarapace");
		}
		
		for(int i = 0; i < ItemC14GaussRifleParts.names.length; i++){
			energy = new ItemEnergy().setUnlocalizedName("energy");
		}

		// Register the items to the game here.
		GameRegistry.registerItem(mineralShard, ItemMineralShard.name);
		GameRegistry.registerItem(richMineralShard, ItemRichMineralShard.name);

		GameRegistry.registerItem(psiBladeFocuserUncharged, ItemPsiBladeFocuserUncharged.name);
		GameRegistry.registerItem(darkPsiBladeFocuserUncharged, ItemDarkPsiBladeFocuserUncharged.name);
		GameRegistry.registerItem(protossArtifact, ItemProtossArtifact.name);
		GameRegistry.registerItem(uraj, ItemUraj.name);

		GameRegistry.registerItem(C14GaussRifle, "c14GaussRifle");
		GameRegistry.registerItem(C14GaussRifleBullet, ItemC14GaussRifleBullet.name);

		GameRegistry.registerItem(creepResin, ItemCreepResin.name);
		GameRegistry.registerItem(organicTissue, ItemOrganicTissue.name);
		
		GameRegistry.registerItem(ingot, REFERENCE.MODID + (ingot.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(essence, REFERENCE.MODID + (essence.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(c14Parts, REFERENCE.MODID + (c14Parts.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(vespene, REFERENCE.MODID + (vespene.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(zergCarapace, REFERENCE.MODID + (zergCarapace.getUnlocalizedName().substring(5)));
		GameRegistry.registerItem(energy, REFERENCE.MODID + (energy.getUnlocalizedName().substring(5)));
		
	}

	public ModItems(String unlocalizedname, String texturename) {
		super();

		this.setCreativeTab(CreativeTab.TabStarcraftMaterials);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + unlocalizedname);
		this.setTextureName(REFERENCE.Texture_Path + texturename);
	}
}

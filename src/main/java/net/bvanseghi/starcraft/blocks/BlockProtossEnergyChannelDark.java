package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockProtossEnergyChannelDark extends Block {
	public static final String name = "protossEnergyChannelDark";
	
	@SideOnly(Side.CLIENT)
	private IIcon topTexture;
	
	public BlockProtossEnergyChannelDark(String textureName){
		super(Material.rock);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("protossEnergyChannelDark");
		this.setBlockName("protossEnergyChannelDark");
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		this.textureName = textureName;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(REFERENCE.MODID + ":" + "protossEnergyChannelDark");
		this.topTexture = reg.registerIcon(REFERENCE.MODID + ":" + "protossMetalDark");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		if(side == 1 || side == 0){
			return this.topTexture;
		}
		
		return this.blockIcon;
	}
	
	public Item getItemDropped(int meta, Random rand, int par1)
    {
			return ModItems.energy;
    }
	
	public int damageDropped(int meta)
    {
			return 1;
    }	
}

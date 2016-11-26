package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockProtossEnergyChannelDark extends Block {
	public static final String name = "protossEnergyChannelDark";
	
	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon topTexture;
	
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
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
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
	}*/
	
	public Item getItemDropped(int meta, Random rand, int par1)
    {
			return ModItems.energy;
    }
	
	public int damageDropped(int meta)
    {
			return 1;
    }	
}

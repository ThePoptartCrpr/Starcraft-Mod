package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockProtossEnergyChannel extends Block {
	public static final String name = "protoss_cnergy_channel";
	
	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon topTexture;
	
	public BlockProtossEnergyChannel(String textureName) {
		super(Material.ROCK);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
//		setBlockTextureName("protossEnergyChannel");
//		setBlockName("protossEnergyChannel");
		setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon(REFERENCE.MODID + ":" + "protossEnergyChannel");
		this.topTexture = reg.registerIcon(REFERENCE.MODID + ":" + "protossMetalAiur");
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
			return 0;
    }	
}

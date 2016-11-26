package net.bvanseghi.starcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockProtossEnergyStabilizerDark extends Block {

		private static String textureName;
		
		//TODO: Figure out how textures work now.
//		@SideOnly(Side.CLIENT)
//		private IIcon topTexture;
		
		@SuppressWarnings("static-access")
		public BlockProtossEnergyStabilizerDark(String textureName){
			super(Material.rock);
			setStepSound(soundTypeMetal);
			setHardness(5.0F);
			setLightLevel(1.0F);
			setResistance(30.0F);
			setHarvestLevel("pickaxe", 3);
			this.setBlockTextureName("protossEnergyStabilizerDark");
			this.setBlockName("protossEnergyStabilizerDark");
			this.setCreativeTab(CreativeTab.TabStarcraftDecorativeBlocks);
			this.textureName = textureName;
		}
		
		//TODO: Figure out how textures work now.
		/*@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister reg){
			this.blockIcon = reg.registerIcon(REFERENCE.MODID + ":" + textureName + "_side");
			this.topTexture = reg.registerIcon(REFERENCE.MODID + ":" + textureName + "_top");
		}
		
		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int side, int meta){
			if(side == 1){
				return this.topTexture;
			}
			
			return this.blockIcon;
		}*/
}

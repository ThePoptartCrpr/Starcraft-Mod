package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockProtossEnergyStabilizer extends Block {

		private static String textureName;
		
		//TODO: Figure out how textures work now.
//		@SideOnly(Side.CLIENT)
//		private IIcon topTexture;
		
		@SuppressWarnings("static-access")
		public BlockProtossEnergyStabilizer(String textureName){
			super(Material.ROCK);
			setStepSound(soundTypeMetal);
			setHardness(5.0F);
			setLightLevel(1.0F);
			setResistance(30.0F);
			setHarvestLevel("pickaxe", 3);
			this.setBlockTextureName("protossEnergyStabilizer");
			this.setBlockName("protossEnergyStabilizer");
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

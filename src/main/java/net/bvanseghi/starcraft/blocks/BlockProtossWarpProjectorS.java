package net.bvanseghi.starcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockProtossWarpProjectorS extends ModBlocks {

	private static String textureName;
	
	@SideOnly(Side.CLIENT)
	private IIcon topTexture;
	
	public BlockProtossWarpProjectorS(String textureName){
		super(Material.rock);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("warpProjectorS");
		this.setBlockName("warpProjectorS");
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
		this.textureName = textureName;
	}
	
	@SideOnly(Side.CLIENT)
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
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		world.setBlock(x, y + 3, z, ModBlocks.warpGateWormholeShakuras);
        return true;
    }

}

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

public class BlockProtossWarpProjectorO extends ModBlocks {

	private static String textureName;
	
	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon topTexture;
	
	@SuppressWarnings("static-access")
	public BlockProtossWarpProjectorO(String textureName){
		super(Material.rock);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("warpProjectorO");
		this.setBlockName("warpProjectorO");
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
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
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		world.setBlock(x, y + 3, z, ModBlocks.warpGateWormholeOverworld);
        return true;
    }

}

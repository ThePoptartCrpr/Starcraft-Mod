package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.CreativeTab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockProtossWarpProjectorC extends ModBlocks {
//	private static String textureName;
	
	//TODO: Figure out how textures work now.
//	@SideOnly(Side.CLIENT)
//	private IIcon topTexture;
	
	public BlockProtossWarpProjectorC(String textureName){
		super(Material.ROCK);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setLightLevel(1.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
//		thissetBlockTextureName("warpProjectorC");
//		this.setBlockName("warpProjectorC");
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
//		this.textureName = textureName;
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
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack stack, EnumFacing side, float hitX, float hitY, float hitZ) {
		world.setBlockState(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()), ModBlocks.warpGateWormholeChar.getDefaultState(), 3);
        return true;
    }
}

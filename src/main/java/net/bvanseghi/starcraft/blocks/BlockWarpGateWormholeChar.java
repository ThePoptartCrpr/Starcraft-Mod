package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeChar;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWarpGateWormholeChar extends BlockContainer {
	public static final String name = "warpGateWormholeChar";

	public BlockWarpGateWormholeChar(Material material) {
		super(material);

		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(0.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(null);
	}

	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(REFERENCE.MODID + ":" + "mineralField");
	}*/

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockWarpGateWormholeChar();
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		Library.blockCube(world, ModBlocks.dimPortalChar.getDefaultState(), pos, 3);
	}
}

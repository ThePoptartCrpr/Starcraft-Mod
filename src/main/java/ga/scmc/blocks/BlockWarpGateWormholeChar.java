package ga.scmc.blocks;

import ga.scmc.lib.Library;
import ga.scmc.lib.Reference;
import ga.scmc.tileentity.TileEntityBlockWarpGateWormholeChar;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockWarpGateWormholeChar extends BlockContainer {

	public BlockWarpGateWormholeChar(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_WARP_GATE_WORMHOLE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_WARP_GATE_WORMHOLE_C.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(0.0F);
		setLightLevel(1.0F);
		setCreativeTab(null);
	}

	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockWarpGateWormholeChar();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		Library.blockCube(world, ModBlocks.DIM_PORTAL_CHAR.getDefaultState(), pos, 3);
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}

package scmc.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import scmc.lib.Library;
import scmc.lib.Reference;
import scmc.tileentity.TileEntityBlockWarpGateWormholeShakuras;

public class BlockWarpGateWormholeShakuras extends BlockContainer {

	public BlockWarpGateWormholeShakuras(Material material) {
		super(material);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_WARP_GATE_WORMHOLE_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_WARP_GATE_WORMHOLE_S.getRegistryRL());
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(0.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(null);
	}

	@Override
	public TileEntity createNewTileEntity(World par1, int par2) {
		return new TileEntityBlockWarpGateWormholeShakuras();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		Library.blockCube(world, ModBlocks.DIM_PORTAL_SHAKURAS.getDefaultState(), pos, 3);
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}
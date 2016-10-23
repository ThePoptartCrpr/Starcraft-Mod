package net.bvanseghi.starcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.lib.Library;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockWarpGateWormholeOverworld;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWarpGateWormholeOverworld extends BlockContainer {
	public static final String name = "warpGateWormholeOverworld";

	public BlockWarpGateWormholeOverworld(Material material) {
		super(material);

		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(0.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(null);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(REFERENCE.MODID + ":" + "mineralField");
	}

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
		return new TileEntityBlockWarpGateWormholeOverworld();
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		Library.blockCube(world, ModBlocks.dimPortalOverworld, x, y, z);
	}
}

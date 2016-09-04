package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichVespeneGeyserChar;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRichVespeneGeyserChar extends BlockContainer {

	public static final String name = "richVespeneGeyserChar";

	public BlockRichVespeneGeyserChar(Material material) {
		super(material);

		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	@Override
	public Item getItemDropped(int par1, Random par2, int par3) {
		return ModItems.vespene;
	}
	
	public int damageDropped(int meta) {
		return 3;
	}

	public int quantityDropped(Random par1) {
		return 7 + par1.nextInt(2);
	}

	protected boolean canSilkHarvest() {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(REFERENCE.MODID + ":" + "vespeneGeyserBaseChar");
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
		return new TileEntityBlockRichVespeneGeyserChar();
	}

}

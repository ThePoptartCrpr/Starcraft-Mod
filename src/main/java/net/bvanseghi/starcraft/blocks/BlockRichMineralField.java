package net.bvanseghi.starcraft.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.bvanseghi.starcraft.tileentity.TileEntityBlockRichMineralField;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRichMineralField extends BlockContainer {

	public static final String name = "richMineralField";

	public BlockRichMineralField(Material material) {
		super(material);

		setStepSound(soundTypeStone);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.85F, 1.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return ModItems.richMineralShard;
	}

	public int quantityDropped(Random par1) {
		return 4 + par1.nextInt(2);
	}

	protected boolean canSilkHarvest() {
		return true;
	}
	
	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(REFERENCE.MODID + ":" + "richMineralField");
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
		return new TileEntityBlockRichMineralField();
	}

}

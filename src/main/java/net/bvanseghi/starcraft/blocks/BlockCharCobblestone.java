package net.bvanseghi.starcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockCharCobblestone extends ModBlocks {

	public static final String name = "charCobblestone";

	public BlockCharCobblestone() {
		super(name, name, Material.rock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setResistance(5.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	public int damageDropped(int par1) {
		return par1;

	}

}
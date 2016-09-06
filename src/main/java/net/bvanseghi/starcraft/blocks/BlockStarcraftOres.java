package net.bvanseghi.starcraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStarcraftOres extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	public static final String[] subBlocks = new String[] { "Mineral", "RichMineral", "Alien", "Titanium", "LapisC",

			// 5-15
			"CoalC", "IronC", "GoldC", "RedstoneC", "Copper", "DiamondC", "MineralC", "RichMineralC", "AlienC",
			"TitaniumC", "CopperC" };

	public BlockStarcraftOres() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 2, 0);
		this.setHarvestLevel("pickaxe", 2, 1);
		this.setHarvestLevel("pickaxe", 2, 2);
		this.setHarvestLevel("pickaxe", 2, 3);
		this.setHarvestLevel("pickaxe", 2, 4);
		this.setHarvestLevel("pickaxe", 2, 5);
		this.setHarvestLevel("pickaxe", 2, 6);
		this.setHarvestLevel("pickaxe", 2, 7);
		this.setHarvestLevel("pickaxe", 2, 8);
		this.setHarvestLevel("pickaxe", 2, 9);
		this.setHarvestLevel("pickaxe", 2, 10);
		this.setHarvestLevel("pickaxe", 2, 11);
		this.setHarvestLevel("pickaxe", 2, 12);
		this.setHarvestLevel("pickaxe", 2, 13);
		this.setHarvestLevel("pickaxe", 2, 14);
		this.setHarvestLevel("pickaxe", 2, 15);
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTab.TabStarcraftBuildingBlocks);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		texture = new IIcon[subBlocks.length];

		for (int i = 0; i < subBlocks.length; i++) {
			texture[i] = iconRegister.registerIcon(REFERENCE.MODID + ":" + "ore" + subBlocks[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < subBlocks.length; i++) {
			list.add(new ItemStack(block, 1, i));
		}

	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return texture[meta];
	}
	
	public Item getItemDropped(int meta, Random p_149650_2_, int p_149650_3_)
    {
		if(meta == 0){
			return ModItems.mineralShard;
		}else if(meta == 1){
			return ModItems.richMineralShard;
		}else if(meta == 5){
			return Items.coal;
		}else if(meta == 8){
			return Items.redstone;
		}else if(meta == 9){
			return Items.dye;
		}else if(meta == 10){
			return Items.diamond;
		}else if(meta == 11){
			return ModItems.mineralShard;
		}else if(meta == 12){
			return ModItems.richMineralShard;
		}
		return Item.getItemFromBlock(this);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
	public int quantityDropped(int meta, int fortune, Random random)
    {
		if(meta == 0 || meta == 1 || meta == 9 || meta == 11 || meta == 12) {
			return 4 + random.nextInt(4);
		}else if(meta == 8) {
			return 4 + random.nextInt(1);
		}
		return 1;
    }
	
    public int damageDropped(int meta)
    {
    	if(meta == 0){
    		return this == ModBlocks.ores ? 0 : 1;
    	}else if(meta == 1){
    		return this == ModBlocks.ores ? 1 : 1;
    	}else if(meta == 2){
    		return this == ModBlocks.ores ? 2 : 1;
    	}else if(meta == 3){
    		return this == ModBlocks.ores ? 3 : 1;
    	}else if(meta == 4){
    		return this == ModBlocks.ores ? 4 : 1;
    	}else if(meta == 5){
    		return this == ModBlocks.ores ? 5 : 1;
    	}else if(meta == 6){
    		return this == ModBlocks.ores ? 6 : 1;
    	}else if(meta == 7){
    		return this == ModBlocks.ores ? 7 : 1;
    	}else if(meta == 8){
    		return this == ModBlocks.ores ? 8 : 1;
    	}else if(meta == 9){
    		return this == ModBlocks.ores ? 9 : 1;
    	}else if(meta == 10){
    		return this == ModBlocks.ores ? 10 : 1;
    	}else if(meta == 11){
    		return this == ModBlocks.ores ? 11 : 1;
    	}else if(meta == 12){
    		return this == ModBlocks.ores ? 12 : 1;
    	}else if(meta == 13){
    		return this == ModBlocks.ores ? 13 : 1;
    	}else if(meta == 14){
    		return this == ModBlocks.ores ? 14 : 1;
    	}else if(meta == 15){
    		return this == ModBlocks.ores ? 15 : 1;
    	}
    	return 0;
    }
}
package net.bvanseghi.starcraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.bvanseghi.starcraft.CreativeTab;
import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.handlers.BucketHandler;
import net.bvanseghi.starcraft.lib.REFERENCE;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class ItemBloodBucket extends ItemBucket {

	public ItemBloodBucket(Block block) {
		super(block);

		this.setTextureName(REFERENCE.MODID + ":bloodBucket");
		this.setCreativeTab(CreativeTab.TabStarcraftMisc);

	}

}

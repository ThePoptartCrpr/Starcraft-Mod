package ga.scmc.blocks.orechar;

import java.util.Random;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/orechar/OreCharRedstone.java
=======
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/orechar/OreCharRedstone.java

public class OreCharRedstone extends ModBlocks {

	public OreCharRedstone() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName(Reference.ModBlocks.ORE_REDSTONE_C.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_REDSTONE_C.getRegistryRL());
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return Items.REDSTONE;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(1);
	}
}

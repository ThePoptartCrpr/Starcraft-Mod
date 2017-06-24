package ga.scmc.blocks.oreshakuras;

import java.util.Random;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.items.ModItems;
import ga.scmc.lib.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/oreshakuras/OreShakurasRichMineral.java
=======
import scmc.blocks.ModBlocks;
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/oreshakuras/OreShakurasRichMineral.java

public class OreShakurasRichMineral extends ModBlocks {

	public OreShakurasRichMineral() {
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(3.5F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setUnlocalizedName(Reference.ModBlocks.ORE_RICHMINERAL_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.ORE_RICHMINERAL_S.getRegistryRL());
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return ModItems.RICH_MINERAL_SHARD;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 4 + rand.nextInt(4);
	}
}

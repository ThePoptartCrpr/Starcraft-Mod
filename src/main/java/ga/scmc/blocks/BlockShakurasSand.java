package ga.scmc.blocks;

import ga.scmc.lib.Reference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
<<<<<<< 9c53d1b268c91c7dd3e7b00933a509a597e4213d:src/main/java/ga/scmc/blocks/BlockShakurasSand.java
=======
import scmc.lib.Reference;
>>>>>>> Start of proxy rebuild:src/main/java/scmc/blocks/BlockShakurasSand.java

public class BlockShakurasSand extends BlockFalling {

	public BlockShakurasSand() {
		super(Material.SAND);
		setUnlocalizedName(Reference.ModBlocks.BLOCK_SAND_S.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.BLOCK_SAND_S.getRegistryRL());
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	public int damageDropped(int par1) {
		return par1;
	}
}
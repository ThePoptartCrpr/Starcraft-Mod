package net.bvanseghi.starcraft.blocks;

import net.bvanseghi.starcraft.fluids.ModFluids;
import net.bvanseghi.starcraft.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockAcidFluid extends BlockFluidClassic {
	private static String name = "acid_fluid";
	private static final ResourceLocation REGISTRY_RL = new ResourceLocation(Reference.TEXTURE_PATH_BASE + name);

	public BlockAcidFluid(Fluid fluid, Material material) {
		super(ModFluids.acid, Material.WATER);
		setCreativeTab(null);
		setRegistryName(REGISTRY_RL);
		setUnlocalizedName(Reference.MODID + "_acidFluid");
	}

	//TODO: Figure out how textures work now.
	/*@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;

	@Override
	public IIcon getIcon(int side, int meta) {
		return (side == 0 || side == 1) ? stillIcon : flowingIcon;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister register) {
		stillIcon = register.registerIcon("Starcraft:acidFluidStill");
		flowingIcon = register.registerIcon("Starcraft:acidFluidFlowing");
	}*/

	public void onEntityCollidedWithBlock(World world, int par1, int par2, int par3, Entity entity) {
		entity.attackEntityFrom(DamageSource.cactus, 1.0F);
	}
}

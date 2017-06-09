package scmc.items.weapons;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.StarcraftCreativeTabs;
import scmc.lib.Reference;

public class WeaponDarkDualWarpBlade extends ItemSword {

	public static final String name = "darkDualWarpBlade";

	public WeaponDarkDualWarpBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(StarcraftCreativeTabs.COMBAT);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

}

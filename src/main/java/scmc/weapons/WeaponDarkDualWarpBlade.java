package scmc.weapons;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.CreativeTab;
import scmc.lib.Reference;

public class WeaponDarkDualWarpBlade extends ItemSword {
	private static final String name = "darkDualWarpBlade";

	public WeaponDarkDualWarpBlade(ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTab.tabStarcraftCombat);
		setUnlocalizedName(Reference.UN_BASE + name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }	
}

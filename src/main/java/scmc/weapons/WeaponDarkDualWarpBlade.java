package scmc.weapons;

import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.CreativeTab;
import scmc.lib.Reference;

public class WeaponDarkDualWarpBlade extends ItemSword {

	public static final String name = "darkDualWarpBlade";

	public WeaponDarkDualWarpBlade(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.tabStarcraftCombat);
		this.setUnlocalizedName(Reference.UN_BASE + name);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
	
}

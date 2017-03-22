package scmc.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModMaterialLiquids extends Material {
	public ModMaterialLiquids(MapColor mapColor) {
		super(mapColor);
		setReplaceable();
		setNoPushMobility();
	}

	/**
	 * Returns if blocks of these materials are liquids.
	 */
	@Override
	public boolean isLiquid() {
		return true;
	}

	/**
	 * Returns if this material is considered solid or not
	 */
	@Override
	public boolean blocksMovement() {
		return true;
	}

	@Override
	public boolean isSolid() {
		return false;
	}

	@Override
	public Material setNoPushMobility() {
		//No flag because it did exactly 0 things
		return this;
	}
}

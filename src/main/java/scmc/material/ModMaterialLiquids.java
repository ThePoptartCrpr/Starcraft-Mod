package net.bvanseghi.starcraft.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModMaterialLiquids extends Material {
	public ModMaterialLiquids(MapColor mapColor) {
		super(mapColor);
		this.setReplaceable();
		this.setNoPushMobility();
	}

	/**
	 * Returns if blocks of these materials are liquids.
	 */
	public boolean isLiquid() {
		return true;
	}

	/**
	 * Returns if this material is considered solid or not
	 */
	public boolean blocksMovement() {
		return true;
	}

	public boolean isSolid() {
		return false;
	}

	public Material setNoPushMobility() {
		//No flag because it did exactly 0 things
		return this;
	}
}
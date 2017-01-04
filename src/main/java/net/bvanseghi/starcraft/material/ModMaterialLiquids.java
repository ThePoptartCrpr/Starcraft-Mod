package net.bvanseghi.starcraft.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModMaterialLiquids extends Material {
	private static final String __OBFID = "CL_00000541";
	private int mobilityFlag;

	public ModMaterialLiquids(MapColor p_i2114_1_) {
		super(p_i2114_1_);
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
		this.mobilityFlag = 1;
		return this;
	}
}
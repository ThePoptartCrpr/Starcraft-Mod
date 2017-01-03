package net.bvanseghi.starcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * A complete, initialized list of every block
 * in the mod as a constant<br>
 * This will replace {@link ModBlocks} when wundr
 * marks it done<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * @author wundrweapon
 */
public class Blockz {
	public static final Block ASH = new BlockAsh();
	public static final Block CHAR_COBBLE = new BlockCharCobblestone();
	public static final Block CHAR_DIRT = new BlockCharDirt();
	public static final Block MAGMA = new BlockCharMagma();
	public static final Block CHAR_STONE = new BlockCharStone();
	public static final Block ENERGY = new BlockEnergyBlock();
	public static final Block KERATIN_CHUNK = new BlockKeratinChunk();
	public static final Block MINERAL_FIELD = new BlockMineralField(Material.AIR); //TODO: get this done in a special way to support the correct material
	public static final Block P_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
	public static final Block P_ENERGY_CHANNEL_D = new BlockProtossEnergyChannelDark();
	public static final Block P_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
	public static final Block P_ENERGY_STABILIZER_D = new BlockProtossEnergyStabilizerDark();
	public static final Block P_METAL = new BlockProtossMetal();
	public static final Block P_WARP_PROJ_C = new BlockProtossWarpProjectorC();
	public static final Block P_WARP_PROJ_O = new BlockProtossWarpProjectorO();
	public static final Block P_WARP_PROJ_S = new BlockProtossWarpProjectorS();
	public static final Block PYLON_CRYSTAL = new BlockPylonCrystal();
	public static final Block RICH_MINERAL_FIELD = new BlockRichMineralField(Material.AIR); //TODO: get this done in a special way to support the correct material
}

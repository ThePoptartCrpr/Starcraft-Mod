package net.bvanseghi.starcraft.achievement;

import net.bvanseghi.starcraft.blocks.ModBlocks;
import net.bvanseghi.starcraft.items.ModItems;
import net.bvanseghi.starcraft.weapons.ModWeapons;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {

	public static Achievement achievementMinedMinerals;
	public static Achievement achievementMinedRichMinerals;
	public static Achievement achievementMinedVespene;
	
	public static Achievement achievementGetC14GaussRifle;
	public static Achievement achievementGetPsiBlade;
	public static Achievement achievementGetWarpBlade;
	public static Achievement achievementGetMasterPsiBlade;
	public static Achievement achievementGetPsiBladeDark;
	public static Achievement achievementGetPsiBladeFocuser;
	public static Achievement achievementGetPsiBladeFocuserDark;
	
	public static Achievement achievementEnterChar;
	public static Achievement achievementEnterShakuras;

	public static void init() {
		achievementMinedMinerals = new Achievement("achievement.mineMinerals", "mineMinerals", 0, 0,
				new ItemStack(ModItems.mineralShard), (Achievement) null).initIndependentStat().registerStat();

		achievementMinedRichMinerals = new Achievement("achievement.mineRichMinerals", "mineRichMinerals", 1, 0,
				new ItemStack(ModItems.richMineralShard), achievementMinedMinerals).initIndependentStat()
						.registerStat();

		achievementMinedVespene = new Achievement("achievement.mineVespene", "mineVespene", 0, 1,
				new ItemStack(ModItems.vespene, 0, 3), (Achievement) null).initIndependentStat().registerStat();

		achievementGetC14GaussRifle = new Achievement("achievement.getC14GaussRifle", "getC14GaussRifle", 6, 0,
				new ItemStack(ModItems.C14GaussRifle), (Achievement) null).initIndependentStat().registerStat();

		// Protoss Achievements
		achievementGetPsiBladeFocuser = new Achievement("achievement.getPsiBladeFocuser", "getPsiBladeFocuser", 3, 0,
				new ItemStack(ModItems.psiBladeFocuserUncharged), (Achievement) null).initIndependentStat()
						.registerStat();

		achievementGetPsiBladeFocuserDark = new Achievement("achievement.getPsiBladeFocuserDark",
				"getPsiBladeFocuserDark", 4, 0, new ItemStack(ModItems.darkPsiBladeFocuserUncharged),
				(Achievement) null).initIndependentStat().registerStat();

		achievementGetPsiBladeDark = new Achievement("achievement.getPsiBladeDark", "getPsiBladeDark", 4, 1,
				new ItemStack(ModWeapons.darkPsiBlade), achievementGetPsiBladeFocuserDark).initIndependentStat().registerStat();

		achievementGetPsiBlade = new Achievement("achievement.getPsiBlade", "getPsiBlade", 3, 1,
				new ItemStack(ModWeapons.psiBlade), achievementGetPsiBladeFocuser).initIndependentStat().registerStat();

		achievementGetWarpBlade = new Achievement("achievement.getWarpBlade", "getWarpBlade", 3, 2,
				new ItemStack(ModWeapons.warpBlade), achievementGetPsiBladeFocuser).initIndependentStat().registerStat();

		achievementGetMasterPsiBlade = new Achievement("achievement.getMasterPsiBlade", "getMasterPsiBlade", 3, 3,
				new ItemStack(ModWeapons.masterPsiBlade), achievementGetPsiBladeFocuser).initIndependentStat().registerStat();
		
		// Dimension Achievements
		
		achievementEnterChar = new Achievement("achievement.enterChar", "enterChar", -3, 0,
				new ItemStack(ModBlocks.stoneChar), (Achievement) null).initIndependentStat().registerStat();
		
		achievementEnterShakuras = new Achievement("achievement.enterShakuras", "enterShakuras", -2, 0,
				new ItemStack(ModBlocks.stoneShakuras), (Achievement) null).initIndependentStat().registerStat();


		AchievementPage.registerAchievementPage(new AchievementPage("Starcraft",
				new Achievement[] {achievementMinedMinerals, achievementMinedRichMinerals, achievementMinedVespene,
						achievementGetC14GaussRifle, achievementGetPsiBlade, achievementGetWarpBlade,
						achievementGetMasterPsiBlade, achievementGetPsiBladeDark, achievementGetPsiBladeFocuser,
						achievementGetPsiBladeFocuserDark, achievementEnterChar, achievementEnterShakuras}));
	}
}

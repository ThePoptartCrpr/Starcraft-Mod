package ga.scmc.achievement;

import ga.scmc.blocks.ModBlocks;
import ga.scmc.items.ModItems;
import ga.scmc.items.weapons.ModWeapons;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {

	public static Achievement achievementEnterChar;
	public static Achievement achievementEnterShakuras;
	public static Achievement achievementGetC14GaussRifle;
	public static Achievement achievementGetMasterPsiBlade;
	public static Achievement achievementGetPsiBlade;
	public static Achievement achievementGetPsiBladeDark;
	public static Achievement achievementGetPsiBladeFocuser;
	public static Achievement achievementGetPsiBladeFocuserDark;
	public static Achievement achievementGetWarpBlade;
	public static Achievement achievementMinedMinerals;

	public static Achievement achievementMinedRichMinerals;
	public static Achievement achievementMinedVespene;

	public static void init() {
		achievementMinedMinerals = new Achievement("achievement.mineMinerals", "mineMinerals", 0, 0, new ItemStack(ModItems.MINERAL_SHARD), (Achievement) null)
				.initIndependentStat().registerStat();

		achievementMinedRichMinerals = new Achievement("achievement.mineRichMinerals", "mineRichMinerals", 1, 0, new ItemStack(ModItems.RICH_MINERAL_SHARD),
				achievementMinedMinerals).initIndependentStat().registerStat();

		achievementMinedVespene = new Achievement("achievement.mineVespene", "mineVespene", 0, 1, new ItemStack(ModItems.VESPENE, 0, 3), (Achievement) null)
				.initIndependentStat().registerStat();

		achievementGetC14GaussRifle = new Achievement("achievement.getC14GaussRifle", "getC14GaussRifle", 6, 0, new ItemStack(ModItems.C14_GAUSS_RIFLE), (Achievement) null)
				.initIndependentStat().registerStat();

		// Protoss Achievements
		achievementGetPsiBladeFocuser = new Achievement("achievement.getPsiBladeFocuser", "getPsiBladeFocuser", 3, 0, new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED),
				(Achievement) null).initIndependentStat().registerStat();

		achievementGetPsiBladeFocuserDark = new Achievement("achievement.getPsiBladeFocuserDark", "getPsiBladeFocuserDark", 4, 0,
				new ItemStack(ModItems.PSI_BLADE_FOCUSER_UNCHARGED, 1, 1), (Achievement) null).initIndependentStat().registerStat();

		achievementGetPsiBladeDark = new Achievement("achievement.getPsiBladeDark", "getPsiBladeDark", 4, 1, new ItemStack(ModWeapons.BANE_BLADE),
				achievementGetPsiBladeFocuserDark).initIndependentStat().registerStat();

		achievementGetPsiBlade = new Achievement("achievement.getPsiBlade", "getPsiBlade", 3, 1, new ItemStack(ModWeapons.PSI_BLADE), achievementGetPsiBladeFocuser)
				.initIndependentStat().registerStat();

		achievementGetWarpBlade = new Achievement("achievement.getWarpBlade", "getWarpBlade", 3, 2, new ItemStack(ModWeapons.WARP_BLADE), achievementGetPsiBladeFocuser)
				.initIndependentStat().registerStat();

		achievementGetMasterPsiBlade = new Achievement("achievement.getMasterPsiBlade", "getMasterPsiBlade", 3, 3, new ItemStack(ModWeapons.MASTER_PSI_BLADE),
				achievementGetPsiBladeFocuser).initIndependentStat().registerStat();

		// Dimension Achievements

		achievementEnterChar = new Achievement("achievement.enterChar", "enterChar", -3, 0, new ItemStack(ModBlocks.STONE_CHAR), (Achievement) null).initIndependentStat()
				.registerStat();

		achievementEnterShakuras = new Achievement("achievement.enterShakuras", "enterShakuras", -2, 0, new ItemStack(ModBlocks.STONE_SHAKURAS), (Achievement) null)
				.initIndependentStat().registerStat();

		AchievementPage.registerAchievementPage(new AchievementPage("Starcraft",
				new Achievement[] { achievementMinedMinerals, achievementMinedRichMinerals, achievementMinedVespene, achievementGetC14GaussRifle, achievementGetPsiBlade,
						achievementGetWarpBlade, achievementGetMasterPsiBlade, achievementGetPsiBladeDark, achievementGetPsiBladeFocuser, achievementGetPsiBladeFocuserDark,
						achievementEnterChar, achievementEnterShakuras }));
	}
}
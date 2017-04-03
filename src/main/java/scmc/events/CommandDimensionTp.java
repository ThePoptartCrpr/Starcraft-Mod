package scmc.events;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.Teleporter;
import scala.actors.threadpool.Arrays;
import scmc.lib.ModTeleporter;
import scmc.worldgen.DimensionRegistry;

public class CommandDimensionTp implements ICommand{
	private final List<String> aliases;
	
	public CommandDimensionTp() {
		aliases = new ArrayList<String>();
		aliases.add("dimensiontp");
	}
	
	@Override
	public int compareTo(ICommand arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "dimensiontp";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/dimensiontp <Dimension ID> or help";
	}

	@Override
	public List<String> getCommandAliases() {
		return this.aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		EntityPlayerMP thePlayer = (EntityPlayerMP) sender;
		if(thePlayer.timeUntilPortal > 0) {
        	thePlayer.timeUntilPortal = 10;
		}
		else if(Arrays.asList(args).contains("-1")) {
			sender.addChatMessage(new TextComponentTranslation("Sending %s to the Nether.", sender.getName()));
			thePlayer.timeUntilPortal = 10;
			thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, -1, new Teleporter(thePlayer.mcServer.worldServerForDimension(-1)));
		}
		else if(Arrays.asList(args).contains("0")) {
			sender.addChatMessage(new TextComponentTranslation("Sending %s to the Overworld.", sender.getName()));
			thePlayer.timeUntilPortal = 10;
			thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, 0, new Teleporter(thePlayer.mcServer.worldServerForDimension(0)));
		}
		else if(Arrays.asList(args).contains("1")) {
			sender.addChatMessage(new TextComponentTranslation("Sending %s to the End.", sender.getName()));
			thePlayer.timeUntilPortal = 10;
			thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, 1, new Teleporter(thePlayer.mcServer.worldServerForDimension(1)));
		}
		else if(Arrays.asList(args).contains(String.valueOf(DimensionRegistry.AIUR_DIMENSION_ID))) {
			sender.addChatMessage(new TextComponentTranslation("Sending %s to the Tutorial Dimension.", sender.getName()));
			thePlayer.timeUntilPortal = 10;
			thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, DimensionRegistry.AIUR_DIMENSION_ID, new ModTeleporter(thePlayer.mcServer.worldServerForDimension(DimensionRegistry.AIUR_DIMENSION_ID), 0, 0, 0));
		}
		else if(Arrays.asList(args).contains("help")) {
			sender.addChatMessage(new TextComponentTranslation("Please choose either 0 for Overworld, -1 for Nether, 1 for End, and 2 for the Tutorial Dimension."));
		}
		else {
			sender.addChatMessage(new TextComponentTranslation("%s" + ", you have put in a unregistered dimension.", sender.getName()));
		}
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}
}
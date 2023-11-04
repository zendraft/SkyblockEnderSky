package fr.zendraft.skyblockendersky.commands.islands;

import fr.zendraft.skyblockendersky.utils.ErrorMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IslandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;

        switch (args[0]) {
            //case "create" -> new IslandCreate(sender, command, label, args);
            case "challenge", "c" -> new IslandChallenge(sender, command, label, args);
            case "h", "home" -> new IslandHome(sender, command, label, args);
            default -> sender.sendMessage(ErrorMessage.ArgumentNotValid.message);
        }

        return false;
    }
}

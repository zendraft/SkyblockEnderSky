package fr.zendraft.skyblockendersky.commands.islands;

import fr.zendraft.skyblockendersky.objects.commands.ChildCommand;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@Getter
@Setter
@SuperBuilder
public class IslandHome extends ChildCommand {
    private Player player;
    public IslandHome(CommandSender sender, Command command, String label, String[] args) {
        super(sender,command,label,args);
    }

    @Override
    public void execute() {

    }

    @Override
    public void initVar(){
        setPlayer((Player) getSender());
    }
}

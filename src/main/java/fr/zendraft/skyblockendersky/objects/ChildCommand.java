package fr.zendraft.skyblockendersky.objects;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@Getter
@Setter
public abstract class ChildCommand {
    private CommandSender sender;
    private Command command;
    private String label;
    private String[] args;

    public ChildCommand(CommandSender sender, Command command, String label, String[] args){
        setSender(sender);
        setCommand(command);
        setLabel(label);
        setArgs(args);

        initVar();
        execute();
    }

    protected abstract void execute();
    protected abstract void initVar();
}

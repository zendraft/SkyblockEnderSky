package fr.zendraft.skyblockendersky.objects.commands;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@Getter
@Setter
public class ChildCommand extends IChildCommand {
    private CommandSender sender;
    private Command command;
    private String label;
    private String[] args;


    public ChildCommand(CommandSender sender, Command command, String label, String[] args){
        super(sender,command,label,args);
        setSender(sender);
        setCommand(command);
        setLabel(label);
        setArgs(args);

        initVar();
        execute();
    }

    public void execute(){};
    public void initVar(){};
}

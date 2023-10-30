package fr.zendraft.skyblockendersky.commands.islands;

import fr.zendraft.skyblockendersky.objects.ChildCommand;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.bukkit.entity.Player;


@Getter
@Setter
@SuperBuilder
public class IslandChallenge extends ChildCommand {
    private Player player;

    @Override
    protected void execute() {

    }

    @Override
    protected void initVar(){
        setPlayer((Player) getSender());
    }
}

package fr.zendraft.skyblockendersky.objects.islands;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Rank {
    MEMBERS(0,"Membre"), MODO(1,"Modo"), COOP(2,"Coop"),ADMIN(3,"Admin"),;
    private final int id;
    private final String name;
}

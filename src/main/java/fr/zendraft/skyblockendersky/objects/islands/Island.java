package fr.zendraft.skyblockendersky.objects.islands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Island {
    private String name;
    private UUID islandUUID;
    private int X,Z;
    private int size;
    private int generatorLevel;
    private int islandLevel;
    private int islandBank;

    private List<IsPlayer> isPlayerlist;
}

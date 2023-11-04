package fr.zendraft.skyblockendersky.objects.islands;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class IsPlayer {
    private String name;
    private UUID uuid;
    private int rankID;
}

package fr.zendraft.skyblockendersky.managers;

import java.util.HashMap;
import java.util.UUID;

public class IslandManager {
    private IslandCreation islandCreation;

    private HashMap<UUID, IslandManager> islands = new HashMap<>();
    private HashMap<String, UUID> islandPlayers = new HashMap<>();

    public IslandManager(){
        islandCreation = new IslandCreation();
    }


}

package fr.zendraft.skyblockendersky.managers;

import java.util.HashMap;
import java.util.UUID;

public class IslandManager {
    HashMap<UUID, IslandManager> islands = new HashMap<>();
    HashMap<String, UUID> islandPlayers = new HashMap<>();
}

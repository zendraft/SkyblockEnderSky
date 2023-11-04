package fr.zendraft.skyblockendersky.caches;

import lombok.Getter;

import java.util.HashMap;
import java.util.UUID;

@Getter
public class IslandCache extends Cache {
    private HashMap<UUID, IslandCache> islandsInCache = new HashMap<>();
    private Thread updateThread;

    public IslandCache(){

    }


    @Override
    public void init() {
        
    }

    @Override
    public void reload(){

    }

    @Override
    public void save(){

    }
}

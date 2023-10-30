package fr.zendraft.skyblockendersky.caches;

import java.util.concurrent.atomic.AtomicBoolean;

public class Cache {
    Thread updateThread;
    AtomicBoolean updateInProgress = new AtomicBoolean(false);


    public void init(){

    }
    public void save(){
        if(updateInProgress.get()) return;
        updateInProgress.set(true);
        updateThread.start();
    }
    public void reload(){
        save();
        while(updateInProgress.get());
        init();
    }
}

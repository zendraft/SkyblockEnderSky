package fr.zendraft.skyblockendersky.managers;

import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardReader;
import fr.zendraft.skyblockendersky.commands.islands.IslandCommand;
import fr.zendraft.skyblockendersky.objects.islands.Island;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class IslandCreation {
    private Clipboard islandSchematic;


    private AtomicReference<PriorityQueue<Island>> islandInCreation = new AtomicReference<>(new PriorityQueue<>());
    private Thread islandCreationThread;
    private AtomicBoolean isActive = new AtomicBoolean(true);
    
    public IslandCreation(){
        initSchematic();
        islandCreationThread = new Thread(()->{
            try { wait(300);}
            catch (InterruptedException e) { throw new RuntimeException(e); }
            if (!isActive.get()) return;
                   
            islandInCreation.updateAndGet(e -> {
                Island island = e.poll();
                if(island == null) return e;
                create(island);
                return e;
            });
        });
        
    }
    @SneakyThrows
    public void initSchematic(){
        File file = new File(Paths.get("").toAbsolutePath()+"//islandSchematic//inUse.schematic");
        ClipboardFormat format = ClipboardFormats.findByFile(file);
        assert format != null;
        try (ClipboardReader reader = format.getReader(new FileInputStream(file))) {
            islandSchematic = reader.read();
        }
    }

    public void addToQueueIsland(Island island){
        islandInCreation.updateAndGet(e -> {
            e.add(island);
            return e;
        });
    }


    public void create(Island island){

    }
}

package fr.zendraft.skyblockendersky;

import fr.zendraft.skyblockendersky.caches.IslandCache;
import fr.zendraft.skyblockendersky.managers.IslandManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class SkyblockEnderSky extends JavaPlugin {
    private SkyblockEnderSky INSTANCE;
    private IslandCache IslandCaches;
    private IslandManager IslandManager;
    @Override
    public void onEnable() {
        INSTANCE = this;
        IslandCaches = new IslandCache();
        IslandManager = new IslandManager();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

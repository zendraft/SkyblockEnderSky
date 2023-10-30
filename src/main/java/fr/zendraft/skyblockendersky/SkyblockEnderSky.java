package fr.zendraft.skyblockendersky;

import fr.zendraft.skyblockendersky.caches.IslandCache;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class SkyblockEnderSky extends JavaPlugin {
    private SkyblockEnderSky INSTANCE;
    private IslandCache IslandCaches;
    @Override
    public void onEnable() {
        INSTANCE = this;
        IslandCaches = new IslandCache();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

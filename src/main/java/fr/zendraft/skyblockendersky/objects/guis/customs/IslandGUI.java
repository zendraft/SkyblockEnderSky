package fr.zendraft.skyblockendersky.objects.guis.customs;

import fr.zendraft.skyblockendersky.objects.guis.CustomIslandInventory;
import fr.zendraft.skyblockendersky.utils.ItemBuilder;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

@Getter
public class IslandGUI extends CustomIslandInventory {

    public IslandGUI(){
        setNbLine(6);
        createDefault();
    }

    @Override
    public void createDefaultItems(){
        addDefaultItem(22,ItemBuilder.create("Home", 0, Material.DARK_OAK_SAPLING));
        addDefaultItem(40,ItemBuilder.create("Challenge", 0, Material.DARK_OAK_SAPLING));
        addDefaultItem(4,ItemBuilder.create("Warps", 0, Material.DARK_OAK_SAPLING));
        addDefaultItem(3,ItemBuilder.create("ISWarps", 0, Material.DARK_OAK_SAPLING));
        addDefaultItem(1,ItemBuilder.create("Boutique", 0, Material.DARK_OAK_SAPLING));
    }
}

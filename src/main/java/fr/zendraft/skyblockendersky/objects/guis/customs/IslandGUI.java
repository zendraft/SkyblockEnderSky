package fr.zendraft.skyblockendersky.objects.guis.customs;

import fr.zendraft.skyblockendersky.objects.guis.CustomInventory;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@Getter
public class IslandGUI implements CustomInventory {
    @Override
    public ItemStack[] updateForPlayerStats(ItemStack[] items) {


        return items;
    }


    private ItemStack createStatsItem();
}

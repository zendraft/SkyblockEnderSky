package fr.zendraft.skyblockendersky.objects.guis;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

@Getter
@Setter
public class CustomIslandInventory implements CustomInventory {
    private ItemStack[] inventoryStack = new ItemStack[0];
    private int nbLine = 6;

    @Override
    public Inventory getDefault(Player player){
        Inventory inv = Bukkit.createInventory(null, nbLine);
        inv.setContents(updateForPlayerStats(inventoryStack));
        return inv;
    }

    @Override
    public ItemStack[] updateForPlayerStats(ItemStack[] items){
        return items;
    }
}

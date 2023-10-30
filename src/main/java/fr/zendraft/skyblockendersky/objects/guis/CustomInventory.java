package fr.zendraft.skyblockendersky.objects.guis;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface CustomInventory {
    default Inventory getDefault(Player player){
        return Bukkit.createInventory(null, 6);
    }
    default ItemStack[] updateForPlayerStats(ItemStack[] items){
        return items;
    }
}

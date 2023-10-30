package fr.zendraft.skyblockendersky.objects.guis;

import fr.zendraft.skyblockendersky.utils.objects.ItemGuiIndexed;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public abstract class CustomIslandInventory implements CustomInventory {
    private List<ItemGuiIndexed> defaultItems = new ArrayList<>();
    private int nbLine = 6;

    private Inventory defaultInventory;

    @Override
    public void createDefault(){
        Inventory inv = Bukkit.createInventory(null, nbLine);
        createDefaultItems();
        defaultItems.forEach(itemGui-> inv.setItem(itemGui.getId(), itemGui.getItem()));
    }
    @Override
    public void createDefaultItems(){
    }
    protected void addDefaultItem(int id, ItemStack item){
        defaultItems.add(new ItemGuiIndexed(id,item));
    }

    private HashMap<Integer, ItemStack> updateForPlayerStats( HashMap<Integer, ItemStack> items){
        return items;
    }

}

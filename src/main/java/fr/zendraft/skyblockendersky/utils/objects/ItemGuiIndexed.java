package fr.zendraft.skyblockendersky.utils.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@Getter
@Setter
@AllArgsConstructor
public class ItemGuiIndexed {
    private int id;
    private ItemStack item;
}

package fr.zendraft.skyblockendersky.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.Arrays;



public class ItemBuilder {
    public static ItemStack create(String name, int color,int amount, Material material, String... lores){


        ItemStack item = new ItemStack(material);
        item.setAmount(amount);

        ItemMeta meta = item.getItemMeta();
        meta.setLore(Arrays.stream(lores).toList());




        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack create(String name, int color, Material material, String... lores){
        ItemStack item = new ItemStack(material);
        item.setAmount(1);


        return item;
    }


}

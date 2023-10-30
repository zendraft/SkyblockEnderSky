package fr.zendraft.skyblockendersky.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.w3c.dom.css.RGBColor;

public class ItemBuilder {
    public static ItemStack create(String name, RGBColor color,int amount, Material material, String... lore){
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);



        return item;
    }
    public static ItemStack create(String name, RGBColor color,Material material, String... lore){
        ItemStack item = new ItemStack(material);
        item.setAmount(1);


        return item;
    }
}

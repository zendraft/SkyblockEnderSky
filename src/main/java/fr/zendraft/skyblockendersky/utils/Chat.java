package fr.zendraft.skyblockendersky.utils;

import org.bukkit.ChatColor;

public class Chat {
    public static String color(String text){
        return ChatColor.translateAlternateColorCodes('&',text);
    }

    public static String error(String text){
        return ChatColor.translateAlternateColorCodes('&',"&c"+text);
    }
}

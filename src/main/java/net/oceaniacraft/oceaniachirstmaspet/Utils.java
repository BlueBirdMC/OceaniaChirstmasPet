package net.oceaniacraft.oceaniachirstmaspet;

import org.bukkit.ChatColor;

import java.util.Random;

public class Utils {
    public static String chat(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

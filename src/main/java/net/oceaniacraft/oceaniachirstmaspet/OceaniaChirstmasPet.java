package net.oceaniacraft.oceaniachirstmaspet;

import org.bukkit.plugin.java.JavaPlugin;

public final class OceaniaChirstmasPet extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("2023christmaspet").setExecutor(new PetCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

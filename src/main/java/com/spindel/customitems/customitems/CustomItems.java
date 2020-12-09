package com.spindel.customitems.customitems;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemList.init();
        getCommand("txstick").setExecutor(new Commands());
        getCommand("txthor").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

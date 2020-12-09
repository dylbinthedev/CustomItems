package com.spindel.customitems.customitems;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static com.spindel.customitems.customitems.ItemList.THOR_HAMMER;

public final class CustomItems extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemList.init();
        getCommand("givemagicstick").setExecutor(new Commands());
        getCommand("givethorhammer").setExecutor(new Commands());
    }
    @EventHandler(priority = EventPriority.NORMAL)
    public void onClick(PlayerInteractEvent event){
        event.getItem().isSimilar(THOR_HAMMER);
            event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 25).getLocation());
    }
    @Override
    public void onDisable() {

    }
}

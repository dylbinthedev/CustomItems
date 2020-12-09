package com.spindel.customitems.customitems;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("txstick")) {
            player.getInventory().addItem(ItemList.magicstick);
        }
            if (cmd.getName().equalsIgnoreCase("txthor")) {
                player.getInventory().addItem(ItemList.thorhammer);
            }

            return true;

        }
    }
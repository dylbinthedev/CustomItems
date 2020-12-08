package com.spindel.customitems.customitems;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    public static ItemStack magicstick;

    public static void init() {
        createmagicstick();
    }

    private static void createmagicstick() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cStick of 0tx");
        List<String> lore = new ArrayList<>();
        lore.add("§6The most powerful item made by the oldies...");
        lore.add("§6Crafted by the almighty god spindel10");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 100, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 100, true );
        meta.addEnchant(Enchantment.DAMAGE_UNDEAD, 100, true);
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 100, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 100, true);
        item.setItemMeta(meta);
        magicstick = item;
    }
}

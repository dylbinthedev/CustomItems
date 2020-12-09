package com.spindel.customitems.customitems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public final class ItemList {
    
    private ItemList() {}

    public static final ItemStack MAGIC_STICK;
    public static final ItemStack THOR_HAMMER;
    static {
        MAGIC_STICK = makeItem(
                Material.STICK, 
                "&cStick of 0tx", 
                Arrays.asList(
                        "&cThe most powerful item made by the oldies...",
                        "&cCrafted by the almighty god spindel10"
                ),
                Enchantment.KNOCKBACK,
                Enchantment.DAMAGE_ALL,
                Enchantment.LOOT_BONUS_MOBS,
                Enchantment.DAMAGE_UNDEAD,
                Enchantment.DAMAGE_ARTHROPODS,
                Enchantment.FIRE_ASPECT
        );
        THOR_HAMMER = makeItem(
                Material.IRON_AXE,
                "&3Thor's Hammer",
                Arrays.asList("&cOden's Wrath"),
                Enchantment.DURABILITY
        );
    }

    private static ItemStack makeItem(Material mat, String name, List<String> lore, Enchantment... enchants) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(colorize(name));
        meta.setLore(lore.stream().map(ItemList::colorize).collect(Collectors.toList()));
        
        Arrays.stream(enchants).forEach(ench -> meta.addEnchant(ench, 100, true));
        
        item.setItemMeta(meta);
        return item;
    }
    
    private static String colorize(String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }

    public static void init() {
    }
}

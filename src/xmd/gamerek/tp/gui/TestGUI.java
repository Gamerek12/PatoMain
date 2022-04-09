package xmd.gamerek.tp.gui;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.*;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.ItemBuilder;
import org.bukkit.inventory.*;

public class TestGUI
{
    public static InventoryView testGUI(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 27, ChatUtil.fix("&8>> &cTestowanie &c&lBP!"));
        final ItemBuilder glass = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)0)
                .setTitle(ChatUtil.fix("&7&oBrak..."));
        final ItemBuilder glass2 = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)14)
                .setTitle(ChatUtil.fix("&7&oBrak..."));
       final ItemBuilder Water = new ItemBuilder(Material.WATER_BUCKET, (short)0)
               .setTitle(ChatUtil.fix("&7&k|&4&kg&7&k|&r &c&lWATER &7&k|&4&kg&7&k|"))
               .addLore(ChatUtil.fix("&8>> &7Kliknij, aby &cprzeteleportowac&7!"))
               .addLore(ChatUtil.fix("&8>> &7Testy: &cWaterow'ow"))
               .addLore(ChatUtil.fix(""))
               .addLore(ChatUtil.fix("&8>> &7Powodzenia: &cLiderowka &4&lP&c&lA&4&lT&c&LO"))
               .addLore(ChatUtil.fix(""));
        final ItemBuilder Fosa2 = new ItemBuilder(Material.SLIME_BLOCK, (short)0)
                .setTitle(ChatUtil.fix("&7&k|&4&kg&7&k|&r &c&lPRZECHODZENIE NA DRUGA STRONE &7&k|&4&kg&7&k|"))
                .addLore(ChatUtil.fix("&8>> &7Kliknij, aby &cprzeteleportowac&7!"))
                .addLore(ChatUtil.fix("&8>> &7Testy: &cPrzechodzenia na druga strone&7!"))
                .addLore(ChatUtil.fix(""))
                .addLore(ChatUtil.fix("&8>> &7Powodzenia: &cLiderowka &4&lP&c&lA&4&lT&c&LO"));
        final ItemBuilder Fosa1 = new ItemBuilder(Material.COBBLESTONE)
                .setTitle(ChatUtil.fix("&7&k|&4&kg&7&k|&r &c&lWYKLOCKOWYWANIE W DOL &7&k|&4&kg&7&k|"))
                .addLore(ChatUtil.fix("&8>> &7Kliknij, aby &cprzeteleportowac&7!"))
                .addLore(ChatUtil.fix("&8>> &7Testy: &cWyklockowywanie w dol&7!"))
                .addLore(ChatUtil.fix(""))
                .addLore(ChatUtil.fix("&8>> &7Powodzenia: &cLiderowka &4&lP&c&lA&4&lT&c&LO"));
        final ItemBuilder Administracja = new ItemBuilder(Material.DIAMOND_BLOCK)
                .setTitle(ChatUtil.fix("&7&k|&4&kg&7&k|&r &c&lADMINISTRACJA TP &7&k|&4&kg&7&k|"))
                .addLore(ChatUtil.fix("&8>> &7Kliknij, aby &cprzeteleportowac&7!"))
                .addLore(ChatUtil.fix("&8>> &7Teleport administracji, do pozycji testow!"))
                .addLore(ChatUtil.fix(""))
                .addLore(ChatUtil.fix("&8>> &7Milego dnia: &cLiderowka &4&lP&c&lA&4&lT&c&LO"));
        inv.setItem(0, glass.build());
        inv.setItem(1, glass2.build());
        inv.setItem(2, glass.build());
        inv.setItem(3, glass.build()); // TODO: cos3
        inv.setItem(4, Fosa2.build()); // druga strona fosy
        inv.setItem(5, glass.build()); // TODO: cos2
        inv.setItem(6, glass.build());
        inv.setItem(7, glass2.build());
        inv.setItem(8, glass.build());
        inv.setItem(9, glass2.build());
        inv.setItem(10, glass.build());
        inv.setItem(11, Water.build()); // waterki
        inv.setItem(12, glass.build());
        inv.setItem(13, glass.build()); // TODO: dsa
        inv.setItem(14, glass.build());
        inv.setItem(15, Fosa1.build()); // klocki w dol
        inv.setItem(16, glass.build()); // TODO: cos1
        inv.setItem(17, glass2.build());
        inv.setItem(18, glass.build());
        inv.setItem(19, glass2.build());
        inv.setItem(20, glass.build());
        inv.setItem(21, glass.build());
        inv.setItem(22, Administracja.build()); // administracja
        inv.setItem(23, glass.build());
        inv.setItem(24, glass.build());
        inv.setItem(25, glass2.build());
        inv.setItem(26, glass.build());
        return p.openInventory(inv);
    }
}

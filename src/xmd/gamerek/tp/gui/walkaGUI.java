package xmd.gamerek.tp.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.ItemBuilder;

public class walkaGUI {

    public static InventoryView efektyGUI(final Player p) {
        final Inventory inv = Bukkit.createInventory((InventoryHolder)p, 27, ("Practice"));
        final ItemBuilder glass = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)0).setTitle(ChatUtil.fix("&7&oBrak..."));
        final ItemBuilder glass2 = new ItemBuilder(Material.STAINED_GLASS_PANE, (short)11).setTitle(ChatUtil.fix("&7&oBrak..."));
        final ItemBuilder drabinki = new ItemBuilder(Material.LADDER, (short)0).setTitle(ChatUtil.fix("&7Gra: &9DRABINKI")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder bugowanie/*(fosa)*/ = new ItemBuilder(Material.SLIME_BLOCK, (short)0).setTitle(ChatUtil.fix("&7Gra: &9Wybugowywanie sie z fosy")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder bot = new ItemBuilder(Material.LEATHER).setTitle(ChatUtil.fix("&7Gra: &9Bicie sie z BOTEM")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder watery = new ItemBuilder(Material.WATER_BUCKET).setTitle(ChatUtil.fix("&7Gra: &9Watery")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder parkour/*(movment)*/ = new ItemBuilder(Material.COBBLESTONE).setTitle(ChatUtil.fix("&7Gra: &9Parkour")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder oneVone = new ItemBuilder(Material.IRON_SWORD).setTitle(ChatUtil.fix("&7Gra: &91v1")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder dwoVdwo = new ItemBuilder(Material.GOLD_SWORD).setTitle(ChatUtil.fix("&7Gra: &92v2")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        final ItemBuilder threeVthree = new ItemBuilder(Material.DIAMOND_SWORD).setTitle(ChatUtil.fix("&7Gra: &93v3")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Kliknij, aby &9rozpoczac walke&7!")).addLore(ChatUtil.fix("")).addLore(ChatUtil.fix("&8>> &7Powodzenia - &9gildia PATO"));
        inv.setItem(0, glass.build());
        inv.setItem(1, glass2.build());
        inv.setItem(2, drabinki.build());
        inv.setItem(3, glass.build());
        inv.setItem(4, glass.build()); // tutaj
        inv.setItem(5, glass.build());
        inv.setItem(6, bot.build());
        inv.setItem(7, glass2.build());
        inv.setItem(8, glass.build());
        inv.setItem(9, glass2.build());
        inv.setItem(10, oneVone.build());
        inv.setItem(11, glass.build());
        inv.setItem(12, dwoVdwo.build());
        inv.setItem(13, glass.build());
        inv.setItem(14, threeVthree.build());
        inv.setItem(15, glass.build());
        inv.setItem(16, watery.build());
        inv.setItem(17, glass2.build());
        inv.setItem(18, glass.build());
        inv.setItem(19, glass2.build());
        inv.setItem(20, bugowanie.build());
        inv.setItem(21, glass.build());
        inv.setItem(22, glass.build()); // tutaj
        inv.setItem(23, glass.build());
        inv.setItem(24, parkour.build());
        inv.setItem(25, glass2.build());
        inv.setItem(26, glass.build());
        return p.openInventory(inv);
    }

}

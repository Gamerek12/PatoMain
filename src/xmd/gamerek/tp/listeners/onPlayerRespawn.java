package xmd.gamerek.tp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import xmd.gamerek.tp.items.Clock;
import xmd.gamerek.tp.items.Compas;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.ItemBuilder;

public class onPlayerRespawn implements Listener {

    public void RespawnPlaer(PlayerRespawnEvent e) {
        Player p = (Player) e.getPlayer();

        ItemBuilder glass = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (short)14).setTitle(ChatUtil.fix("&8>> &7Wybierz inne pole!"));
        ItemBuilder glass1 = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (short)9).setTitle(ChatUtil.fix("&8>> &7Wybierz inne pole!"));
        ItemBuilder glass2 = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (short)3).setTitle(ChatUtil.fix("&8>> &7Wybierz inne pole!"));
        ItemBuilder glass3 = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (short)8).setTitle(ChatUtil.fix("&8>> &7Wybierz inne pole!"));
        ItemStack compas = Compas.Compass();
        ItemStack clock = Clock.Clockk();

        p.getInventory().setItem(0, glass.build());
        p.getInventory().setItem(1, glass1.build());
        p.getInventory().setItem(2, glass2.build());
        p.getInventory().setItem(3, compas);
        p.getInventory().setItem(4, glass3.build());
        p.getInventory().setItem(5, clock);
        p.getInventory().setItem(6, glass2.build());
        p.getInventory().setItem(7, glass1.build());
        p.getInventory().setItem(8, glass.build());
        p.teleport(new Location(Bukkit.getWorld("world"), 969, 61, 969));

    }

}

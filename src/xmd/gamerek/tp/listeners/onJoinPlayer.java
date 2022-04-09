package xmd.gamerek.tp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xmd.gamerek.tp.items.Clock;
import xmd.gamerek.tp.items.Compas;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.ItemBuilder;

import java.sql.SQLException;

public class onJoinPlayer implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) throws SQLException {

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
        p.teleport(new Location(Bukkit.getWorld("world"), 969, 61, 1277));
        p.addPotionEffect(PotionEffectType.SATURATION.createEffect(1000000000, 10), true);

        ChatUtil.sendTitle(p, "&7Gildia &9&lPATO", "&8>> &7Podstawowa komenda: &9/pomoc", 10, 40, 10);

        e.setJoinMessage("");
        ChatUtil.sendActionbarToAllPlayers("&7Do gry dolaczyl: &9" + p.getName() + "&7!");
    }
}

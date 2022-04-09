package xmd.gamerek.tp.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import xmd.gamerek.tp.MainPlugin;

import java.util.ArrayList;
import java.util.List;

public class PlayerUtil {

        private static final PlayerUtil playerutil = new PlayerUtil();
    private final MainPlugin plugin = MainPlugin.getInstance();

    public static PlayerUtil getPlayerUtil() {
            return playerutil;
        }

        private final List<Player> tpQueue = new ArrayList<>();

        public void rtp(Player player) {
            if (tpQueue.contains(player) ) {
                player.sendMessage(ChatUtil.fixColor("&8>> &7Nie klikaj tak czesto &cguzika&7!"));
                return;
            }
            tpQueue.add(player);

            int x = 969;
            int z = 1276;
            int y = 65;

            new BukkitRunnable() {

                @SuppressWarnings("deprecation")
                @Override
                public void run() {
                    if (!player.isOnline()) {
                        tpQueue.remove(player);
                        return;
                    }

                    player.teleport(new Location(player.getWorld(), x, y, z));
                    tpQueue.remove(player);
                    player.sendTitle(ChatUtil.fix("&c&lPATO &8>>"), ChatUtil.fix("&7Testowac sie dalej? &c/testy"));
                }
            }.runTaskLater(plugin, 40);

        }

    }

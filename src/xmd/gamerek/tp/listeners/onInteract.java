package xmd.gamerek.tp.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import xmd.gamerek.tp.gui.TestGUI;
import xmd.gamerek.tp.gui.walkaGUI;
import xmd.gamerek.tp.utils.ChatUtil;

public class onInteract implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();

        if(a == Action.LEFT_CLICK_AIR || a.equals(Action.RIGHT_CLICK_AIR) || a.equals(Action.LEFT_CLICK_BLOCK) || a.equals(Action.RIGHT_CLICK_BLOCK)) {
            if(p.getItemInHand().getType().equals(Material.COMPASS)) {

                TestGUI.testGUI(p);
                p.sendMessage(" ");
                p.sendMessage(ChatUtil.fix("&8>> &7Otwarto gui &ctestow bp&7!"));
                p.sendMessage(" ");
            } else if(p.getItemInHand().getType().equals(Material.GOLD_BARDING)) {

                    p.sendMessage(" ");
                    p.sendMessage(ChatUtil.fix("&8>> &7Tryb &9practice &7jest offline!"));
                    p.sendMessage(" ");
            }
        }
    }
}

package xmd.gamerek.tp.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.utils.BlockUtil;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.PlayerUtil;

import javax.swing.*;

public class ClockInteract implements Listener {

    MainPlugin plugin;

    @SuppressWarnings("deprecation")
    @EventHandler
    public void interact(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK))
            return;

        player.sendTitle(ChatUtil.fix("&c&lPATO"), ChatUtil.fixColor("&7Powrot do &clobby&7!"));
        player.showPlayer(player);
        player.getInventory().clear();
        PlayerUtil.getPlayerUtil().rtp(player);
    }

}

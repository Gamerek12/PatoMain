package xmd.gamerek.tp.listeners;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.utils.BlockUtil;
import xmd.gamerek.tp.utils.ChatUtil;

public class ButtonPlace implements Listener {

    MainPlugin plugin;

    @EventHandler
    public void place(BlockPlaceEvent e) {
        Block block = e.getBlock();
        if (!block.getType().equals(Material.STONE_BUTTON))
            return;

        Block behind = BlockUtil.getBlockutil().getBlockBehind(block);
        if (behind == null)
            return;
        if (!behind.getType().equals(Material.EMERALD_BLOCK))
            return;

        Player player = e.getPlayer();
        if (!player.isOp()) {
            block.breakNaturally();
            player.sendMessage(ChatUtil.fix("&8>> &7Nie masz &cpermisji&7!"));
            return;
        }

        block.getWorld().playEffect(block.getLocation(), Effect.SMOKE, 200000000, 2000000000);
        block.getWorld().strikeLightningEffect(block.getLocation());
        player.sendMessage(ChatUtil.fix("&8>> &7Poprawnie ustawiono &ateleport&7!"));
    }
}

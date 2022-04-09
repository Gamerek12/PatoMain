package xmd.gamerek.tp.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.items.Air;
import xmd.gamerek.tp.utils.BlockUtil;
import xmd.gamerek.tp.utils.ChatUtil;
import xmd.gamerek.tp.utils.PlayerUtil;

public class ButtonInteract implements Listener {

    MainPlugin plugin;

    @SuppressWarnings("deprecation")
    @EventHandler
    public void interact(PlayerInteractEvent e) {
        ItemStack air = Air.Powietrze();
        Player player = e.getPlayer();
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK))
            return;

        Block clicked = e.getClickedBlock();
        if (!clicked.getType().equals(Material.STONE_BUTTON))
            return;

        Block behind = BlockUtil.getBlockutil().getBlockBehind(clicked);
        if (behind == null)
            return;
        if (!behind.getType().equals(Material.EMERALD_BLOCK))
            return;

        player.sendTitle(ChatUtil.fix("&c&lPATO"), ChatUtil.fixColor("&7Powrot do &clobby&7!"));
        ChatUtil.sendActionbar(player, "&8>> &7Czyszczenie &ceq&7!");
        player.getInventory().clear();
        player.getInventory().setHelmet(air);
        player.getInventory().setChestplate(air);
        player.getInventory().setLeggings(air);
        player.getInventory().setBoots(air);
        PlayerUtil.getPlayerUtil().rtp(player);
    }

}

package xmd.gamerek.tp.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import xmd.gamerek.tp.utils.ChatUtil;

public class onDeadPlayer implements Listener {

    public void PlayerDead(PlayerDeathEvent e) {
            e.setDeathMessage(ChatUtil.fix("&8>> &7Gracz &c " + e.getEventName() + " &7umarl!"));
    }
}

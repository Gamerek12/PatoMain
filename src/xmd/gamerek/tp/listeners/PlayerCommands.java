package xmd.gamerek.tp.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;
import xmd.gamerek.tp.utils.ChatUtil;

public class PlayerCommands implements Listener {

    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        String cmd = e.getMessage();

        if(!p.hasPermission("tech.cmds") || !p.isOp()) {
            if(cmd.contains("/pl")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.pl&8)"));
                return;
            } else if(cmd.contains("bukkit:pl")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.pl&8)"));
                return;
            }else if(cmd.contains("/bukkit:plugins")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.plugins&8)"));
                return;
            }else if(cmd.contains("/plugins")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.plugins&8)"));
                return;
            }else if(cmd.contains("/bukkit:ver")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.ver&8)"));
                return;
            }else if(cmd.contains("/minecraft:me")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.me&8)"));
                return;
            }else if(cmd.contains("/me")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.me&8)"));
                return;
            }else if(cmd.contains("/spigot:reload")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.reload&8)"));
                return;
            }else if(cmd.contains("/nuke")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.nuke&8)"));
                return;
            }else if(cmd.contains("/bukkit:?")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.?&8)"));
                return;
            }else if(cmd.contains("/?")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.?&8)"));
                return;
            }else if(cmd.contains("/help")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.help&8)"));
                return;
            }else if(cmd.contains("/bukkit:help")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.help&8)"));
                return;
            }else if(cmd.contains("/bungee")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbungee.command.bungee&8)"));
                return;
            }else if(cmd.contains(" //calculotr")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cworldedit.command.calculator&8)"));
                return;
            }else if(cmd.contains(" /gamemode")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.gamemode&8)"));
                return;
            }else if(cmd.contains(" /op")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.op&8)"));
                return;
            }else if(cmd.contains(" /deop")) {
                e.setCancelled(true);
                p.sendMessage(ChatUtil.fix("<X> &4&lNie masz dostępu do tej komendy! &8(&cbukkit.command.deop&8)"));
                return;
            }
        }

        String msg = e.getMessage().split(" ") [0];
        HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
        if(topic == null) {
            p.sendMessage(ChatUtil.fixColor("&4&lBLAD! &7Wpisz: &c&l/POMOC"));
            e.setCancelled(true);
        }
    }

}

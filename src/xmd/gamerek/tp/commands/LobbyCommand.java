package xmd.gamerek.tp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.utils.ChatUtil;

public class LobbyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player p = (Player) sender;

        for (int i = 5; i >= 0;  i-- )
        {
            ChatUtil.sendActionbar(p, "&8>> &7Teleportacja do &clobby &7za: &c" + i + "&7!");
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        MainPlugin.sendPlayer((Player) sender, "lobby");

        return false;
    }
}

package xmd.gamerek.tp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xmd.gamerek.tp.utils.ChatUtil;

public class OsobyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String s, String[] args) {

        Player p = (Player) sender;

        ChatUtil.sendActionbar(p, "&8>> &7Aktualnie na serwerze jest: &c" + Bukkit.getOnlinePlayers().size() + "&7!");

        return false;
    }
}

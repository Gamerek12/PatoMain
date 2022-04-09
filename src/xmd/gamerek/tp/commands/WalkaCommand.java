package xmd.gamerek.tp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xmd.gamerek.tp.gui.walkaGUI;
import xmd.gamerek.tp.utils.ChatUtil;

public class WalkaCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(!p.isOp()) return ChatUtil.sendMessage(p, "&8>> &7Nie masz &cpermisji &7do tego!");

            walkaGUI.efektyGUI(p);
        }

        return false;
    }
}

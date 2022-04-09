package xmd.gamerek.tp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xmd.gamerek.tp.utils.ChatUtil;

public class PomocCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String s, String[] args) {

        Player p = (Player) sender;

        p.sendMessage(ChatUtil.fix(""));
        p.sendMessage(ChatUtil.fix("&8>> &7Jedyne komendy, jakie istnieja na serwerze to:"));
        p.sendMessage(ChatUtil.fix("&8>> &c&l/TESTY&7, &c&l/WALKA &7i &c&l/LIST"));
        p.sendMessage(ChatUtil.fix(""));
        p.sendMessage(ChatUtil.fix("&8>> &7Milego grania na serwerze! ~ &cLiderowka PATO"));
        p.sendMessage(ChatUtil.fix("&8>> &fAutor pluginu: &cGamer!"));
        p.sendMessage(ChatUtil.fix(""));

        return false;
    }
}

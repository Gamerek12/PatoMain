package xmd.gamerek.tp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.automsg.Automsg;
import xmd.gamerek.tp.utils.Config;

public class AutomsgCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String arg2, final String[] args) {
        if (!cmd.getName().equalsIgnoreCase("automsg")) {
            return false;
        }
        if (sender instanceof Player) {
            MainPlugin.getCfg();
            if (!sender.hasPermission(Config.pex)) {
                sender.sendMessage(Config.noPexMessage);
                return false;
            }
        }
        if (args.length < 1) {
            sender.sendMessage("�8>> �cPoprawne uzycie: �7/automsg <on/off/reload>");
            return false;
        }
        if (args[0].equalsIgnoreCase("on")) {
            if (!Automsg.autoMsgIsRunning()) {
                Automsg.runAutoMessage(Config.msgs);
                sender.sendMessage("�8>> �3AutoMessage zostalo �awlaczone");
                return true;
            }
            sender.sendMessage("�8>> �cAutoMessage jest juz wlaczone!");
            return false;
        }
        else if (args[0].equalsIgnoreCase("off")) {
            if (Automsg.autoMsgIsRunning()) {
                Automsg.stopAutoMessage();
                sender.sendMessage("�8>> �3AutoMessage zostalo �cwylaczone");
                return true;
            }
            sender.sendMessage("�8>> �cAutoMessage jest juz wylaczone!");
            return false;
        }
        else {
            if (args[0].equalsIgnoreCase("reload")) {
                Config.reloadConfig();
                sender.sendMessage("�8>> §aKonfiguracja zostala przeladowana!");
                return true;
            }
            sender.sendMessage("�8>> �cPoprawne uzycie: �7/automsg <on/off/reload>");
            return false;
        }
    }
}

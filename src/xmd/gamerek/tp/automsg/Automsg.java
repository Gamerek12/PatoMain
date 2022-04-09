package xmd.gamerek.tp.automsg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import xmd.gamerek.tp.MainPlugin;
import xmd.gamerek.tp.utils.Config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Automsg {

    private static Map<String, Integer> timery;
    private static int taskID;
    private static int msgNum;

    static {
        Automsg.timery = new HashMap<String, Integer>();
    }

    public static void runAutoMessage(final List<String> msgs) {
        if (Automsg.timery.containsKey("Timer")) {
            Bukkit.getScheduler().cancelTask((int)Automsg.timery.get("Timer"));
            Automsg.timery.remove("Timer");
        }
        Automsg.msgNum = 0;
        Automsg.taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin) MainPlugin.getMain(), (Runnable)new Runnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage(String.valueOf(Config.chatPrefix) + msgs.get(Automsg.msgNum));
                Automsg.access$1(Automsg.msgNum + 1);
                if (Automsg.msgNum == msgs.size()) {
                    Automsg.access$1(0);
                }
            }
        }, (long)(Config.delay * 20), (long)(Config.delay * 20));
        Automsg.timery.put("Timer", Automsg.taskID);
    }

    public static void stopAutoMessage() {
        if (Automsg.timery.containsKey("Timer")) {
            Bukkit.getScheduler().cancelTask((int)Automsg.timery.get("Timer"));
            Automsg.timery.remove("Timer");
        }
    }

    public static boolean autoMsgIsRunning() {
        return Automsg.timery.containsKey("Timer");
    }

    static /* synthetic */ void access$1(final int msgNum) {
        Automsg.msgNum = msgNum;
    }

}

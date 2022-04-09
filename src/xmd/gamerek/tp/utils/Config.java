package xmd.gamerek.tp.utils;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public static int delay;
    public static String chatPrefix;
    public static List<String> msgs;
    public static boolean automsgStan;
    public static String pex;
    public static String noPexMessage;

    static {
        Config.msgs = new ArrayList<String>();
    }

    public static void reloadConfig() {
        Config.delay = FilesManager.ymlconfig.getInt("time");
        Config.chatPrefix = color(FilesManager.ymlconfig.getString("chatPrefix"));
        Config.msgs = colorList(FilesManager.ymlconfig.getStringList("wiadomosci"));
        Config.automsgStan = FilesManager.ymlconfig.getBoolean("defaultEnabled");
        Config.pex = FilesManager.ymlconfig.getString("pex");
        Config.noPexMessage = color(FilesManager.ymlconfig.getString("no-pexmsg"));
    }

    public static String color(final String msg) {
        return msg.replaceAll("&", "�");
    }

    public static List<String> colorList(final List<String> msg) {
        final List<String> ret = new ArrayList<String>();
        for (int i = 0; i < msg.size(); ++i) {
            ret.add(msg.get(i).replaceAll("&", "�"));
        }
        return ret;
    }
}

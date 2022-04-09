package xmd.gamerek.tp.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import xmd.gamerek.tp.MainPlugin;

import java.io.File;

public class FilesManager {
    public static File dir;
    public static File config;
    public static YamlConfiguration ymlconfig;

    static {
        FilesManager.dir = new File("plugins/gScript-AutoMessage");
        FilesManager.config = new File(FilesManager.dir + "/config.yml");
    }

    public static void checkFiles() {
        if (!FilesManager.dir.exists()) {
            FilesManager.dir.mkdir();
        }
        if (!FilesManager.config.exists()) {
            MainPlugin.getMain().saveResource("config.yml", true);
        }
        FilesManager.ymlconfig = YamlConfiguration.loadConfiguration(FilesManager.config);
    }
}

package xmd.gamerek.tp;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.plugin.java.*;
import org.bukkit.event.*;
import org.bukkit.*;
import xmd.gamerek.tp.automsg.Automsg;
import xmd.gamerek.tp.commands.*;
import xmd.gamerek.tp.guiListener.TestyListener;
import xmd.gamerek.tp.guiListener.walkaListener;
import xmd.gamerek.tp.listeners.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;
import xmd.gamerek.tp.utils.Config;
import xmd.gamerek.tp.utils.FilesManager;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class MainPlugin extends JavaPlugin implements Listener
{
    private static MainPlugin instance;

    public static MainPlugin main;
    public static Config config;

    public void onEnable() {
        instance = this;
        System.out.println("[Pato-Main] Load Listeners.....");
        Bukkit.getPluginManager().registerEvents((Listener)new TestyListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener) new ButtonPlace(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener) new ButtonInteract(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener) new onJoinPlayer(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener) new PlayerCommands(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener) this, (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new walkaListener(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new onInteract(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new onDeadPlayer(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new onPlayerRespawn(), (Plugin)this);
        System.out.println("[Pato-Main] Load Commands......");
        this.getCommand("pomoc").setExecutor((CommandExecutor)new PomocCommand());
        this.getCommand("online").setExecutor((CommandExecutor)new OsobyCommand());
        this.getCommand("walka").setExecutor((CommandExecutor)new WalkaCommand());
        this.getCommand("testy").setExecutor((CommandExecutor)new TestyCommand());
        this.getCommand("lobby").setExecutor((CommandExecutor)new LobbyCommand());
        this.getCommand("automsg").setExecutor((CommandExecutor)new AutomsgCommand());
        FilesManager.checkFiles();
        Config.reloadConfig();
        if (Config.automsgStan) {
            Automsg.runAutoMessage(Config.msgs);
        }
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        System.out.println("[Pato-Main] Plugin zostal zaladowany!");
    }

    public static MainPlugin getInstance() {
        return instance;
    }

    @EventHandler
    public void BlockFromto(final BlockFromToEvent event) {
        final Block block = event.getToBlock();
        final Material type = block.getType();
        if (type.equals((Object)Material.WATER)) {}
        type.equals((Object)Material.STATIONARY_WATER);
        type.equals((Object)Material.LAVA);
        type.equals((Object)Material.STATIONARY_LAVA);
        event.setCancelled(true);
    }

    public static void sendPlayer(Player p, String target) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeUTF("Connect");
            dos.writeUTF("lobby");
        } catch (Exception e) {
            e.printStackTrace();

        }

        p.sendPluginMessage(MainPlugin.getPlugin(MainPlugin.class), "BungeeCord", baos.toByteArray());
    }


    public static MainPlugin getMain() {
        return MainPlugin.main;
    }

    public static Config getCfg() {
        return MainPlugin.config;
    }
}

package xmd.gamerek.tp.guiListener;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import xmd.gamerek.tp.utils.ChatUtil;

public class walkaListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void walka(final InventoryClickEvent e) {
        if (e.getInventory().getName().equalsIgnoreCase("Practice")) {
            e.setCancelled(true);
            final int j = e.getSlot();
            final Player p = (Player)e.getWhoClicked();
            // speed
            if (j == 2) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &9DRABINKI &7rozpocznie sie za: &9" + i + "&7!", 10, 30,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.LADDER, 16));
                p.teleport(new Location(Bukkit.getWorld("world"), 10, 100, 10));
                return;
            }
            // haste
            else if (j == 6) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &9WALKA Z BOTEM &7rozpocznie sie za: &9" + i + "&7!", 10, 30,10);try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.SLIME_BLOCK, 1)); //TODO: saturacja, iron sword, iron zbrojka
                p.teleport(new Location(Bukkit.getWorld("world"), 10, 100, 10));
                return;
            }
            else if (j == 10) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &91v1 &7rozpocznie sie za: &9" + i + "&7!", 10, 30,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.teleport(new Location(Bukkit.getWorld("world"), 1042, 1, 1166));
                return;
            }
            else if (j == 12) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &92v2 &7rozpocznie sie za: &9" + i + "&7!", 10, 30,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
                p.teleport(new Location(Bukkit.getWorld("world"), 1014, 70, 1162));
                return;
            }

            else if (j == 14) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0; i--) {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &93v3 &7rozpocznie sie za: &9" + i + "&7!", 10, 30, 10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.teleport(new Location(Bukkit.getWorld("world"), 1095, 70, 1162));
                return;
            }

            else if (j == 16) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0; i--) {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &9Watery &7rozpocznie sie za: &9" + i + "&7!", 10, 30, 10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.teleport(new Location(Bukkit.getWorld("world"), 1095, 70, 1162));
                return;
            }

            else if (j == 20) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0; i--) {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &9Wybugowywanie z fosy &7rozpocznie sie za: &9" + i + "&7!", 10, 30, 10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.teleport(new Location(Bukkit.getWorld("world"), 1095, 70, 1162));
                return;
            }

            else if (j == 24) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0; i--) {
                    ChatUtil.sendTitle((Player) p, "", "&7Gra: &9Parkour &7rozpocznie sie za: &9" + i + "&7!", 10, 30, 10);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                    }
                }
                ChatUtil.sendActionbar(p, "&9&n&lPATO&r &8>> &aStart&7, powodzenia!");
                p.teleport(new Location(Bukkit.getWorld("world"), 1095, 70, 1162));
                return;
            }
        }
    }

}

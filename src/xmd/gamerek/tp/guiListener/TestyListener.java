package xmd.gamerek.tp.guiListener;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.inventory.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import xmd.gamerek.tp.items.Boots;
import xmd.gamerek.tp.items.Chestplate;
import xmd.gamerek.tp.items.Helmet;
import xmd.gamerek.tp.items.Leggins;
import xmd.gamerek.tp.utils.ChatUtil;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import xmd.gamerek.tp.utils.ItemBuilder;

public class TestyListener implements Listener
{

    @EventHandler(priority = EventPriority.MONITOR)
    public void efekty(final InventoryClickEvent e) {
        if (e.getInventory().getName().equalsIgnoreCase(ChatUtil.fix("&8>> &cTestowanie &c&lBP!"))) {
            e.setCancelled(true);
            final int j = e.getSlot();
            final Player p = (Player)e.getWhoClicked();
            if (j == 4) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Testy: &cPrzechodzenie na druga strone &7rozpoczna sie za: &c" + i + "&7!", 10, 40,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }

                ItemStack helm = Helmet.Helm();
                ItemStack napiersnik = Chestplate.Napiersnik();
                ItemStack spodnie = Leggins.Nogawice();
                ItemStack buty = Boots.Buty();

                ChatUtil.sendActionbar(p, "&c&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));
                p.getInventory().addItem(new ItemStack(Material.SLIME_BLOCK, 1));
                p.getInventory().setHelmet(helm);
                p.getInventory().setChestplate(napiersnik);
                p.getInventory().setLeggings(spodnie);
                p.getInventory().setBoots(buty);
                p.addPotionEffect(PotionEffectType.REGENERATION.createEffect(30, 2), true);
                p.teleport(new Location(Bukkit.getWorld("world"), 940, 73, 1355));
                return;
            }
            else if (j == 15) {
                p.closeInventory();
                p.getInventory().clear();
                ItemStack helm = Helmet.Helm();
                ItemStack napiersnik = Chestplate.Napiersnik();
                ItemStack spodnie = Leggins.Nogawice();
                ItemStack buty = Boots.Buty();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Testy: &cWyklockowywanie w dol &7rozpoczna sie za: &c" + i + "&7!", 10, 40,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&c&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));
                p.getInventory().setHelmet(helm);
                p.getInventory().setChestplate(napiersnik);
                p.getInventory().setLeggings(spodnie);
                p.getInventory().setBoots(buty);
                p.teleport(new Location(Bukkit.getWorld("world"), 966, 73, 1379));
                return;
            }

            // WATERY <-

            else if (j == 11) {
                p.closeInventory();
                p.getInventory().clear();
                for (int i = 3; i >= 0;  i-- )
                {
                    ChatUtil.sendTitle((Player) p, "", "&7Testy: &cWater'a &7rozpoczna sie za: &c" + i + "&7!", 10, 40,10);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ie)
                    {
                    }
                }
                ChatUtil.sendActionbar(p, "&c&lPATO&r &8>> &aStart&7, powodzenia!");
                p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
                p.teleport(new Location(Bukkit.getWorld("world"), 967, 73, 1354));
                return;
            }

            else if (j == 22) {
                if(p.isOp() || p.hasPermission("pato.admin")) {
                    p.closeInventory();
                    ChatUtil.sendMessage((CommandSender) p, "&c&lPATO &8>> &7Zostaniesz przeteleportowany za chwile!");
                    for (int i = 3; i >= 0; i--) {
                        ChatUtil.sendTitle((Player) p, "&c&lPATO &8>>", "&7Teleportacja za: &c" + i + "&7!", 10, 40, 10);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ie) {
                        }
                    }
                    p.sendMessage(ChatUtil.fix("&8>> &7Zobacz graczy, ktorzy sie testuja!"));
                    ChatUtil.sendActionbar(p, "&c&lPATO &8>> &a&lMilego sprawdzania!");
                    p.setGameMode(GameMode.SPECTATOR);
                    p.teleport(new Location(Bukkit.getWorld("world"), 953, 73, 1370));
                    return;
                }else
                    p.sendMessage(ChatUtil.fix("&cNie masz permisji zjebie"));
                return;
            }
        }
    }
}

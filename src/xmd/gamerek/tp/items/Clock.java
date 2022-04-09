package xmd.gamerek.tp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xmd.gamerek.tp.utils.ChatUtil;

public class Clock {

    public static ItemStack Clockk() {
        ItemStack item = new ItemStack(Material.GOLD_BARDING);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatUtil.fix("&8>> &9Tryb Practice &c&l(Off) &r&8<<"));

        item.setItemMeta(meta);

        return item;
    }

}

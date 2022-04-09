package xmd.gamerek.tp.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xmd.gamerek.tp.utils.ChatUtil;

public class Compas {

    public static ItemStack Compass() {
        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatUtil.fix("&8>> &cTryb Testy BP &8<<"));

        item.setItemMeta(meta);

        return item;
    }

}

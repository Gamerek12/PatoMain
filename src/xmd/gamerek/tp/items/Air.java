package xmd.gamerek.tp.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Air {

    public static ItemStack Powietrze() {
        ItemStack item = new ItemStack(Material.AIR);
        ItemMeta meta = item.getItemMeta();

        item.setItemMeta(meta);

        return item;
    }

}

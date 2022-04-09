package xmd.gamerek.tp.utils;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.material.Directional;

public class BlockUtil {

    private static final BlockUtil blockUtil = new BlockUtil();
    public static BlockUtil getBlockutil() {
        return blockUtil;
    }

    public Block getBlockBehind(Block b) {
        BlockState state = b.getState();
        Directional dir = (Directional) state.getData();
        return b.getRelative(dir.getFacing().getOppositeFace());
    }

}

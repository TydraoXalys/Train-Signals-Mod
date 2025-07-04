package fr.tydraoxalys.trainsignals.items.items;

// import net.minecraft.block.Block;
// import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class SemaphoreSignal extends CustomItem {

    public SemaphoreSignal() {
        super(initSettings(), "semaphore");
    }

    private static Settings initSettings() {
        Item.Settings settings = new Item.Settings();
        return settings;
    }

}

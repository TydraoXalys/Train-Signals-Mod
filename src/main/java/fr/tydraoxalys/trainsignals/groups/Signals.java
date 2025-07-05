package fr.tydraoxalys.trainsignals.groups;

import fr.tydraoxalys.trainsignals.items.ItemManager;
import net.minecraft.item.ItemStack;

public class Signals extends CustomGroup {

    public Signals() {
        super("signals_group",new ItemStack(ItemManager.SEMAPHORE));
    }
    
}

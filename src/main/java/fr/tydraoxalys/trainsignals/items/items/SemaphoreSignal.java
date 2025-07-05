package fr.tydraoxalys.trainsignals.items.items;

import fr.tydraoxalys.trainsignals.utils.RegistryManager;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

public class SemaphoreSignal extends CustomItem {

    public SemaphoreSignal() {
        super(initSettings(), "semaphore_signal");
    }

    private static Settings initSettings() {
        Item.Settings settings = new Item.Settings();
        settings.registryKey(RegistryManager.generateKey(Registries.ITEM.getKey(), "semaphore_signal"));
        return settings;
    }

}

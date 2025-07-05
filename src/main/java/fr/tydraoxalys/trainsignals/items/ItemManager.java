package fr.tydraoxalys.trainsignals.items;

import fr.tydraoxalys.trainsignals.groups.GroupManager;
import fr.tydraoxalys.trainsignals.items.items.SemaphoreSignal;
import fr.tydraoxalys.trainsignals.utils.RegistryManager;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKeys;

/**
 * Class that manages mod's custom items.
 * 
 * @author TydraoXalys
 */
public class ItemManager {
    public static final SemaphoreSignal SEMAPHORE = RegistryManager.register(new SemaphoreSignal());

    public static void init() {
        ItemGroupEvents
            .modifyEntriesEvent(
                RegistryManager.generateKey(RegistryKeys.ITEM_GROUP, GroupManager.SIGNALS.getGroupName())
            )
            .register((itemGroup) -> {
                itemGroup.add(SEMAPHORE);
            });
    }
}

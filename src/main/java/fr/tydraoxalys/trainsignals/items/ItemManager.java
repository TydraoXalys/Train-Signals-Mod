package fr.tydraoxalys.trainsignals.items;

import fr.tydraoxalys.trainsignals.items.items.SemaphoreSignal;
import fr.tydraoxalys.trainsignals.utils.RegistryManager;

/**
 * Class that manages mod's custom items.
 * 
 * @author TydraoXalys
 */
public class ItemManager {
    public static final SemaphoreSignal SEMAPHORE = RegistryManager.register(new SemaphoreSignal());

    public static void init() {}
}

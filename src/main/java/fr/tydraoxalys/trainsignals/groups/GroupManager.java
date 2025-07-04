package fr.tydraoxalys.trainsignals.groups;

import fr.tydraoxalys.trainsignals.utils.RegistryManager;
import net.minecraft.item.ItemGroup;

/**
 * Class that manages mod's custom groups.
 * 
 * @author TydraoXalys
 */
public class GroupManager {
    public static final ItemGroup SIGNALS = RegistryManager.register(Signals::new);

    public static void init() {}
}

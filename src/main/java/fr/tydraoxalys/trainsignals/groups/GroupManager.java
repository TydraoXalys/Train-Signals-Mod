package fr.tydraoxalys.trainsignals.groups;

import fr.tydraoxalys.trainsignals.utils.RegistryManager;
import net.minecraft.item.ItemGroup;

/**
 * Class that manages mod's custom groups.
 * 
 * @author TydraoXalys
 */
public class GroupManager {

    public static final Signals SIGNALS = new Signals();
    public static final ItemGroup SIGNALS_ITEMGROUP = 
        RegistryManager.register(
            SIGNALS.getInstance(), 
            SIGNALS.getGroupName()
        );

    public static void init() {}
}

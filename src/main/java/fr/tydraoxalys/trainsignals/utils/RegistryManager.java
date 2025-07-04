package fr.tydraoxalys.trainsignals.utils;

import java.util.function.Function;

import fr.tydraoxalys.trainsignals.TrainSignals;
import fr.tydraoxalys.trainsignals.groups.CustomGroup;
import fr.tydraoxalys.trainsignals.items.blockitems.CustomBlockItem;
import fr.tydraoxalys.trainsignals.items.items.CustomItem;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

/**
 * Class that manages registry key generation and object registrations in Minecraft registries.
 * 
 * @author TydraoXalys
 */
public class RegistryManager {

    /**
     * Generates the registry key corresponding to the given entry.
     * @param registryKey Targeted registry key.
     * @param name Entry id.
     * @return Generated registry key.
     */
    public static <T> RegistryKey<T> generateKey(RegistryKey<? extends Registry<T>> registryKey, String name) {
        return RegistryKey.of(
            registryKey,
            Identifier.of(TrainSignals.MOD_ID, name)
        );
    }

    /**
     * Adds a custom group into the registries.
     * @param entry Custom group object.
     * @return ItemGroup instance corresponding to the custom group.
     */
    public static ItemGroup register(CustomGroup customGroup) {
        return Registry.register(
            Registries.ITEM_GROUP, 
            generateKey(Registries.ITEM_GROUP.getKey(), customGroup.getGroupName()), 
            customGroup.getInstance()
        );
    }

    /**
     * Adds a block and its corresponding item to the registries.
     * @param <T> Block object.
     * @param entry Block entry to add.
     * @param name Block id.
     * @param itemConstructor CustomBlockItem constructor.
     * @return Block instance.
     */
    public static <T extends Block> T register(T entry, String name, Function<T,CustomBlockItem> itemConstructor) {
        register(itemConstructor.apply(entry));
        return register(entry, name);
    }

    /**
     * Adds a block to the registries without associating an item.
     * @param <T> Block object.
     * @param entry Block entry to add.
     * @param name Block id.
     * @return Block instance.
     */
    public static <T extends Block> T register(T entry, String name) {
        return Registry.register(
            Registries.BLOCK,
            generateKey(Registries.BLOCK.getKey(), name),
            entry
        );
    }

    /**
     * Adds an item to the registries.
     * @param <T> Item object.
     * @param customItem Item to add.
     * @return Item instance.
     */
    public static <T extends CustomItem> T register(T customItem) {
        return Registry.register(
            Registries.ITEM,
            generateKey(Registries.ITEM.getKey(), customItem.getItemName()),
            customItem
        );
    }

    /**
     * Adds an item to the registries.
     * @param <T> Item object.
     * @param customBlockItem Item to add.
     * @return Item instance.
     */
    public static <T extends CustomBlockItem> T register(T customBlockItem) {
        return Registry.register(
            Registries.ITEM,
            generateKey(Registries.ITEM.getKey(), customBlockItem.getItemName()),
            customBlockItem
        );
    }
}

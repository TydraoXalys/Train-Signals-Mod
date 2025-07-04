package fr.tydraoxalys.trainsignals.utils;

import java.util.function.Function;
import java.util.function.Supplier;

import fr.tydraoxalys.trainsignals.TrainSignals;
import fr.tydraoxalys.trainsignals.groups.CustomGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
     * Instanciates an ItemGroup and add it into the registries.
     * @param constructor CustomGroup object constructor.
     * @return ItemGroup instance.
     */
    public static ItemGroup register(Supplier<CustomGroup> constructor) {
        CustomGroup customGroup = constructor.get();
        RegistryKey<ItemGroup> key = generateKey(Registries.ITEM_GROUP.getKey(), customGroup.getGroupName());

        return Registry.register(Registries.ITEM_GROUP, key, customGroup.getInstance());
    }

    /**
     * Adds a block and its corresponding item to the registries.
     * @param <T> Block object.
     * @param entry Block entry to add.
     * @param name Block id.
     * @param itemConstructor BlockItem constructor (custom or not).
     * @return Block instance.
     */
    public static <T extends Block> T register(T entry, String name, Function<T,BlockItem> itemConstructor) {
        register(itemConstructor.apply(entry), name);
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
     * @param entry Item entry to add.
     * @param name Item id.
     * @return Item instance.
     */
    public static <T extends Item> T register(T entry, String name) {
        return Registry.register(
            Registries.ITEM,
            generateKey(Registries.ITEM.getKey(), name),
            entry
        );
    }
}

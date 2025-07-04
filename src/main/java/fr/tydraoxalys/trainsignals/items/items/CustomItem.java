package fr.tydraoxalys.trainsignals.items.items;

import net.minecraft.item.Item;

public class CustomItem extends Item {

    private String name;

    public CustomItem(Item.Settings settings, String name) {
        super(settings);
        this.name = name;
    }

    public String getItemName() {
        return this.name;
    };    
}

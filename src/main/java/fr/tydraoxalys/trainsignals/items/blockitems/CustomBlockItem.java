package fr.tydraoxalys.trainsignals.items.blockitems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class CustomBlockItem extends BlockItem {

    private String name;

    public CustomBlockItem(Block block, Item.Settings settings, String name) {
        super(block, settings);
        this.name = name;
    }

    public String getItemName() {
        return this.name;
    };    
}

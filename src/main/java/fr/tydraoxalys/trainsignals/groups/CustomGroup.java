package fr.tydraoxalys.trainsignals.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;

/**
 * Abstract class for mod's custom groups.
 * 
 * @author TydraoXalys
 */
public class CustomGroup {
    
    private String name;
    private ItemGroup instance;

    public CustomGroup(String name) {
        this.name = name;
        this.instance = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.".concat(name)))
            .build();
    }

    public String getName() {
        return this.name;
    }

    public ItemGroup getInstance() {
        return this.instance;
    }
}

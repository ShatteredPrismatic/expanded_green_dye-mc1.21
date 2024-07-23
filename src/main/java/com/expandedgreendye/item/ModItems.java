package com.expandedgreendye.item;

import com.expandedgreendye.ExpandedGreenDye;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(ExpandedGreenDye.MOD_ID, id);

        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }

    public static final Item MOSS_CLUMP = register (
            new Item(new Item.Settings()),
            "moss_clump"
    );
    public static void AddToGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.MOSS_CLUMP));
        FuelRegistry.INSTANCE.add(ModItems.MOSS_CLUMP, 15 * 20);
    }
    public static final RegistryKey<ItemGroup> MossClumpGroupKey = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ExpandedGreenDye.MOD_ID, "moss_clump_group"));
    public static final ItemGroup MossClumpGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MOSS_CLUMP))
            .displayName(Text.translatable("itemGroup.expanded_green_dye"))
            .build();
}

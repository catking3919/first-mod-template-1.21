package net.catgod.firstmod.item;

import net.catgod.firstmod.FirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAT = regesterItem("rat", new Item(new Item.Settings()));
    public static final Item PINK_GARNET = regesterItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = regesterItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static Item regesterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAT);
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
            fabricItemGroupEntries.add(RAT);
        });
    }
}

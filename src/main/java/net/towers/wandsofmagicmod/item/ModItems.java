package net.towers.wandsofmagicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.WandsOfMagicMod;

public class ModItems {

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(WandsOfMagicMod.MOD_ID, name), item);
    }

    public static final Item FIRE_WAND = registerItem(
            "fire_wand",
            new Item(new Item.Settings()),
            ItemGroups.COMBAT);

    public static final Item FIRE_PROJECTILE = registerItem(
            "fire_projectile",
            new Item(new Item.Settings()),
            ItemGroups.COMBAT);

    public static void registerModItems() {
        WandsOfMagicMod.LOGGER.debug("Registering Mod Items for " + WandsOfMagicMod.MOD_ID);
    }

}

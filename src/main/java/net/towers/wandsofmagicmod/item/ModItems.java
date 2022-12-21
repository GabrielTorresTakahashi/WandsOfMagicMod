package net.towers.wandsofmagicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.WandsOfMagicMod;
import net.towers.wandsofmagicmod.item.custom.WandOfFire;

public class ModItems {

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(WandsOfMagicMod.MOD_ID, name), item);
    }

    public static final Item WAND_OF_FIRE = registerItem(
            "wand_of_fire",
            new WandOfFire(new Item.Settings().maxCount(1).fireproof().maxDamage(2), 3, -2f),
            ModItemGroup.WANDS_OF_MAGIC_GROUP);

    public static final Item FIRE_PROJECTILE = registerItem(
            "fire_projectile",
            new Item(new Item.Settings()),
            ModItemGroup.WANDS_OF_MAGIC_GROUP);

    public static final Item FIRESTONE = registerItem(
            "firestone",
            new Item(new Item.Settings()),
            ModItemGroup.WANDS_OF_MAGIC_GROUP);

    public static void registerModItems() {
        WandsOfMagicMod.LOGGER.debug("Registering Mod Items for " + WandsOfMagicMod.MOD_ID);
    }

}

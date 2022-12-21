package net.towers.wandsofmagicmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.WandsOfMagicMod;
import net.towers.wandsofmagicmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block FIRESTONE_ORE = registerBlock(
            "firestone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()),
            ModItemGroup.WANDS_OF_MAGIC_GROUP);

    public static final Block DEEPSLATE_FIRESTONE_ORE = registerBlock(
            "deepslate_firestone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ModItemGroup.WANDS_OF_MAGIC_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(WandsOfMagicMod.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(WandsOfMagicMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WandsOfMagicMod.LOGGER.debug("Registering ModBlocks for " + WandsOfMagicMod.MOD_ID);
    }

}

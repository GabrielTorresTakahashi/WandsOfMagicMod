package net.towers.wandsofmagicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.WandsOfMagicMod;

public class ModItemGroup {
    public static final ItemGroup WANDS_OF_MAGIC_GROUP = FabricItemGroup.builder(
            new Identifier(WandsOfMagicMod.MOD_ID))
            .icon(() -> new ItemStack(ModItems.FIRESTONE))
            .build();

}

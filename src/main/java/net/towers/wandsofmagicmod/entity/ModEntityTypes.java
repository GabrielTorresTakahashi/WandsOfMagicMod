package net.towers.wandsofmagicmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.WandsOfMagicMod;
import net.towers.wandsofmagicmod.entity.projectile.thrown.FireProjectileEntity;

public class ModEntityTypes {

    public static final EntityType<FireProjectileEntity> FIRE_PROJECTILE_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(WandsOfMagicMod.MOD_ID, "fire_projectile"),
            FabricEntityTypeBuilder.<FireProjectileEntity>create(SpawnGroup.MISC, FireProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build());

}

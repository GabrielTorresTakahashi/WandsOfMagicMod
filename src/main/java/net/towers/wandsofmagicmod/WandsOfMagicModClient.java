package net.towers.wandsofmagicmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.towers.wandsofmagicmod.entity.ModEntityTypes;

public class WandsOfMagicModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityTypes.FIRE_PROJECTILE_ENTITY_TYPE,
                (context) -> new FlyingItemEntityRenderer<>(context));
    }

}

package net.towers.wandsofmagicmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class WandsOfMagicModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(WandsOfMagicMod.FIRE_PROJECTILE_ENTITY_TYPE,
                (context) -> new FlyingItemEntityRenderer<>(context));
    }

}

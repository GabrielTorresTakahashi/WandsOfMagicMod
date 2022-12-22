package net.towers.wandsofmagicmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.towers.wandsofmagicmod.block.ModBlocks;
import net.towers.wandsofmagicmod.entity.projectile.thrown.FireProjectileEntity;
import net.towers.wandsofmagicmod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WandsOfMagicMod implements ModInitializer {
	public static final String MOD_ID = "wandsofmagicmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}

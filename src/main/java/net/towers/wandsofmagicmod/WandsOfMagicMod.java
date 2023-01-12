package net.towers.wandsofmagicmod;

import net.fabricmc.api.ModInitializer;
import net.towers.wandsofmagicmod.block.ModBlocks;
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

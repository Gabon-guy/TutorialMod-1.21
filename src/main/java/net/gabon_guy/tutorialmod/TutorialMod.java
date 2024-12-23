package net.gabon_guy.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.gabon_guy.tutorialmod.block.ModBlocks;
import net.gabon_guy.tutorialmod.item.ModItemGroups;
import net.gabon_guy.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "data/tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}
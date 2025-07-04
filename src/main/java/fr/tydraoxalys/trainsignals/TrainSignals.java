package fr.tydraoxalys.trainsignals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.tydraoxalys.trainsignals.blocks.BlockManager;
import fr.tydraoxalys.trainsignals.groups.GroupManager;
import fr.tydraoxalys.trainsignals.items.ItemManager;

public class TrainSignals implements ModInitializer {
	public static final String MOD_ID = "train-signals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GroupManager.init();
		BlockManager.init();
		ItemManager.init();
	}
}
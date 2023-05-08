package org.zeith.comm12.squake;

import dev.isxander.yacl.api.YetAnotherConfigLib;
import io.github.javajump3r.autocfg.ConfigGenerator;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Squake implements ModInitializer, ClientModInitializer
{
	public static final String MODID = "squake";
	public static final String MODNAME = "Squake";
	public static Squake instance;
	public static final Logger LOGGER = LogManager.getLogger(MODNAME);
	private ConfigGenerator configGen;

	public Squake()
	{
		instance = this;
	}

	public void clientSetup()
	{
		ToggleKeyHandler.setup();
		//configGen.getFinishedConfigScreen();
	}

	@Override
	public void onInitializeClient() {
		clientSetup();
	}

	@Override
	public void onInitialize() {
		new Squake();
	}

	public ConfigGenerator getConfigGen() {
		if(configGen==null)
		{
			this.configGen = new ConfigGenerator("Squake-fabric");
			configGen.addClassToConfig(ModConfig.Common.class);
		}
		return configGen;
	}
}
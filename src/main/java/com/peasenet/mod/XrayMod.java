package com.peasenet.mod;

import com.peasenet.config.XrayConfig;
import com.peasenet.main.Settings;
import com.peasenet.mods.render.ModXray;
import com.peasenet.main.GavinsMod;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XrayMod implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("gavinsmod");

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing GEM Xray!");
        Settings.addConfig(new XrayConfig());
        GavinsMod.addMod(new ModXray());
        LOGGER.info("Initialized GEM Xray!");
    }
}

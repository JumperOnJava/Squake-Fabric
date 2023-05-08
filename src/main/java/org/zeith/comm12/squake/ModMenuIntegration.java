package org.zeith.comm12.squake;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screen.Screen;
public class ModMenuIntegration implements ModMenuApi {
    public ConfigScreenFactory<Screen> getModConfigScreenFactory(){
        return Squake.instance.configGen::getFinishedConfigScreen;
    }

}
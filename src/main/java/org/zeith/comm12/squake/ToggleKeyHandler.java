package org.zeith.comm12.squake;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class ToggleKeyHandler
{
	private static final KeyBinding TOGGLE_KEY = new KeyBinding("squake.key.toggle", GLFW.GLFW_KEY_COMMA, "key.categories.squake");

	public static void setup() {
		KeyBindingHelper.registerKeyBinding(TOGGLE_KEY);
		ClientTickEvents.END_CLIENT_TICK.register(ToggleKeyHandler::onKeyEvent);
	}

	public static void onKeyEvent(MinecraftClient client) {
		if(TOGGLE_KEY.wasPressed()) {
			ModConfig.setEnabled(!ModConfig.isEnabled());

			String feedback = ModConfig.isEnabled() ? I18n.translate("squake.key.toggle.enabled") : I18n.translate("squake.key.toggle.disabled");
			MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(Text.literal("[" + Squake.MODNAME + "] " + feedback));
		}
	}
}
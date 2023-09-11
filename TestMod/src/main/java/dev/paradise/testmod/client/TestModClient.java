package dev.paradise.testmod.client;


import dev.paradise.renderer.event.RenderEvents;
import dev.paradise.testmod.Handler;
import net.fabricmc.api.ClientModInitializer;

public class TestModClient implements ClientModInitializer {
	/**
	 * Runs the mod initializer on the client environment.
	 */
	@Override
	public void onInitializeClient() {
		RenderEvents.HUD.register(Handler::hud);
		RenderEvents.WORLD.register(Handler::world);
	}
}

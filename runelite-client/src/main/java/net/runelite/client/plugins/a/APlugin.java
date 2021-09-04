package net.runelite.client.plugins.a;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@PluginDescriptor(
		name = "A Plugin",
		description = "Random Plugin Information"
)
@Slf4j
@SuppressWarnings("unused")
public class APlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ItemManager itemManager;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private AOverlay aOverlay;

	private LocalPoint localLocation;

	private ExtUtils utils;

	@Getter
	private Point minimapLocation;


	// to execute things like key press and click -- new thread
	private final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);
	private final ThreadPoolExecutor executorService = new ThreadPoolExecutor(1, 1, 25, TimeUnit.SECONDS, queue,
			new ThreadPoolExecutor.DiscardPolicy());

	@Override
	protected void startUp()
	{
		this.utils = new ExtUtils(client);
		overlayManager.add(aOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		Player local = client.getLocalPlayer();

		if (local == null)
		{
			return;
		}

		if (localLocation == null)
		{
			localLocation = local.getLocalLocation();
			return;
		}

		LocalPoint newLocation = local.getLocalLocation();
		if (newLocation.distanceTo(localLocation) <= 0)
		{
			return;
		}
		localLocation = newLocation;

		sendChatMessage("Your character has moved.");

		GameObject object = utils.findNearestGameObject(10819);
		if (object == null)
		{
			return;
		}

		minimapLocation = object.getMinimapLocation();
		if (minimapLocation != null)
		{

			sendChatMessage("nearest game object minimap information: " + minimapLocation);
			sendChatMessage("This is the distance on minimap of " + local.getMinimapLocation().distanceTo(minimapLocation));
			object.getCanvasTilePoly().getBounds();
		}
		LocalPoint localDestinationLocation = client.getLocalDestinationLocation();

		sendChatMessage("nearest game object information: " + object.getCanvasLocation());
		LocalPoint localLocation = object.getLocalLocation();
		String[] actions = object.getActions();
		for (String action :
				actions)
		{
			sendChatMessage("Options for:" + object.getName());
		}
		sendChatMessage("This is the distance of " + local.getLocalLocation().distanceTo(localLocation));
		sendChatMessage("Is it on the screen?: " + utils.isOnScreen(object));
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(aOverlay);
	}

	@Subscribe
	public void onScriptPostFired(ScriptPostFired event)
	{

	}

	private void sendChatMessage(String chatMessage)
	{
		final String message = new ChatMessageBuilder()
				.append(ChatColorType.HIGHLIGHT)
				.append(chatMessage)
				.build();

		chatMessageManager.queue(
				QueuedMessage.builder()
						.type(ChatMessageType.CONSOLE)
						.runeLiteFormattedMessage(message)
						.build());
	}

	private void sendChatMessage(String chatMessage, ChatColorType type)
	{
		final String message = new ChatMessageBuilder()
				.append(ChatColorType.HIGHLIGHT)
				.append(chatMessage)
				.build();

		chatMessageManager.queue(
				QueuedMessage.builder()
						.type(ChatMessageType.CONSOLE)
						.runeLiteFormattedMessage(message)
						.build());
	}
}

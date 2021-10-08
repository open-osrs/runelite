package net.runelite.client.plugins.a;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.*;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.external.ExternalPlugins.OneClick.Comparables.skilling.Spell;
import net.runelite.client.external.adonai.MenuMap;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

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

	private Player player;


	private boolean keyboard = true;


	// to execute things like key press and click -- new thread
	private final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);

	private ExecutorService executor;

	@Override
	protected void startUp()
	{
		executor = Executors.newFixedThreadPool(1);

		try
		{
			this.utils = new ExtUtils(client, new Keyboard());
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}

		overlayManager.add(aOverlay);
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		randomCameraEvent();

		player = client.getLocalPlayer();

		if (isPlayerLocationChanged())
		{
			sendChatMessage("Your character has moved.");
		}

		GameObject object = utils.findNearestGameObject(10819);
		if (object == null)
		{
			return;
		}

		minimapLocation = object.getMinimapLocation();
		if (minimapLocation != null)
		{
			sendChatMessage("nearest game object minimap information: " + minimapLocation);
			sendChatMessage("This is the distance on minimap of " + player.getMinimapLocation().distanceTo(minimapLocation));
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
		sendChatMessage("This is the distance of " + player.getLocalLocation().distanceTo(localLocation));
		sendChatMessage("Is it on the screen?: " + utils.isOnScreen(object));
	}

	private void randomCameraEvent()
	{
		char cameraMovement;
		if (ExtUtils.random(1, 100) > 85)
		{
			StringBuilder outcome = new StringBuilder();
			int numberPressed = ExtUtils.random(5, 20);
			switch (ExtUtils.random(1, 5))
			{
				case 1:
					cameraMovement = Keyboard.LEFT_ARROW_KEY;
					break;
				case 2:
					cameraMovement = Keyboard.RIGHT_ARROW_KEY;
					break;
				case 3:
					cameraMovement = Keyboard.UP_ARROW_KEY;
					break;
				default:
					cameraMovement = Keyboard.DOWN_ARROW_KEY;
					break;
			}
			for (int i = 0; i < numberPressed; i++)
			{
				outcome.append(cameraMovement);
			}
			Runnable typeWords = () ->
			{

				utils.robotType(outcome.toString());
			};
			executor.execute(typeWords);
		}
	}

	private boolean isPlayerLocationChanged()
	{
		if (player == null)
		{
			return false;
		}

		if (localLocation == null)
		{
			localLocation = player.getLocalLocation();
			return true;
		}

		LocalPoint newLocation = player.getLocalLocation();
		if (newLocation.distanceTo(localLocation) <= 0)
		{
			return false;
		}

		localLocation = newLocation;

		return true;
	}

	@Override
	protected void shutDown()
	{
		executor.shutdown();
		overlayManager.remove(aOverlay);
	}


	/**
	 * gets the location of the menu items
	 *
	 * @param event
	 */
	@Subscribe
	public void onMenuOpened(MenuOpened event)
	{
		MenuMap menuMap = new MenuMap(client, event);
		menuMap.getMenuCanvasLocation(menuMap.menuItems[1]);
	}

	TileObject findTileObject(int x, int y, int id)
	{
		Scene scene = client.getScene();
		Tile[][][] tiles = scene.getTiles();
		Tile tile = tiles[client.getPlane()][x][y];
		if (tile != null)
		{
			for (GameObject gameObject : tile.getGameObjects())
			{
				if (gameObject != null && gameObject.getId() == id)
				{
					return gameObject;
				}
			}

			WallObject wallObject = tile.getWallObject();
			if (wallObject != null && wallObject.getId() == id)
			{
				return wallObject;
			}

			DecorativeObject decorativeObject = tile.getDecorativeObject();
			if (decorativeObject != null && decorativeObject.getId() == id)
			{
				return decorativeObject;
			}

			GroundObject groundObject = tile.getGroundObject();
			if (groundObject != null && groundObject.getId() == id)
			{
				return groundObject;
			}
		}
		return null;
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

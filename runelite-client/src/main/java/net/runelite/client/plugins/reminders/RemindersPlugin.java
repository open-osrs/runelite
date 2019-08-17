package net.runelite.client.plugins.reminders;

import com.google.inject.Provides;
import static java.lang.Math.floor;
import static java.time.Duration.between;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.task.Schedule;
import javax.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

@PluginDescriptor(
	name = "Reminders",
	description = "various reminders",
	tags = {"session", "reminder", "hydrate", "hydration"},
	enabledByDefault = false,
	type = PluginType.UTILITY
)

public class RemindersPlugin extends Plugin
{

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	@Inject
	private RemindersConfig config;

	@Inject
	private ChatMessageManager chatMessageManager;

	private Instant loginTime;
	private boolean ready;
	private boolean hydrationReminder;
	private boolean breakReminder;

	@Provides
	RemindersConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RemindersConfig.class);
	}

	@Override
	public void startUp()
	{
		addSubscriptions();
		updateConfig();
	}

	@Override
	public void shutDown()
	{
		eventBus.unregister(this);
		loginTime = null;
	}

	private void addSubscriptions()
	{
		eventBus.subscribe(GameStateChanged.class, this, this::onGameStateChanged);
		eventBus.subscribe(ConfigChanged.class, this, this::onConfigChanged);
	}

	public void onGameStateChanged(GameStateChanged event)
	{
		GameState state = event.getGameState();

		switch (state)
		{
			case LOGIN_SCREEN:
			case LOGIN_SCREEN_AUTHENTICATOR:
			case LOGGING_IN:
				ready = true;
				loginTime = null;
				break;
			case LOGGED_IN:
				if (ready)
				{
					loginTime = Instant.now();
					ready = false;
				}
				break;
		}
	}

	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("reminders"))
		{
			return;
		}

		updateConfig();
	}

	@Schedule(
		period = 1,
		unit = ChronoUnit.MINUTES
	)
	public void reminders()
	{

		if (loginTime == null)
		{
			return;
		}
		int seconds = 60;
		int minutes = (int) floor(between(loginTime, Instant.now()).getSeconds() / seconds);
		int hours = minutes / seconds;
		if (minutes % seconds == 0 && minutes > 0)
		{
			if (this.breakReminder)
			{
				switch (hours)
				{
					case 1:
						final ChatMessageBuilder breakreminderhour = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("You have hit the 1 hour mark, you should take a 5-10 minute break.");

						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(breakreminderhour.build())
							.build());
						break;
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
						final ChatMessageBuilder breakreminderhours = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("You have hit the " + hours + " hours mark, you should take a 5-10 minute break.");

						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(breakreminderhours.build())
							.build());
						break;
					default:
						throw new IllegalStateException("Unexpected value: " + hours);
				}
			}
			if (this.hydrationReminder)
			{
				int ounces = 4 * hours;
				int millilitres = 120 * hours;

				switch (hours)
				{
					case 1:
						final ChatMessageBuilder hydrationreminderhour = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("You have been logged in for 1 hour.");
						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(hydrationreminderhour.build())
							.build());
						break;
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
						final ChatMessageBuilder hydrationreminderhours = new ChatMessageBuilder()
							.append(ChatColorType.NORMAL)
							.append("You have been logged in for " + hours + " hours.");

						chatMessageManager.queue(QueuedMessage.builder()
							.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
							.runeLiteFormattedMessage(hydrationreminderhours.build())
							.build());
						break;
					default:
						throw new IllegalStateException("Unexpected value: " + hours);
				}
			final ChatMessageBuilder hydrationreminder = new ChatMessageBuilder()
					.append(ChatColorType.NORMAL)
					.append("By this point, you should have consumed at least " + ounces + "oz (" + millilitres + "ml) of Water to maintain optimum hydration.");


				chatMessageManager.queue(QueuedMessage.builder()
					.type(ChatMessageType.FRIENDSCHATNOTIFICATION)
					.runeLiteFormattedMessage(hydrationreminder.build())
					.build());
			}
		}
	}

	private void updateConfig()
	{
		this.hydrationReminder = config.hydrationReminder();
		this.breakReminder = config.breakReminder();
	}
}

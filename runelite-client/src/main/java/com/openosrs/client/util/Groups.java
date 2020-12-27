package com.openosrs.client.util;

import com.openosrs.client.OpenOSRS;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLite;
import com.openosrs.client.config.OpenOSRSConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import org.jgroups.Address;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ObjectMessage;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.jgroups.util.Util;

@Slf4j
@Singleton
public class Groups implements Receiver
{
	private final OpenOSRSConfig openOSRSConfig;
	private final JChannel channel;

	@Getter(AccessLevel.PUBLIC)
	private int instanceCount;
	@Getter(AccessLevel.PUBLIC)
	private List<Address> members;
	@Getter(AccessLevel.PUBLIC)
	private final Map<String, List<Address>> messageMap = new HashMap<>();
	@Getter(AccessLevel.PUBLIC)
	private final PublishSubject<Message> messageStringSubject = PublishSubject.create();
	@Getter(AccessLevel.PUBLIC)
	private final PublishSubject<Message> messageObjectSubject = PublishSubject.create();

	@Inject
	public Groups(OpenOSRSConfig openOSRSConfig, EventBus eventBus) throws Exception
	{
		this.openOSRSConfig = openOSRSConfig;

		try (final InputStream is = RuneLite.class.getResourceAsStream("/udp-openosrs.xml"))
		{
			this.channel = new JChannel(is)
				.setName(OpenOSRS.uuid)
				.setReceiver(this)
				.setDiscardOwnMessages(true)
				.connect("openosrs");
		}

		eventBus.register(this);
	}

	@Subscribe
	public void onClientShutdown(ClientShutdown event)
	{
		Future<Void> f = close();
		event.waitFor(f);
	}

	public void broadcastSring(String command)
	{
		send(null, command);
	}

	public void sendConfig(Address destination, ConfigChanged configChanged)
	{
		if (!openOSRSConfig.localSync() || OpenOSRSSplashScreen.showing() || instanceCount < 2)
		{
			return;
		}

		try
		{
			byte[] buffer = Util.objectToByteBuffer(configChanged);
			Message message = new ObjectMessage()
				.setDest(destination)
				.setObject(buffer);

			channel.send(message);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void sendString(String command)
	{
		String[] messageObject = command.split(";");
		String pluginId = messageObject[1];

		messageMap.put(pluginId, new ArrayList<>());

		for (Address member : channel.getView().getMembers())
		{
			if (member.toString().equals(OpenOSRS.uuid))
			{
				continue;
			}

			messageMap.get(pluginId).add(member);
			send(member, command);
		}
	}

	public void send(Address destination, String command)
	{
		if (!openOSRSConfig.localSync() || OpenOSRSSplashScreen.showing() || instanceCount < 2)
		{
			return;
		}

		try
		{
			channel.send(new ObjectMessage(destination, command));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void viewAccepted(View view)
	{
		members = view.getMembers();
		instanceCount = members.size();
	}

	@Override
	public void receive(Message message)
	{
		if (OpenOSRSSplashScreen.showing())
		{
			return;
		}

		if (message.getObject() instanceof String)
		{
			messageStringSubject.onNext(message);
		}
		else
		{
			messageObjectSubject.onNext(message);
		}

	}

	private CompletableFuture<Void> close()
	{
		CompletableFuture<Void> future = new CompletableFuture<>();
		try
		{
			channel.close();
			future.complete(null);
		}
		catch (Exception ex)
		{
			future.completeExceptionally(ex);
		}

		return future;
	}
}

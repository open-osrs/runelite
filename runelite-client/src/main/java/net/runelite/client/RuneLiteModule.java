/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.openosrs.client.config.OpenOSRSConfig;
import java.applet.Applet;
import java.io.File;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.inject.Singleton;
import lombok.AllArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.hooks.Callbacks;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.Hooks;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ItemManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.task.Scheduler;
import net.runelite.client.util.DeferredEventBus;
import net.runelite.client.util.ExecutorServiceExceptionLogger;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.chat.ChatClient;
import okhttp3.OkHttpClient;

@AllArgsConstructor
public class RuneLiteModule extends AbstractModule
{
	private final OkHttpClient okHttpClient;
	private final Supplier<Applet> clientLoader;
	private final boolean developerMode;
	private final boolean safeMode;
	private final File sessionfile;
	private final File config;

	@Override
	protected void configure()
	{
		Properties properties = RuneLiteProperties.getProperties();
		for (String key : properties.stringPropertyNames())
		{
			String value = properties.getProperty(key);
			bindConstant().annotatedWith(Names.named(key)).to(value);
		}
		bindConstant().annotatedWith(Names.named("developerMode")).to(developerMode);
		bindConstant().annotatedWith(Names.named("safeMode")).to(safeMode);
		bind(File.class).annotatedWith(Names.named("sessionfile")).toInstance(sessionfile);
		bind(File.class).annotatedWith(Names.named("config")).toInstance(config);
		bind(ScheduledExecutorService.class).toInstance(new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
		bind(OkHttpClient.class).toInstance(okHttpClient);
		bind(MenuManager.class);
		bind(ChatMessageManager.class);
		bind(ItemManager.class);
		bind(Scheduler.class);
		bind(PluginManager.class);
		bind(SessionManager.class);

		bind(Gson.class).toInstance(RuneLiteAPI.GSON);

		bind(Callbacks.class).to(Hooks.class);

		bind(EventBus.class)
			.toInstance(new EventBus());

		bind(EventBus.class)
			.annotatedWith(Names.named("Deferred EventBus"))
			.to(DeferredEventBus.class);
	}

	@Provides
	@Singleton
	Applet provideApplet()
	{
		return clientLoader.get();
	}

	@Provides
	@Singleton
	Client provideClient(@Nullable Applet applet)
	{
		return applet instanceof Client ? (Client) applet : null;
	}

	@Provides
	@Singleton
	RuneLiteConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RuneLiteConfig.class);
	}

	@Provides
	@Singleton
	ChatColorConfig provideChatColorConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ChatColorConfig.class);
	}

	@Provides
	@Singleton
	ChatClient provideChatClient(OkHttpClient okHttpClient)
	{
		return new ChatClient(okHttpClient);
	}

	@Provides
	@Singleton
	OpenOSRSConfig provideOpenOSRSConfig(ConfigManager configManager)
	{
		return configManager.getConfig(OpenOSRSConfig.class);
	}

	@Provides
	@Singleton
	ExecutorService provideExecutorService()
	{
		int poolSize = 2 * Runtime.getRuntime().availableProcessors();

		// Will start up to poolSize threads (because of allowCoreThreadTimeOut) as necessary, and times out
		// unused threads after 1 minute
		ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize,
			60L, TimeUnit.SECONDS,
			new LinkedBlockingQueue<>(),
			new ThreadFactoryBuilder().setNameFormat("worker-%d").build());
		executor.allowCoreThreadTimeOut(true);

		return new NonScheduledExecutorServiceExceptionLogger(executor);
	}
}

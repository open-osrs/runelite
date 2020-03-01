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
package net.runelite.client.plugins;

import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;
import com.google.inject.testing.fieldbinder.Bind;
import com.google.inject.testing.fieldbinder.BoundFieldModule;
import com.google.inject.util.Modules;
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.events.Event;
import net.runelite.client.RuneLite;
import net.runelite.client.RuneLiteModule;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.eventbus.AccessorGenerator;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PluginManagerTest
{
	private static final String PLUGIN_PACKAGE = "net.runelite.client.plugins";

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Mock
	@Bind
	public Applet applet;

	@Mock
	@Bind
	public Client client;

	private Set<Class> pluginClasses;
	private Set<Class> configClasses;

	@Before
	public void before() throws IOException
	{
		Injector injector = Guice.createInjector(Modules
			.override(new RuneLiteModule(() -> null, true))
			.with(BoundFieldModule.of(this)));

		RuneLite.setInjector(injector);

		// Find plugins and configs we expect to have
		pluginClasses = new HashSet<>();
		configClasses = new HashSet<>();
		Set<ClassInfo> classes = ClassPath.from(getClass().getClassLoader()).getTopLevelClassesRecursive(PLUGIN_PACKAGE);
		for (ClassInfo classInfo : classes)
		{
			Class<?> clazz = classInfo.load();
			PluginDescriptor pluginDescriptor = clazz.getAnnotation(PluginDescriptor.class);
			if (pluginDescriptor != null)
			{
				pluginClasses.add(clazz);
				continue;
			}

			if (Config.class.isAssignableFrom(clazz))
			{
				configClasses.add(clazz);
			}
		}
	}

	@Test
	public void testLoadPlugins() throws Exception
	{
		PluginManager pluginManager = new PluginManager(false, null, null, null, null);
		pluginManager.setOutdated(true);
		pluginManager.loadCorePlugins();
		Collection<Plugin> plugins = pluginManager.getPlugins();
		long expected = pluginClasses.stream()
			.map(cl -> (PluginDescriptor) cl.getAnnotation(PluginDescriptor.class))
			.filter(Objects::nonNull)
			.filter(PluginDescriptor::loadWhenOutdated)
			.count();
		assertEquals(expected, plugins.size());

		pluginManager = new PluginManager(false, null, null, null, null);
		pluginManager.loadCorePlugins();
		plugins = pluginManager.getPlugins();

		expected = pluginClasses.stream()
			.map(cl -> (PluginDescriptor) cl.getAnnotation(PluginDescriptor.class))
			.filter(Objects::nonNull)
			.filter(pd -> !pd.developerPlugin())
			.count();
		assertEquals(expected, plugins.size());
	}

	@Test
	public void dumpGraph() throws Exception
	{
		List<Module> modules = new ArrayList<>();
		modules.add(new GraphvizModule());
		modules.add(new RuneLiteModule(() -> null, true));

		PluginManager pluginManager = new PluginManager(true, null, null, null, null);
		pluginManager.loadCorePlugins();
		modules.addAll(pluginManager.getPlugins());

		File file = folder.newFile();
		try (PrintWriter out = new PrintWriter(file, "UTF-8"))
		{
			Injector injector = Guice.createInjector(modules);
			GraphvizGrapher grapher = injector.getInstance(GraphvizGrapher.class);
			grapher.setOut(out);
			grapher.setRankdir("TB");
			grapher.graph(injector);
		}
	}

	@Test
	public void ensureNoDuplicateConfigKeyNames()
	{
		for (final Class clazz : configClasses)
		{
			final Set<String> configKeyNames = new HashSet<>();

			for (final Method method : clazz.getMethods())
			{
				if (!method.isDefault())
				{
					continue;
				}

				final ConfigItem annotation = method.getAnnotation(ConfigItem.class);

				if (annotation == null)
				{
					continue;
				}

				final String configKeyName = annotation.keyName();

				if (configKeyNames.contains(configKeyName))
				{
					throw new IllegalArgumentException("keyName " + configKeyName + " is duplicated in " + clazz);
				}

				configKeyNames.add(configKeyName);
			}
		}
	}

	@Test
	public void testEventbusAnnotations() throws PluginInstantiationException
	{
		EventBus eventbus = new EventBus();
		PluginManager pluginManager = new PluginManager(true, eventbus, null, null, null)
		{
			@Override
			public boolean isPluginEnabled(Plugin plugin)
			{
				return true;
			}
		};

		class TestEvent implements Event {}
		class TestPlugin extends Plugin
		{
			private boolean thisShouldBeTrue = false;

			@Subscribe
			private void doSomething(TestEvent event)
			{
				thisShouldBeTrue = true;
			}
		}

		TestPlugin plugin = new TestPlugin();
		AccessorGenerator.scanSubscribes(MethodHandles.lookup(), plugin)
			.forEach(s -> s.subscribe(eventbus, plugin));
		eventbus.post(TestEvent.class, new TestEvent());
		assert plugin.thisShouldBeTrue;
	}
}

package net.runelite.client.plugins;

import org.pf4j.DevelopmentPluginClasspath;

class ExternalPluginClasspath extends DevelopmentPluginClasspath
{
	static final String GRADLE_DEPS_PATH = "build/deps";

	ExternalPluginClasspath()
	{
		addJarsDirectories(GRADLE_DEPS_PATH);
	}
}

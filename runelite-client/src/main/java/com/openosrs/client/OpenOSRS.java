package com.openosrs.client;

import com.google.common.base.Strings;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;

public class OpenOSRS
{
	public static final File OPENOSRS_DIR = new File(System.getProperty("user.home"), ".openosrs");
	public static final File EXTERNALPLUGIN_DIR = new File(OPENOSRS_DIR, "plugins");
	public static final String PLUGIN_DEVELOPMENT_PATH = "plugin.development.path";
	public static final String SYSTEM_VERSION;
	public static final String SYSTEM_API_VERSION;

	@Getter(AccessLevel.PACKAGE)
	private static final Properties properties = new Properties();

	public static String uuid = UUID.randomUUID().toString();

	static
	{
		try
		{
			properties.load(OpenOSRS.class.getResourceAsStream("/openosrs.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		SYSTEM_VERSION = properties.getProperty("oprs.version", "0.0.0");
		SYSTEM_API_VERSION = properties.getProperty("oprs.api.version");
	}

	public static String[] getPluginDevelopmentPath()
	{
		// First check if property supplied as environment variable PLUGIN_DEVELOPMENT_PATHS
		String developmentPluginPaths = System.getenv(PLUGIN_DEVELOPMENT_PATH.replace('.', '_').toUpperCase());

		if (Strings.isNullOrEmpty(developmentPluginPaths))
		{
			// Otherwise check the property file
			developmentPluginPaths = properties.getProperty(PLUGIN_DEVELOPMENT_PATH);
		}

		return Strings.isNullOrEmpty(developmentPluginPaths) ? new String[0] : developmentPluginPaths.split(";");
	}

	public static void preload()
	{
	}
}

package com.openosrs.client;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

public class OpenOSRS
{
	public static final File OPENOSRS_DIR = new File(System.getProperty("user.home"), ".openosrs");
	public static final File EXTERNALPLUGIN_DIR = new File(OPENOSRS_DIR, "plugins");
	public static final String SYSTEM_VERSION;
	public static final String SYSTEM_API_VERSION;

	public static String uuid = UUID.randomUUID().toString();

	static
	{
		Properties properties = new Properties();
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

	public static void preload()
	{
	}
}

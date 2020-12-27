package com.openosrs.client.plugins;

import com.google.inject.Injector;
import org.pf4j.ExtensionPoint;

public class Plugin extends net.runelite.client.plugins.Plugin implements ExtensionPoint
{
	public Injector injector;
}

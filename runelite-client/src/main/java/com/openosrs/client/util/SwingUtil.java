package com.openosrs.client.util;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

public class SwingUtil extends net.runelite.client.util.SwingUtil
{
	public static void syncExec(final Runnable r) throws InvocationTargetException, InterruptedException
	{
		if (EventQueue.isDispatchThread())
		{
			r.run();
		}
		else
		{
			EventQueue.invokeAndWait(r);
		}
	}
}

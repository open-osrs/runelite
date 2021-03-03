/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.injectors;

import net.runelite.asm.Named;

public interface Injector extends Named
{
	/**
	 * Where all the injection should be done
	 */
	void inject();

	/**
	 * Get a name the injector is going to be referred to in logging
	 */
	default String getName()
	{
		return this.getClass().getSimpleName();
	}

	/**
	 * Called before inject, AbstractInjector currently uses it to start a stopwatch
	 */
	void start();

	/**
	 * Gets a message logged at quiet level when the injector ends
	 */
	String getCompletionMsg();
}

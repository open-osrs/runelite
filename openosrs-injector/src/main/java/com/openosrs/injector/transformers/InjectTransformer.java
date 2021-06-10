/*
 * Copyright (c) 2020, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.transformers;

import com.google.common.base.Stopwatch;
import com.openosrs.injector.injection.InjectData;
import lombok.RequiredArgsConstructor;
import net.runelite.asm.Named;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;

@RequiredArgsConstructor
public abstract class InjectTransformer implements Named
{
	protected final InjectData inject;
	protected final Logger log = Logging.getLogger(this.getClass());
	private Stopwatch stopwatch;

	public final void transform()
	{
		stopwatch = Stopwatch.createStarted();
		transformImpl();
	}

	abstract void transformImpl();

	public final String getCompletionMsg()
	{
		return "finished in " + stopwatch.toString();
	}

	@Override
	public final String getName()
	{
		return this.getClass().getSimpleName();
	}
}

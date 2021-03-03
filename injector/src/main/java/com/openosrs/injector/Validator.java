/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector;

import net.runelite.asm.Named;

public interface Validator extends Named
{
	boolean validate();

	default String getName()
	{
		return this.getClass().getSimpleName();
	}
}

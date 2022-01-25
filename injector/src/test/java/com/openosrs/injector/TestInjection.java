/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.Injector;
import com.openosrs.injector.rsapi.RSApi;
import net.runelite.asm.ClassGroup;

public class TestInjection extends InjectData
{
	public TestInjection(ClassGroup vanilla, ClassGroup deobfuscated, ClassGroup mixins, RSApi rsApi)
	{
		super(vanilla, deobfuscated, mixins, rsApi);
	}

	@Override
	public void runChildInjector(Injector injector) throws InjectException
	{
		injector.inject();
	}
}

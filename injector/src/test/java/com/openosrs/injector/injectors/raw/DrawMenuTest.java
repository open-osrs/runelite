/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector.injectors.raw;

import com.google.common.io.ByteStreams;
import com.openosrs.injector.TestInjection;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.rsapi.RSApi;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.deob.util.JarUtil;
import org.junit.Test;

public class DrawMenuTest
{
	@Test
	public void test160() throws Exception
	{
		// 160 has both drawMenu and drawTopLeftText inlined
		ClassFile deobClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_deob160.class")));
		ClassFile obClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_ob160.class")));

		ClassGroup van = new ClassGroup();
		van.addClass(obClient);
		ClassGroup deob = new ClassGroup();
		deob.addClass(deobClient);

		InjectData inject = new TestInjection(van, deob, new ClassGroup(), new RSApi());
		inject.initToVanilla();
		new DrawMenu(inject).inject();
	}

	@Test
	public void test180() throws Exception
	{
		// 180 has only drawMenu inlined
		ClassFile deobClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_deob180.class")));
		ClassFile obClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_ob180.class")));

		ClassGroup van = new ClassGroup();
		van.addClass(obClient);
		ClassGroup deob = new ClassGroup();
		deob.addClass(deobClient);

		InjectData inject = new TestInjection(van, deob, new ClassGroup(), new RSApi());
		inject.initToVanilla();
		new DrawMenu(inject).inject();
	}
}

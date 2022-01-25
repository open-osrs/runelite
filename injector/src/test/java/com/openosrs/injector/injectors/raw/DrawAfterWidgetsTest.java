/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.openosrs.injector.injectors.raw;

import com.google.common.io.ByteStreams;
import com.openosrs.injector.TestInjection;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.rsapi.RSApi;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Type;
import static net.runelite.deob.DeobAnnotations.OBFUSCATED_NAME;
import static net.runelite.deob.DeobAnnotations.OBFUSCATED_SIGNATURE;
import net.runelite.deob.util.JarUtil;
import org.junit.Test;

public class DrawAfterWidgetsTest
{
	@Test
	public void testInjectDrawWidgetsRev160() throws Exception
	{
		// Rev 160 does not have the drawWidgets call inlined

		ClassFile deobClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_deob160.class")));
		ClassFile deobRasterizer = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Rasterizer2D_deob160.class")));

		ClassGroup deob = new ClassGroup();
		deob.addClass(deobClient);
		deob.addClass(deobRasterizer);

		ClassFile obClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_ob160.class")));
		ClassFile obRasterizer = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Rasterizer2D_ob160.class")));

		ClassGroup vanilla = new ClassGroup();
		vanilla.addClass(obClient);
		vanilla.addClass(obRasterizer);

		InjectData inject = new TestInjection(vanilla, deob, new ClassGroup(), new RSApi());
		addPhonyFields(deob, vanilla);
		inject.initToVanilla();
		new DrawAfterWidgets(inject).inject();
	}

	@Test
	public void testInjectDrawWidgetsRev180() throws Exception
	{
		// Rev 180 has the drawWidgets call inlined

		ClassFile deobClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_deob180.class")));
		ClassFile deobRasterizer = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Rasterizer2D_deob180.class")));

		ClassGroup deob = new ClassGroup();
		deob.addClass(deobClient);
		deob.addClass(deobRasterizer);

		ClassFile obClient = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Client_ob180.class")));
		ClassFile obRasterizer = JarUtil.loadClass(ByteStreams.toByteArray(getClass().getResourceAsStream("/drawafterwidgets/Rasterizer2D_ob180.class")));

		ClassGroup vanilla = new ClassGroup();
		vanilla.addClass(obClient);
		vanilla.addClass(obRasterizer);

		InjectData inject = new TestInjection(vanilla, deob, new ClassGroup(), new RSApi());
		addPhonyFields(deob, vanilla);
		inject.initToVanilla();
		new DrawAfterWidgets(inject).inject();
	}

	private static void addPhonyFields(ClassGroup deob, ClassGroup vanilla)
	{
		final ClassFile d = deob.findClass("Client");
		final ClassFile v = vanilla.findClass("client");
		final Field clientD = new Field(d, "client", new Type("LClient;"));
		clientD.findAnnotation(OBFUSCATED_NAME, true).setElement("obclient");
		clientD.findAnnotation(OBFUSCATED_SIGNATURE, true).setElement("descriptor", "Lclient;");
		clientD.setStatic();
		d.addField(clientD);
		final Field clientV = new Field(v, "obclient", new Type("Lclient;"));
		clientV.setStatic();
		v.addField(clientV);
		final Field callbacks = new Field(v, "callbacks", new Type("LCallbacks;"));
		v.addField(callbacks);
	}
}

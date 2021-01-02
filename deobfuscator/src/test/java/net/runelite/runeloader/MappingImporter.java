/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.runeloader;

import java.io.File;
import java.io.IOException;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Type;
import net.runelite.asm.Annotation;
import net.runelite.asm.attributes.Annotated;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.util.JarUtil;
import net.runelite.runeloader.inject.AddInterfaceInstruction;
import net.runelite.runeloader.inject.GetterInjectInstruction;
import net.runelite.runeloader.inject.Injection;
import net.runelite.runeloader.inject.InjectionModscript;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MappingImporter
{
	private static final Logger logger = LoggerFactory.getLogger(MappingImporter.class);

	private static final File IN = new File("d:/rs/07/adamin.jar");
	private static final File OUT = new File("d:/rs/07/adamout.jar");

	public static final String RL_INJECTION = "injection_130.json";

	private static final Type OBFUSCATED_NAME = new Type("Lnet/runelite/mapping/ObfuscatedName;");
	private static final Type EXPORT = new Type("Lnet/runelite/mapping/Export;");
	private static final Type IMPLEMENTS = new Type("Lnet/runelite/mapping/Implements;");

	private ClassGroup group;

	@Before
	public void before() throws IOException
	{
		group = JarUtil.load(IN);
	}

	@After
	public void after() throws IOException
	{
		JarUtil.save(group, OUT);
	}

	private boolean hasObfuscatedName(Annotated an, String name)
	{
		if (an == null)
		{
			return false;
		}
		return name.equals(DeobAnnotations.getStringValue(an, OBFUSCATED_NAME));
	}

	private ClassFile findClassWithObfuscatedName(String name)
	{
		for (ClassFile c : group.getClasses())
		{
			if (c.getName().equals(name))
			{
				return c;
			}

			if (this.hasObfuscatedName(c, name))
			{
				return c;
			}
		}
		return null;
	}

	private Field findFieldWithObfuscatedName(ClassFile c, String name)
	{
		for (Field f : c.getFields())
		{
			if (this.hasObfuscatedName(f, name))
			{
				return f;
			}
		}
		return null;
	}

	@Test
	@Ignore
	public void makeMappings()
	{
		InjectionModscript mod = Injection.load(MappingImporter.class.getResourceAsStream(RL_INJECTION));
		int fields = 0, classes = 0;

		for (int i = 0; i < mod.getGetterInjects().size(); ++i)
		{
			GetterInjectInstruction gii = mod.getGetterInjects().get(i);

			ClassFile cf = this.findClassWithObfuscatedName(gii.getGetterClassName());
			Assert.assertNotNull(cf);

			Field f = this.findFieldWithObfuscatedName(cf, gii.getGetterFieldName());
			if (f == null)
			{
				// some of their fields they inject getters for they also inject,
				// so they don't all exist
				continue;
			}

			String attrName = gii.getGetterName();
			attrName = Utils.toExportedName(attrName);

			Annotation a = f.findAnnotation(EXPORT);
			if (a != null)
			{
				String exportedName = a.getValueString();

				if (!attrName.equals(exportedName))
				{
					logger.info("Exported field " + f + " with mismatched name. Theirs: " + attrName + ", mine: " + exportedName);
				}
			}
			else
			{
				f.addAnnotation(EXPORT, attrName);

				logger.info("Exporting field " + f + " with name " + attrName);
				++fields;
			}
		}

		for (AddInterfaceInstruction aii : mod.getAddInterfaceInjects())
		{
			ClassFile cf = this.findClassWithObfuscatedName(aii.getClientClass());
			Assert.assertNotNull(cf);

			String iface = aii.getInterfaceClass();

			iface = iface.replace("com/runeloader/api/bridge/os/accessor/", "");

			Annotation a = cf.findAnnotation(IMPLEMENTS);
			if (a != null)
			{
				String implementsName = a.getValueString();

				if (!iface.equals(implementsName))
				{
					logger.info("Implements class " + cf + " with mismatched name. Theirs: " + iface + ", mine: " + implementsName);
				}
			}
			else
			{
				cf.addAnnotation(IMPLEMENTS, iface);

				logger.info("Exporting class " + cf.getName() + " with name " + iface);
				++classes;
			}
		}

		logger.info("Added {} fields, {} classes", fields, classes);
	}
}

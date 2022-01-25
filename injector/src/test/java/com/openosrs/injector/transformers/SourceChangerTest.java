/*
 * Copyright (c) 2020, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this source tree.
 */
package com.openosrs.injector.transformers;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.Injector;
import com.openosrs.injector.transformers.srcchangeclasses.NewName;
import com.openosrs.injector.transformers.srcchangeclasses.OldName;
import java.lang.invoke.MethodHandles;
import java.util.function.BiConsumer;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.objectwebasm.NonloadingClassWriter;
import net.runelite.asm.visitors.ClassFileVisitor;
import org.junit.Ignore;
import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class SourceChangerTest
{
	private static final String PACKAGE = "com.openosrs.injector.transformers.srcchangeclasses.";

	@Test
	@Ignore // Ignored because it's not really testing anything atm, but it works!
	public void test() throws Exception
	{
		final ClassFileVisitor deob = new ClassFileVisitor(), vann = new ClassFileVisitor();
		new ClassReader(PACKAGE + "NewName").accept(deob, ClassReader.SKIP_FRAMES);
		new ClassReader(PACKAGE + "OldName").accept(vann, ClassReader.SKIP_FRAMES);

		new SourceChanger(
			new InjectData(new ClassGroup(), new ClassGroup(), null, null)
			{
				public void runChildInjector(Injector injector) throws InjectException
				{
				}

				@Override
				public void forEachPair(BiConsumer<ClassFile, ClassFile> consumer)
				{
					consumer.accept(deob.getClassFile(), vann.getClassFile());
				}
			}).transformImpl();

		final ClassGroup group = new ClassGroup();
		group.addClass(vann.getClassFile());

		final ClassWriter cw = new NonloadingClassWriter(group, 0);
		vann.getClassFile().accept(cw);

		OldName obj = (OldName) MethodHandles.privateLookupIn(
				NewName.class,
				MethodHandles.lookup())
			.defineClass(cw.toByteArray())
			.getDeclaredConstructor()
			.newInstance();

		obj.obfMethodName();
	}
}

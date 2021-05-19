/*
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.transformers;

import com.openosrs.injector.injection.InjectData;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Exception;
import org.objectweb.asm.Opcodes;

public class Java8Ifier extends InjectTransformer
{
	public Java8Ifier(InjectData inject)
	{
		super(inject);
	}

	@Override
	void transformImpl()
	{
		inject.forEachPair(this::makeJava8);
	}

	private void makeJava8(ClassFile rsc, ClassFile vanilla)
	{
		vanilla.setVersion(Opcodes.V1_8);
		for (Method method : vanilla.getMethods())
		{
			if (!method.getName().equals("<init>"))
			{
				continue;
			}

			fixTryCatch(method);
		}
	}

	private void fixTryCatch(Method method)
	{
		Code code = method.getCode();
		List<Exception> remove = code.getExceptions().getExceptions().stream().filter(e -> e.getCatchType() != null && e.getCatchType().getName().equals("java/lang/RuntimeException")).collect(Collectors.toList());
		remove.forEach(code.getExceptions()::remove);
	}
}
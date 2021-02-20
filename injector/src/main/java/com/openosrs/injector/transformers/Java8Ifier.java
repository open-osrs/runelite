/*
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector.transformers;

import com.openosrs.injector.InjectException;
import com.openosrs.injector.injection.InjectData;
import java.util.ListIterator;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Exception;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
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

		if (code.getExceptions().getExceptions().stream().noneMatch(e -> e.getCatchType() != null && e.getCatchType().getName().equals("java/lang/RuntimeException")))
		{
			return;
		}

		Instructions instructions = code.getInstructions();
		ListIterator<Instruction> insnIt = instructions.listIterator();
		Instruction insn;
		Label firstLabel = null;
		Label injectedLabel = null;
		while (insnIt.hasNext())
		{
			insn = insnIt.next();

			if (firstLabel == null && insn instanceof Label)
			{
				firstLabel = (Label) insn;
			}
			else if (insn instanceof InvokeSpecial)
			{
				if (((InvokeSpecial) insn).getMethod().getName().equals("<init>"))
				{
					injectedLabel = new Label(instructions);
					insnIt.add(injectedLabel);
					break;
				}
			}
		}

		// this should never happen
		if (firstLabel == null)
		{
			throw new InjectException("Label missing from ctor " + method.toString() + " even though exception exists");
		}

		// label was injected
		if (injectedLabel != null)
		{
			for (Exception ex : code.getExceptions().getExceptions())
			{
				if (ex.getStart().equals(firstLabel))
				{
					ex.setStart(injectedLabel);
				}
			}
		}
	}
}